/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2;

/**
 *
 * @author Wendell Marcos
 */
public class Transporte {
    
    private String aereo;
    private String maritimo;
    private String rodoviario;
    private Double valor;
    
    public Transporte() {
      
    }

    public Transporte(String aereo, String maritimo, String rodoviario, double valor) {
        this.aereo = aereo;
        this.maritimo = maritimo;
        this.rodoviario = rodoviario;
        this.valor = valor;
    }

    
    
    
    public String getAereo() {
        return aereo;
    }

    public void setAereo(String aereo) {
        this.aereo = aereo;
    }

    public String getMaritimo() {
        return maritimo;
    }

    public void setMaritimo(String maritimo) {
        this.maritimo = maritimo;
    }

    public String getRodoviario() {
        return rodoviario;
    }

    public void setRodoviario(String rodoviario) {
        this.rodoviario = rodoviario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

   
}


