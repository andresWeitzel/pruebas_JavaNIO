package versionador.java.interfaces;

import java.util.List;
import versionador.java.entidades.ProyectosCab;

public interface I_ProyectosCab {
    void save(ProyectosCab proyectosCab);
    void remove(ProyectosCab proyectosCab);
    void update(ProyectosCab proyectosCab);
    List<ProyectosCab>getAll();
    
}
