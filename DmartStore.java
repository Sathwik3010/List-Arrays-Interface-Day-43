package com.codegnan.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DmartStore {

	public static void main(String[] args) {
		List<String> products = new LinkedList<>();
		
        // 1. add(Object)
		products.add("Rice");
		products.add("Sugar");
	    products.add("Milk");
	    products.add("Bread");
	    products.add("Oil");
	    
	    System.out.println("Initital Products: "+ products);
	    
        // 2. add(int index, Object)
	    products.add(2, "Salt");
	    System.out.println("After adding Salt at index 2: " + products);
	    
        // 3. addAll()
	    List<String> newProducts = Arrays.asList("Soap", "Shampoo", "Toothpaste");
	    products.addAll(newProducts);
	    System.out.println("After addAll: "+products);
	    
        // 4. addFirst() & addLast()
	    products.addFirst("Biscuits");
	    products.addLast("Chocolate");
	    System.out.println("After addFist & addLast "+products);
	    
        // 5. get(int index)
	    System.out.println("Product at index 3: "+products.get(3));
	    
	    // 6. getFirst() & getLast()
        System.out.println("First product: " + products.getFirst());
        System.out.println("Last product: " + products.getLast());
        
        // 7. remove(int index)
        products.remove(4);
        System.out.println("After removing index 4: " + products);
        
        // 8. removeFirst() & removeLast()
        products.removeFirst();
        products.removeLast();
        System.out.println("After removeFirst & removeLast: " + products);

        // 9. set(int index, Object)
        products.set(1, "Green Tea");
        System.out.println("After set at index 1: " + products);

     // 10. indexOf() & lastIndexOf()
        products.add("Milk");   // duplicate
        System.out.println("indexOf Milk: " + products.indexOf("Milk"));
        System.out.println("lastIndexOf Milk: " + products.lastIndexOf("Milk"));
        
     // 11. contains()
        System.out.println("Contains Sugar? " + products.contains("Sugar"));

        // 12. size()
        System.out.println("Total products count: " + products.size());

        // 13. isEmpty()
        System.out.println("Is store empty? " + products.isEmpty());
        
        // 14. Using Iterator (Cursor)
        Iterator<String> iterator = products.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        
        // 15. clear()
        products.clear();
        System.out.println("\nAfter clear(): " + products);
        
        // 16. isEmpty after clear
        System.out.println("Is store empty now? " + products.isEmpty());
	}

}
