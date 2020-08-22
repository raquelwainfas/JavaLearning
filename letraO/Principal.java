package letraO;

public class Principal {

	public static void main(String[] args) {
		Paciente p = new Paciente();
		p.cadastrarEntrada("Raquel", "02/08/2020", new Leito("Quarto1"));
		
		System.out.println(p.nome+","+p.dataEntrada+","+p.leito.nome);
		
		p.cadastrarSaida(p.nome, "07/08/2020", p.leito);
		
		System.out.println(p.nome +","+ p.dataSaida +","+ p.leito.nome);

	}
}