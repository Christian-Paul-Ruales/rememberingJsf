/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casob.casob_ec.facade;

import com.casob.casob_ec.model.AtencionMesa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author christian
 */
@Stateless
public class AtencionMesaFacade extends AbstractFacade<AtencionMesa> {

    @PersistenceContext(unitName = "com.casob_casob_ec_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AtencionMesaFacade() {
        super(AtencionMesa.class);
    }
    
}
