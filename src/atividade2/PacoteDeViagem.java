<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2;

import java.util.Scanner;

/**
 *
 * @author Wendell Marcos
 */
public class PacoteDeViagem {
    
    
    private String destino;
    private int quantidadeDeDias;
    
    private Transporte transporte;
    private Hospedagem hospedagem;
    
    Scanner entrada = new Scanner(System.in);
    
    public double calcularTotalHospedagem( ){
        return         quantidadeDeDias * hospedagem.getValorDeDiaria();
    }
    
    public double calcularValorDeLucro(double margemDesejada, double valorcompra ){
       
        double margemLucro = 0;
        
        System.out.println("Qual o valor da margem desejada ?");
        margemDesejada = entrada.nextDouble();
        
        System.out.println("Qual o valor da compra ?");
        valorcompra = entrada.nextDouble();
        
        
        double lucroTotal = margemDesejada * margemLucro;
        return lucroTotal;
    }
    
    public PacoteDeViagem(){
    }

    public PacoteDeViagem(String destino, int quantidadeDeDias) {
        this.destino = destino;
        this.quantidadeDeDias = quantidadeDeDias;
    }
    
    

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the quantidadeDeDias
     */
    public int getQuantidadeDeDias() {
        return quantidadeDeDias;
    }

    /**
     * @param quantidadeDeDias the quantidadeDeDias to set
     */
    public void setQuantidadeDeDias(int quantidadeDeDias) {
        this.quantidadeDeDias = quantidadeDeDias;
    }

  
    
    
    
    
    
}
=======
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

    private Transporte transporte = new Transporte();
    private Hospedagem hospedagem = new Hospedagem();
    

   public float valorDoPacote() {
       
       PacoteDeViagem pacoteDeViagem = new PacoteDeViagem();
        float valorDoPacote;
         Scanner entrada = new Scanner(System.in);
        

        System.out.println("Qual o tipo de transporte ?: ");
        String tipoTransporte = entrada.next();
        
        valorDoPacote =+ transporte.getValor() + calcularTotalHospedagem() + calcularValorDeLucro() + pacoteDeViagem.calcularValorDeLucro();


        if (tipoTransporte.equalsIgnoreCase(transporte.getAereo())) {
            valorDoPacote = valorDoPacote * 0.10f;
        } else if (tipoTransporte.equalsIgnoreCase(transporte.getMaritimo())) {
            valorDoPacote = valorDoPacote * 0.15f;
        } else if (tipoTransporte.equalsIgnoreCase(transporte.getRodoviario())) {
            valorDoPacote = valorDoPacote * 0.05f;
        }
        
        System.out.println("Quer colocar algum custo adicional SIM OU NÃO ?:");
        String resposta = entrada.nextLine();
        
        if (resposta.equalsIgnoreCase("SIM") || resposta.equalsIgnoreCase("S")){
            System.out.println("Qual o valor que gostaria de adicionar? ");
            float taxaAdicional = entrada.nextFloat();
            valorDoPacote =+ taxaAdicional;
        }
       
        
        System.out.println("Tipo de Transporte  :" + tipoTransporte + "/n Valor do pacote é :");
        entrada.close();
        return valorDoPacote;
    }

    public float calcularTotalHospedagem() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias: ");
        int quantidadeDeDias = entrada.nextInt();
        entrada.nextLine();
        hospedagem.setValorDeDiaria(300f);
        return hospedagem.getValorDeDiaria() * quantidadeDeDias;
    }

    public float calcularValorDeLucro() {
        Scanner entrada = new Scanner(System.in);
        float margemDesejada;
        float valorTotal;
        float lucroTotal;

        System.out.println("Qual o valor da margem desejada ?");
        margemDesejada = entrada.nextFloat();
        
        transporte.setValor(100);
        
        valorTotal = (margemDesejada / 100) * transporte.getValor();
        lucroTotal = valorTotal - transporte.getValor();

        System.out.println("Valor total é :"+ valorTotal + "%.2f" + valorTotal + " o lucro total  é : " + lucroTotal);
        
        entrada.close();
        
     
        return lucroTotal;
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
    public String toString() {
        return "PacoteDeViagem{" + "destino=" + destino + ", quantidadeDeDias=" + quantidadeDeDias + ", transporte=" + transporte + ", hospedagem=" + hospedagem + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.destino);
        hash = 13 * hash + this.quantidadeDeDias;
        hash = 13 * hash + Objects.hashCode(this.transporte);
        hash = 13 * hash + Objects.hashCode(this.hospedagem);
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
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        if (!Objects.equals(this.transporte, other.transporte)) {
            return false;
        }
        return Objects.equals(this.hospedagem, other.hospedagem);
    }



 
}
>>>>>>> 4cde717 (Atualizando classes, criando lógica, adicionando estrutura de controle)
