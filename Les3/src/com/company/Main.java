package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Person p1 = new Person ("Edem",1998);
        Person p2 = new Person ("Anna",1950);
        Person p3 = new Person ("Dzvina",1999);
        Person p4 = new Person ("Anna",1995);
        Person p5 = new Person();
        p5.input();
        p5.output();

    }
}
