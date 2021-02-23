package com.casob.casob_ec.model;

import com.casob.casob_ec.model.Cliente;
import com.casob.casob_ec.model.Factura;
import com.casob.casob_ec.model.Mesa;
import com.casob.casob_ec.model.Mesero;
import com.casob.casob_ec.model.PlatillosOrden;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-23T12:39:49")
@StaticMetamodel(AtencionMesa.class)
public class AtencionMesa_ { 

    public static volatile SingularAttribute<AtencionMesa, Integer> ateId;
    public static volatile SingularAttribute<AtencionMesa, Mesa> mesaMesaAtencion;
    public static volatile SingularAttribute<AtencionMesa, Date> ateFecha;
    public static volatile CollectionAttribute<AtencionMesa, PlatillosOrden> platillosOrdenCollection;
    public static volatile SingularAttribute<AtencionMesa, Integer> ateNumeroOrden;
    public static volatile SingularAttribute<AtencionMesa, Integer> ateEstado;
    public static volatile SingularAttribute<AtencionMesa, Mesero> mesMeseroEncargado;
    public static volatile SingularAttribute<AtencionMesa, Cliente> cliCodigo;
    public static volatile CollectionAttribute<AtencionMesa, Factura> facturaCollection;

}