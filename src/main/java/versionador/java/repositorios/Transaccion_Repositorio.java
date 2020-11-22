package versionador.java.repositorios;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import versionador.java.entidades.Transaccion;
import versionador.java.interfaces.I_Transaccion;

public class Transaccion_Repositorio implements I_Transaccion{
    
    private EntityManagerFactory emf;
    
    public Transaccion_Repositorio(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public void save(Transaccion transaccion) {
        if(transaccion == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(transaccion);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void remove(Transaccion transaccion) {
        if(transaccion == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(transaccion));
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(Transaccion transaccion) {
        if(transaccion == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(transaccion);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Transaccion> getAll() {
        List<Transaccion> list = new ArrayList();
        EntityManager em=emf.createEntityManager();
        list=(List<Transaccion>)em.createNamedQuery("Transaccion.findAll").getResultList();
        return list;
    }
    
}
