package atividade2;

import java.util.Scanner;

/**
 *
 * @author Wendell Marcos
 */
public class Venda {

    /*private String nomeCliente;*/
    private String formaDePagamento;

    private Cliente cliente;
    private PacoteDeViagem pacoteDeViagem;

    public void cadastrarVenda( ) {
        Scanner entrada = new Scanner(System.in);
        Venda venda = new Venda();
        
        
        System.out.println("Qual a forma de pagamento? ");
        if (entrada.hasNextLine()) {
        formaDePagamento = entrada.nextLine();
    }
       // formaDePagamento = entrada.nextLine();
        venda.setFormaDePagamento(formaDePagamento);
      
        
        System.out.println(cliente + venda.getFormaDePagamento());
        
        

    }

    public void converterMoeda( ) {
        Scanner in = new Scanner(System.in);
        float cotacaoDolar;
      
        System.out.println("Olá qual a cotação atual do dolar ? ");
        cotacaoDolar = in.nextFloat();
        float TotalDolar = pacoteDeViagem.valorDoPacote();
        float TotalReal = TotalDolar * cotacaoDolar; 
        
            
        System.out.println("Valor total do pacote em dólar: " + TotalDolar);
        System.out.println("Valor total do pacote em reais: " + TotalReal);
       
    }
    
    public void infoTotal( ) {
        
        Venda venda = new Venda();
        PacoteDeViagem pacoteDeViagem = new PacoteDeViagem();
        Scanner in = new Scanner(System.in);
        float cotacao;
        
        System.out.println("--- Informações da Venda ---");
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("Forma de Pagamento: " + venda.formaDePagamento);
        System.out.println("Destino: " + pacoteDeViagem.getDestino());
        System.out.println("Quantidade de dias: " + pacoteDeViagem.getDestino());
        System.out.println("Valor total do pacote em dólar: " + venda.getPacoteDeViagem());
        System.out.println("Cotação atual do Dolar ? ");
        cotacao = in.nextFloat();
        in.nextLine();
        System.out.println("Valor total do pacote em reais: " + pacoteDeViagem.valorDoPacote() * cotacao);
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