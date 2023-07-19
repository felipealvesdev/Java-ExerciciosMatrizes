package javabasico.aula20arraymultidimensional;

import java.util.Scanner;

public class ArrayIrregular {
    public static void main(String[] args) {
        // EXEMPLO:
        int[][] arrayIrregular = new int[3][];// o array irregular tera 3 linhas
        arrayIrregular[0] = new int[1];// a linha 0 terá apenas 1 coluna
        arrayIrregular[1] = new int[2];// a linha 1 terá apenas 2 colunas}
        arrayIrregular[2] = new int[3];// a linha 2 terá apenas 3 colunas;


        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero de pessoas que serão entrevistadas: ");
        int numEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for(int i=0; i< nomesFilhos.length; i++){
            System.out.println("Digite a quantidade de filhos");
            int qtdFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for(int j = 0; j< nomesFilhos[i].length; j++){
                System.out.println("Digite o nome do filho " + (j+1));

                nomesFilhos[i][j] = scan.next();
            }
        }
        for(int i=0; i< nomesFilhos.length; i++){

            System.out.println("Pessoa " + (i+1) + " tem " + nomesFilhos[i].length + " filhos:");
            for(int j = 0; j< nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j]);
            }
        }


    }
}
