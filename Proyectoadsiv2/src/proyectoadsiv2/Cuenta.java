/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoadsiv2;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private String contraseña;
    private String rol;
    private String usuarioTipoDocumento;
    private String usuarioNumDocumento;
    private String correoElectronico;

    public Cuenta(String contraseña, String rol, String usuarioTipoDocumento, String usuarioNumDocumento, String correoElectronico) {
        this.contraseña = contraseña;
        this.rol = rol;
        this.usuarioTipoDocumento = usuarioTipoDocumento;
        this.usuarioNumDocumento = usuarioNumDocumento;
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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
