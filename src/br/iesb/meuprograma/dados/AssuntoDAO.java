/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.dados;

import java.util.List;

import br.iesb.meuprograma.negocio.assunto.Assunto;
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
public class AssuntoDAO implements DAO<Assunto> {
    
    private Connection conn;
    
    public AssuntoDAO() throws DadosException {
        try {
            this.conn = ConexaoBD.getConexao();
        } catch(DadosException e) {
            throw new DadosException(e.getMessage() + "Não foi possível inserir o assunto");
        }
    }

    public void salvar(Assunto entidade) throws DadosException{
        if (entidade.getAssuntoId() == null) {
            this.inserir(entidade);
        } else {
            this.alterar(entidade);
        }
    }
    
    @Override
    public void inserir(Assunto entidade) throws DadosException {
        try {
            PreparedStatement st = this.conn.prepareStatement("INSERT INTO assunto (str_assunto, ativo) VALUES (?, ?)");
            st.setString(1, entidade.getAssunto());
            st.setBoolean(2, entidade.isAtivo());
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssuntoDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new DadosException("Não foi possível inserir o assunto - Erro no banco, consulte o log.");
        }
    }

    @Override
    public void alterar(Assunto entidade) throws DadosException {
        try {
            PreparedStatement st = this.conn.prepareStatement("UPDATE assunto SET str_assunto = ?, ativo = ? "
                    + "WHERE id = ?");
            st.setString(1, entidade.getAssunto());
            st.setBoolean(2, entidade.isAtivo());
            st.setInt(3, entidade.getAssuntoId());
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssuntoDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new DadosException("Não foi possível alterar o assunto - Erro no banco, consulte o log.");
        }
    }

    @Override
    public void excluir(Assunto entidade) throws DadosException {
        try {
            PreparedStatement st = this.conn.prepareStatement("DELETE FROM assunto WHERE id = ?;");
            st.setInt(1, entidade.getAssuntoId());
            st.execute();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssuntoDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new DadosException("Não foi possível excluir o assunto - Erro no banco, consulte o log.");
        }
    }

    @Override
    public Assunto consultar(int id) throws DadosException {
        try {
            PreparedStatement st = this.conn.prepareStatement("SELECT * FROM assunto WHERE id = ?;");
            st.setInt(1, id);
            ResultSet results = st.executeQuery();
            Assunto assunto = new Assunto(results.getString("str_assunto"),
                                           results.getBoolean("ativo"));
            assunto.setAssuntoId(results.getInt("id"));
            st.close();
            return assunto;
        } catch (SQLException ex) {
            Logger.getLogger(AssuntoDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new DadosException("Não foi possível excluir o assunto - Erro no banco, consulte o log.");
        }
    }

    @Override
    public List<Assunto> listar() throws DadosException {
        List<Assunto> listaAssuntos = new ArrayList<Assunto>();

        try {
            PreparedStatement st = this.conn.prepareStatement("SELECT * FROM assunto ORDER BY str_assunto;");
            ResultSet results = st.executeQuery();
            while(results.next()) {
                Assunto assunto = new Assunto(results.getString("str_assunto"),
                                               results.getBoolean("ativo"));
                assunto.setAssuntoId(results.getInt("id"));
                listaAssuntos.add(assunto);
            }
            return listaAssuntos;
        } catch (SQLException ex) {
            Logger.getLogger(AssuntoDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new DadosException("Não foi possível excluir o assunto - Erro no banco, consulte o log.");
        }
    }
    
}
