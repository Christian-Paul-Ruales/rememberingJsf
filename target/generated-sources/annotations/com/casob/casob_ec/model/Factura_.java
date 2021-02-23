package com.casob.casob_ec.model;

import com.casob.casob_ec.model.AtencionMesa;
import com.casob.casob_ec.model.Cliente;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-23T12:39:49")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, AtencionMesa> ateOrden;
    public static volatile SingularAttribute<Factura, Integer> facGenerada;
    public static volatile SingularAttribute<Factura, String> facNumero;
    public static volatile SingularAttribute<Factura, Serializable> facDetalle;
    public static volatile SingularAttribute<Factura, Integer> facId;
    public static volatile SingularAttribute<Factura, Date> facFechaCreada;
    public static volatile SingularAttribute<Factura, Date> facFechaGenerada;
    public static volatile SingularAttribute<Factura, Cliente> cliCliente;

}