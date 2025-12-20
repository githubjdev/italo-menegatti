package dev.italo.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
	
	
	public static void main(String[] args) {
		
		Set<String> emails = new HashSet<String>();
		
		emails.add("alex@gmail.com");
		emails.add("fernando@gmail.com");
		emails.add("alex@gmail.com");
		
		System.out.println(emails);
		
		List<String> list = new ArrayList<String>();
		list.add("alex@gmail.com");
		list.add("fernando@gmail.com");
		list.add("alex@gmail.com");
		
		System.out.println(list);
		
	}

}
