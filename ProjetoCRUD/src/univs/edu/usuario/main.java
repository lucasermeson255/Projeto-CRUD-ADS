/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.usuario;

/**
 *
 * @author LABORATORIO 01
 */
public class main {
    
    public static void main(String[] args) {
        
        
        Usuario usuario = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        
        usuario.setLogin("admim");
        usuario.setNomeUsuario("Ermeson Lucas");
        usuario.setSenha("123");
        
        dao.salvar(usuario);
    }
    
}