package _22_08;

import java.util.Scanner;

public class PrecoFrete {

    static final Integer Adicionar_Frete_Abaixo_Do_Preco = 100;
    static final Integer Valor_Do_Frete = 15;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o Valor do Produto : ");
        double valorProduto = entrada.nextDouble();

        boolean adicionarFrete = valorProduto <= Adicionar_Frete_Abaixo_Do_Preco;

        System.out.println(adicionarFrete? "O valor da compra é de :"+ valorProduto : "O valor com frete é de :" + (valorProduto + Valor_Do_Frete) );

    }
}
