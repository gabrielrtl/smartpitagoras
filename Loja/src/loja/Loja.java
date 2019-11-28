package loja;

import java.util.Scanner;


public class Loja {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Scanner scan = new Scanner(System.in);
         int fimPedido = 5;



        String menu = ("\nBem vindo\n"
                + "1-Produtos\n"
                + "2-Clientes\n"
                + "3-Funcionarios\n"
                + "4-Fazer Pedido\n"
                + "9-Sair\n"
        );

        System.out.println(menu);
        int opcaomenu = scan.nextInt();


        while(opcaomenu != 9){
            if (opcaomenu == 1)
            {
                Produto.carregarProdutos();
            }
            if (opcaomenu == 2){
                System.out.println("1-Cadastrar Cliente");
                System.out.println("2-Mostrar Clientes");
                int submenu2 = scan.nextInt();
                switch (submenu2) {
                    case 1:
                        Cliente.insereCliente();
                        break;
                    case 2:
                        System.out.println("----------------------------------------");
                        Cliente.mostrarClientes();
                        System.out.println("----------------------------------------");
                        break;
                    default:
                        System.out.println("\nOpção invalida.\n");
                        System.out.println(menu);
                        break;
                }

            }
            if (opcaomenu == 3){
                Funcionario.imprimirFuncionarios();
            }
            if (opcaomenu == 4){
            	System.out.print("Digite o codigo do funcionario: (1-3)\n");
                pedido.adicionarFuncionario(scan.nextInt());
                Produto.carregarProdutos();
                while(fimPedido !=0)
                {
                    System.out.println("Digite o codigo do produto desejado para adiciona-lo ao seu pedido: ");
                    int id = scan.nextInt();
                    pedido.adicionarProdutoComprado(id);
                    System.out.println("Deseja continuar? Digite 1 para continuar e 0 para sair.");
                    fimPedido = scan.nextInt();
                }
                pedido.imprimeNotaFiscal();

            }
            if (opcaomenu == 9){
                break;
            }

            System.out.println("\n");
            System.out.println(menu);
            opcaomenu = scan.nextInt();
        }

    }
}