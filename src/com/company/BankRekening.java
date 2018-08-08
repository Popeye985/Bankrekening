package com.company;
public class BankRekening {


    public void stortGeld(int bedrag) {
        saldo = saldo + bedrag;
    }

    public void haalGeldAf(int bedrag) {
        saldo = saldo - bedrag;
    }

    public int getSaldo() {
        return saldo;

    }
    private int saldo;


}
