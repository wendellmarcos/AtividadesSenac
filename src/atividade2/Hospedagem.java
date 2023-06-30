
package atividade2;

import java.util.Scanner;

/**
 *
 * @author Wendell Marcos
 */
public class Hospedagem {
    
    private String descricao;
    private float valorDeDiaria;
    
    
    
   
    
     public Hospedagem() {
       
    }
     
      public float calcularTotalHospedagem() {
        
          
         Scanner in = new Scanner(System.in);
         float totalHospedagem;
         int quantidadeDias;
         
        System.out.println("Qual a quantidade de dia? :");
        quantidadeDias = in.nextInt();
        in.nextLine();
        totalHospedagem = valorDeDiaria * quantidadeDias;
        return totalHospedagem; 
    }

    public Hospedagem(String descricao, float valorDeDiaria) {
        this.descricao = descricao;
        this.valorDeDiaria = valorDeDiaria;
    }

   

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorDeDiaria() {
        return valorDeDiaria;
    }

    public void setValorDeDiaria(float valorDeDiaria) {
        this.valorDeDiaria = valorDeDiaria;
    }
    
    
    
    
    
}
