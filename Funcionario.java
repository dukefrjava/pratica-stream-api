import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private double salario;
    private TipoContrato tipoContrato;
    private int idade;

    public Funcionario(String nome, LocalDate dataNascimento, double salario, TipoContrato tipoContrato, int idade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.tipoContrato = tipoContrato;
        this.idade = idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public int getIdade() {
        return idade;
    }
    
    @Override 
    public String toString() {
        return String.format("%s (Nasc: %s, Salário: R$ %.2f, Contrato: %s, Idade: %d)",
                nome, dataNascimento, salario, tipoContrato, idade);
    }
}
