package exercicio;

/**
Áries: de 21 de março a 20 de abril;
Touro: de 21 de abril a 20 de maio;
Gêmeos: de 21 de maio a 20 de junho;
Câncer: de 21 de junho a 22 de julho;
Leão: de 23 de julho a 22 de agosto;
Virgem: de 23 de agosto a 22 de setembro;
Libra: de 23 de setembro a 22 de outubro;
Escorpião: de 23 de outubro a 21 de novembro;
Sagitário: de 22 de novembro a 21 de dezembro;
Capricórnio: de 22 de dezembro a 20 de janeiro;
Aquário: de 21 de janeiro a 18 de fevereiro;
Peixes: de 19 de fevereiro a 20 de março;
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o dia que nasceu: ");
        int dia = teclado.nextInt();

        System.out.print("Digite o mes que nasceu: ");
        int mes = teclado.nextInt();

        teclado.close();

        if (dia >= 21 && mes == 3 || dia <= 20 && mes == 4) {
            System.out.println("Áries");
        }
        else if (dia >= 21 && mes == 4 || dia <= 20 && mes == 5) {
            System.out.println("Touro");
        }
        else if (dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {
            System.out.println("Gêmeos");
        }
        else if (dia >= 21 && mes == 6 || dia <= 22 && mes == 7) {
            System.out.println("Câncer");
        }
        else if (dia >= 23 && mes == 7 || dia <= 22 && mes == 8) {
            System.out.println("Leão");
        }
        else if (dia >= 23 && mes == 8 || dia <= 22 && mes == 9) {
            System.out.println("Virgem");
        }
        else if (dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {
            System.out.println("Libra");
        }
        else if (dia >= 23 && mes == 10 || dia <= 21 && mes == 11) {
            System.out.println("Escorpião");
        }
        else if (dia >= 22 && mes == 11 || dia <= 21 && mes == 12) {
            System.out.println("Sagitário");
        }
        else if (dia >= 22 && mes == 12 || dia <= 20 && mes == 1) {
            System.out.println("Capricórnio");
        }
        else if (dia >= 21 && mes == 1 || dia <= 18 && mes == 2) {
            System.out.println("Aquário");
        }
        else if (dia >= 19 && mes == 2 || dia <= 20 && mes == 3) {
            System.out.println("Peixes");
        }
    }
}
