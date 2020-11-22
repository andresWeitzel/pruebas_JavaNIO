package versionador.java.interfaces;
import java.util.List;
import versionador.java.entidades.ProyectosDet;

public interface I_ProyectosDet {
    void save(ProyectosDet proyectosDet);
    void remove(ProyectosDet proyectosDet);
    void update(ProyectosDet proyectosDet);
    List<ProyectosDet>getAll();
    
}
