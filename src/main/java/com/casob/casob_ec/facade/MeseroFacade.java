/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casob.casob_ec.facade;

import com.casob.casob_ec.model.Mesero;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author christian
 */
@Stateless
public class MeseroFacade extends AbstractFacade<Mesero> {

    @PersistenceContext(unitName = "com.casob_casob_ec_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public List<Mesero>  findLogin(String usuario, String password){
        TypedQuery<Mesero> consultaMesero = getEntityManager().createNamedQuery("Mesero.findByMesUsuarioMesPassword", Mesero.class);
        consultaMesero.setParameter("mesUsuario", usuario);
        consultaMesero.setParameter("mesPassword", password);
        
        List<Mesero> usuarios = consultaMesero.getResultList();
        return usuarios;
        
    }
    
    public MeseroFacade() {
        super(Mesero.class);
    }
    
}
