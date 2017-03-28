import java.util.Scanner;

/**
 * Created by Tommy on 23.03.2017.
 */
public class Løsningsforslag {

    // Kjører alle metoder
   /* public void allProblems(){
        helloWorld();
        helloName();
        helloBobAlice();
        sumNnumbers();
        sumNnumDiv3();
        sumOrProd();
        multTable();
        primes();

    }*/

    // Oppgave 1:
    public void helloWorld(){
        System.out.println("Hello, World!");
    }

    // Oppgave 2:
    public void helloName(){
        System.out.println("Please write your name...");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Hello, " + name);
    }
    // Alternativt //
    public void helloName(String name){
        System.out.println("Hello, " + name);
    }

    // Oppgave 3:
    public void helloBobAlice(){
        System.out.println("Please write your name...");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        if (name.toLowerCase().equals("bob") || name.toLowerCase().equals("alice")) {
            System.out.println("Hello, " + name);
        }
    }
    // Alternativt //
    public void helloBobAlice(String name){
        if (name.toLowerCase().equals("bob") || name.toLowerCase().equals("alice")) {
            System.out.println("Hello, " + name);
        }
    }

    // Oppgave 4:
    public void sumNnumbers(int n){
        int x = 0;
        for (int i = 1; i < n ; i++) {
            x += i;
        }
        System.out.println(x);
    }

    // Oppgave 5:
    public void sumNnumDiv3(int n){
        int x = 0;
        for (int i = 1; i < n ; i++) {
            if (i % 3 == 0){
                x += i;
            }
        }
        System.out.println(x);
    }

    // Oppgave 6:
    public void sumOrProd(int n){
        System.out.println("Would you like to take the sum of the numbers from 1 to " + n + "\nOr would you like to " +
                "take the product of the numbers?\nPlease write 'sum' or 'product'");
        Scanner scanner = new Scanner(System.in);

        String answer = scanner.next();

        switch (answer){
            case "sum" :
                sumNnumbers(n);
                break;
            case "product" :
                int x = 1;
                for (int i = 1; i < n; i++) {
                    x *= i;
                }
                System.out.println(x);
                break;
            default:
                System.out.println("Could not read 'sum' or 'product'\nPlease try again...");
        }
    }

    // Oppgave 7:
    public void multTable(){
        for (int i = 1; i <= 12 ; i++) {
            for (int j = 1; j <= 12 ; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }

    // Oppgave 8:
    public void primes(int n){
        for (int i = 2; i < n; i++) {
            boolean prime = true;
            int x = (int)Math.sqrt(i);
            //System.out.println(x);
            int k = 0;
            for (int j = 2; j < x ; j++) {
                k = x % j;
                if (k == 0) {
                    prime = false;
                    break;
                }
                System.out.println(i+" " + j + " " + k);
            }
            if (prime){
                System.out.print(i + ", rest:" + k);
            }
        }
    }
}


/*
1 Write a program that prints ‘Hello World’ to the screen.
2 Write a program that asks the user for her name and greets her with her name.
3 Modify the previous program such that only the users Alice and Bob are greeted with their names.
4 Write a program that asks the user for a number n and prints the sum of the numbers 1 to n
5 Modify the previous program such that only multiples of three or five are considered in the sum, e.g. 3, 5, 6, 9,
 10, 12, 15 for n=17
6 Write a program that asks the user for a number n and gives him the possibility to choose between computing the sum
 and computing the product of 1,…,n.
7 Write a program that prints a multiplication table for numbers up to 12.
8 Write a program that prints all prime numbers. (Note: if your programming language does not support arbitrary size
 numbers, printing all primes up to the largest number you can easily represent is fine too.)
9 Write a guessing game where the user has to guess a secret number. After every guess the program tells the user
 whether their number was too large or too small. At the end the number of tries needed should be printed. I counts only as one try if they input the same number multiple times consecutively.
10 Write a program that prints the next 20 leap years.
 */