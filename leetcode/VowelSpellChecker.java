package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VowelSpellChecker {

    //Time Limit Exceeded for very large inputs
    public static String[] spellcheckerOld(String[] wordlist, String[] queries) {

        String[] result = new String[queries.length];
        List<String> inputWordList = Arrays.asList(wordlist);
        for (int i = 0; i < queries.length; i++) {

            boolean found = false;
            String query = queries[i];
            if (inputWordList.contains(query)) {
                result[i] = query;
                continue;
            }

            if (inputWordList.stream().anyMatch(query::equalsIgnoreCase)) {
                result[i] = inputWordList.stream().filter(e -> e.equalsIgnoreCase(query)).findFirst().get();
                continue;
            }

            String queryVowel = query.replaceAll("[AEIOUaeiou]", "1");
            for (String word : wordlist) {
                String wordVowel = word.replaceAll("[AEIOUaeiou]", "1");
                if (wordVowel.equalsIgnoreCase(queryVowel)) {
                    result[i] = word;
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            result[i] = "";
        }

        return result;
    }

    public static String[] spellchecker(String[] wordlist, String[] queries) {

        String[] result = new String[queries.length];
        Map<String, String> inputWordList = new HashMap<String, String>();
        Map<String, String> caseWordList = new HashMap<String, String>();
        Map<String, String> vowelsWordList = new HashMap<String, String>();

        for(String word : wordlist) {
            inputWordList.put(word, word);

            if(!caseWordList.containsKey(word.toLowerCase())) {
                caseWordList.put(word.toLowerCase(), word);
            }
            String wordVowel = word.replaceAll("[AEIOUaeiou]", "1").toLowerCase();
            if(!vowelsWordList.containsKey(wordVowel)) {
                vowelsWordList.put(wordVowel, word);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            if (inputWordList.containsKey(queries[i])) {
                result[i] = queries[i];
                continue;
            }

            if (caseWordList.containsKey(queries[i].toLowerCase())) {
                result[i] = caseWordList.get(queries[i].toLowerCase());
                continue;
            }

            String queryVowel = queries[i].replaceAll("[AEIOUaeiou]", "1").toLowerCase();
            if(vowelsWordList.containsKey(queryVowel)) {
                result[i] = vowelsWordList.get(queryVowel);
                continue;
            }

            result[i] = "";
        }

        return result;
    }

    public static void main(String[] args) {

        String[] wordList = {"KiTe", "kite", "hare", "Hare"};
        String[] queries = {"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"};

        System.out.println(Arrays.asList(spellchecker(wordList, queries)));
    }
}
