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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author christian
 */
@Entity
@Table(name = "factura")
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f"),
    @NamedQuery(name = "Factura.findByFacId", query = "SELECT f FROM Factura f WHERE f.facId = :facId"),
    @NamedQuery(name = "Factura.findByFacNumero", query = "SELECT f FROM Factura f WHERE f.facNumero = :facNumero"),
    @NamedQuery(name = "Factura.findByFacFechaCreada", query = "SELECT f FROM Factura f WHERE f.facFechaCreada = :facFechaCreada"),
    @NamedQuery(name = "Factura.findByFacFechaGenerada", query = "SELECT f FROM Factura f WHERE f.facFechaGenerada = :facFechaGenerada"),
    @NamedQuery(name = "Factura.findByFacGenerada", query = "SELECT f FROM Factura f WHERE f.facGenerada = :facGenerada"),
    @NamedQuery(name = "Factura.findByFacDetalle", query = "SELECT f FROM Factura f WHERE f.facDetalle = :facDetalle")})
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fac_id")
    private Integer facId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "fac_numero")
    private String facNumero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fac_fecha_creada")
    @Temporal(TemporalType.DATE)
    private Date facFechaCreada;
    @Column(name = "fac_fecha_generada")
    @Temporal(TemporalType.DATE)
    private Date facFechaGenerada;
    @Column(name = "fac_generada")
    private Integer facGenerada;
    @Column(name = "fac_detalle")
    private Serializable facDetalle;
    @JoinColumn(name = "ate_orden", referencedColumnName = "ate_id")
    @ManyToOne
    private AtencionMesa ateOrden;
    @JoinColumn(name = "cli_cliente", referencedColumnName = "cli_id")
    @ManyToOne(optional = false)
    private Cliente cliCliente;

    public Factura() {
    }

    public Factura(Integer facId) {
        this.facId = facId;
    }

    public Factura(Integer facId, String facNumero, Date facFechaCreada) {
        this.facId = facId;
        this.facNumero = facNumero;
        this.facFechaCreada = facFechaCreada;
    }

    public Integer getFacId() {
        return facId;
    }

    public void setFacId(Integer facId) {
        this.facId = facId;
    }

    public String getFacNumero() {
        return facNumero;
    }

    public void setFacNumero(String facNumero) {
        this.facNumero = facNumero;
    }

    public Date getFacFechaCreada() {
        return facFechaCreada;
    }

    public void setFacFechaCreada(Date facFechaCreada) {
        this.facFechaCreada = facFechaCreada;
    }

    public Date getFacFechaGenerada() {
        return facFechaGenerada;
    }

    public void setFacFechaGenerada(Date facFechaGenerada) {
        this.facFechaGenerada = facFechaGenerada;
    }

    public Integer getFacGenerada() {
        return facGenerada;
    }

    public void setFacGenerada(Integer facGenerada) {
        this.facGenerada = facGenerada;
    }

    public Serializable getFacDetalle() {
        return facDetalle;
    }

    public void setFacDetalle(Serializable facDetalle) {
        this.facDetalle = facDetalle;
    }

    public AtencionMesa getAteOrden() {
        return ateOrden;
    }

    public void setAteOrden(AtencionMesa ateOrden) {
        this.ateOrden = ateOrden;
    }

    public Cliente getCliCliente() {
        return cliCliente;
    }

    public void setCliCliente(Cliente cliCliente) {
        this.cliCliente = cliCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facId != null ? facId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.facId == null && other.facId != null) || (this.facId != null && !this.facId.equals(other.facId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.casob.casob_ec.model.Factura[ facId=" + facId + " ]";
    }
    
}
