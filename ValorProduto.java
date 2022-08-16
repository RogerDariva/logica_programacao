package _15_java;

import java.util.Scanner;

public class ValorProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorProduto = 0.0, quantidadeItens = 0.0;

        System.out.println("Qual o valor do Produto? ");
        valorProduto = entrada.nextDouble();

        System.out.println("Qual a quantidade desejada? ");
        quantidadeItens = entrada.nextDouble();

        if (quantidadeItens > 10) {
            System.out.println("valor total da compra com desconto é de : R$" + quantidadeItens * 0.9 * valorProduto + " reais");
        } else
            System.out.println("valor total da compra é de : R$" + quantidadeItens * valorProduto + " reais");
        }
    }

