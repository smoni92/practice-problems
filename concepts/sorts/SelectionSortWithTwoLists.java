package concepts.sorts;

import java.util.*;

public class SelectionSortWithTwoLists {

    public List<Integer> selectionSort(List<Integer> orgList) {

        List<Integer> sortedList = new ArrayList<>();
        Iterator<Integer> iterator = orgList.iterator();
        while (iterator.hasNext()) {
            int smallest = Collections.min(orgList);
            sortedList.add(smallest);
            orgList.remove((Integer) smallest);
        }

        return sortedList;
    }

    public static void main(String[] args) {

        List<Integer> orgList = new ArrayList<Integer>(Arrays.asList(5, 3, 6, 2, 10));

        SelectionSortWithTwoLists selectionSortWithTwoLists = new SelectionSortWithTwoLists();
        List<Integer> sortedList = selectionSortWithTwoLists.selectionSort(orgList);
        System.out.println(sortedList);
    }

}
