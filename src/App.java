import Visao.MostraCliente;
import Visao.MostraFornecedor;
import Visao.MostraFuncionario;

public class App {
    public static void main(String[] args) throws Exception {
        MostraCliente visao = new MostraCliente();
        visao.mostrarcliente();

        MostraFornecedor visao2 = new MostraFornecedor();
        visao2.mostrarfornecedor();

        MostraFuncionario visao3 = new MostraFuncionario();
        visao3.mostrarfuncionario();
    }
}
