package br.iesb.meuprograma.negocio;

import java.util.List;

public interface BO<T> {

    void validar(T entidade) throws NegocioException;

    void salvar(T entidade) throws NegocioException;

    void excluir(T entidade) throws NegocioException;

    T consultar(int id) throws NegocioException;

    List<T> listar() throws NegocioException;
}
