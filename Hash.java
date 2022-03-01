import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.*;
import java.lang.*;

public class Hash {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		hashmap.put(0, 1);
		hashmap.put(1, 3);
		hashmap.put(2, 5);
		hashmap.put(3, 7);
		hashmap.put(4, 9);
		hashmap.put(5, 11);
            System.out.println("Size after additions: " + hashmap.size());
		
		System.out.println("Contents: " + hashmap);
		addAndSort(hashmap, 2);
    System.out.println("Contents (add & sort): " + hashmap);
		swapValues(hashmap, 1, 4);
		System.out.println("Contents (swap values): " + hashmap);
		System.out.println("Index of searched value in new list: " + findValue());
		
	}
	
	public static void addAndSort(HashMap <Integer, Integer> hashmap, int value) {
		if((int)hashmap.get(hashmap.size() - 1) < value) {
      hashmap.put(hashmap.size(), value);
    }
    else {
      int i = 0;
      while((int)hashmap.get(i) < value) {
        i++;
      }
      int key = (int)hashmap.size();
      for (int j = i + 1; j < hashmap.size(); j++){
        hashmap.put(key, hashmap.get(key - 1));
        key--;
      }
      hashmap.put(i, value);      
    }
	}


	public static void swapValues(HashMap<Integer, Integer> hashmap, int indexOne, int indexTwo) {
		int value1 = (int)hashmap.get(indexOne);
		int value2 = (int)hashmap.get(indexTwo);
		
		hashmap.remove(indexOne);
		hashmap.put(indexOne, value2);
		hashmap.remove(indexTwo);
		hashmap.put(indexTwo, value1);
	} 
	
	public static int findValue() {
		Random rand = new Random();
		HashMap<Integer,Integer> hashmap2 = new HashMap<Integer, Integer>();
		int index = -1;
		
		for (int i = 0; i < 500; i++) {
			hashmap2.put(i, rand.nextInt(1000, 9999));
		}
		
		int searchVal = rand.nextInt(1000, 9999);
		for (int i = 0; i < 500; i++) {
			if ((int)hashmap2.get(i) == searchVal) {
				index = i;
			}
		}
		return index;
	}
}
	
