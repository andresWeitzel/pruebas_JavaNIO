/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package versionador.java.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FRANCISCO
 */
@Entity
@Table(name = "proyectos_cab")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProyectosCab.findAll", query = "SELECT p FROM ProyectosCab p"),
    @NamedQuery(name = "ProyectosCab.findByIdProyecto", query = "SELECT p FROM ProyectosCab p WHERE p.idProyecto = :idProyecto"),
    @NamedQuery(name = "ProyectosCab.findByNombre", query = "SELECT p FROM ProyectosCab p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "ProyectosCab.findByDescripcion", query = "SELECT p FROM ProyectosCab p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "ProyectosCab.findByCarpetaBase", query = "SELECT p FROM ProyectosCab p WHERE p.carpetaBase = :carpetaBase"),
    @NamedQuery(name = "ProyectosCab.findByActivo", query = "SELECT p FROM ProyectosCab p WHERE p.activo = :activo"),
    @NamedQuery(name = "ProyectosCab.findByCreadoUsuario", query = "SELECT p FROM ProyectosCab p WHERE p.creadoUsuario = :creadoUsuario"),
    @NamedQuery(name = "ProyectosCab.findByCreadoDia", query = "SELECT p FROM ProyectosCab p WHERE p.creadoDia = :creadoDia")})
public class ProyectosCab implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_proyecto")
    private Integer idProyecto;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "carpeta_base")
    private String carpetaBase;
    @Basic(optional = false)
    @Column(name = "activo")
    private String activo;
    @Basic(optional = false)
    @Column(name = "creado_usuario")
    private String creadoUsuario;
    @Basic(optional = false)
    @Column(name = "creado_dia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoDia;

    public ProyectosCab() {
    }

    public ProyectosCab(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public ProyectosCab(Integer idProyecto, String nombre, String descripcion, String carpetaBase, String activo, String creadoUsuario, Date creadoDia) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.carpetaBase = carpetaBase;
        this.activo = activo;
        this.creadoUsuario = creadoUsuario;
        this.creadoDia = creadoDia;
    }

    public ProyectosCab(String nombre, String descripcion, String carpetaBase, String activo, String creadoUsuario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.carpetaBase = carpetaBase;
        this.activo = activo;
        this.creadoUsuario = creadoUsuario;
    }    

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCarpetaBase() {
        return carpetaBase;
    }

    public void setCarpetaBase(String carpetaBase) {
        this.carpetaBase = carpetaBase;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getCreadoUsuario() {
        return creadoUsuario;
    }

    public void setCreadoUsuario(String creadoUsuario) {
        this.creadoUsuario = creadoUsuario;
    }

    public Date getCreadoDia() {
        return creadoDia;
    }

    public void setCreadoDia(Date creadoDia) {
        this.creadoDia = creadoDia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProyecto != null ? idProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProyectosCab)) {
            return false;
        }
        ProyectosCab other = (ProyectosCab) object;
        if ((this.idProyecto == null && other.idProyecto != null) || (this.idProyecto != null && !this.idProyecto.equals(other.idProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "versionador.java.entidades.ProyectosCab[ idProyecto=" + idProyecto + " ]";
    }
    
}
