package atividade2;

/**
 *
 * @author Wendell Marcos
 */
public class Atividade2 {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        PacoteDeViagem pacoteDeViagem = new PacoteDeViagem();

        Venda venda = new Venda();

        System.out.println("************************************************************ \n");
        System.out.println("************************************************************ \n" );
        System.out.println("Olá, vamos começar a cotação do seu pacote! ");
        System.out.println("Informe os dados solicitado !");

        System.out.println("************************************************************ \n");
        System.out.println("************************************************************ \n" );

        cliente.cadastrarCliente();
        System.out.println("************************************************************ \n");
        System.out.println("************************************************************ \n" );

        pacoteDeViagem.calcularTotalHospedagem();
        System.out.println("************************************************************ \n");
        pacoteDeViagem.calcularValorDeLucro();
        System.out.println("************************************************************ \n");
        System.out.println("************************************************************ \n" );
        venda.converterMoeda();
        System.out.println("************************************************************ \n");
        System.out.println("************************************************************ \n");
        System.out.println("Segue os dados da cotação: ");
        venda.infoTotal();
        System.out.println("************************************************************ \n");
        System.out.println("************************************************************ \n");

        pacoteDeViagem.mostrarInformacoes();

        System.out.println("************************************************************ \n");
        System.out.println("************************************************************ \n");

    }

}
