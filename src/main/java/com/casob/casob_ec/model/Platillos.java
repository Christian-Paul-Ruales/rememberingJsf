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
@Table(name = "platillos")
@NamedQueries({
    @NamedQuery(name = "Platillos.findAll", query = "SELECT p FROM Platillos p"),
    @NamedQuery(name = "Platillos.findByPlatId", query = "SELECT p FROM Platillos p WHERE p.platId = :platId"),
    @NamedQuery(name = "Platillos.findByPlatNombre", query = "SELECT p FROM Platillos p WHERE p.platNombre = :platNombre"),
    @NamedQuery(name = "Platillos.findByPlatDetalle", query = "SELECT p FROM Platillos p WHERE p.platDetalle = :platDetalle")})
public class Platillos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "plat_id")
    private Integer platId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "plat_nombre")
    private String platNombre;
    @Size(max = 255)
    @Column(name = "plat_detalle")
    private String platDetalle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "platPlatillo")
    private Collection<PlatillosOrden> platillosOrdenCollection;

    public Platillos() {
    }

    public Platillos(Integer platId) {
        this.platId = platId;
    }

    public Platillos(Integer platId, String platNombre) {
        this.platId = platId;
        this.platNombre = platNombre;
    }

    public Integer getPlatId() {
        return platId;
    }

    public void setPlatId(Integer platId) {
        this.platId = platId;
    }

    public String getPlatNombre() {
        return platNombre;
    }

    public void setPlatNombre(String platNombre) {
        this.platNombre = platNombre;
    }

    public String getPlatDetalle() {
        return platDetalle;
    }

    public void setPlatDetalle(String platDetalle) {
        this.platDetalle = platDetalle;
    }

    public Collection<PlatillosOrden> getPlatillosOrdenCollection() {
        return platillosOrdenCollection;
    }

    public void setPlatillosOrdenCollection(Collection<PlatillosOrden> platillosOrdenCollection) {
        this.platillosOrdenCollection = platillosOrdenCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (platId != null ? platId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platillos)) {
            return false;
        }
        Platillos other = (Platillos) object;
        if ((this.platId == null && other.platId != null) || (this.platId != null && !this.platId.equals(other.platId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.casob.casob_ec.model.Platillos[ platId=" + platId + " ]";
    }
    
}
