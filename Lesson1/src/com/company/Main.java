package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static <string> void main(String[] args) throws IOException {
        double radius = 0;
        double perimetr = 0;
        double area = 0;
        System.out.println("Enter radius:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        radius = Double.parseDouble(br.readLine());
        area = radius*radius*3.1415;
        perimetr = 2*3.1415*radius;
        System.out.println("Area = " + area );
        System.out.println("Perimetr = " + perimetr);
        System.out.println( "===================");

        System.out.println("what is your name?");
        String name = br.readLine();
        System.out.println("where do you live," + name + "?");
        String address = br.readLine();
        System.out.println("nice to meet you, " + name + " ,from " + address + "!!");
        System.out.println( "===================");

        double[] c = new double[3];
        int[] t = new int[3];
        double sum = 0;
        for (int i = 0 ;i<3;i++){
            System.out.println("Enter c[" + i + "]");
            c[i] = Double.parseDouble(br.readLine());
            System.out.println("Enter t[" + i + "]");
            t[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i< 3;i++){
            System.out.println((i+1)+ " call cost " + c[i]*t[i]);
            sum += c[i] *t[i];
        }
        System.out.println("Total sum = " + sum);

    }
}
