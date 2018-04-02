/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.dados;

import java.util.List;

import br.iesb.meuprograma.negocio.unidade.Unidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kimura
 */
public class UnidadeDAO implements DAO<Unidade> {
    
    private Connection conn;
    
    public UnidadeDAO() throws DadosException {
        try {
            this.conn = ConexaoBD.getConexao();
        } catch(DadosException e) {
            throw new DadosException(e.getMessage() + "Não foi possível inserir a unidade");
        }
    }

    public void salvar(Unidade entidade) throws DadosException{
        if (entidade.getUnidadeId() == null) {
            this.inserir(entidade);
        } else {
            this.alterar(entidade);
        }
    }
    
    @Override
    public void inserir(Unidade entidade) throws DadosException {
        try {
            PreparedStatement st = this.conn.prepareStatement("INSERT INTO unidade (str_nome_unidade, str_sigla_unidade, ativo) VALUES (?, ?, ?)");
            st.setString(1, entidade.getUnidade());
            st.setString(2, entidade.getSigla());
            st.setBoolean(3, entidade.isAtivo());
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(UnidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new DadosException("Não foi possível inserir a unidade - Erro no banco, consulte o log.");
        }
    }

    @Override
    public void alterar(Unidade entidade) throws DadosException {
        try {
            PreparedStatement st = this.conn.prepareStatement("UPDATE unidade SET str_nome_unidade = ?, str_sigla_unidade = ?, ativo = ? "
                    + "WHERE id = ?");
            st.setString(1, entidade.getUnidade());
            st.setString(2, entidade.getSigla());
            st.setBoolean(3, entidade.isAtivo());
            st.setInt(4, entidade.getUnidadeId());
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(UnidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new DadosException("Não foi possível alterar a unidade - Erro no banco, consulte o log.");
        }
    }

    @Override
    public void excluir(Unidade entidade) throws DadosException {
        try {
            PreparedStatement st = this.conn.prepareStatement("DELETE FROM unidade WHERE id = ?;");
            st.setInt(1, entidade.getUnidadeId());
            st.execute();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(UnidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new DadosException("Não foi possível excluir a unidade - Erro no banco, consulte o log.");
        }
    }

    @Override
    public Unidade consultar(int id) throws DadosException {
        try {
            PreparedStatement st = this.conn.prepareStatement("SELECT * FROM unidade WHERE id = ?;");
            st.setInt(1, id);
            ResultSet results = st.executeQuery();
            Unidade unidade = new Unidade(results.getString("str_nome_unidade"),
                                            results.getString("str_sigla_unidade"),
                                           results.getBoolean("ativo"));
            unidade.setUnidadeId(results.getInt("id"));
            st.close();
            return unidade;
        } catch (SQLException ex) {
            Logger.getLogger(UnidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new DadosException("Não foi possível excluir a unidade - Erro no banco, consulte o log.");
        }
    }

    @Override
    public List<Unidade> listar() throws DadosException {
        List<Unidade> listaUnidades = new ArrayList<Unidade>();

        try {
            PreparedStatement st = this.conn.prepareStatement("SELECT * FROM unidade ORDER BY str_nome_unidade;");
            ResultSet results = st.executeQuery();
            while(results.next()) {
                Unidade unidade = new Unidade(results.getString("str_nome_unidade"),
                                                results.getString("str_sigla_unidade"),
                                               results.getBoolean("ativo"));
                unidade.setUnidadeId(results.getInt("id"));
                listaUnidades.add(unidade);
            }
            return listaUnidades;
        } catch (SQLException ex) {
            Logger.getLogger(UnidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new DadosException("Não foi possível excluir a unidade - Erro no banco, consulte o log.");
        }
    }
    
}
