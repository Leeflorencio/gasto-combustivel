import java.text.DecimalFormat;
import java.util.Scanner;

public class GastoCombustivel {

    public static void main(String[] args) {
        /*
        Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem,
         ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através
         de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas)
         e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida,
         calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.
         */

        Scanner sc = new Scanner(System.in);

        DecimalFormat result = new DecimalFormat("0.000");

        System.out.println("Forneça o tempo gasto na viagem (em horas): ");
        int tempoEmHoras = sc.nextInt();

        System.out.println("Forneça a velocidade média durante a viagem (em km/h): ");
        int velocidadePorKm = sc.nextInt();

        double litrosPorViagem = ((double)tempoEmHoras * velocidadePorKm) / 12;
        System.out.println(result.format(litrosPorViagem));
    }
}
