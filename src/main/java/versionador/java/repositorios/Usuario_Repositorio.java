package versionador.java.repositorios;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import versionador.java.entidades.Usuario;
import versionador.java.interfaces.I_Usuario;

public class Usuario_Repositorio implements I_Usuario{
    
    private EntityManagerFactory emf;
    
    public Usuario_Repositorio(EntityManagerFactory emf){
        this.emf = emf;
    }

    @Override
    public void save(Usuario usuario) {
        if(usuario == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void remove(Usuario usuario) {
        if(usuario == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(usuario));
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(Usuario usuario) {
        if(usuario == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Usuario> getAll() {
        List<Usuario> list = new ArrayList();
        EntityManager em=emf.createEntityManager();
        list=(List<Usuario>)em.createNamedQuery("Usuario.findAll").getResultList();
        return list;
    }
    
}
