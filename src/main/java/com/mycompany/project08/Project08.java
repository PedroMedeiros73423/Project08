
package com.mycompany.project08;
import java.util.Scanner;

public class Project08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int X = in.nextInt();
        System.out.println("Informe o segundo valor: ");
        int Y = in.nextInt();
        int soma = X + Y;
        System.out.println("A soma dos dois valores é: " + soma);
    }
}