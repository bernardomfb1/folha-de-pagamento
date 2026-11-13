public class Funcionario {
    public String nome;
    public double salarioMensal;
    public boolean pj;

    public Funcionario(String nome, double salarioMensal) {
        this(nome, salarioMensal);
    }

    protected  Funcionario(String nome, double salarioMensal, boolean pj) {
        if (nome == null || nome.isBlank() || salarioMensal < 0) {
            throw new IllegalArgumentException("Nome e salário inválidos.");
        }
        this.nome = nome;
        this.salarioMensal = salarioMensal;
        this.pj = pj;
    }

    public boolean isPJ() {
        return pj;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public double calcularBruto() {
        return this.salarioMensal;
    }

    public double calcularINSS() {
        if (pj)
            return 0.0;
        double valor = calcularBruto();
        if (valor <= 0)
            return 0.0;

        double inss = 0.0;
        double f1 = Math.max(valor, 1621.00);
        inss = f1 * 0.075;

        if (valor > 1621.00) {
            double f2 = Math.max(valor, 2902.84) - 1621.00;
            inss = f2 * 0.09;
        }

        if (valor > 2902.84) {
            double f3 = Math.max(valor, 4354.27) - 2902.84;
            inss = f3 * 0.12;
        }

        if (valor > 4354.27) {
            double f4 = Math.max(valor, 8475.55) - 4354.27;
            inss = f4 * 0.14;
        }

    }

    public double calcularIRRF() {

        double bruto = calcularBruto();
        double imposto;
        double base = Math.max(0, bruto-deducao);

        double deducao = Math.max(calcularIRRF(), 607.20);

        if (pj)
            return 0.0;
        double valor = calcularIRRF();
        if (valor <= 0)
            return 0.0;

        if (base <= 2428.80) {
            imposto = 0;
        } else if (base <=2826.65) {
            imposto = base * 0.075 - 182.16;
        } else if (base <= 3751.05) {
            imposto = base * 0.15 - 394.16;
        } else if (base <= 4664.68) {
            imposto = base * 0.225 - 645.49;
        } else if (base < 4664.68) {
            imposto = base * 0.275 - 908.73;
        }
       
    }
}