# Desafio Stream API em Java

Projeto desenvolvido para praticar manipulação avançada de coleções e dados em memória utilizando a Stream API do Java, aplicando conceitos essenciais para o desenvolvimento back-end.

## O que foi desenvolvido

- **Filtragem combinada:** Seleção de funcionários com base em múltiplos critérios simultâneos (faixa de ano de nascimento e teto salarial).
- **Operações de redução:** Soma de elementos numéricos filtrados de uma coleção utilizando `mapToInt().sum()`.
- **Ranking e ordenação:** Combinação de `filter`, `sorted` (ordem decrescente) e `limit` para extrair os maiores salários de um público específico.

## Estrutura do Projeto

O código está dividido em três classes principais:

1. **`Funcionario`:** Modelo de dados contendo nome, data de nascimento, salário, tipo de contrato (Enum `TipoContrato`) e idade.
2. **`Empresa`:** Modelo que agrupa uma lista de funcionários vinculados a uma empresa.
3. **`DesafioStream`:** Classe utilitária contendo os três métodos estáticos exigidos pelo desafio.

## Implementação dos Métodos

### 1. Filtrar funcionários por ano de nascimento e salário
```java
public static List<Funcionario> filtrarPorNascimentoESalario(List<Empresa> empresas) {
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
