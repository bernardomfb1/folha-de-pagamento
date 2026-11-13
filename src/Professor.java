public class Professor extends FuncionarioPJ {
    public Professor(String nome, double valorHoraAula, double horasSemanais) {
        super(nome, valorHoraAula, horasSemanais, false);
    }

    public double calcularBruto() {
    
        double horasMensais = getHorasTrabalhadas() * 4.5;
        double remuneracaoAulas = getValorHora() * horasMensais;
        double dsrDidatico = remuneracaoAulas / 6.0;
        return remuneracaoAulas + dsrDidatico;
    }
}