package exerc_while_for;

import javax.swing.JOptionPane;
/*b) [while] Elabore um programa que recebe valores naturais até que seja digitado o valor zero. 
O programa deverá exibir a média aritmética. Lembre-se: o valor zero apenas
sinaliza o fim da entrada, não deve ser contabilizado.**/

public class Exer_B {
  public static void main(String[] args) {
         double num, padrao = 0;
         int contador = 0;
         
         do {
         num = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero ou digite o 0 para encerrar: "));
         padrao += num;
         contador++;
         } while (num != 0);
  }
}