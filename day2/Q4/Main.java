package day2.Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import day2.Q2.Student;


public class Main {
	

	
	public static <String, Student extends Comparable<Student>> HashMap<String, Student> sortByValue(HashMap<String, Student> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Student> > list = new LinkedList<Map.Entry<String, Student> >(hm.entrySet());
         
        // put data from sorted list to hashmap
        HashMap<String, Student> temp = new LinkedHashMap<String, Student>();
        for (Map.Entry<String, Student> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
		
		HashMap<String,Student> map = new HashMap<>();
		
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
			
			map.put(address, new Student(id, name, marks));
			
		}
		
		Map<String,Student> treeMap = sortByValue(map);
		
		
		
		
		ArrayList<String> keyList = new ArrayList<String>(treeMap.keySet());
		
		ArrayList<Student> valueList = new ArrayList<Student>(treeMap.values());
		
		for(int i=0;i<keyList.size();i++) {
		System.out.println(keyList.get(i)+" "+valueList.get(i));
		}

	}

}
