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
