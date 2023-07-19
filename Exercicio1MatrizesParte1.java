package javabasico.aula20arraymultidimensional;

import java.util.Random;

public class Exercicio1MatrizesParte1 {
    public static void main(String[] args){
        //1 exercicio
        int[][] M = new int[4][4];
        Random numeroRandom = new Random();

        int maiorNumero = 0;
        int colunaNumero = 0;
        int linhaNumero = 0;

        for (int i = 0; i< M.length; i++){
            for(int j = 0; j<M[i].length; j++){
                // ira pegar um numero aleatorio entre zero e 100;
                M[i][j] = numeroRandom.nextInt(100);
                System.out.println("Numero["+ i+"]["+j+"] = " + M[i][j]);
                        if(M[i][j] >= maiorNumero ){
                            maiorNumero = M[i][j];
                            colunaNumero = j;
                            linhaNumero = i;
                }
            }
        }

        System.out.println("O maior número da lista é: " + maiorNumero);
        System.out.println("O valor da linha [i] do número " + maiorNumero + " é: " + linhaNumero);
        System.out.println("O valor da coluna [j] do número " + maiorNumero + " é " + colunaNumero);

    }
}
