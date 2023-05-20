package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Mostafa","Khaled","Omar","Mahmoud","Shrouk"));

        for(String name:names){
            System.out.println(name);
        }
    }
}