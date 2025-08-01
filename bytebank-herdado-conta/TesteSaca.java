package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;

public class TesteSaca {
    
    public static void main(String[] args) {

    ContaCorrente conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch(modelo.SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println(conta.getSaldo());

    }

}