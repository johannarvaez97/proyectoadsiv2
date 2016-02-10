/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoadsiv2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Equipo {
    List<Propietario> p = new ArrayList<>(); 
    private String idEquipo;
    private String Marca;
    private String numSerial;
    private String Descripcion;

    public Equipo(String idEquipo, String Marca, String numSerial, String Descripcion) {
        this.idEquipo = idEquipo;
        this.Marca = Marca;
        this.numSerial = numSerial;
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getNumSerial() {
        return numSerial;
    }

    public void setNumSerial(String numSerial) {
        this.numSerial = numSerial;
    }
    
}
