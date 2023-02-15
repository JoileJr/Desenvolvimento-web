package GestaoClientes;

import java.util.List;
import java.util.Random;

public class Cliente {
	String nome;
	
	List<Endereco> enderecos;
	Integer id;
	Random random = new Random();
	
	public Integer gerarId() {
		return random.nextInt(10);
	}
	
	public void incluirCliente() {
		
	}
	
	public void incluirEndereço(Endereco endereco) {
		enderecos.add(endereco);
	}
	
}
