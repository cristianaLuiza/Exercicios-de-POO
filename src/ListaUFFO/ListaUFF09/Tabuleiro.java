package ListaUFFO.ListaUFF09;

import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {
    private int[][] tabuleiroA = new int[4][4];
    private int[][] tabuleiroB = new int[4][4];
    private int linha, coluna;
    private int linhaA, colunaA, linhaB, colunaB;
    private boolean atingido = false;
    private int posicaoX1, posicaoY1, posicaoX2, posicaoY2, posicaoX3, posicaoY3;


    public void exibindoTabuleiro() {
        System.out.println("Tabuleiro A");
        for (linhaA = 0; linhaA < tabuleiroA.length; linhaA++) {
            for (colunaA = 0; colunaA < tabuleiroA.length; colunaA++) {
                System.out.printf("%2d | ", tabuleiroA[linhaA][colunaA]);
            }
            System.out.printf("%n");
        }
    }

    public void posicionarPecasA() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a posição X da sua 1º peça!");
        posicaoX1 = leia.nextInt();
        System.out.println("Digite a posição y da sua 1º peça!");
        posicaoY1 = leia.nextInt();

        System.out.println("Digite a posição X da sua 2º peça!");
        posicaoX2 = leia.nextInt();
        System.out.println("Digite a posição y da sua 2º peça!");
        posicaoY2 = leia.nextInt();

        System.out.println("Digite a posição X da sua 3º peça!");
        posicaoX3 = leia.nextInt();
        System.out.println("Digite a posição y da sua 3º peça!");
        posicaoY3 = leia.nextInt();

    }

    public void digitandoElementosA() {
        Random random = new Random();
        Scanner leia = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println(" Jogador 1 Linha A: ");
            linha = leia.nextInt();
            System.out.println("Jogador 1 Coluna B: ");
            coluna = leia.nextInt();

            for (linhaA = 0; linhaA < tabuleiroA.length; linhaA++) {
                for (colunaA = 0; colunaA < tabuleiroA.length; colunaA++) {
                    if (linha == this.posicaoX1 && coluna == this.posicaoY1) {
                        if (linha == random.nextInt(4) && coluna == random.nextInt(4)) {
                            atingido = true;
                        }
                    } else if (linha == this.posicaoX2 && coluna == this.posicaoY2) {
                        if (linha == random.nextInt(4) && coluna == random.nextInt(4)) {
                            atingido = true;
                        }
                    } else if (linha == this.posicaoX3 && coluna == this.posicaoY3) {
                        if (linha == random.nextInt(4) && coluna == random.nextInt(4)) {
                            atingido = true;
                        }
                    } else {
                        atingido = false;
                    }
                }
            }
            if (getAtingido() == true) {
                System.out.println("ALVO ATINGIDO!!!!!!");
            }
        }
    }

    public void posicionarPecasB() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a posição X da sua 1º peça!");
        posicaoX1 = leia.nextInt();
        System.out.println("Digite a posição y da sua 1º peça!");
        posicaoY1 = leia.nextInt();

        System.out.println("Digite a posição X da sua 2º peça!");
        posicaoX2 = leia.nextInt();
        System.out.println("Digite a posição y da sua 2º peça!");
        posicaoY2 = leia.nextInt();

        System.out.println("Digite a posição X da sua 3º peça!");
        posicaoX3 = leia.nextInt();
        System.out.println("Digite a posição y da sua 3º peça!");
        posicaoY3 = leia.nextInt();

    }

    public void digitandoElementosB() {
        Random random = new Random();
        Scanner leia = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Jogador 2 Linha A: ");
            linha = leia.nextInt();
            System.out.println("Jogador 2 Coluna B: ");
            coluna = leia.nextInt();

            for (linhaB = 0; linhaB < tabuleiroB.length; linhaB++) {
                for (colunaB = 0; colunaB < tabuleiroB.length; colunaB++) {
                    if (linha == this.posicaoX1 && coluna == this.posicaoY1) {
                        if (linha == random.nextInt(4) && coluna == random.nextInt(4)) {
                            atingido = true;
                        }
                    } else if (linha == this.posicaoX2 && coluna == this.posicaoY2) {
                        if (linha == random.nextInt(4) && coluna == random.nextInt(4)) {
                            atingido = true;
                        }
                    } else if (linha == this.posicaoX3 && coluna == this.posicaoY3) {
                        if (linha == random.nextInt(4) && coluna == random.nextInt(4)) {
                            atingido = true;
                        }
                    } else {
                        atingido = false;
                    }
                }
            }
            if (getAtingido() == true) {
                System.out.println("ALVO ATINGIDO!!!!!!");
            }
        }
    }


    public boolean getAtingido() {
        return atingido;
    }

}


