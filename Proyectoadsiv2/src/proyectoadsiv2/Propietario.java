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
public class Propietario {

    List<RegistroEquipo> e = new ArrayList<>();
    private String usuarioTipoDocumento;
    private String usuarioNumDocumento;
    private String equipoIdEquipo;
    RegistroEquipo registroEquipo;

    public Propietario(String usuarioTipoDocumento, String usuarioNumDocumento, String equipoIdEquipo) {
        this.usuarioTipoDocumento = usuarioTipoDocumento;
        this.usuarioNumDocumento = usuarioNumDocumento;
        this.equipoIdEquipo = equipoIdEquipo;
    }

    public String getEquipoIdEquipo() {
        return equipoIdEquipo;
    }

    public void setEquipoIdEquipo(String equipoIdEquipo) {
        this.equipoIdEquipo = equipoIdEquipo;
    }

    public String getUsuarioTipoDocumento() {
        return usuarioTipoDocumento;
    }

    public void setUsuarioTipoDocumento(String usuarioTipoDocumento) {
        this.usuarioTipoDocumento = usuarioTipoDocumento;
    }

    public String getUsuarioNumDocumento() {
        return usuarioNumDocumento;
    }

    public void setUsuarioNumDocumento(String usuarioNumDocumento) {
        this.usuarioNumDocumento = usuarioNumDocumento;
    }

}
