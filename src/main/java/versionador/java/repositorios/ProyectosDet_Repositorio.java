package versionador.java.repositorios;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import versionador.java.entidades.ProyectosDet;
import versionador.java.interfaces.I_ProyectosDet;

public class ProyectosDet_Repositorio implements I_ProyectosDet{
    
    private EntityManagerFactory emf;

    public ProyectosDet_Repositorio(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    
    @Override
    public void save(ProyectosDet proyectosDet) {
        if(proyectosDet == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(proyectosDet);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void remove(ProyectosDet proyectosDet) {
        if(proyectosDet == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(proyectosDet));
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(ProyectosDet proyectosDet) {
        if(proyectosDet == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(proyectosDet);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<ProyectosDet> getAll() {
        List<ProyectosDet> list = new ArrayList();
        EntityManager em=emf.createEntityManager();
        list=(List<ProyectosDet>)em.createNamedQuery("ProyectosDet.findAll").getResultList();
        return list;
    }
    
}
