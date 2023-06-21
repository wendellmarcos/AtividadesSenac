/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2;

/**
 *
 * @author Wendell Marcos
 */
public class Hospedagem {
    
    private String descricao;
    private double valorDeDiaria;
    
     public Hospedagem() {
       
    }

    public Hospedagem(String descricao, double valorDeDiaria) {
        this.descricao = descricao;
        this.valorDeDiaria = valorDeDiaria;
    }

   
    
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorDeDiaria() {
        return valorDeDiaria;
    }

    public void setValorDeDiaria(double valorDeDiaria) {
        this.valorDeDiaria = valorDeDiaria;
    }
    
    
    
    
    
}
