package com.collection.pratice;
import java.util.*;
public class ArrayListExample2 {
	public static void main(String args[]){  
		  //Creating user-defined class objects  
		  Student s1=new Student(101,"Rishu",23);  
		  Student s2=new Student(102,"Kunja",21);  
		  Student s3=new Student(103,"Ranju",25);  
		  //creating arraylist  
		  ArrayList<Student> al=new ArrayList<Student>();  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		  //Getting Iterator  
		  Iterator itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		 }  
		}  

