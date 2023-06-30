
package atividade2;


import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Wendell Marcos
 */
public class Cliente {
    
    private String nome;
    private String telefone;
    private String endereco;
    
  
    
    
    public void  cadastrarCliente(){
        
                
       Scanner in = new Scanner(System.in);
       
            Cliente cliente = new Cliente( nome, telefone, endereco);
            
            System.out.println("Digite o nome do cliente: ");
            nome = in.nextLine(); 
            cliente.setNome(nome);
            
            System.out.println("Digite o telefone: ");
            telefone = in.nextLine();
            cliente.setTelefone(telefone);
            
            System.out.println("Digite o endereço: ");
            endereco = in.nextLine();
            cliente.setEndereco(endereco);
            
            System.out.println("************************************************************ \n" ); 
            System.out.println("Cliente cadastrado com sucesso!");
            System.out.println("Segue abaixo dados do cliente: \n" + cliente);
            System.out.println("************************************************************ \n" );
            
            
          
    }
    
    public void mostrarCliente(){
        
        Cliente cliente = new Cliente( nome, telefone, endereco);
        System.out.println("************************************************************" );
        System.out.println("Dados do cliente: " + cliente.getNome() +"/n" + cliente.getTelefone()  +"/n"+ cliente.getEndereco());
        System.out.println("************************************************************" );
        
      
    }
    
    
    public Cliente(){
        
    }

    public Cliente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.telefone);
        hash = 79 * hash + Objects.hashCode(this.endereco);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        return Objects.equals(this.endereco, other.endereco);
    }
    
    
    
    
}
