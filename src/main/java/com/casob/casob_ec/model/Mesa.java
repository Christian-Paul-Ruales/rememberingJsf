/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casob.casob_ec.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "mesa")
@NamedQueries({
    @NamedQuery(name = "Mesa.findAll", query = "SELECT m FROM Mesa m"),
    @NamedQuery(name = "Mesa.findByMesaId", query = "SELECT m FROM Mesa m WHERE m.mesaId = :mesaId"),
    @NamedQuery(name = "Mesa.findByMesaNumero", query = "SELECT m FROM Mesa m WHERE m.mesaNumero = :mesaNumero"),
    @NamedQuery(name = "Mesa.findByMesaDescripcion", query = "SELECT m FROM Mesa m WHERE m.mesaDescripcion = :mesaDescripcion")})
public class Mesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mesa_id")
    private Integer mesaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mesa_numero")
    private int mesaNumero;
    @Size(max = 255)
    @Column(name = "mesa_descripcion")
    private String mesaDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mesaMesaAtencion")
    private Collection<AtencionMesa> atencionMesaCollection;

    public Mesa() {
    }

    public Mesa(Integer mesaId) {
        this.mesaId = mesaId;
    }

    public Mesa(Integer mesaId, int mesaNumero) {
        this.mesaId = mesaId;
        this.mesaNumero = mesaNumero;
    }

    public Integer getMesaId() {
        return mesaId;
    }

    public void setMesaId(Integer mesaId) {
        this.mesaId = mesaId;
    }

    public int getMesaNumero() {
        return mesaNumero;
    }

    public void setMesaNumero(int mesaNumero) {
        this.mesaNumero = mesaNumero;
    }

    public String getMesaDescripcion() {
        return mesaDescripcion;
    }

    public void setMesaDescripcion(String mesaDescripcion) {
        this.mesaDescripcion = mesaDescripcion;
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
        hash += (mesaId != null ? mesaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesa)) {
            return false;
        }
        Mesa other = (Mesa) object;
        if ((this.mesaId == null && other.mesaId != null) || (this.mesaId != null && !this.mesaId.equals(other.mesaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.casob.casob_ec.model.Mesa[ mesaId=" + mesaId + " ]";
    }
    
}
