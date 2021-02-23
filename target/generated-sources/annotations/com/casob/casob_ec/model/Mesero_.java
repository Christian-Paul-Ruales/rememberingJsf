package com.casob.casob_ec.model;

import com.casob.casob_ec.model.AtencionMesa;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-23T12:39:49")
@StaticMetamodel(Mesero.class)
public class Mesero_ { 

    public static volatile SingularAttribute<Mesero, Integer> mesId;
    public static volatile SingularAttribute<Mesero, String> mesUsuario;
    public static volatile SingularAttribute<Mesero, String> mesNombre;
    public static volatile SingularAttribute<Mesero, String> mesPassword;
    public static volatile CollectionAttribute<Mesero, AtencionMesa> atencionMesaCollection;

}