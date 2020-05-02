package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        System.out.print("enter name:");
        String s=scanner.next();
        student.setName(s);
        System.out.print("enter id:");
        int i=scanner.nextInt();
        student.setId(i);
        System.out.print("enter father name: ");
        String a=scanner.next();
        student.setFathername(a);
        
        List<String> list1=new ArrayList<>();
        list1.add(s);
        list1.add(a);
        for (String f:list1) {
            System.out.println(f);
        }
        
        List<Integer> list2=new ArrayList<>();
        list2.add(new Integer(i));
        for (Integer w:list2) {
            System.out.println(w);
        }

        System.out.println("enter 3ta nomre:");
        int z=scanner.nextInt();
        int c=scanner.nextInt();
        int v=scanner.nextInt();
        List<Integer> list=new ArrayList<>();
        list.add(z);
        list.add(c);
        list.add(v);
        for (Integer l:list) {
            System.out.println(l);
        }
        
    }
}
