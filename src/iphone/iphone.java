package iphone;

import iphone.sistemas.AparelhoTelefonico;
import iphone.sistemas.NavegadorNaInternet;
import iphone.sistemas.ReprodutorMusical;

public class iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    
    
}
