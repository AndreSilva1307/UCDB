package com.example;

import com.example.controller.AlunoC;
import com.example.controller.BancoDeDados;
import com.example.model.AlunoM;

public class Main {
    public static void main(String[] args) {
       try {
        AlunoM alex=new AlunoM(1, "Teste");
        AlunoC dao=new AlunoC();
        dao.cadastroAluno(alex);
       } catch (Exception e) {

       }
    }
}