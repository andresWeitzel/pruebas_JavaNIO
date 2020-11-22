package versionador.java.interfaces;
import java.util.List;
import versionador.java.entidades.Transaccion;

public interface I_Transaccion {
    void save(Transaccion transaccion);
    void remove(Transaccion transaccion);
    void update(Transaccion transaccion);
    List<Transaccion>getAll();
}
