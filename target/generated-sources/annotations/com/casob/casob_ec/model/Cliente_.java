package com.casob.casob_ec.model;

import com.casob.casob_ec.model.AtencionMesa;
import com.casob.casob_ec.model.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-23T12:39:49")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> cliNombre;
    public static volatile SingularAttribute<Cliente, String> cliIdentificacion;
    public static volatile SingularAttribute<Cliente, Integer> cliId;
    public static volatile CollectionAttribute<Cliente, AtencionMesa> atencionMesaCollection;
    public static volatile CollectionAttribute<Cliente, Factura> facturaCollection;

}