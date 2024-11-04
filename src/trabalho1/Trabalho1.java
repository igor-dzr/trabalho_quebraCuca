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

    //verifica se a matriz está ordenada
    public static boolean verificador(int[][] jogo) {
        if (jogo[0][0] == 1 && jogo[0][1] == 2 && jogo[0][2] == 3
                && jogo[1][0] == 4 && jogo[1][1] == 5 && jogo[1][2] == 6
                && jogo[2][0] == 7 && jogo[2][1] == 8 && jogo[2][2] == 0) {
            System.out.println("Fim de Jogo!");
            return false;
        } else {
            return true;
        }
    }

    //imprime a matriz a cada movimento que o jogador realiza
    public static void imprimeJogo(int[][] jogo) {

        for (int i = 0; i < jogo.length; i++) {
            for (int j = 0; j < jogo.length; j++) {
                if (jogo[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(jogo[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    //funcao que lerá a jogada do usuário
    public static int jogada() {
        System.out.println("digite a peca que deseja mover: ");
        Scanner scan = new Scanner(System.in);
        int valorDigitado = scan.nextInt();
        return valorDigitado;
    }

    //mensegem que exibira a matriz embaralhada
    public static void mensagemIn(int[][] jogo) {

        System.out.println("Tabuleiro embaralhado, Vamos começar o jogo!");
        for (int i = 0; i < jogo.length; i++) {
            for (int j = 0; j < jogo.length; j++) {
                if (jogo[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(jogo[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    //função onde o usuario jogara
    public static void jogo(int[][] matriz) {
        int jogo[][] = embaralhar(matriz);

        mensagemIn(jogo);

        while (true) {
            int jogada = 0;       

            for (int linha = 0; linha < jogo.length; linha++) {
                for (int coluna = 0; coluna < jogo.length; coluna++) {

                    if (jogo[linha][coluna] == 0) {

                        if (jogo[linha][coluna] == jogo[0][0]) {
                            int dir = jogo[linha][coluna + 1];
                            int baix = jogo[linha + 1][coluna];
                            jogada = jogada();

                            if (jogada == dir) {
                                jogo[linha][coluna] = dir;
                                jogo[linha][coluna + 1] = 0;

                            } else if (jogada == baix) {
                                jogo[linha][coluna] = baix;
                                jogo[linha + 1][coluna] = 0;
                            } else {
                                System.out.println("nao e possivel movimentar a peça: " + jogada);
                            }

                        } else if (jogo[linha][coluna] == jogo[0][1]) {
                            int dir = jogo[linha][coluna + 1];
                            int baix = jogo[linha + 1][coluna];
                            int esq = jogo[linha][coluna - 1];
                            jogada = jogada();

                            if (jogada == dir) {
                                jogo[linha][coluna] = dir;
                                jogo[linha][coluna + 1] = 0;
                            } else if (jogada == baix) {
                                jogo[linha][coluna] = baix;
                                jogo[linha + 1][coluna] = 0;
                            } else if (jogada == esq) {
                                jogo[linha][coluna] = esq;
                                jogo[linha][coluna - 1] = 0;
                            } else {
                                System.out.println("nao e possivel movimentar a peça: " + jogada);
                            }

                        } else if (jogo[linha][coluna] == jogo[0][2]) {

                            int baix = jogo[linha + 1][coluna];
                            int esq = jogo[linha][coluna - 1];
                            jogada = jogada();

                            if (jogada == baix) {
                                jogo[linha][coluna] = baix;
                                jogo[linha + 1][coluna] = 0;
                            } else if (jogada == esq) {
                                jogo[linha][coluna] = esq;
                                jogo[linha][coluna - 1] = 0;
                            } else {
                                System.out.println("nao e possivel movimentar a peça: " + jogada);
                            }

                        } else if (jogo[linha][coluna] == jogo[1][0]) {
                            int cima = jogo[linha - 1][coluna];
                            int dir = jogo[linha][coluna + 1];
                            int baix = jogo[linha + 1][coluna];
                            jogada = jogada();

                            if (jogada == dir) {
                                jogo[linha][coluna] = dir;
                                jogo[linha][coluna + 1] = 0;
                            } else if (jogada == baix) {
                                jogo[linha][coluna] = baix;
                                jogo[linha + 1][coluna] = 0;
                            } else if (jogada == cima) {
                                jogo[linha][coluna] = cima;
                                jogo[linha - 1][coluna] = 0;
                            } else {
                                System.out.println("nao e possivel movimentar a peça: " + jogada);
                            }

                        } else if (jogo[linha][coluna] == jogo[1][1]) {
                            int cima = jogo[linha - 1][coluna];
                            int dir = jogo[linha][coluna + 1];
                            int baix = jogo[linha + 1][coluna];
                            int esq = jogo[linha][coluna - 1];
                            jogada = jogada();

                            if (jogada == dir) {
                                jogo[linha][coluna] = dir;
                                jogo[linha][coluna + 1] = 0;

                            } else if (jogada == baix) {
                                jogo[linha][coluna] = baix;
                                jogo[linha + 1][coluna] = 0;
                            } else if (jogada == cima) {
                                jogo[linha][coluna] = cima;
                                jogo[linha - 1][coluna] = 0;
                            } else if (jogada == esq) {
                                jogo[linha][coluna] = esq;
                                jogo[linha][coluna - 1] = 0;
                            } else {
                                System.out.println("nao e possivel movimentar a peça: " + jogada);
                            }

                        } else if (jogo[linha][coluna] == jogo[1][2]) {
                            int cima = jogo[linha - 1][coluna];
                            int esq = jogo[linha][coluna - 1];
                            int baix = jogo[linha + 1][coluna];
                            jogada = jogada();

                            if (jogada == esq) {
                                jogo[linha][coluna] = esq;
                                jogo[linha][coluna - 1] = 0;
                            } else if (jogada == baix) {
                                jogo[linha][coluna] = baix;
                                jogo[linha + 1][coluna] = 0;
                            } else if (jogada == cima) {
                                jogo[linha][coluna] = cima;
                                jogo[linha - 1][coluna] = 0;
                            } else {
                                System.out.println("nao e possivel movimentar a peça: " + jogada);
                            }

                        } else if (jogo[linha][coluna] == jogo[2][0]) {
                            int dir = jogo[linha][coluna + 1];
                            int cima = jogo[linha - 1][coluna];
                            jogada = jogada();

                            if (jogada == dir) {
                                jogo[linha][coluna] = dir;
                                jogo[linha][coluna + 1] = 0;
                            } else if (jogada == cima) {
                                jogo[linha][coluna] = cima;
                                jogo[linha - 1][coluna] = 0;
                            } else {
                                System.out.println("nao e possivel movimentar a peça: " + jogada);
                            }

                        } else if (jogo[linha][coluna] == jogo[2][1]) {
                            int dir = jogo[linha][coluna + 1];
                            int cima = jogo[linha - 1][coluna];
                            int esq = jogo[linha][coluna - 1];
                            jogada = jogada();

                            if (jogada == dir) {
                                jogo[linha][coluna] = dir;
                                jogo[linha][coluna + 1] = 0;
                            } else if (jogada == cima) {
                                jogo[linha][coluna] = cima;
                                jogo[linha - 1][coluna] = 0;
                            } else if (jogada == esq) {
                                jogo[linha][coluna] = esq;
                                jogo[linha][coluna - 1] = 0;
                            } else {
                                System.out.println("nao e possivel movimentar a peça: " + jogada);
                            }

                        } else if (jogo[linha][coluna] == jogo[2][2]) {
                            int esq = jogo[linha][coluna - 1];
                            int cima = jogo[linha - 1][coluna];
                            jogada = jogada();

                            if (jogada == esq) {
                                jogo[linha][coluna] = esq;
                                jogo[linha][coluna - 1] = 0;
                            } else if (jogada == cima) {
                                jogo[linha][coluna] = cima;
                                jogo[linha - 1][coluna] = 0;
                            } else {
                                System.out.println("nao e possivel movimentar a peça: " + jogada);
                            }
                        }
                        imprimeJogo(jogo);
                        break;
                    }
                }
            }if (verificador(jogo) == false) {
                break;
            }
        } 

    }
    
    //função que embaralha a matriz
    public static int[][] embaralhar(int[][] matriz) {
        int dif = dificuldade();
        for (int cont = 0; cont < dif; cont++) {
            for (int linha = 0; linha < matriz.length; linha++) {
                for (int coluna = 0; coluna < matriz.length; coluna++) {

                    if (matriz[linha][coluna] == 0) {
                        if (matriz[linha][coluna] == matriz[0][0]) {
                            int dir = matriz[linha][coluna + 1];
                            int baix = matriz[linha + 1][coluna];
                            int sort = new Random().nextInt(0, 2);

                            if (sort == 0) {
                                matriz[linha][coluna] = dir;
                                matriz[linha][coluna + 1] = 0;
                            } else if (sort == 1) {
                                matriz[linha][coluna] = baix;
                                matriz[linha + 1][coluna] = 0;
                            }

                        } else if (matriz[linha][coluna] == matriz[0][1]) {
                            int dir = matriz[linha][coluna + 1];
                            int baix = matriz[linha + 1][coluna];
                            int esq = matriz[linha][coluna - 1];
                            int sort = new Random().nextInt(0, 3);

                            if (sort == 0) {
                                matriz[linha][coluna] = dir;
                                matriz[linha][coluna + 1] = 0;
                            } else if (sort == 1) {
                                matriz[linha][coluna] = baix;
                                matriz[linha + 1][coluna] = 0;
                            } else if (sort == 2) {
                                matriz[linha][coluna] = esq;
                                matriz[linha][coluna - 1] = 0;
                            }

                        } else if (matriz[linha][coluna] == matriz[0][2]) {

                            int baix = matriz[linha + 1][coluna];
                            int esq = matriz[linha][coluna - 1];
                            int sort = new Random().nextInt(0, 2);

                            if (sort == 0) {
                                matriz[linha][coluna] = baix;
                                matriz[linha + 1][coluna] = 0;
                            } else if (sort == 1) {
                                matriz[linha][coluna] = esq;
                                matriz[linha][coluna - 1] = 0;
                            }

                        } else if (matriz[linha][coluna] == matriz[1][0]) {
                            int cima = matriz[linha - 1][coluna];
                            int dir = matriz[linha][coluna + 1];
                            int baix = matriz[linha + 1][coluna];
                            int sort = new Random().nextInt(0, 3);

                            if (sort == 0) {
                                matriz[linha][coluna] = dir;
                                matriz[linha][coluna + 1] = 0;
                            } else if (sort == 1) {
                                matriz[linha][coluna] = baix;
                                matriz[linha + 1][coluna] = 0;
                            } else if (sort == 2) {
                                matriz[linha][coluna] = cima;
                                matriz[linha - 1][coluna] = 0;
                            }

                        } else if (matriz[linha][coluna] == matriz[1][1]) {
                            int cima = matriz[linha - 1][coluna];
                            int dir = matriz[linha][coluna + 1];
                            int baix = matriz[linha + 1][coluna];
                            int esq = matriz[linha][coluna - 1];
                            int sort = new Random().nextInt(0, 4);

                            if (sort == 0) {
                                matriz[linha][coluna] = dir;
                                matriz[linha][coluna + 1] = 0;
                            } else if (sort == 1) {
                                matriz[linha][coluna] = baix;
                                matriz[linha + 1][coluna] = 0;
                            } else if (sort == 2) {
                                matriz[linha][coluna] = cima;
                                matriz[linha - 1][coluna] = 0;
                            } else if (sort == 3) {
                                matriz[linha][coluna] = esq;
                                matriz[linha][coluna - 1] = 0;
                            }

                        } else if (matriz[linha][coluna] == matriz[1][2]) {
                            int cima = matriz[linha - 1][coluna];
                            int esq = matriz[linha][coluna - 1];
                            int baix = matriz[linha + 1][coluna];
                            int sort = new Random().nextInt(0, 3);

                            if (sort == 0) {
                                matriz[linha][coluna] = esq;
                                matriz[linha][coluna - 1] = 0;
                            } else if (sort == 1) {
                                matriz[linha][coluna] = baix;
                                matriz[linha + 1][coluna] = 0;
                            } else if (sort == 2) {
                                matriz[linha][coluna] = cima;
                                matriz[linha - 1][coluna] = 0;
                            }

                        } else if (matriz[linha][coluna] == matriz[2][0]) {
                            int dir = matriz[linha][coluna + 1];
                            int cima = matriz[linha - 1][coluna];
                            int sort = new Random().nextInt(0, 2);
                            {
                                if (sort == 0) {
                                    matriz[linha][coluna] = dir;
                                    matriz[linha][coluna + 1] = 0;
                                } else if (sort == 1) {
                                    matriz[linha][coluna] = cima;
                                    matriz[linha - 1][coluna] = 0;
                                }
                            }
                        } else if (matriz[linha][coluna] == matriz[2][1]) {
                            int dir = matriz[linha][coluna + 1];
                            int cima = matriz[linha - 1][coluna];
                            int esq = matriz[linha][coluna - 1];
                            int sort = new Random().nextInt(0, 3);

                            if (sort == 0) {
                                matriz[linha][coluna] = dir;
                                matriz[linha][coluna + 1] = 0;
                            } else if (sort == 1) {
                                matriz[linha][coluna] = cima;
                                matriz[linha - 1][coluna] = 0;
                            } else if (sort == 2) {
                                matriz[linha][coluna] = esq;
                                matriz[linha][coluna - 1] = 0;
                            }

                        } else if (matriz[linha][coluna] == matriz[2][2]) {
                            int esq = matriz[linha][coluna - 1];
                            int cima = matriz[linha - 1][coluna];
                            int sort = new Random().nextInt(0, 2);

                            if (sort == 0) {
                                matriz[linha][coluna] = esq;
                                matriz[linha][coluna - 1] = 0;
                            } else if (sort == 1) {
                                matriz[linha][coluna] = cima;
                                matriz[linha - 1][coluna] = 0;
                            }
                        }

                    }
                }

            }
        }

        return matriz;
    }
    
    //função para receber o valor da dificuldade
    public static int dificuldade() {
        System.out.println("dificuldades:\n"
                + "facil(1)\n"
                + "medio(2)\n"
                + "dificil(3)\n");
        int dif;
        int ndif = 0;

        do {
            Scanner scan = new Scanner(System.in);
            dif = scan.nextInt();
            if (dif == 1) {
                ndif = 20;
            } else if (dif == 2) {
                ndif = 40;
            } else if (dif == 3) {
                ndif = 80;
            } else if (dif < 0 || dif > 3) {
                System.out.println("invalido");
            }
        } while (dif < 0 || dif > 3);
        return ndif;
    }

    //função que ensinará a jogar
    public static void instrucao() {
        System.out.println("Digite o numero que deseja mover no teclado!");
    }
   
    //função para exibir o menu
    public static void menu() {
        System.out.println("(0)para sair \n"
                + "(1)comecar um novo jogo\n"
                + "(2)ver instrucoes de como jogar");
    }

    public static void main(String[] args) {
        menu();

        int matriz[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        while (true) {
            Scanner scan = new Scanner(System.in);
            int opcao = scan.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("obrigado por jogar!");

                    break;

                case 1:

                    jogo(matriz);
                    System.exit(0);
                    break;

                case 2:
                    instrucao();
                    menu();
            }
            if (opcao == 0) {
                break;
            }
        }

    }

}
