package br.com.pratica1;

public class Vip extends Ingresso {

    private double valorAdicional;

    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }
    public void imprimeIngresso(){
        System.out.println("Ingresso vip - valor:" + (getValorIngresso()+ getValorAdicional()));
    }

}
