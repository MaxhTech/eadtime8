/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio.unidade;

import br.iesb.meuprograma.negocio.unidade.*;
import br.iesb.meuprograma.dados.UnidadeDAO;
import br.iesb.meuprograma.dados.DadosException;
import java.util.List;

import br.iesb.meuprograma.negocio.BO;
import br.iesb.meuprograma.negocio.NegocioException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kimura
 */
public class UnidadeBO implements BO<Unidade> {
    
    private UnidadeDAO dao;

    public UnidadeBO() {
        try {
            this.dao = new UnidadeDAO();
        } catch (DadosException e) {
            Logger.getLogger(UnidadeBO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void validar(Unidade entidade) throws NegocioException {
        if (entidade.getUnidade().trim().isEmpty()) {
            throw new NegocioException("O campo da descrição da unidade é obrigatório");
        }
    }

    @Override
    public void salvar(Unidade entidade) throws NegocioException {
        try {
            this.dao.salvar(entidade);
        } catch (DadosException e) {
            throw new NegocioException("Erro ao salvar a unidade");
        }
    }


    @Override
    public void excluir(Unidade entidade) throws NegocioException {
        try {
            this.dao.excluir(entidade);
        } catch (DadosException ex) {
            Logger.getLogger(UnidadeBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException("Erro ao deletar a unidade");
        }
    }

    @Override
    public Unidade consultar(int id) throws NegocioException {
        try {
            return this.dao.consultar(id);
        } catch (DadosException ex) {
            Logger.getLogger(UnidadeBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException("Erro ao carregar a lista de unidades");
        }
    }

    @Override
    public List<Unidade> listar() throws NegocioException {
        try {
            return this.dao.listar();
        } catch (DadosException ex) {
            Logger.getLogger(UnidadeBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException("Erro ao carregar a lista de unidades");
        }
    }

    
    
}
