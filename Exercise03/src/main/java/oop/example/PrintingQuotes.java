package oop.example;
import java.util.Scanner;


public class PrintingQuotes {
    public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);
        System.out.print("What is the quote?");
        String quote = scnr.nextLine();
        System.out.print("Who said it?");
        String author = scnr.nextLine();
        System.out.println(author + " says, \"" + quote + ".\""  );

    }
}
