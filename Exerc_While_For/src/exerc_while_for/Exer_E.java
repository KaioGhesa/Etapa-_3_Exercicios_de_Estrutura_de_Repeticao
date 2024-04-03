package exerc_while_for;
import java.util.Scanner;
/* e) [for] Desenvolva um programa que exibe a 
tabuada de um número natural escolhido pelo usuário.
Os múltiplos apresentados devem ser de 1 a 10.**/


public class Exer_E {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num, resp =1;
        
        while(resp != 2){
            System.out.print("Digite um numero que deseja saber a tabuada: ");
            num = sc.nextInt();
            
            for (int i=0; i <=10; i++)
            {
                System.out.println(num + "x" + i + "=" + (num*i) );
            }
            System.out.println("Deseja continuar? 1-sim e 2-nao");
            resp = sc.nextInt();
        }
    }
}
