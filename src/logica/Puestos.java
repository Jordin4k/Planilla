/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Student
 */
public class Puestos {
    private int idPuesto;
    private String nomPuesto;
    private double salario;

    public Puestos(int idPuesto, String nomPuesto, double salario) {
        this.idPuesto = idPuesto;
        this.nomPuesto = nomPuesto;
        this.salario = salario;
    }

    public Puestos() {
        this.idPuesto = 0;
        this.nomPuesto = "";
        this.salario = 0;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getNomPuesto() {
        return nomPuesto;
    }

    public void setNomPuesto(String nomPuesto) {
        this.nomPuesto = nomPuesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
