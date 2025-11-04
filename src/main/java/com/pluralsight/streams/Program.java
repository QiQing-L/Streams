package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // list of 10 people:

        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Carissa", "Carrillo",20));
        peopleList.add(new Person("Ines", "Harrison",30));
        peopleList.add(new Person("Callie", "Brooks",40));
        peopleList.add(new Person("Martina", "Saunders",23));
        peopleList.add(new Person("Brooks", "Ramos",28));
        peopleList.add(new Person("Malcolm", "Wilcox",10));
        peopleList.add(new Person("Brigitte", "Brown",2));
        peopleList.add(new Person("Terrell", "Rios",70));
        peopleList.add(new Person("Kayla", "Novak",66));
        peopleList.add(new Person("Kathleen", "Brown",95));

        // step 2:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name (first or last name):");
        String nameInput = scanner.nextLine().trim().toLowerCase();

        List<Person> searchList = new ArrayList<>();
        for (Person person :peopleList){
            if (person.getFirstName().equalsIgnoreCase(nameInput)
                    || person.getLastName().equalsIgnoreCase(nameInput)){
                searchList.add(person);
            }
        }

        for (Person personOnList: searchList){
            System.out.println(personOnList.getFirstName() +" "+ personOnList.getLastName());
        }

        // step 3:
        double averageAge = 0;
        for (Person person : peopleList) {
            averageAge += person.getAge();
        }
        averageAge = averageAge / peopleList.size();
        System.out.println("Average Age: "+ averageAge);







    }
}
