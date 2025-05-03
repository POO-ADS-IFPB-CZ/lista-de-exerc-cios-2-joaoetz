package view;

import model.ContaCorrente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== BANCO \"OO\" ===");

        System.out.print("Digite o nome do Titular da conta: ");
        String nome = sc.nextLine();

        ContaCorrente conta1 = new ContaCorrente(nome);

        System.out.printf("Bem vindo %s!\n",conta1.getTitular());
        int opcao;
        do {
            System.out.println("\n=== Digite uma das opções ===");
            System.out.print("Digite '1' para depositar\nDigite '2' para Sacar\nDigite '3' para verificar o saldo\nDigite '4' para sair\nQual o número da opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    conta1.depositar();
                    break;
                case 2:
                    conta1.sacar();
                    break;
                case 3:
                    System.out.printf("Valor Atual do Saldo: R$ %.2f\n",conta1.getSaldo());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
            }
        } while (opcao != 4);
    }
}