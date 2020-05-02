package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code her
        Student student=new Student();
        Scanner scanner=new Scanner(System.in);

        System.out.print("inter id:");
        int i=scanner.nextInt();
        student.setId(i);
        System.out.print("inter name:");
        String s=scanner.next();
        student.setName(s);
        System.out.print("inter moadel:");
        double d=scanner.nextDouble();
        student.setMoadel(d);

        Map<String,Integer> map2=new HashMap<>();
        map2.put("id",student.getId());
        Map<String,Double> map=new HashMap<>();
        map.put("moadel",student.getMoadel());

        Map<String,String> map1=new HashMap<>();
        map1.put("name",student.getName());

        System.out.print(map2.keySet());
        System.out.println(map2.get("id"));
        System.out.print(map1.keySet());
        System.out.println(map1.get("name"));
        System.out.print(map.keySet());
        System.out.println(map.get("moadel"));

    }
}
