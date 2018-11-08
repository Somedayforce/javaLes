package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Person {
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public Person () {}
    public Person (String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    public int age(){
        return 2018 - this.birthYear;
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name:");
        this.name = br.readLine();
        System.out.println("Enter birth year:");
        this.birthYear = Integer.parseInt(br.readLine());
    }
    public void output(){
        System.out.println("Name = " + this.name );
        System.out.println( "Birth year = " + this.birthYear);
    }

    public void changeName(String name){
        this.setName(name);
    }

}
