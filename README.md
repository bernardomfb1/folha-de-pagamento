# Sistema de Folha de Pagamento em Java

Estudo guiado avaliativo desenvolvido para a disciplina de Programacao Orientada a Objetos, com o objetivo de calcular a folha de pagamento de funcionarios (CLT, PJ e Professores) aplicando classes, encapsulamento, heranca, polimorfismo e tratamento de excecoes.

## Estrutura do Projeto

1. Funcionario.java: Classe base com atributos privados, construtores, validacoes e calculos de INSS, IRRF e FGTS.
2. FuncionarioPJ.java: Subclasse para prestadores de servico, calculando bruto por hora e aplicando DAS-MEI fixo.
3. Professor.java: Subclasse de FuncionarioPJ adaptada para o regime CLT docente (conversao de carga horaria e DSR).
4. Main.java: Classe de teste interativa via terminal com uso de Scanner.

## Como Compilar e Executar

Abra o terminal na pasta dos arquivos e execute:

javac *.java
java Main


