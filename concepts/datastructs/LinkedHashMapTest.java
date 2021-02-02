package concepts.datastructs;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Output:
 * Normal LinkedHashMap::
 * Original Map:
 * {1=One, 2=Two}
 * Map with Duplicate Entries:
 * {1=One-ReInserted, 2=Two}
 *
 * LinkedHashMap with Access Order::
 * Original Map:
 * {1=One, 2=Two}
 * Map with Duplicate Entries:
 * {2=Two, 1=One-ReInserted}
 */
public class LinkedHashMapTest {

    public static void main(String[] args) {

        System.out.println("Normal LinkedHashMap::");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");

        System.out.println("Original Map:");
        System.out.println(linkedHashMap);

        linkedHashMap.put(1, "One-ReInserted");

        System.out.println("Map with Duplicate Entries:");
        System.out.println(linkedHashMap);

        System.out.println();

        System.out.println("LinkedHashMap with Access Order::");
        Map<Integer, String> accessOrderLinkedHashMap = new LinkedHashMap<Integer, String>(100, 5, true);
        accessOrderLinkedHashMap.put(1, "One");
        accessOrderLinkedHashMap.put(2, "Two");

        System.out.println("Original Map:");
        System.out.println(accessOrderLinkedHashMap);

        accessOrderLinkedHashMap.put(1, "One-ReInserted");

        System.out.println("Map with Duplicate Entries:");
        System.out.println(accessOrderLinkedHashMap);
    }
}
