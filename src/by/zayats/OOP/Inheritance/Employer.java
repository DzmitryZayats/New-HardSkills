package by.zayats.OOP.Inheritance;

import java.net.ServerSocket;
import java.util.SortedMap;

public class Employer extends Person_4{
String company;
    public Employer(String name, String company) {
        super(name);
        this.company = company;
    }

    public void work(){
        System.out.printf("%s works in %s\n", getName(), company);
    }

    @Override
    public void display() {
        System.out.printf("Name: %s \n", getName());
        System.out.printf("Works in %s \n", company);
    }
}
