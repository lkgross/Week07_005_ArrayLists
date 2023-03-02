package bsu.comp152;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> roster = new ArrayList<String>();
        roster.add("Miah");
        roster.add("Cody");
        roster.add("Subhan");
        roster.add("Dan");
        roster.add("Cris");
        roster.add("Dominic");
        System.out.println(roster);
        System.out.println(roster.size());
        System.out.println(roster.get(3));
        roster.set(4, "Abigail");
        System.out.println(roster);
        System.out.println(roster.contains("Cris"));
        System.out.println(roster.contains("Abigail"));
        System.out.println(roster.get(roster.size()-1));
        roster.add(2, "Cardelina");
        System.out.println(roster);
        roster.remove("Cardelina");
        System.out.println(roster);
        // We can loop through an ArrayList element-by-element.
        for (String name : roster){
            System.out.printf("%s (Section 005)\n", name);
        }
        // We can loop through an ArrayList index-by-index.
        System.out.println("What is the index for Dan?");
        for (int i = 0; i < roster.size(); i++){
            if (roster.get(i).equals("Dan")){
                System.out.printf("Dan is at position %d in the roster.\n", i);
            }
        }
        System.out.println("What is the index for Cris?");
        for (int i = 0; i < roster.size(); i++){
            if (roster.get(i).equals("Cris")){
                System.out.printf("Cris is at position %d in the roster.\n", i);
            }
        }
    }
}