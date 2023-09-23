import iphone.iphone;

public class App {
    public static void main(String[] args) throws Exception {

        iphone celular = new iphone();

        
        System.out.println("Reprodutor Músical: ");
        System.out.println(" ");

        celular.tocar();
        celular.pausar();
        celular.selecionarMusica();

        System.out.println("_____________________________");
        System.out.println(" ");

        System.out.println("Aparelho Telefônico: ");
        System.out.println(" ");

        celular.ligar();
        celular.atender();
        celular.iniciarCorreioVoz();

        System.out.println("_____________________________");
        System.out.println(" ");

        System.out.println("Navegador Da Internet: ");
        System.out.println(" ");

        celular.exibirPagina();
        celular.adicionarNovaAba();
        celular.atualizarPagina();

        System.out.println(" ");  

    }

}