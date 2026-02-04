package testes;

public class Exercicio01 {
    public static void main(String[] args){
        float ps = 7;
        float tcc = 5;
        float ai1 = 10;
        float ai2 = 8;

        float mediaAi =(ai1+ai2)/2;
        double mediaFinal = ps * 0.5 + tcc * 0.3 + mediaAi * 0.2;

        System.out.println("A média final é "+mediaFinal);

        if(mediaFinal >= 6){
            System.out.println("você foi aprovado");
        }else if (mediaFinal>=3 && mediaFinal < 6){
            System.out.println("você está de prova final");
        }else {
            System.out.println("você foi reprovado");
        }
    }
}
