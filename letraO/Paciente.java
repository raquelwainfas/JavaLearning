package letraO;
public class Paciente {
	public String nome;
	public String dataEntrada;
	public String dataSaida;
	public Leito leito;
	
	
	public void cadastrarEntrada(String nome, String dataEntrada, Leito leito) {
		this.nome = nome;
		this.dataEntrada = dataEntrada;
		this.leito = leito;
	}

	
	public void cadastrarSaida(String nome, String dataSaida, Leito leito){
		this.nome = nome;
		this.dataSaida = dataSaida;
		this.leito = leito;
	}

}
