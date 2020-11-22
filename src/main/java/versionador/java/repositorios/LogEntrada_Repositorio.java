package versionador.java.repositorios;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import versionador.java.entidades.LogEntrada;
import versionador.java.interfaces.I_LogEntrada;

public class LogEntrada_Repositorio implements I_LogEntrada{
    
    private EntityManagerFactory emf;

    public LogEntrada_Repositorio(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    
    @Override
    public void save(LogEntrada logEntrada) {
        if(logEntrada == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(logEntrada);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void remove(LogEntrada logEntrada) {
        if(logEntrada == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(logEntrada));
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(LogEntrada logEntrada) {
        if(logEntrada == null) return;
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(logEntrada);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<LogEntrada> getAll() {
        List<LogEntrada> list = new ArrayList();
        EntityManager em=emf.createEntityManager();
        list=(List<LogEntrada>)em.createNamedQuery("LogEntrada.findAll").getResultList();
        return list;
    }
    
}
