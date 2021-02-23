package com.casob.casob_ec.model;

import com.casob.casob_ec.model.AtencionMesa;
import com.casob.casob_ec.model.Platillos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-23T12:39:49")
@StaticMetamodel(PlatillosOrden.class)
public class PlatillosOrden_ { 

    public static volatile SingularAttribute<PlatillosOrden, Date> plaoFechaServido;
    public static volatile SingularAttribute<PlatillosOrden, String> plaoDetalle;
    public static volatile SingularAttribute<PlatillosOrden, Integer> plaoServido;
    public static volatile SingularAttribute<PlatillosOrden, AtencionMesa> ateOrden;
    public static volatile SingularAttribute<PlatillosOrden, Platillos> platPlatillo;
    public static volatile SingularAttribute<PlatillosOrden, Integer> plaoId;

}