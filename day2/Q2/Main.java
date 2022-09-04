package day2.Q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Map<Student, String> map = new HashMap<>();
		
		System.out.println("Enter no-of Student : ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter "+n+" Students Details: ");
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter Student Id: ");
			int id  = sc.nextInt();
			
			System.out.println("Enter Student Name: ");
			
			String name = sc.next(); 
			
			System.out.println("Enter Student Marks: ");
			
			int marks = sc.nextInt(); 
			
			System.out.println("Enter the Student State: ");
			
			String address = sc.next(); 	
			
			map.put(new Student(id, name, marks),address);
			
		}
		
		Map<Student, String> treeMap = new TreeMap<>(map);
		
		ArrayList<Student> keyList = new ArrayList<Student>(treeMap.keySet());
		
		ArrayList<String> valueList = new ArrayList<String>(treeMap.values());
		
		for(int i=0;i<keyList.size();i++) {
		System.out.println(keyList.get(i)+" From "+valueList.get(i));
		}
		
		
		
		
		
		

	}

}
