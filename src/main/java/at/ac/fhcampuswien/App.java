package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        double Eingabe, maxNum = 0;
        int Zaehler=1;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Number " + Zaehler + ": ");
            Eingabe=scan.nextDouble();

            if (Eingabe <= 0 && Zaehler == 1){
            System.out.println("No number entered.");
            break;
        }
            Zaehler++;
            if (maxNum < Eingabe){
            maxNum = Eingabe;}


            if (0 >= Eingabe){
            System.out.println("The largest number is " + String.format("%.2f", maxNum));
            //String.format für 2 Nachkommastellen
        }

        }
        while (Eingabe > 0);
        // input your solution here
    }

    //todo Task 2
    public void stairs(){
        int Reihe = 1, size;
        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        size = scan.nextInt();

        if (0 >= size){
            System.out.println("Invalid number!");
        } else {
            for (int Zeile = 1; Zeile <= size; Zeile++) { //mit Zeile ist eine "Stufe" gemeint
                for (int Zahl = 0; Zahl < Zeile; Zahl++) {
                    System.out.print(Reihe++ + " ");
                }
                System.out.println();
            }
        }
    }
        // input your solution here

    //todo Task 3
    public void printPyramid() {
        int k = 6; //k steht für die Konstanze

        for (int Zeile = 1; Zeile <= k; Zeile++) {
            for (int Abstand = 1; 6 - Zeile >= Abstand; Abstand++) {
                System.out.print(" ");
            }
            for (int Stern = 1; 2 * Zeile - 1 >= Stern; Stern++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        // input your solution here


    //todo Task 4
    public void printRhombus(){
        // input your solution here //leider nicht geschafft
    }

    //todo Task 5
    public void marks(){
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int Note5 = 0;
        int countMark = 1;
        float averageNote = 0;
        float sum = 0;

        System.out.print("Mark " + countMark + ": ");

        int Note = scan.nextInt();

        while (Note != 0) {
            if (Note < 0 || Note > 5) {
                System.out.println("Invalid mark!");
            } else {
                if (Note == 5) {
                    Note5++;
                }
                sum = sum + Note;
                countMark++;
                count++;
            }
            System.out.print("Mark " + countMark + ": ");
            Note = scan.nextInt();
        }
            if (count != 0){
                averageNote = sum / count;
        }
        System.out.printf("Average: " + String.format("%.2f", averageNote)); //String.format für 2 Nachkommastellen
        System.out.println();
        System.out.println("Negative marks: " + Note5);
    }
    // input your solution here


    //todo Task 6
    public void happyNumbers(){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int Eingabe;
        int Zahl;


        System.out.print("n: ");
        Eingabe = scan.nextInt();

        while (Eingabe != 1 && Eingabe != 4) {
            while (Eingabe > 0) { // berechnet die Summe der quadrierten Zahlen
                Zahl = Eingabe % 10;
                sum = (Zahl*Zahl) + sum;
                Eingabe = Eingabe / 10;
            }
            Eingabe = sum;
            sum = 0;
        }

        if (Eingabe == 4){
            System.out.println("Sad number!");
            }
        else if (Eingabe == 1){
            System.out.println("Happy number!");
        }
    }
        // input your solution here

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}