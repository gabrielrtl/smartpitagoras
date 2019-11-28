package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Cliente {
    private String nome;
    private long cpf;
    private String endereco;
    private String telefone;
    private int codigo;


    Cliente(){
        nome = "";
        cpf = 0;
        endereco = "";
        telefone = "";
        codigo = 1;
    }

    Cliente(String nome, long valorCPF, String endereco, String telefone, int codigo){
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public long getCPF(){
        return cpf;
    }

    public void setCPF(long cpf){
        this.cpf = cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    //private static int qtdClientes;
    private static List<Cliente> clientes = new ArrayList<Cliente>();


    public static Cliente insereCliente(){
        Scanner scan = new Scanner (System.in);
        Cliente cliente = new Cliente();

        System.out.println("Informe o nome do cliente: ");
        cliente.nome = scan.nextLine();

        scan = new Scanner (System.in);
        System.out.println("Informe o cpf: ");
        cliente.cpf = scan.nextLong();

        scan = new Scanner (System.in);
        System.out.println("Informe o numero do telefone: ");
        cliente.telefone = scan.nextLine();

        scan = new Scanner (System.in);
        System.out.println("Informe o endereco onde voce mora: ");
        cliente.endereco = scan.nextLine();
        
        

        
        clientes.add(cliente);
        //qtdClientes ++;
        //System.out.print("\n\nqtde: " + qtdClientes);

        System.out.println("\nCliente cadastrado com sucesso!!!");
        return cliente;
    }


    public static void mostrarClientes(){
        for(int i=0; i < clientes.size(); i++){
            System.out.println("Nome: " + clientes.get(i).nome +
                    ", CPF: " + clientes.get(i).cpf +
                    ", telefone: " + clientes.get(i).telefone +
                    ", endereco: " + clientes.get(i).endereco +
                    ", codigo: " + clientes.get(i).codigo);
        }
    }
}
