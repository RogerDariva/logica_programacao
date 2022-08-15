package _15_java;

import java.util.Scanner;

public class MultaVeiculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double velocidadeMaxima = 0, velocidadeVeiculo = 0;
        String carro = "carro", caminhao = "caminhao";

        System.out.println("tipos de veiculos disponiveis:\n \"carro\"\n\"caminhao\" ");

        System.out.println("Digite o Tipo de Veiculo :");
        String veiculo = scanner.next();

        System.out.println("Informe a velocidade do máxima (km)");
        velocidadeMaxima = scanner.nextInt();

        System.out.println("Informe a velocidade do veículo (km)");
        velocidadeVeiculo = scanner.nextInt();

        double multaCarro = (velocidadeMaxima * 1.1);

        double multaCaminhao = (velocidadeMaxima * 1.05) ;

        if (veiculo.equals(carro) && velocidadeVeiculo > multaCarro) {
            System.out.println("O Carro será Multado\n Valor da Multa é : " + (velocidadeVeiculo - multaCarro) * 5);
        } else if (veiculo.equals("caminhao") && velocidadeVeiculo > multaCaminhao) {
            System.out.println("O caminhão será Multado\n Valor da Multa é : " + (velocidadeVeiculo - multaCaminhao) * 10);
        } else if (veiculo.equals(carro) || veiculo.equals(caminhao))
            System.out.println("O veiculo não será Multado");
            else {
            System.out.println("A opção do Veiculo digitada é inválida. Tente escrever com o mesmo padrão oferecido dentro das aspas");
        }

        }

    }

