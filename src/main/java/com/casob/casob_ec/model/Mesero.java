/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casob.casob_ec.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author christian
 */
@Entity
@Table(name = "mesero")
@NamedQueries({
    @NamedQuery(name = "Mesero.findAll", query = "SELECT m FROM Mesero m"),
    @NamedQuery(name = "Mesero.findByMesId", query = "SELECT m FROM Mesero m WHERE m.mesId = :mesId"),
    @NamedQuery(name = "Mesero.findByMesNombre", query = "SELECT m FROM Mesero m WHERE m.mesNombre = :mesNombre"),
    @NamedQuery(name = "Mesero.findByMesUsuario", query = "SELECT m FROM Mesero m WHERE m.mesUsuario = :mesUsuario"),
    @NamedQuery(name = "Mesero.findByMesUsuarioMesPassword", query = "SELECT m FROM Mesero m WHERE m.mesUsuario = :mesUsuario AND m.mesPassword = :mesPassword"),

    @NamedQuery(name = "Mesero.findByMesPassword", query = "SELECT m FROM Mesero m WHERE m.mesPassword = :mesPassword")})
public class Mesero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "mes_id")
    private Integer mesId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "mes_nombre")
    private String mesNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "mes_usuario")
    private String mesUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "mes_password")
    private String mesPassword;
    @OneToMany(mappedBy = "mesMeseroEncargado")
    private Collection<AtencionMesa> atencionMesaCollection;

    public Mesero() {
    }

    public Mesero(Integer mesId) {
        this.mesId = mesId;
    }

    public Mesero(Integer mesId, String mesNombre, String mesUsuario, String mesPassword) {
        this.mesId = mesId;
        this.mesNombre = mesNombre;
        this.mesUsuario = mesUsuario;
        this.mesPassword = mesPassword;
    }

    public Integer getMesId() {
        return mesId;
    }

    public void setMesId(Integer mesId) {
        this.mesId = mesId;
    }

    public String getMesNombre() {
        return mesNombre;
    }

    public void setMesNombre(String mesNombre) {
        this.mesNombre = mesNombre;
    }

    public String getMesUsuario() {
        return mesUsuario;
    }

    public void setMesUsuario(String mesUsuario) {
        this.mesUsuario = mesUsuario;
    }

    public String getMesPassword() {
        return mesPassword;
    }

    public void setMesPassword(String mesPassword) {
        this.mesPassword = mesPassword;
    }

    public Collection<AtencionMesa> getAtencionMesaCollection() {
        return atencionMesaCollection;
    }

    public void setAtencionMesaCollection(Collection<AtencionMesa> atencionMesaCollection) {
        this.atencionMesaCollection = atencionMesaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mesId != null ? mesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesero)) {
            return false;
        }
        Mesero other = (Mesero) object;
        if ((this.mesId == null && other.mesId != null) || (this.mesId != null && !this.mesId.equals(other.mesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.casob.casob_ec.model.Mesero[ mesId=" + mesId + " ]";
    }
    
}
