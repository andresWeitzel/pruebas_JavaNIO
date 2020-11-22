package versionador.java.repositorios;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import versionador.java.entidades.ProyectosCab;
import versionador.java.interfaces.I_ProyectosCab;

public class ProyectosCab_Repositorio implements I_ProyectosCab{

    private EntityManagerFactory emf;

    public ProyectosCab_Repositorio(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
            
    @Override
    public void save(ProyectosCab proyectosCab) {
        if(proyectosCab==null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(proyectosCab);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void remove(ProyectosCab proyectosCab) {
        if(proyectosCab == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(proyectosCab));
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(ProyectosCab proyectosCab) {
        if(proyectosCab == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(proyectosCab);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<ProyectosCab> getAll() {
        List<ProyectosCab> list = new ArrayList();
        EntityManager em=emf.createEntityManager();
        list=(List<ProyectosCab>)em.createNamedQuery("ProyectosCab.findAll").getResultList();
        return list;
    }
    
}