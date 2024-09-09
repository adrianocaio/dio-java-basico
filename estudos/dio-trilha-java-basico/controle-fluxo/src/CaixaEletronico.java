
//Condicional Simples:

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 40.0;

        if (valorSolicitado < saldo) 
            saldo = saldo - valorSolicitado;
           
        else
            System.out.println("saldo insuficiente");
            
            System.out.println("seu saldo é de: " + saldo);
        
    }
}
