
package pct;

import java.util.Scanner;


public class Horoscopo {
    public static void main(String[] args) {
        //Declaração de variáveis 
        int mes, dia;
        
        //Criação e intância de objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação 
        System.out.println("\n\t\t\t Validador de signos\n");
        
        //Entrada de dados
        System.out.println("\n\t\t\t Digite o dia de seu nascimento:\n");
        dia = entrada.nextInt();
        System.out.println("\n\t\t\t Digite o mês de seu nascimento:\n");
        mes = entrada.nextInt();
        
        //Processamento e saída
       if ((mes == 3 && dia  >= 21) || (mes == 4 && dia <= 19)){
           System.out.println("Seu signo é ARIES!");
       } else if ((mes == 4 && dia >= 20)|| (mes == 5 && dia <=20)){
           System.out.println("Seu signo é TOURO!");
       } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20 )){
           System.out.println("Seu signo é GÊMEOS!");
       } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)){
           System.out.println("Seu signo é CÂNCER");
       } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)){
           System.out.println("Seu signo é LEÃO!");
       } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)){
           System.out.println("Seu signo é VIRGEM!");
       } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)){
           System.out.println("Seu signo é LIBRA!");
       } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)){
           System.out.println("Seu signo é ESCORPIÃO!");
       } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)){
           System.out.println("Seu signo é SAGITÁRIO!");
       } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)){
           System.out.println("Seu signo é CAPRICÓRNIO!");
       } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)){
           System.out.println("Seu signo é AQUÁRIO!");
       } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)){
           System.out.println("Seu signo é PEIXES!");
       }
           
    }
    
}
