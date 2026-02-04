package testes;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor inteiro:");
        int n = leitor.nextInt();

        if(n%2==0){
            System.out.println("O número é par");
        }else {
            System.out.println("O número é ímpar");
        }
    }
}
