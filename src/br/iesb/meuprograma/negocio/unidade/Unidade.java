/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio.unidade;

import br.iesb.meuprograma.negocio.unidade.*;

/**
 *
 * @author kimura
 */
public class Unidade {
    private Integer unidadeId;
    private String unidade;
    private String sigla;
    private boolean ativo;

    public Unidade() {}
    
    public Unidade(String unidade, String sigla, boolean isAtivo) {
        this.unidade = unidade;
        this.sigla = sigla;
        this.ativo = isAtivo;
    }

    public Integer getUnidadeId() {
        return unidadeId;
    }

    public void setUnidadeId(Integer unidadeId) {
        this.unidadeId = unidadeId;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    public String getSigla(){
        return sigla;
    }
    
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    
    public boolean isAtivo() {
        return ativo;
    }

    public void setIsAtivo(boolean isAtivo) {
        this.ativo = isAtivo;
    }
}
