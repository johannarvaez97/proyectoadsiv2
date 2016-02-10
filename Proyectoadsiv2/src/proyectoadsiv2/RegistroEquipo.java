/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoadsiv2;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class RegistroEquipo {

    private int registroNumRegistro;
    private String EquipoIdEquipo;
    private String UsuarioTipoDocumento;
    private String usuarioNumDocumento;
    private Date fechaEntrada;
    private Date horaEntrada;
    private Date fechaSalida;
    private Date horaSalida;
    
   

   

    public int getRegistroNumRegistro() {
        return registroNumRegistro;
    }

    public void setRegistroNumRegistro(int registroNumRegistro) {
        this.registroNumRegistro = registroNumRegistro;
    }

    
    public String getEquipoIdEquipo() {
        return EquipoIdEquipo;
    }

    public void setEquipoIdEquipo(String EquipoIdEquipo) {
        this.EquipoIdEquipo = EquipoIdEquipo;
    }

    public String getUsuarioTipoDocumento() {
        return UsuarioTipoDocumento;
    }

  
    public void setUsuarioTipoDocumento(String UsuarioTipoDocumento) {
        this.UsuarioTipoDocumento = UsuarioTipoDocumento;
    }

   
    public String getUsuarioNumDocumento() {
        return usuarioNumDocumento;
    }

   
    public void setUsuarioNumDocumento(String usuarioNumDocumento) {
        this.usuarioNumDocumento = usuarioNumDocumento;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

}
