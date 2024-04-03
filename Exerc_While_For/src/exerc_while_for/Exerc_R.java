package exerc_while_for;

public class Exerc_R {
    public static void main(String[] args) {
        int alturaFulano = 160;
        int alturaCiclano = 110;
        int crescimentoFulano = 2;
        int crescimentoCiclano = 3;
        
        int anos = 0;
        
        while (alturaCiclano <= alturaFulano){
        alturaFulano += crescimentoFulano;
        alturaCiclano += crescimentoCiclano;
        anos ++;
        }
        System.out.println("Ciclano vai ser mais altura que Ciclano em: " + anos + " anos");
    }
}
