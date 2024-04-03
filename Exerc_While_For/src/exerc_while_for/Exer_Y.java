
package exerc_while_for;


/* y) Um funcionário de uma empresa recebe bonificação salarial anualmente. 
Sabe-se que ele foi contratado em 2000 com salário de R$ 1.000,00. 
Em 2001 recebeu bonificação de 0,5% sobre o salário inicial e ano a ano passou
a receber porcentagem em dobro do ano anterior, sempre em relação ao salarial inicial. 
Faça um programa que mostre ano a ano o salário do funcionário, 
desde que foi admitido até 2017.**/

public class Exer_Y {
    public static void main(String[] args) {
        
        double salarioInicial = 1000.0; //R$1.000,00 (Salario)
        double bonus = 0.005; //0.5%
        
        int anoInicial = 2000;
        int anoFinal = 2017;
        
        double salarioAtual = salarioInicial;
        
        System.out.println("Ano\tSalario");
        
        for (int ano = anoInicial; ano <= anoFinal; ano++){
        salarioAtual += salarioAtual * bonus; //Para adicionar o aumento anual
            System.out.println(ano + "\tR$ " + String.format("%.2f,", salarioAtual));
            bonus *=2; //Dobrar o aumento para proximo ano
            
        }
    }
}
