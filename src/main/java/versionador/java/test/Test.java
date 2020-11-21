package versionador.java.test;

import java.time.LocalDateTime;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import versionador.java.entidades.ProyectosCab;
import versionador.java.interfaces.I_ProyectosCab;
import versionador.java.repositorios.ProyectosCab_Repositorio;

public class Test {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
        
//        LocalDateTime dia=LocalDateTime.now()
;
        
        I_ProyectosCab pcr = new ProyectosCab_Repositorio(emf);
        
        ProyectosCab proyectosCab = new ProyectosCab("Pepito", "prueba de consistencia con la base", "c:/sadsa/adsad/sdasd", "NO", "24");
        pcr.save(proyectosCab);
        System.out.println("************************");
        System.out.println("");
        System.out.println(proyectosCab);
        
        emf.close();

    }
}
