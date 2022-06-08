package Heranca3;


public class Conta{
    void heranca3.Super();
    
    private int saldo;
    private int numero;
    private int agencia;
    private String titular;

    public void saque(){
        this.saldo =- saldo;
    }

    public void deposito(){
        this.saldo =+ saldo;
    }

    public void saldo(){
        System.out.println(saldo);;
    }
    
    
}