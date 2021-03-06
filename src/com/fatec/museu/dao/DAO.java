/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.fatec.museu.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author junig
 */
public abstract class DAO<T> {
    
    private final String persistenceUnitName = "dbmuseu";
    
    public abstract void salvar(T objeto);
    public abstract List<T> listarTodos();
    public abstract void excluir(T objeto);
    public abstract T buscar(T objeto);
    
    protected EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        EntityManager em = emf.createEntityManager();
        return em;
    }
    
}
