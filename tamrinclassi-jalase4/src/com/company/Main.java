package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        Man man=new Man();
        System.out.print("name;");
        String a=scanner.next();
        System.out.print("family:");
        String b=scanner.next();
        System.out.print("job:");
        String c=scanner.next();
        System.out.print("user:");
        int d=scanner.nextInt();
        System.out.print("age:");
        int e=scanner.nextInt();

        Set<String> set=new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        for (String i:set) {
            System.out.println(i);
        }

        Set<Integer> set1=new HashSet<>();
        set1.add(d);
        set1.add(e);
        for (Integer j:set1) {
            System.out.println(j);
        }

    }
}
