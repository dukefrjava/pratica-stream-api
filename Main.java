import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // DADOS TESTE
        Funcionario f1 = new Funcionario("Ana", LocalDate.of(1980, 5, 12), 2500.0, TipoContrato.CLT, 43);
        Funcionario f2 = new Funcionario("Bruno", LocalDate.of(1972, 3, 10), 2800.0, TipoContrato.CLT, 51);
        Funcionario f3 = new Funcionario("Carlos", LocalDate.of(2002, 8, 20), 4500.0, TipoContrato.CLT, 24);
        Funcionario f4 = new Funcionario("Diana", LocalDate.of(2004, 11, 5), 3200.0, TipoContrato.CLT, 22);

        Empresa empresa1 = new Empresa("Tech Corp", Arrays.asList(f1, f2, f3));
        Empresa empresa2 = new Empresa("Inovação S/A", Arrays.asList(f4));

        List<Empresa> empresas = Arrays.asList(empresa1, empresa2);

        // DESAFIO 1
        System.out.println("--- Desafio 1: Nascidos entre 1975-1985 e Salário <= 3000 ---");
        DesafioStream.filtrarPorNascESal(empresas).forEach(System.out::println);

        // DESAFIO 2
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int somaPares = DesafioStream.somarNumerosPares(numeros);
        System.out.println("\n--- Desafio 2: Soma dos números pares ---");
        System.out.println("Soma: " + somaPares); // Deve retornar 30

        // DESAFIO 3
        System.out.println("\n--- Desafio 3: Top CLT com menos de 25 anos ordenados por salário ---");
        DesafioStream.obterMaioresSalariosCltJovens(empresas).forEach(System.out::println);
    }
}
