package testes;

public class Operadores {

    public static  void main(String[] args){
        int x = 30;
        int y = 25;

        int soma = x + y;
        int subtracao = x - y;
        int mult = x * y;
        int div = x / y;
        int rdiv = x % y;

        System.out.println("Resultado da soma:"+soma);
        System.out.println("Resultado da subtração:"+subtracao);
        System.out.println("Resultado da multiplicação:"+mult);
        System.out.println("Resultado da divisão:"+div);
        System.out.println("Resultado resto da divisão:"+rdiv);
    }
}
