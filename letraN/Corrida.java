package letraN;

import java.util.ArrayList;

public class Corrida {
	public String nome;
	public ArrayList <Carro> carros = new ArrayList<Carro>();
	
	public Corrida(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Carro> cadastrarCarro(Carro carro, String corrida) {
        this.carros.add(carro);
        this.nome = corrida;				
	
        return carros;
	}
	
	public void listarCarros(Corrida corrida) {				
		for(Carro carro : carros) {
			System.out.println(carro.nome+" - Equipe: "+ carro.equipe);
		}
	}
	
	public void registrarCampeao(Corrida corrida, Carro carro) {
		System.out.println("Carro: "+ carro.nome + " - Campeão da corrida: " + corrida.nome +"! Parabéns!");
	}
}
