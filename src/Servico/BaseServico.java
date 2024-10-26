package Servico;

import java.util.ArrayList;

public abstract class BaseServico<TDominio> {
    //traduçao modelo crud
    //publico poiis e a classe pai e as filhas devem acessar
    public abstract TDominio Criar(TDominio dados);

    public abstract ArrayList<TDominio> LerTodos();

    public abstract TDominio Ler(int chave);

    public abstract TDominio Atualizar(TDominio dados);

    public abstract TDominio Deletar(int chave);
}
