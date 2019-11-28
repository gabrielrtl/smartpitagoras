package loja;

import java.util.ArrayList;

public class Pedido
{
    Cliente cliente;
    Funcionario funcionario;
    ArrayList<Produto> produto;
    float total;

    public Pedido()
    {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.produto = new ArrayList<>();
        this.total = 0;
    }

    public void adicionarProdutoComprado(int id)
    {
        Produto.carregarProdutos();
        produto.add(Produto.produtos.get(id-1));
        total += Produto.produtos.get(id-1).getValor();
    }
    public void adicionarFuncionario(int id)
    {
        Funcionario.carregarFuncionarios();
        funcionario = Funcionario.funcionarios.get(id-1);
    }
    public void adicionarCliente(int id)
    {
        cliente = Cliente.insereCliente();
    }


    public void imprimeNotaFiscal()
    {
        System.out.println("Cliente: " + cliente + "\tVendedor: " + funcionario.nome);
        for (int i = 0; i < produto.size(); i++)
        {
            System.out.println("Codigo: " + produto.get(i).getCodigo() + "\nNome: " + produto.get(i).getNome());
            System.out.println("-----------------------------------------------");
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Total: R$" + total);
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
