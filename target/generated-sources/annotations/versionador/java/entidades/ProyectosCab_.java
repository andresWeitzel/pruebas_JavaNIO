package versionador.java.entidades;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-11-21T17:43:17", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(ProyectosCab.class)
public class ProyectosCab_ { 

    public static volatile SingularAttribute<ProyectosCab, String> descripcion;
    public static volatile SingularAttribute<ProyectosCab, Integer> idProyecto;
    public static volatile SingularAttribute<ProyectosCab, String> carpetaBase;
    public static volatile SingularAttribute<ProyectosCab, String> creadoUsuario;
    public static volatile SingularAttribute<ProyectosCab, Date> creadoDia;
    public static volatile SingularAttribute<ProyectosCab, String> nombre;
    public static volatile SingularAttribute<ProyectosCab, String> activo;

}