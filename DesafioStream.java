import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioStream {
    // DESAFIO 1
    public static List<Funcionario> filtrarPorNascESal(List<Empresa> empresas) {
       int anoInicio = 1975;
       int anoFim = 1985;
       double salarioLimite = 3000.00;
       
       return empresas.stream()
            .flatMap(empresa -> empresa.getFuncionarios().stream())
            .filter(f -> {
                int anoNascimento = f.getDataNascimento().getYear();
                return anoNascimento >= anoInicio && anoNascimento <= anoFim;
            })
            .filter(f -> f.getSalario() <= salarioLimite)
            .collect(Collectors.toList());
    }

    // DESAFIO 2
    public static int somarNumerosPares(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n% 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // DESAFIO 3
    public static List<Funcionario> obterMaioresSalariosCltJovens(List<Empresa> empresas) {
        return empresas.stream()
            .flatMap(empresa -> empresa.getFuncionarios().stream())
            .filter(f -> f.getTipoContrato() == TipoContrato.CLT)
            .filter(f -> f.getIdade() < 25)
            .sorted(Comparator.comparingDouble(Funcionario::getSalario).reversed())
            .limit(30)
            .collect(Collectors.toList());
    }
}
