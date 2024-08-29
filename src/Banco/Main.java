package Banco;

import java.util.Scanner;

public class  Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        cliente.setNome(nome);

        System.out.print("Digite valor do deposito: ");
        double valorDeposito = sc.nextDouble();
        corrente.depositar(valorDeposito);

        System.out.println("Digite o  valor que deseja transferir: ");
        double valorTransferencia = sc.nextDouble();
        corrente.transferir(valorTransferencia, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        sc.close();
    }
}