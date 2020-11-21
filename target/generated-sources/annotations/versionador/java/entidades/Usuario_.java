package versionador.java.entidades;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import versionador.java.entidades.LogEntrada;
import versionador.java.entidades.ProyectosDet;
import versionador.java.entidades.Transaccion;
import versionador.java.entidades.Version;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-11-20T21:14:00", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile CollectionAttribute<Usuario, Version> versionCollection;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile CollectionAttribute<Usuario, ProyectosDet> proyectosDetCollection;
    public static volatile CollectionAttribute<Usuario, LogEntrada> logEntradaCollection;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile CollectionAttribute<Usuario, Transaccion> transaccionCollection;

}