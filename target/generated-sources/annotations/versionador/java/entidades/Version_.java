package versionador.java.entidades;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import versionador.java.entidades.Transaccion;
import versionador.java.entidades.Usuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-11-21T17:43:17", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Version.class)
public class Version_ { 

    public static volatile SingularAttribute<Version, Date> fecha;
    public static volatile SingularAttribute<Version, Transaccion> idTransaccion;
    public static volatile SingularAttribute<Version, String> tipo;
    public static volatile SingularAttribute<Version, Usuario> idUsuario;
    public static volatile SingularAttribute<Version, Integer> idVersion;
    public static volatile SingularAttribute<Version, Integer> idArchivo;

}