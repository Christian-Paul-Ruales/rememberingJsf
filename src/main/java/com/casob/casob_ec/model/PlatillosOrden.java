/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casob.casob_ec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author christian
 */
@Entity
@Table(name = "platillos_orden")
@NamedQueries({
    @NamedQuery(name = "PlatillosOrden.findAll", query = "SELECT p FROM PlatillosOrden p"),
    @NamedQuery(name = "PlatillosOrden.findByPlaoId", query = "SELECT p FROM PlatillosOrden p WHERE p.plaoId = :plaoId"),
    @NamedQuery(name = "PlatillosOrden.findByPlaoFechaServido", query = "SELECT p FROM PlatillosOrden p WHERE p.plaoFechaServido = :plaoFechaServido"),
    @NamedQuery(name = "PlatillosOrden.findByPlaoServido", query = "SELECT p FROM PlatillosOrden p WHERE p.plaoServido = :plaoServido"),
    @NamedQuery(name = "PlatillosOrden.findByPlaoDetalle", query = "SELECT p FROM PlatillosOrden p WHERE p.plaoDetalle = :plaoDetalle")})
public class PlatillosOrden implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "plao_id")
    private Integer plaoId;
    @Column(name = "plao_fecha_servido")
    @Temporal(TemporalType.DATE)
    private Date plaoFechaServido;
    @Column(name = "plao_servido")
    private Integer plaoServido;
    @Size(max = 255)
    @Column(name = "plao_detalle")
    private String plaoDetalle;
    @JoinColumn(name = "ate_orden", referencedColumnName = "ate_id")
    @ManyToOne(optional = false)
    private AtencionMesa ateOrden;
    @JoinColumn(name = "plat_platillo", referencedColumnName = "plat_id")
    @ManyToOne(optional = false)
    private Platillos platPlatillo;

    public PlatillosOrden() {
    }

    public PlatillosOrden(Integer plaoId) {
        this.plaoId = plaoId;
    }

    public Integer getPlaoId() {
        return plaoId;
    }

    public void setPlaoId(Integer plaoId) {
        this.plaoId = plaoId;
    }

    public Date getPlaoFechaServido() {
        return plaoFechaServido;
    }

    public void setPlaoFechaServido(Date plaoFechaServido) {
        this.plaoFechaServido = plaoFechaServido;
    }

    public Integer getPlaoServido() {
        return plaoServido;
    }

    public void setPlaoServido(Integer plaoServido) {
        this.plaoServido = plaoServido;
    }

    public String getPlaoDetalle() {
        return plaoDetalle;
    }

    public void setPlaoDetalle(String plaoDetalle) {
        this.plaoDetalle = plaoDetalle;
    }

    public AtencionMesa getAteOrden() {
        return ateOrden;
    }

    public void setAteOrden(AtencionMesa ateOrden) {
        this.ateOrden = ateOrden;
    }

    public Platillos getPlatPlatillo() {
        return platPlatillo;
    }

    public void setPlatPlatillo(Platillos platPlatillo) {
        this.platPlatillo = platPlatillo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plaoId != null ? plaoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlatillosOrden)) {
            return false;
        }
        PlatillosOrden other = (PlatillosOrden) object;
        if ((this.plaoId == null && other.plaoId != null) || (this.plaoId != null && !this.plaoId.equals(other.plaoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.casob.casob_ec.model.PlatillosOrden[ plaoId=" + plaoId + " ]";
    }
    
}
