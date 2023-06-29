<<<<<<< HEAD

package atividade2;

/**
 *
 * @author Wendell Marcos
 */
public class Venda {
    
}
=======
package atividade2;

import java.util.Scanner;

/**
 *
 * @author Wendell Marcos
 */
public class Venda {

    /*private String nomeCliente;*/
    private String formaDePagamento;

    private Cliente cliente = new Cliente();
    private PacoteDeViagem pacoteDeViagem = new PacoteDeViagem();

    public void cadastrarVenda( ) {
        Scanner entrada = new Scanner(System.in);
        Venda venda = new Venda();
        
        PacoteDeViagem pacoteDeViagem = new PacoteDeViagem();
        
        cliente.cadastrarCliente();
        pacoteDeViagem.calcularValorDeLucro();
                
        System.out.println("Qual a forma de pagamento? ");
        venda.getFormaDePagamento() = entrada.nextLine();
        entrada.close();
        
        System.out.println(cliente + venda + pacoteDeViagem);
        
        

    }

    public float converterMoeda() {
        Scanner entrada = new Scanner(System.in);
        float reaisConvertido;
        float cotacaoDolar;
                
        System.out.println("Olá, qual o valor para converter em reais? ;");
        pacoteDeViagem.valorDoPacote() = entrada.nextFloat();
        entrada.nextLine();
        
        System.out.println("Qual cotação atual do Dolar? ;");
        cotacaoDolar = entrada.nextFloat();
        entrada.nextLine();
        
        reaisConvertido = cotacaoDolar * pacoteDeViagem.valorDoPacote();
        entrada.close();
        return System.out.println("Valor convertido :" + reaisConvertido);

    }

    public void totalValorPacote() {
        System.out.println("Valor total do pacote de viagens é: " + pacoteDeViagem.valorDoPacote());
    }

    public Venda() {

    }

    public Venda(String formaDePagamento, PacoteDeViagem pacoteDeViagem) {
        this.formaDePagamento = formaDePagamento;
        this.pacoteDeViagem = pacoteDeViagem;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public PacoteDeViagem getPacoteDeViagem() {
        return pacoteDeViagem;
    }

    public void setPacoteDeViagem(PacoteDeViagem pacoteDeViagem) {
        this.pacoteDeViagem = pacoteDeViagem;
    }

}
>>>>>>> 4cde717 (Atualizando classes, criando lógica, adicionando estrutura de controle)
