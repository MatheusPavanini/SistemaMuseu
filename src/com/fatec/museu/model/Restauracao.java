package com.fatec.museu.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Restauracao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRestauracao;
    @Temporal(TemporalType.DATE)
    private Date dataDeEnvio;
    @Temporal(TemporalType.DATE)
    private Date dataDeRetorno;
    private String status;
    private String descricao;
    @OneToOne
    private Instituicao instituicao;
    @OneToOne
    private Obra obra;

    public Long getIdRestauracao() {
        return idRestauracao;
    }

    public void setIdRestauracao(Long idRestauracao) {
        this.idRestauracao = idRestauracao;
    }
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataDeEnvio() {
        return dataDeEnvio;
    }

    public void setDataDeEnvio(Date dataDeEnvio) {
        this.dataDeEnvio = dataDeEnvio;
    }

    public Date getDataDeRetorno() {
        return dataDeRetorno;
    }

    public void setDataDeRetorno(Date dataDeRetorno) {
        this.dataDeRetorno = dataDeRetorno;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }
	
	
	
}