package br.com.pratica1;

public class Camarote extends Ingresso {
        private double valorAdcional;
        private String localizacao;

    public Camarote(double valorIngresso, double valorAdcional, String localizacao) {
        super(valorIngresso);
        this.valorAdcional = valorAdcional;
        this.localizacao = localizacao;
    }

    public double getValorAdcional() {
        return valorAdcional;
    }

    public void setValorAdcional(double valorAdcional) {
        this.valorAdcional = valorAdcional;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimeIngresso(){
        System.out.println();
    }


}

