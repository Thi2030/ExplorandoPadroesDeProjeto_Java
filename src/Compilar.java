import Facade.CadastroCliente;
import Singleton.SingletonDois;
import Singleton.SingletonTres;
import Singleton.SingletonUm;
import Strategy.Emocao;
import Strategy.EmocaoFeliz;
import Strategy.EmocaoRaiva;
import Strategy.EmocaoTriste;
import Strategy.Pessoa;

/*
 * @Autor: Thi2030
 * Projeto: Java e Padroes de Projeto.
 * Assuntos: Singleton, Strategy, Facade.
 */

public class Compilar {
    public static void main(String[] args) {

    //Singleton - Projeto: Os 3 Tipos existentes.
		
    SingletonUm objetoUm = SingletonUm.getInstancia();
    System.out.println(objetoUm);
    objetoUm = SingletonUm.getInstancia();
    System.out.println(objetoUm);  
    
    SingletonDois objetoDois = SingletonDois.getInstancia();
    System.out.println(objetoDois);
    objetoDois = SingletonDois.getInstancia();
    System.out.println(objetoDois);
    
    SingletonTres objetoTres = SingletonTres.getInstancia();
    System.out.println(objetoTres);
    objetoTres = SingletonTres.getInstancia();
    System.out.println(objetoTres);
    
    // Strategy - Projeto: Emções de uma Pessoa.
    
    Emocao felicidade = new EmocaoFeliz();
    Emocao raiva = new EmocaoRaiva();
    Emocao trsite = new EmocaoTriste();
    
    Pessoa pessoa = new Pessoa();
    pessoa.setEmocao(felicidade);
    pessoa.expressar_se();
    pessoa.expressar_se();
    pessoa.setEmocao(raiva);
    pessoa.expressar_se();
    pessoa.setEmocao(trsite);
    pessoa.expressar_se();
    pessoa.expressar_se();
    pessoa.expressar_se();
    
    // Facade - Projeto: Cadastro de Cliente.
    
    CadastroCliente facade = new CadastroCliente();
    facade.migrarCliente("Thi2030", "03632-000");
    }
}    



        