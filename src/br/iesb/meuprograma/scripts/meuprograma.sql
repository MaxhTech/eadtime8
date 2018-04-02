/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  kimura
 * Created: Mar 27, 2018
 */

CREATE TABLE assunto (
    id SERIAL PRIMARY KEY,
    str_assunto VARCHAR(30) NOT NULL,
    ativo BOOLEAN NOT NULL
);

CREATE TABLE unidade (
    id SERIAL PRIMARY KEY,
    str_nome_unidade VARCHAR(100) NOT NULL,
    str_sigla_unidade VARCHAR(10) NOT NULL,
    ativa BOOLEAN NOT NULL
);