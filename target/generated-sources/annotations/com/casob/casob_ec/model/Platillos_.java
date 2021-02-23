package com.casob.casob_ec.model;

import com.casob.casob_ec.model.PlatillosOrden;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-23T12:39:49")
@StaticMetamodel(Platillos.class)
public class Platillos_ { 

    public static volatile SingularAttribute<Platillos, Integer> platId;
    public static volatile SingularAttribute<Platillos, String> platNombre;
    public static volatile CollectionAttribute<Platillos, PlatillosOrden> platillosOrdenCollection;
    public static volatile SingularAttribute<Platillos, String> platDetalle;

}