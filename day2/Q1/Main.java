package day2.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static List<?> gen(List<?> list) {
		
		for(Object l:list) {
		System.out.println(l);
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of List: ");
		
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the values: ");
			list.add(sc.nextInt()); 
		}
		System.out.println(gen(list));

		
		List<Student> studentList = new ArrayList<>();
		
		System.out.println("Enter the No-of Student: ");
		
		System.out.println("Enter the Student Details: ");
		
		int m = sc.nextInt();
		
		for(int i=0;i<m;i++) {
			System.out.println("Enter the Student Id: ");
			int id = sc.nextInt();
			System.out.println("Enter the Student Name: ");
			String name = sc.next();
			System.out.println("Enter the Student Marks: ");
			int marks = sc.nextInt();
			studentList.add(new Student(id,name,marks)); 
		}
		
		System.out.println(gen(studentList));

	}

}
