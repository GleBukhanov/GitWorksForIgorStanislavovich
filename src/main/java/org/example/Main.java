package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        Calculator calculator=new Calculator();
        calculator.add(a,b);
        calculator.subtract(a,b);
        calculator.devide(a,b);
        calculator.multiply(a,b);

    }
}