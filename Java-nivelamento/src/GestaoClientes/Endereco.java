package GestaoClientes;

import java.util.Random;

public class Endereco {
	String nomeRua;
	String numero;
	String bairro;
	Random random = new Random();
	Integer id;
	
	public Endereco(String nomeRua, String numero, String bairro) {
		this.nomeRua = nomeRua;
		this.numero = numero;
		this.bairro = bairro;
	}
	
	public Integer gerarId() {
		return random.nextInt(10);
	}
}
