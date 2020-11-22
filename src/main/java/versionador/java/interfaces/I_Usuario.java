package versionador.java.interfaces;
import java.util.List;
import versionador.java.entidades.Usuario;

public interface I_Usuario {
    void save(Usuario usuario);
    void remove(Usuario usuario);
    void update(Usuario usuario);
    List<Usuario>getAll();
}
