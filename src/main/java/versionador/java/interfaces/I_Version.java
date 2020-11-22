package versionador.java.interfaces;

import java.util.List;
import versionador.java.entidades.Version;

public interface I_Version {
    void save(Version version);
    void remove(Version version);
    void update(Version version);
    List<Version>getAll();
    
}
