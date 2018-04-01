/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio.assunto;

import br.iesb.meuprograma.dados.AssuntoDAO;
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
public class AssuntoBO implements BO<Assunto> {
    
    private AssuntoDAO dao;

    public AssuntoBO() {
        try {
            this.dao = new AssuntoDAO();
        } catch (DadosException e) {
            Logger.getLogger(AssuntoBO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void validar(Assunto entidade) throws NegocioException {
        if (entidade.getAssunto().trim().isEmpty()) {
            throw new NegocioException("O campo da descrição do assunto é obrigatório");
        }
    }

    @Override
    public void salvar(Assunto entidade) throws NegocioException {
        try {
            this.dao.salvar(entidade);
        } catch (DadosException e) {
            throw new NegocioException("Erro ao salvar o assunto");
        }
    }


    @Override
    public void excluir(Assunto entidade) throws NegocioException {
        try {
            this.dao.excluir(entidade);
        } catch (DadosException ex) {
            Logger.getLogger(AssuntoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException("Erro ao deletar o assunto");
        }
    }

    @Override
    public Assunto consultar(int id) throws NegocioException {
        try {
            return this.dao.consultar(id);
        } catch (DadosException ex) {
            Logger.getLogger(AssuntoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException("Erro ao carregar a lista de assuntos");
        }
    }

    @Override
    public List<Assunto> listar() throws NegocioException {
        try {
            return this.dao.listar();
        } catch (DadosException ex) {
            Logger.getLogger(AssuntoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException("Erro ao carregar a lista de assuntos");
        }
    }

    
    
}
