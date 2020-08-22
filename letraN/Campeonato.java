package letraN;

public class Campeonato {

	public static void main(String[] args) {
		Carro carro = new Carro("Number 1", "Numero 1");
		Carro carro2 = new Carro("Number 2", "Numero 2");
		Carro carro3 = new Carro("Number 3", "Numero 3");
		Corrida corrida = new Corrida("Interlagos");
		
		corrida.cadastrarCarro(carro, corrida.nome);
		corrida.cadastrarCarro(carro2, corrida.nome);
		corrida.cadastrarCarro(carro3, corrida.nome);
		corrida.listarCarros(corrida);
		
		corrida.registrarCampeao(corrida, carro2);
	}

}
