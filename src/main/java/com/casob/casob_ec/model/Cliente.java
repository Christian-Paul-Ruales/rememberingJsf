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
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCliId", query = "SELECT c FROM Cliente c WHERE c.cliId = :cliId"),
    @NamedQuery(name = "Cliente.findByCliIdentificacion", query = "SELECT c FROM Cliente c WHERE c.cliIdentificacion = :cliIdentificacion"),
    @NamedQuery(name = "Cliente.findByCliNombre", query = "SELECT c FROM Cliente c WHERE c.cliNombre = :cliNombre")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cli_id")
    private Integer cliId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cli_identificacion")
    private String cliIdentificacion;
    @Size(max = 2147483647)
    @Column(name = "cli_nombre")
    private String cliNombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliCodigo")
    private Collection<AtencionMesa> atencionMesaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliCliente")
    private Collection<Factura> facturaCollection;

    public Cliente() {
    }

    public Cliente(Integer cliId) {
        this.cliId = cliId;
    }

    public Cliente(Integer cliId, String cliIdentificacion) {
        this.cliId = cliId;
        this.cliIdentificacion = cliIdentificacion;
    }

    public Integer getCliId() {
        return cliId;
    }

    public void setCliId(Integer cliId) {
        this.cliId = cliId;
    }

    public String getCliIdentificacion() {
        return cliIdentificacion;
    }

    public void setCliIdentificacion(String cliIdentificacion) {
        this.cliIdentificacion = cliIdentificacion;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public Collection<AtencionMesa> getAtencionMesaCollection() {
        return atencionMesaCollection;
    }

    public void setAtencionMesaCollection(Collection<AtencionMesa> atencionMesaCollection) {
        this.atencionMesaCollection = atencionMesaCollection;
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
        hash += (cliId != null ? cliId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cliId == null && other.cliId != null) || (this.cliId != null && !this.cliId.equals(other.cliId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.casob.casob_ec.model.Cliente[ cliId=" + cliId + " ]";
    }
    
}
