package versionador.java.entidades;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import versionador.java.entidades.Usuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-11-21T17:43:17", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(ProyectosDet.class)
public class ProyectosDet_ { 

    public static volatile SingularAttribute<ProyectosDet, Integer> idProyecto;
    public static volatile SingularAttribute<ProyectosDet, String> archivo;
    public static volatile SingularAttribute<ProyectosDet, Usuario> idUsuario;
    public static volatile SingularAttribute<ProyectosDet, Integer> idArchivo;
    public static volatile SingularAttribute<ProyectosDet, String> destino;

}