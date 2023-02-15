package GestaoClientes;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		 List listaClientes = new ArrayList();
		
		Cliente cliente = new Cliente();
		Endereco endereco1 = new Endereco("Rua bruno", "01", "Centro");
		Endereco endereco2 = new Endereco("Rua palombo", "02", "Centro");
		endereco1.gerarId();
		endereco2.gerarId();
		cliente.id = cliente.gerarId();
		cliente.incluirEndereço(endereco1);
		cliente.incluirEndereço(endereco2);
	}

}
