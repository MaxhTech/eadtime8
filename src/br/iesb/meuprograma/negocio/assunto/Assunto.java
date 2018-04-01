/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio.assunto;

/**
 *
 * @author kimura
 */
public class Assunto {
    private Integer assuntoId;
    private String assunto;
    private boolean ativo;

    public Assunto() {}
    
    public Assunto(String assunto, boolean isAtivo) {
        this.assunto = assunto;
        this.ativo = isAtivo;
    }

    public Integer getAssuntoId() {
        return assuntoId;
    }

    public void setAssuntoId(Integer assuntoId) {
        this.assuntoId = assuntoId;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setIsAtivo(boolean isAtivo) {
        this.ativo = isAtivo;
    }
}
