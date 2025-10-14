package pr;

public class consumo {
private double kms = 0;
private double ltrs = 0;
private double vm = 0;
private double pgas = 0;

    public consumo(double ltrs, double kms, double vm, double pgas) {
        this.ltrs = ltrs;
        this.kms = kms;
        this.vm = vm;
        this.pgas = pgas;
    }
    public double getTiempo(){
        return kms/vm;
    }

    public double consumoMedio() {
        return (ltrs * 100) / kms;
    }

    public double consumoEuros() {
        return consumoMedio() * pgas;
    }

}