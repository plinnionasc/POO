package br.com.banco;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c1=new ContaCorrente(12151,1000);
        c1.depositar(50);
        c1.sacar(500);

        System.out.println("saldo:" +c1.consultarSaldo());
        System.out.println("saldo:" +c1.consultarSaldoTotal());

        Conta c2 = new Conta(12151);
        c2.depositar(50);
        c2.sacar(500);
        System.out.println("saldo:" + c2.consultarSaldo());
        }
    }
