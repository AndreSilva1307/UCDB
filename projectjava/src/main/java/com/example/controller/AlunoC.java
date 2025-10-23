package com.example.controller;

import com.example.model.AlunoM;

public class AlunoC {
    BancoDeDados dao = new BancoDeDados();

    public void cadastroAluno(AlunoM alunoM){
        try {
            dao.abrirConexao();
            String sql="insert into aluno values("+alunoM.getRa()+",'"+alunoM.getNome()+"')";
            dao.getStatement().execute(sql);
            dao.fecharConexao();
        } catch (Exception erro){
            erro.printStackTrace();
        }
    }

    public void atualizaAluno()
    {
        
    }
    
}
