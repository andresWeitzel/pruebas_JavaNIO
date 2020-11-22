package versionador.java.repositorios;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import versionador.java.entidades.Version;
import versionador.java.interfaces.I_Version;

public class Version_Repositorio implements I_Version{
    
    private EntityManagerFactory emf;

    public Version_Repositorio(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    
    @Override
    public void save(Version version) {
        if(version == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(version);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void remove(Version version) {
        if(version == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(version));
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(Version version) {
        if(version == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(version);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Version> getAll() {
        List<Version> list = new ArrayList();
        EntityManager em=emf.createEntityManager();
        list=(List<Version>)em.createNamedQuery("Version.findAll").getResultList();
        return list;
    }
    
}
