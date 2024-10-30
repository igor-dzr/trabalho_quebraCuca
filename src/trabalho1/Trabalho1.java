package trabalho1;

import java.util.Scanner;
import java.util.Random;
/*Você deve implementar o jogo para um único jogador utilizando uma matriz para armazená-lo. Seu 
programa deve ser executado seguindo o fluxo abaixo: 
1. O programa deve exibir um menu com as opções (0) para sair, (1) começar um novo jogo, (2) ver 
instruções de como jogar. 
a. Se a opção for iniciar um novo jogo, o programa deve solicitar qual o nível de dificuldade 
desejado: fácil (1), médio (2) ou difícil (3). 
b. Se a opção instruções for selecionado, o programa deve imprimir os comandos possíveis 
e instruções de como jogar.*/
public class Trabalho1 {
    public static int [][] matrizEmb(int [][] matriz){
        
        for (int cont = 0; cont < dificult; cont++) {
            for (int linha = 0; linha < matriz.length; linha++) {
                for (int coluna = 0; coluna < matriz.length; coluna++) {

                    if (matriz[linha][coluna] == 0) {
                        if (matriz[linha][coluna] == matriz[0][0]) {
                            int dir = matriz[linha][coluna + 1];
                            int baix = matriz[linha + 1][coluna];
                            int sort = new Random().nextInt(0, 2);
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz.length; j++) {
                                    if (sort == 0) {
                                        matriz[linha][coluna] = dir;
                                        matriz[linha][coluna + 1] = 0;
                                    }
                                    if (sort == 1) {
                                        matriz[linha][coluna] = baix;
                                        matriz[linha + 1][coluna] = 0;
                                    }
                                }
                            }
                        } else if (matriz[linha][coluna] == matriz[0][1]) {
                            int dir = matriz[linha][coluna + 1];
                            int baix = matriz[linha + 1][coluna];
                            int esq = matriz[linha][coluna - 1];
                            int sort = new Random().nextInt(0, 3);
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz.length; j++) {
                                    if (sort == 0) {
                                        matriz[linha][coluna] = dir;
                                        matriz[linha][coluna + 1] = 0;
                                    }
                                    if (sort == 1) {
                                        matriz[linha][coluna] = baix;
                                        matriz[linha + 1][coluna] = 0;
                                    }
                                    if (sort == 2) {
                                        matriz[linha][coluna] = esq;
                                        matriz[linha][coluna - 1] = 0;
                                    }
                                }
                            }
                        } else if (matriz[linha][coluna] == matriz[0][2]) {

                            int baix = matriz[linha + 1][coluna];
                            int esq = matriz[linha][coluna - 1];
                            int sort = new Random().nextInt(0, 2);
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz.length; j++) {

                                    if (sort == 0) {
                                        matriz[linha][coluna] = baix;
                                        matriz[linha + 1][coluna] = 0;
                                    }
                                    if (sort == 1) {
                                        matriz[linha][coluna] = esq;
                                        matriz[linha][coluna - 1] = 0;
                                    }
                                }
                            }
                        } else if (matriz[linha][coluna] == matriz[1][0]) {
                            int cima = matriz[linha - 1][coluna];
                            int dir = matriz[linha][coluna + 1];
                            int baix = matriz[linha + 1][coluna];
                            int sort = new Random().nextInt(0, 3);
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz.length; j++) {
                                    if (sort == 0) {
                                        matriz[linha][coluna] = dir;
                                        matriz[linha][coluna + 1] = 0;
                                    }
                                    if (sort == 1) {
                                        matriz[linha][coluna] = baix;
                                        matriz[linha + 1][coluna] = 0;
                                    }
                                    if (sort == 2) {
                                        matriz[linha][coluna] = cima;
                                        matriz[linha - 1][coluna] = 0;
                                    }
                                }
                            }
                        } else if (matriz[linha][coluna] == matriz[1][1]) {
                            int cima = matriz[linha - 1][coluna];
                            int dir = matriz[linha][coluna + 1];
                            int baix = matriz[linha + 1][coluna];
                            int esq = matriz[linha][coluna - 1];
                            int sort = new Random().nextInt(0, 4);
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz.length; j++) {
                                    if (sort == 0) {
                                        matriz[linha][coluna] = dir;
                                        matriz[linha][coluna + 1] = 0;
                                    }
                                    if (sort == 1) {
                                        matriz[linha][coluna] = baix;
                                        matriz[linha + 1][coluna] = 0;
                                    }
                                    if (sort == 2) {
                                        matriz[linha][coluna] = cima;
                                        matriz[linha - 1][coluna] = 0;
                                    }
                                    if (sort == 3) {
                                        matriz[linha][coluna] = esq;
                                        matriz[linha][coluna - 1] = 0;
                                    }
                                }
                            }
                        } else if (matriz[linha][coluna] == matriz[1][2]) {
                            int cima = matriz[linha - 1][coluna];
                            int esq = matriz[linha][coluna - 1];
                            int baix = matriz[linha + 1][coluna];
                            int sort = new Random().nextInt(0, 3);
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz.length; j++) {
                                    if (sort == 0) {
                                        matriz[linha][coluna] = esq;
                                        matriz[linha][coluna - 1] = 0;
                                    }
                                    if (sort == 1) {
                                        matriz[linha][coluna] = baix;
                                        matriz[linha + 1][coluna] = 0;
                                    }
                                    if (sort == 2) {
                                        matriz[linha][coluna] = cima;
                                        matriz[linha - 1][coluna] = 0;
                                    }
                                }
                            }
                        } else if (matriz[linha][coluna] == matriz[2][0]) {
                            int dir = matriz[linha][coluna + 1];
                            int cima = matriz[linha - 1][coluna];
                            int sort = new Random().nextInt(0, 2);
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz.length; j++) {
                                    if (sort == 0) {
                                        matriz[linha][coluna] = dir;
                                        matriz[linha][coluna + 1] = 0;
                                    }
                                    if (sort == 1) {
                                        matriz[linha][coluna] = cima;
                                        matriz[linha - 1][coluna] = 0;
                                    }
                                }
                            }
                        } else if (matriz[linha][coluna] == matriz[2][1]) {
                            int dir = matriz[linha][coluna + 1];
                            int cima = matriz[linha - 1][coluna];
                            int esq = matriz[linha][coluna - 1];
                            int sort = new Random().nextInt(0, 3);
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz.length; j++) {
                                    if (sort == 0) {
                                        matriz[linha][coluna] = dir;
                                        matriz[linha][coluna + 1] = 0;
                                    }
                                    if (sort == 1) {
                                        matriz[linha][coluna] = cima;
                                        matriz[linha - 1][coluna] = 0;
                                    }
                                    if (sort == 2) {
                                        matriz[linha][coluna] = esq;
                                        matriz[linha][coluna - 1] = 0;
                                    }
                                }
                            }
                        } else if (matriz[linha][coluna] == matriz[2][2]) {
                            int esq = matriz[linha][coluna - 1];
                            int cima = matriz[linha - 1][coluna];
                            int sort = new Random().nextInt(0, 2);
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz.length; j++) {
                                    if (sort == 0) {
                                        matriz[linha][coluna] = esq;
                                        matriz[linha][coluna - 1] = 0;
                                    }
                                    if (sort == 1) {
                                        matriz[linha][coluna] = cima;
                                        matriz[linha - 1][coluna] = 0;
                                    }
                                }
                            }
                        }

                    }
                }

            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
            }

        }
        
        
        
    return matriz;}
    public static void menu() {
        System.out.println("(0)para sair \n"
                + "(1)comecar um novo jogo\n"
                + "(2)ver instrucoes de como jogar");
    }

    public static void main(String[] args) {
        menu();

        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        int matriz[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};

        switch (opcao) {
            case 0:

                break;

            case 1:
               int 
                break;

            case 2:

                break;

        }

    }

}
