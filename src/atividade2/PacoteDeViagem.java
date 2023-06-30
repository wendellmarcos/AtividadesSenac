package atividade2;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Wendell Marcos
 */
public class PacoteDeViagem {

    private String destino;
    private int quantidadeDeDias;
    private float taxasAdicionais;
    private Transporte transporte;
    private Hospedagem hospedagem;

    public float valorDoPacote() {

        Scanner in = new Scanner(System.in);
        String tipoTransporte;

        float totalHospedagem = hospedagem.calcularTotalHospedagem();
        float valorTransporte = transporte.getValor();

        System.out.println("Qual o tipo de transporte ?");
        tipoTransporte = in.nextLine();

        System.out.println("Quer colocar algum custo adicional SIM OU NÃO ?:");
        String resposta = in.nextLine();
        float valorDoPacote;

        if (resposta.equalsIgnoreCase("SIM") || resposta.equalsIgnoreCase("S")) {
            System.out.println("Qual o valor que gostaria de adicionar? ");
            taxasAdicionais = in.nextFloat();
            valorDoPacote = +taxasAdicionais;
        }

        System.out.print("Margem de Lucro (%): ");
        float margemLucro = in.nextFloat();

        float valorLucro = (valorTransporte + totalHospedagem + taxasAdicionais) * (margemLucro / 100);
        valorDoPacote = valorTransporte + totalHospedagem + valorLucro + taxasAdicionais;

        if (tipoTransporte.equalsIgnoreCase(transporte.getAereo())) {
            valorDoPacote = valorDoPacote * 0.10f;
        } else if (tipoTransporte.equalsIgnoreCase(transporte.getMaritimo())) {
            valorDoPacote = valorDoPacote * 0.15f;
        } else if (tipoTransporte.equalsIgnoreCase(transporte.getRodoviario())) {
            valorDoPacote = valorDoPacote * 0.05f;
        }
        return valorDoPacote;
    }

    public float calcularTotalHospedagem() {

        Scanner entrada = new Scanner(System.in);
        int quantidadeDeDias;
        float valorTotal;
        float diariaHospedagem;
        
        System.out.println("Qual o valor diária da hospedagem ?");
        diariaHospedagem = entrada.nextFloat();
        
        
        hospedagem.setValorDeDiaria(diariaHospedagem);

        System.out.println("Digite a quantidade de dias: ");
        quantidadeDeDias = entrada.nextInt();

        valorTotal = hospedagem.getValorDeDiaria() * quantidadeDeDias;

        return valorTotal;

    }

    public float calcularValorDeLucro() {
        Scanner entrada = new Scanner(System.in);
        float margemDesejada;
        float valorTotal;
        float lucroTotal;

        System.out.println("Qual o valor da margem desejada ? (Ex: 00,00 ou 00)");
        margemDesejada = entrada.nextFloat();

        transporte.setValor(100);

        valorTotal = (margemDesejada / 100) * transporte.getValor();
        lucroTotal = valorTotal - transporte.getValor();

        System.out.printf("Valor total é: %.2f, o lucro total é: %.2f\n", valorTotal, lucroTotal);

        return lucroTotal;
    }
    
    public void mostrarInformacoes() {
        Cliente cliente = new Cliente();
        PacoteDeViagem pacoteDeViagem = new PacoteDeViagem();
        Venda venda = new Venda();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Qual a cotação atual do Dolar? :");
        float cotacao = in.nextFloat();
        
        System.out.println("--------------- Informações da Venda ---------------");
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("Forma de Pagamento: " + venda.getFormaDePagamento());
        System.out.println("Destino: " + pacoteDeViagem.getDestino());
        System.out.println("Quantidade de dias: " + pacoteDeViagem.getQuantidadeDeDias());
        System.out.println("Valor total do pacote em dólar: " + pacoteDeViagem.valorDoPacote());
        System.out.println("Valor total do pacote em reais: " + (pacoteDeViagem.valorDoPacote() * cotacao));
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public PacoteDeViagem(Transporte transporte, Hospedagem hospedagem) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
    }

    public PacoteDeViagem() {
    }

    public PacoteDeViagem(String destino, int quantidadeDeDias) {
        this.destino = destino;
        this.quantidadeDeDias = quantidadeDeDias;
    }

    public float getTaxasAdicionais() {
        return taxasAdicionais;
    }

    public void setTaxasAdicionais(float taxasAdicionais) {
        this.taxasAdicionais = taxasAdicionais;
    }

    public PacoteDeViagem(float taxasAdicionais) {
        this.taxasAdicionais = taxasAdicionais;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQuantidadeDeDias() {
        return quantidadeDeDias;
    }

    public void setQuantidadeDeDias(int quantidadeDeDias) {
        this.quantidadeDeDias = quantidadeDeDias;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.destino);
        hash = 47 * hash + this.quantidadeDeDias;
        hash = 47 * hash + Float.floatToIntBits(this.taxasAdicionais);
        hash = 47 * hash + Objects.hashCode(this.transporte);
        hash = 47 * hash + Objects.hashCode(this.hospedagem);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PacoteDeViagem other = (PacoteDeViagem) obj;
        if (this.quantidadeDeDias != other.quantidadeDeDias) {
            return false;
        }
        if (Float.floatToIntBits(this.taxasAdicionais) != Float.floatToIntBits(other.taxasAdicionais)) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        if (!Objects.equals(this.transporte, other.transporte)) {
            return false;
        }
        return Objects.equals(this.hospedagem, other.hospedagem);
    }

}
