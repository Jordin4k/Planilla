/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.ArrayList;
import logica.Puestos;

/**
 *
 * @author Student
 */
public class AlmacenamientoPuestos {
    private ArrayList<Puestos> listaPuestos;

    public AlmacenamientoPuestos() {
        this.listaPuestos = new ArrayList();
    }

    public ArrayList<Puestos> getListaPuestos() {
        return listaPuestos;
    }

    public void setListaPuestos(ArrayList<Puestos> listaPuestos) {
        this.listaPuestos = listaPuestos;
    }
    public void insertarPuesto(Puestos puesto){
        if(this.listaPuestos != null){
            this.listaPuestos.add(puesto);
        }
    }
    public void editarPuesto(int index, Puestos newPuesto){
        if(index >= 0 && newPuesto != null && !listaPuestos.isEmpty()){
            this.listaPuestos.set(index, newPuesto);
        }
    }

    public boolean eliminarPuesto(Puestos puesto) {
        if (this.listaPuestos.contains(puesto)) {
            this.listaPuestos.remove(puesto);
            return true;
        } 
        else {
            return false; //puesto no existe en el array
        }
    
        
    }
    
}
