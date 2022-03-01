import java.util.*;

public class Collection {

      public static void main(String args[]) {
            LinkedList<Integer> list = new LinkedList();
            // System.out.println("Size: " + list.size());

            list.add(1);
            list.add(3);
            list.add(5);
            list.add(7);
            list.add(9);
            list.add(11);
            System.out.println("Size after additions: " + list.size());

            System.out.println("Contents: " + list);

            addAndSort(list, 2);

            System.out.println("Contents (add & sort): " + list);

            swapValues(list, 1, 9);

            System.out.println("Contents (swap values) " + list);

            System.out.println("Index of searched value in new list: " + findValue());

      }

      public static LinkedList<Integer> addAndSort(LinkedList<Integer> list, int value) {
            if (list.size() == 0) {
                  list.add(value);
            } else if (list.get(0) > value) {
                  list.add(0, value);
            } else if (list.get(list.size() - 1) < value) {
                  list.add(list.size(), value);
            } else {
                  int i = 0;
                  while (list.get(i) < value) {
                        i++;
                  }
                  list.add(i, value);
            }
            return list;
      }

      // Swap Function
      public static LinkedList<Integer> swapValues(LinkedList<Integer> list, int indexOne, int indexTwo) {

            // Getting the positions of the elements
            int index1 = list.indexOf(indexOne);
            int index2 = list.indexOf(indexTwo);

            // Returning if the element is not present in the
            // LinkedList
            if (index1 == -1 || index2 == -1) {
                  return list;
            }

            // Swapping the elements
            list.set(index1, indexTwo);
            list.set(index2, indexOne);

            return list;
      }

      public static int findValue() {
            Random random = new Random();
            LinkedList<Integer> list2 = new LinkedList();

            int i, searchVal = 0;
            for (i = 0; i <= 500; i++) {
                  list2.add(random.nextInt(1000, 9999));
            }

            searchVal = random.nextInt(1000, 9999);

            for (i = 0; i <= 500; i++) {
                  if (list2.get(i) == searchVal) {
                        return i;
                  } else {
                        return i = -1;
                  }
            }

            // System.out.println("LIST2: " + list2);
            // System.out.println("SEARCH: " + searchVal);
            return i;
      }
}