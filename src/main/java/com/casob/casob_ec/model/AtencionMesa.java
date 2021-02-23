/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casob.casob_ec.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author christian
 */
@Entity
@Table(name = "atencion_mesa")
@NamedQueries({
    @NamedQuery(name = "AtencionMesa.findAll", query = "SELECT a FROM AtencionMesa a"),
    @NamedQuery(name = "AtencionMesa.findByAteId", query = "SELECT a FROM AtencionMesa a WHERE a.ateId = :ateId"),
    @NamedQuery(name = "AtencionMesa.findByAteFecha", query = "SELECT a FROM AtencionMesa a WHERE a.ateFecha = :ateFecha"),
    @NamedQuery(name = "AtencionMesa.findByAteEstado", query = "SELECT a FROM AtencionMesa a WHERE a.ateEstado = :ateEstado"),
    @NamedQuery(name = "AtencionMesa.findByAteNumeroOrden", query = "SELECT a FROM AtencionMesa a WHERE a.ateNumeroOrden = :ateNumeroOrden")})
public class AtencionMesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ate_id")
    private Integer ateId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ate_fecha")
    @Temporal(TemporalType.DATE)
    private Date ateFecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ate_estado")
    private int ateEstado;
    @Basic(optional = false)
    @Column(name = "ate_numero_orden")
    private int ateNumeroOrden;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ateOrden")
    private Collection<PlatillosOrden> platillosOrdenCollection;
    @JoinColumn(name = "cli_codigo", referencedColumnName = "cli_id")
    @ManyToOne(optional = false)
    private Cliente cliCodigo;
    @JoinColumn(name = "mesa_mesa_atencion", referencedColumnName = "mesa_id")
    @ManyToOne(optional = false)
    private Mesa mesaMesaAtencion;
    @JoinColumn(name = "mes_mesero_encargado", referencedColumnName = "mes_id")
    @ManyToOne
    private Mesero mesMeseroEncargado;
    @OneToMany(mappedBy = "ateOrden")
    private Collection<Factura> facturaCollection;

    public AtencionMesa() {
    }

    public AtencionMesa(Integer ateId) {
        this.ateId = ateId;
    }

    public AtencionMesa(Integer ateId, Date ateFecha, int ateEstado, int ateNumeroOrden) {
        this.ateId = ateId;
        this.ateFecha = ateFecha;
        this.ateEstado = ateEstado;
        this.ateNumeroOrden = ateNumeroOrden;
    }

    public Integer getAteId() {
        return ateId;
    }

    public void setAteId(Integer ateId) {
        this.ateId = ateId;
    }

    public Date getAteFecha() {
        return ateFecha;
    }

    public void setAteFecha(Date ateFecha) {
        this.ateFecha = ateFecha;
    }

    public int getAteEstado() {
        return ateEstado;
    }

    public void setAteEstado(int ateEstado) {
        this.ateEstado = ateEstado;
    }

    public int getAteNumeroOrden() {
        return ateNumeroOrden;
    }

    public void setAteNumeroOrden(int ateNumeroOrden) {
        this.ateNumeroOrden = ateNumeroOrden;
    }

    public Collection<PlatillosOrden> getPlatillosOrdenCollection() {
        return platillosOrdenCollection;
    }

    public void setPlatillosOrdenCollection(Collection<PlatillosOrden> platillosOrdenCollection) {
        this.platillosOrdenCollection = platillosOrdenCollection;
    }

    public Cliente getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(Cliente cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public Mesa getMesaMesaAtencion() {
        return mesaMesaAtencion;
    }

    public void setMesaMesaAtencion(Mesa mesaMesaAtencion) {
        this.mesaMesaAtencion = mesaMesaAtencion;
    }

    public Mesero getMesMeseroEncargado() {
        return mesMeseroEncargado;
    }

    public void setMesMeseroEncargado(Mesero mesMeseroEncargado) {
        this.mesMeseroEncargado = mesMeseroEncargado;
    }

    public Collection<Factura> getFacturaCollection() {
        return facturaCollection;
    }

    public void setFacturaCollection(Collection<Factura> facturaCollection) {
        this.facturaCollection = facturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ateId != null ? ateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtencionMesa)) {
            return false;
        }
        AtencionMesa other = (AtencionMesa) object;
        if ((this.ateId == null && other.ateId != null) || (this.ateId != null && !this.ateId.equals(other.ateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.casob.casob_ec.model.AtencionMesa[ ateId=" + ateId + " ]";
    }
    
}
