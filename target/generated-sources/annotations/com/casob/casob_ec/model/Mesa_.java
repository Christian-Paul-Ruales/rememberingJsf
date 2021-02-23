package com.casob.casob_ec.model;

import com.casob.casob_ec.model.AtencionMesa;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-23T12:39:49")
@StaticMetamodel(Mesa.class)
public class Mesa_ { 

    public static volatile SingularAttribute<Mesa, Integer> mesaId;
    public static volatile SingularAttribute<Mesa, Integer> mesaNumero;
    public static volatile SingularAttribute<Mesa, String> mesaDescripcion;
    public static volatile CollectionAttribute<Mesa, AtencionMesa> atencionMesaCollection;

}