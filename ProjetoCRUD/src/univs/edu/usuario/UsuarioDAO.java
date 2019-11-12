/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.usuario;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import univs.edu.util.HibernateUtil;

/**
 *
 * @author LABORATORIO 01
 */
public class UsuarioDAO {

    private Session sessao;
    private Transaction trasacao;

    public void salvar(Usuario usuario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        trasacao = sessao.beginTransaction();
        if (usuario.getIdUsuario() == 0) {
            sessao.save(usuario);

        } else {
            sessao.update(usuario);

        }
        trasacao.commit();
        sessao.close();

    }

    public void excluir(Usuario usuario) {

        sessao = HibernateUtil.getSessionFactory().openSession();
        trasacao = sessao.beginTransaction();
        sessao.delete(usuario);
        trasacao.commit();
        sessao.close();

    }

    public Usuario pesquisar(int id) {

        sessao = HibernateUtil.getSessionFactory().openSession();
        trasacao = sessao.beginTransaction();
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("idUsuario", id)).uniqueResult();

        return usuario;

    }

    public List<Usuario> pesquisar() {

        sessao = HibernateUtil.getSessionFactory().openSession();
        trasacao = sessao.beginTransaction();
        List<Usuario> usuarios = sessao.createCriteria(Usuario.class).list();

        return usuarios;

    }

}
