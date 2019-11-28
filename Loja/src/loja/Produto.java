package loja;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    public String nome;
    public int codigo;
    public String desc;
    public float valor;
    public int quantidade;

    public Produto(String nome, int codigo, String desc, float valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.desc = desc;
        this.valor = valor;
    }

    public static List<Produto> produtos = new ArrayList<Produto>();

    public static void carregarProdutos()
    {
        Produto p1 = new Produto("Halls", 1, "Pacote com 10un", 1.50f);
        Produto p2 = new Produto("Achocolatado Nescau", 2, "500g", 6.50f);
        Produto p3 = new Produto("Leite Itambe", 3, "1 litro", 2.80f);
        Produto p4 = new Produto("Biscoito Oreo", 4, "pacote com 10un", 3.00f);
        Produto p5 = new Produto("Refrigerante Kuat", 5, "2 litros", 4.00f);
        Produto p6 = new Produto("Mucarela", 6, "bandeja com 8 fatias", 3.15f);
        Produto p7 = new Produto("Pao Fraces", 7, "unidade", 0.80f);
        Produto p8 = new Produto("Chocolate Snickers", 8, "unidade", 2.45f);
        Produto p9 = new Produto("Pacoca", 9, "unidade", 0.50f);
        Produto p10 = new Produto("Sabao em Po", 10, "500g", 5.50f);
        Produto p11 = new Produto("Detergente Ype", 11, "500ml", 2.89f);
        Produto p12 = new Produto("Escova de Dentes Colgate", 12, "unidade", 3.20f);
        Produto p13 = new Produto("Pasta de Dente Colgate", 13, "unidade", 2.83f);
        Produto p14 = new Produto("Hamburger de Frango", 14, "2 unidades", 1.50f);
        Produto p15 = new Produto("Hamburger de Boi", 15, "2 unidades", 1.50f);
        Produto p16 = new Produto("Torrada Bauduco", 16, "pacote com 10un", 3.45f);
        Produto p17 = new Produto("Cookie Bauduco", 17, "pacote com 10un", 3.69f);
        Produto p18 = new Produto("Margarina Delicia", 18, "200g", 2.85f);
        Produto p19 = new Produto("Presunto", 19, "bandeja com 8 fatias", 2.95f);
        Produto p20 = new Produto("Refrigerante Coca-Cola", 20, "2 litros", 5.99f);
        
        
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);
        produtos.add(p6);
        produtos.add(p7);
        produtos.add(p8);
        produtos.add(p9);
        produtos.add(p10);
        produtos.add(p11);
        produtos.add(p12);
        produtos.add(p13);
        produtos.add(p14);
        produtos.add(p15);
        produtos.add(p16);
        produtos.add(p17);
        produtos.add(p18);
        produtos.add(p19);
        produtos.add(p20);
        
        /*
    	for(Produto b:produtos){  
            System.out.println(
            		"*----------------------------------*" +
            		"\nNome: " + b.nome + "\nCodigo: " + b.codigo + 
                    "\nDescricao: " + b.desc+ "\nValor : R$"+b.valor);
        	}
        */
    }
    
    public List<Produto> retornaProdutos()
    {
        return produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public static List<Produto> getProdutos() {
        return produtos;
    }

    public static void setProdutos(List<Produto> produtos) {
        Produto.produtos = produtos;
    }
}
