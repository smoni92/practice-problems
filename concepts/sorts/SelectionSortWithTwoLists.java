package concepts.sorts;

import java.util.*;

public class SelectionSortWithTwoLists {

    public List selectionSort(List<Integer> orgList) {

        List sortedList = new ArrayList();
        Iterator iterator = orgList.iterator();
        while (iterator.hasNext()) {
            int smallest = Collections.min(orgList);
            sortedList.add(smallest);
            orgList.remove(orgList.indexOf(smallest));
        }

        return sortedList;
    }

    public static void main(String[] args) {

        List<Integer> orgList = new ArrayList<Integer>(Arrays.asList(5, 3, 6, 2, 10));

        SelectionSortWithTwoLists selectionSortWithTwoLists = new SelectionSortWithTwoLists();
        List sortedList = selectionSortWithTwoLists.selectionSort(orgList);
        System.out.println(sortedList);
    }

}
