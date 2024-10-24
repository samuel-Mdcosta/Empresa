package Repositorio;

import Dominio.Funcionario;
import FakeDb.AddFuncionario;

public class FuncionarioRepo extends BaseRepositorio<Funcionario> {

    private AddFuncionario afun;

    public FuncionarioRepo(){
        this.afun = new AddFuncionario();
        this.FonteDeDados = this.afun.getTabelaFuncionarios();
    }

    @Override
    public Funcionario Create(Funcionario instancia) {
        int proximaChave = this.FonteDeDados.getLast().getCodigo();
        proximaChave ++;

        //atualiza o codigo que est na instancia
        instancia.setCodigo(proximaChave);
        this.FonteDeDados.add(instancia);
        return instancia;    }

    @Override
    public Funcionario Read(int chave) {
        //tipo generico da lista = nome da variavel - lista que ira usar
        for (Funcionario afun : this.FonteDeDados) {
            //se o codgo da lista for igual ao da chave ele retorna cl (lista)
            if (afun.getCodigo() == chave) {
                return afun;
            }
        }
        return null;   
    }

    @Override
    public Funcionario Update(Funcionario instancia) {
        //acha a chave para atualizar a lista
        Funcionario afun = this.Read(instancia.getCodigo());

        //acha a lista
        if (afun != null) {
            //pega o telefone que est em instancia e coloca em cl
            afun.setTelefone(instancia.getTelefone());
            return afun;
        }else{
            return null;
        }    }

    @Override
    public Funcionario Delete(int chave) {
        Funcionario afun = this.Read(chave);
        if (afun != null) {
            //remove a instancia de cp da lista, nao esta apagando a lista
            //quando mando apagar devolve a intanica para quem pediu para caso o usuaio se arrependa
            this.FonteDeDados.remove(afun);
            return afun;
        }else{
            return null;
        }     
    }
    
}
