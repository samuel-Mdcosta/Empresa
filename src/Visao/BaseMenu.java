package Visao;

//ajuda no armazenamento da entrada de texto 
import java.util.Scanner;

public abstract class BaseMenu {
    protected Scanner scanner;

    //implementação do scanner pelo contrutor para ajudar no salvamento de dados
    public BaseMenu(){
        this.scanner = new Scanner(System.in);
    }
    
    //acoes que serao puxadas nas filhas por isso abstract
    public abstract void ExibirMenu();
    public abstract void Listar();   
    public abstract void Localizar();
    public abstract void Adicionar();
    public abstract void Atualizar();
    public abstract void Remover();
}
