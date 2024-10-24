package Repositorio;

import java.util.ArrayList;

public abstract class BaseRepositorio<TDominio> {
    //aponta para a cada que ira trabalhar
    //publico pois as filhas devem acessar esses metodos

    //modelo crud

    //lista que iora retornar todos os dados
    protected ArrayList<TDominio> FonteDeDados;

    //cria algo entao tem que passar as especificacoes desse algo
    //e devolve a mesma instancia da cricacao
    public abstract TDominio Create(TDominio instancia);

    public ArrayList<TDominio> ReadAll(){
        return this.FonteDeDados;
    }

    //atributo (chave) para achar a lista, faz mensao ao codigo do dominio 
    public abstract TDominio Read(int chave);

    //se quiser upar algo tem que passar as especificacoes desse algo
    public abstract TDominio Update(TDominio instancia);

    //precisa de uma chave para localizar
    public abstract TDominio Delete(int chave);
    
}
