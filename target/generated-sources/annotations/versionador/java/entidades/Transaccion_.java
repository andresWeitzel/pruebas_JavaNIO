package versionador.java.entidades;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import versionador.java.entidades.Usuario;
import versionador.java.entidades.Version;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-11-20T21:14:00", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Transaccion.class)
public class Transaccion_ { 

    public static volatile SingularAttribute<Transaccion, Integer> idTransaccion;
    public static volatile SingularAttribute<Transaccion, Date> fecha;
    public static volatile CollectionAttribute<Transaccion, Version> versionCollection;
    public static volatile SingularAttribute<Transaccion, Usuario> idUsuario;
    public static volatile SingularAttribute<Transaccion, String> comentario;

}