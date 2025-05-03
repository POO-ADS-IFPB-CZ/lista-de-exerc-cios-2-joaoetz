package model;
import java.util.Scanner;
import java.time.LocalDate;

public class ContaCorrente {
    private String titular;
    private static int contador = 0;
    private int numero;
    private double saldo;

    public ContaCorrente(String titular) {
        contador++;
        this.numero = contador;
        this.titular = titular;
        saldo = 0;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Valor Atual do Saldo: R$ %.2f\n", saldo);
        System.out.print("Qual o valor do deposito?\nValor: R$ ");
        double valor = sc.nextDouble();

        if(valor < 0 || valor > 10000){
            System.out.println("Valor do deposito invalido.\n");
        }else{
            saldo += valor;
            System.out.printf("Valor Depositado: R$ %.2f\n", valor);
            System.out.printf("Valor Atual do Saldo: R$ %.2f\n", saldo);
            }
    }
    public void sacar(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Valor Atual do Saldo: R$ %.2f\n", saldo);
        System.out.print("Qual o valor do saque?\nValor: R$ ");
        double valor = sc.nextDouble();

        if(valor < 0 || valor > saldo || saldo == 0){
            System.out.println("Valor do saque invalido.\n");
        }else if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Valor sacado: R$ %.2f\n", valor);
            System.out.printf("Valor Atual do Saldo: R$ %.2f\n", saldo);
        }
    }
    public void transferir(ContaCorrente destino){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Valor Atual do Saldo: R$ %.2f\n", saldo);
        System.out.print("Qual o valor da transferencia?\nValor: R$ ");
        double valor = sc.nextDouble();

        if(valor < 0 || valor > saldo || valor > 10000){
            System.out.println("Valor do saque invalido.\n");
        }else if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.saldo += valor;
            System.out.printf("Valor transferido: R$ %.2f\n", valor);
            System.out.printf("Valor Atual do Saldo: R$ %.2f\n", saldo);
        }
    }
}