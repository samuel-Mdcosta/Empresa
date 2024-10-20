package Visao;

import Dominio.Cliente;
import Dominio.Fornecedor;
import Dominio.Funcionario;

public class Pessoasvisao {
    
    public Pessoasvisao(){
    }

    public void motrar(){
        Cliente cl = new Cliente(1, "Samuel Costa", "costadev19@gmail.com", "(67)99300-3759", "088.789.391-02");

        System.out.println("Cliente:");
        System.out.println("Codigo:" + cl.getCodigo());
        System.out.println("CPF:" + cl.getCpf());
        System.out.println("Email:" + cl.getEmail());
        System.out.println("Nome:" + cl.getNome());
        System.out.println("Telefone:" + cl.getTelefone());

        System.out.println("=========================================");

        Fornecedor fd = new Fornecedor(1, "Dallas",
        "dallas@gmail.com", "(67)3333-3333", "Alimentos Dallas ltda,", "XX. XXX. XXX/0001-XX");

        System.out.println("Fornecedor:");
        System.out.println("Codigo:" + fd.getCodigo());
        System.out.println("CPF:" + fd.getCnpj());
        System.out.println("Email:" + fd.getEmail());
        System.out.println("Nome:" + fd.getNome());
        System.out.println("Telefone:" + fd.getTelefone());

        System.out.println("=========================================");

        Funcionario fn = new Funcionario(1, "Heber Costa", "heber@gmail.com", "()99253-3808", "Gerente", Double.valueOf(2000));

        System.out.println("Funcionario:");
        System.out.println("Codigo:" + fn.getCodigo());
        System.out.println("CPF:" + fn.getCargo());
        System.out.println("Email:" + fn.getEmail());
        System.out.println("Nome:" + fn.getNome());
        System.out.println("Telefone:" + fn.getTelefone());
        System.out.println("Salario:" + fn.getSalario());

    }

}
