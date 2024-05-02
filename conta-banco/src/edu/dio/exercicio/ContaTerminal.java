package edu.dio.exercicio;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String titular;
        String agencia;
        double saldo;
        int conta;

        System.out.println("Por favor, digite o seu nome:");
        titular = scanner.nextLine();

        System.out.println("Digite a agência:");
        int tempAgencia = scanner.nextInt();
        // format para padrao ###-#
        agencia = String.format("%03d-%d", tempAgencia / 10, tempAgencia % 10);

        System.out.println("Digite o número da conta:");
        conta = scanner.nextInt();

        System.out.println("Digite seu saldo:");
        saldo = scanner.nextDouble();
        String money = String.format("R$ %.2f", saldo);

        scanner.close(); // Sempre fechar o scanner após o uso (boa prática, memory leak)

        System.out.println("Olá " + titular + ", obrigado por criar uma conta em nosso banco. sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + money + " já está disponível para saque");
    }
}