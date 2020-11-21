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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "log_entrada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogEntrada.findAll", query = "SELECT l FROM LogEntrada l"),
    @NamedQuery(name = "LogEntrada.findByIp", query = "SELECT l FROM LogEntrada l WHERE l.ip = :ip"),
    @NamedQuery(name = "LogEntrada.findByPc", query = "SELECT l FROM LogEntrada l WHERE l.pc = :pc"),
    @NamedQuery(name = "LogEntrada.findByFecha", query = "SELECT l FROM LogEntrada l WHERE l.fecha = :fecha")})
public class LogEntrada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @Column(name = "pc")
    private String pc;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public LogEntrada() {
    }

    public LogEntrada(String ip) {
        this.ip = ip;
    }

    public LogEntrada(String ip, String pc, Date fecha) {
        this.ip = ip;
        this.pc = pc;
        this.fecha = fecha;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        hash += (ip != null ? ip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogEntrada)) {
            return false;
        }
        LogEntrada other = (LogEntrada) object;
        if ((this.ip == null && other.ip != null) || (this.ip != null && !this.ip.equals(other.ip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "versionador.java.entidades.LogEntrada[ ip=" + ip + " ]";
    }
    
}
