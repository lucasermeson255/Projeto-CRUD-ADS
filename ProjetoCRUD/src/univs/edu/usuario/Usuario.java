/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
/**
 *
 * @author LABORATORIO 01
 */
public class Usuario {
   @Id
   @GeneratedValue
    
    private int idUsuario;
   
   @Column(length = 100, nullable = false)
    private String nomeUsuario;
    
    @Column(length = 100, nullable = false, unique = true)
    private String login;
   
    @Column(length = 100, nullable = false)
    private String  senha;

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the nomeUsuario
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param nomeUsuario the nomeUsuario to set
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    /**
     * @return the logim
     */
    public String getLogim() {
        return logim;
    }

    /**
     * @param logim the logim to set
     */
    public void setLogim(String logim) {
        this.logim = logim;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
            
    
}
