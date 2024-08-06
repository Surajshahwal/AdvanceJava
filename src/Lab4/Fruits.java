package Lab4;

import java.util.Scanner;
import java.util.TreeSet;

public class Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of strings: ");
        String input = sc.nextLine();
        String word[]=input.split("\\s");
        TreeSet<String> set = new TreeSet<>();

        for (String fruits : word) {
           set.add(fruits);
        }
        System.out.println(set);

    }
    }

