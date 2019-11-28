package loja;

import java.util.ArrayList;
import java.util.List;

public class Funcionario
{
    public int id;
    public String nome;
    public long cpf;
    public String telefone;
    public String horario;
    public String contrat;
    public Integer salario;

    public static List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    Funcionario (int id, String nome, long cpf, String telefone, String horario, String contrat, Integer salario){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.horario = horario;
        this.contrat = contrat;
        this.salario = salario;
    }

    public static void carregarFuncionarios()
    {
        Funcionario f0 = new Funcionario(1,"Jonathan", 32323232378L, "31232323123", "manha", "24/06/2019", 2750);
        Funcionario f1 = new Funcionario(2,"Gabriel", 12312312312L, "31123123123", "manha", "28/04/2015", 3000);
        Funcionario f2 = new Funcionario(3,"Vitor", 32132132132L, "3187736354", "tarde", "14/12/2016", 3500);
        Funcionario f3 = new Funcionario(4,"Matheus", 91112334556L, "31111123335", "noite", "02/09/2010", 2500);

        funcionarios.add(f0);
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

    }
    public static void imprimirFuncionarios()
    {
        carregarFuncionarios();
        for(Funcionario b:funcionarios){
            System.out.println("\nNome: " + b.nome + "\nCPF: " + b.cpf +
                    "\nTelefone: " + b.telefone + "\nHorario : "+b.horario
                    + "\nContratacao :"+b.contrat + "\nSalario: "+b.salario);
        }
    }
}
