package com.fatec.museu.dao;

import com.fatec.museu.model.Exposicao;
import java.util.List;
import javax.persistence.EntityManager;

public class ExposicaoDAO extends DAO<Exposicao> {

    @Override
    public void salvar(Exposicao objeto) {
        EntityManager em = super.getEntityManager();
        
        em.getTransaction().begin();
        em.merge(em);
        em.getTransaction().commit();
        
        em.close();
    }

    @Override
    public List<Exposicao> listarTodos() {
        EntityManager em = super.getEntityManager();
        List<Exposicao> exposicoes = em.createNamedQuery("from Exposicao").getResultList();
        
        em.close();
        return exposicoes;
    }

    @Override
    public void excluir(Exposicao objeto) {
        EntityManager em = super.getEntityManager();
        objeto = em.find(Exposicao.class, objeto.getIdExposicao());
        
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        
        em.close();
    }

    @Override
    public Exposicao buscar(Exposicao objeto) {
        EntityManager em = super.getEntityManager();
        objeto = em.find(Exposicao.class, objeto.getIdExposicao());
        em.close();
        return objeto;
    }
    
}
