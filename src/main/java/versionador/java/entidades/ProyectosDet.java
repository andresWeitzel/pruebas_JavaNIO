/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package versionador.java.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FRANCISCO
 */
@Entity
@Table(name = "proyectos_det")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProyectosDet.findAll", query = "SELECT p FROM ProyectosDet p"),
    @NamedQuery(name = "ProyectosDet.findByIdArchivo", query = "SELECT p FROM ProyectosDet p WHERE p.idArchivo = :idArchivo"),
    @NamedQuery(name = "ProyectosDet.findByIdProyecto", query = "SELECT p FROM ProyectosDet p WHERE p.idProyecto = :idProyecto"),
    @NamedQuery(name = "ProyectosDet.findByArchivo", query = "SELECT p FROM ProyectosDet p WHERE p.archivo = :archivo"),
    @NamedQuery(name = "ProyectosDet.findByDestino", query = "SELECT p FROM ProyectosDet p WHERE p.destino = :destino")})
public class ProyectosDet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_archivo")
    private Integer idArchivo;
    @Basic(optional = false)
    @Column(name = "id_proyecto")
    private int idProyecto;
    @Basic(optional = false)
    @Column(name = "archivo")
    private String archivo;
    @Basic(optional = false)
    @Column(name = "destino")
    private String destino;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public ProyectosDet() {
    }

    public ProyectosDet(Integer idArchivo) {
        this.idArchivo = idArchivo;
    }

    public ProyectosDet(Integer idArchivo, int idProyecto, String archivo, String destino) {
        this.idArchivo = idArchivo;
        this.idProyecto = idProyecto;
        this.archivo = archivo;
        this.destino = destino;
    }

    public Integer getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(Integer idArchivo) {
        this.idArchivo = idArchivo;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArchivo != null ? idArchivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProyectosDet)) {
            return false;
        }
        ProyectosDet other = (ProyectosDet) object;
        if ((this.idArchivo == null && other.idArchivo != null) || (this.idArchivo != null && !this.idArchivo.equals(other.idArchivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "versionador.java.entidades.ProyectosDet[ idArchivo=" + idArchivo + " ]";
    }
    
}
