package versionador.java.entidades;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import versionador.java.entidades.Usuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-11-28T15:11:40", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(LogEntrada.class)
public class LogEntrada_ { 

    public static volatile SingularAttribute<LogEntrada, Date> fecha;
    public static volatile SingularAttribute<LogEntrada, String> pc;
    public static volatile SingularAttribute<LogEntrada, String> ip;
    public static volatile SingularAttribute<LogEntrada, Usuario> idUsuario;

}