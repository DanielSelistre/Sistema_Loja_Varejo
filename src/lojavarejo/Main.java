
package lojavarejo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Vendedor vende1 = new Vendedor();
		Cliente clien1 = new Cliente();
		Fornecedor Forne1 = new Fornecedor();
		Estoque estoq1 = new Estoque();
		Transportadora transp1 = new Transportadora();
		Vendas venda1 = new Vendas();
		Produtos prod1 = new Produtos();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do Vendedor:");
		vende1.nome = teclado.nextLine();
		
		System.out.println("Digite o nome do cliente:");
		clien1.nomeCliente = teclado.nextLine();
		
		System.out.println("Digite o produto vendido:");
		prod1.nomeProduto = teclado.nextLine();
		
	
		System.out.println("Digite a transportadora:");
		transp1.nomeTransportadora = teclado.nextLine();
		
		System.out.printf("O vendedor %s, vendeu um %s para o cliente %s. Ele será entregue pela transportadora %s.", vende1.nome, prod1.nomeProduto, clien1.nomeCliente, transp1.nomeTransportadora);
		
	}
}
