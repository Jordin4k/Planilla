/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Colaborador {
    private int cedula;
    private String nombre;
    private LocalDate fechaNac;
    private LocalDate fechaIngreso;
    private LocalDate fechaDespido;
    private String direccion;
    private int telefono;
    private String email;
    private Puestos puesto;
    private int cedJefe;

    public Colaborador(int cedula, String nombre, LocalDate fechaNac, LocalDate fechaIngreso, LocalDate fechaDespido, String direccion, int telefono, String email, Puestos puesto, int cedJefe) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.fechaIngreso = fechaIngreso;
        this.fechaDespido = fechaDespido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.puesto = puesto;
        this.cedJefe = cedJefe;
    }

    public Colaborador() {
        this.cedula = 0;
        this.nombre = "";
        this.fechaNac = null;
        this.fechaIngreso = null;
        this.fechaDespido = null;
        this.direccion = "";
        this.telefono = 0;
        this.puesto = null;
        this.cedJefe = 0;
    }
}
