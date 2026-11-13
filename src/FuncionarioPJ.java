public class FuncionarioPJ extends Funcionario {
    private double valorHora;
    private double horasTrabalhadas;

    public FuncionarioPJ(String nome, double valorHora, double horasTrabalhadas) {
        this(nome, valorHora, horasTrabalhadas, true);
    }

    protected FuncionarioPJ(String nome, double valorHora, double horasTrabalhadas, boolean pj) {
        super(nome, 0.0, pj);
        if (valorHora < 0 || horasTrabalhadas < 0) {
            throw new IllegalArgumentException("Hora e quantidade inválidas.");
        }
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularBruto() {
        return salarioMensal;

}