<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2;

/**
 *
 * @author Wendell Marcos
 */
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
=======

package atividade2;

import java.util.Scanner;

/**
 *
 * @author Wendell Marcos
 */
public class Atividade2 {


    public static void main(String[] args) {
        
       
        Cliente cliente = new Cliente();
        PacoteDeViagem pacoteDeViagem = new PacoteDeViagem();
        
         Venda venda = new Venda();
        
        
        System.out.println("************************************************************ \n" );
        System.out.println("Olá, vamos começar a cotação do seu pacote! " );
        System.out.println("Informe os dados solicitado !" );
        
        System.out.println("************************************************************ \n" );
        
        /*System.out.println("Qual o nome do cliente");
        venda.setNomeCliente(entrada.nextLine());*/
        cliente.cadastrarCliente();
        System.out.println("************************************************************ \n" );
        
        venda.cadastrarVenda();
        System.out.println("************************************************************ \n" );
        pacoteDeViagem.calcularTotalHospedagem();
        System.out.println("************************************************************ \n" );
        pacoteDeViagem.calcularValorDeLucro();
        System.out.println("************************************************************ \n" );
        venda.converterMoeda();
        System.out.println("************************************************************ \n" );
        
        
        System.out.println("Segue os dados da cotação: " );
        
        
        
    }
    
}
>>>>>>> 4cde717 (Atualizando classes, criando lógica, adicionando estrutura de controle)
