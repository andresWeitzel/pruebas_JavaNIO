package versionador.java.interfaces;
import java.util.List;
import versionador.java.entidades.LogEntrada;

public interface I_LogEntrada {
    void save(LogEntrada logEntrada);
    void remove(LogEntrada logEntrada);
    void update(LogEntrada logEntrada);
    List<LogEntrada>getAll();
}
