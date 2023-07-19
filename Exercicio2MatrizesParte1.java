package javabasico.aula20arraymultidimensional;

import java.util.Random;

public class Exercicio2MatrizesParte1 {
    public static void main(String[] args){

        int[][] M = new int[10][10];

        Random numeroRandom = new Random();
        int linha5MenorValor = 9;
        int coluna7MaiorValor = 0;
        int coluna7menorValor = 9;

        for(int i = 0; i<M.length; i++){
            for(int j = 0; j<M[i].length; j++){
                M[i][j] = numeroRandom.nextInt(9);
                System.out.println("O valor do numero[" + i + "][" + j + "]: " + M[i][j]);
            }
        }
        for(int i = 0; i<M.length; i++){
            for(int j = 0; j<M[i].length; j++){
                if(M[5][j]< linha5MenorValor){
                    linha5MenorValor = M[5][j];
                }
                if(M[i][7] > coluna7MaiorValor){
                    coluna7MaiorValor = M[i][7];
                }
                if(M[i][7]< coluna7menorValor) {
                    coluna7menorValor = M[i][7];
                }
            }
            System.out.print("Valores da coluna ["+i+"][7]: " );
            System.out.println(M[i][7]);
        }
        for(int j = 0; j<M.length;j++){
            System.out.print("Valores da linha [5]["+ j +"]: " );
            System.out.println(M[5][j]);
        }

        System.out.println("O menor valor da linha 5 é: " + linha5MenorValor);
        System.out.println("O maior valor da coluna 7 é: " + coluna7MaiorValor);
        System.out.println("O menor valor da coluna 7 é: " + coluna7menorValor);
    }
}
