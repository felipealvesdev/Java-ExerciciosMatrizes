package javabasico.aula20arraymultidimensional;

import java.util.Scanner;

public class Exercicio3MatrizesParte1 {
    public static void main(String[] args){
        int[][] M = new int[3][3];
        Scanner scan = new Scanner(System.in);
        int qtdPares = 0;
        int qtdImpares = 0;

        for(int i = 0; i<M.length; i++){
            for(int j = 0; j<M[i].length; j++){
                System.out.println("Por favor, digite o valor da Matriz["+i+"]["+j+"]");
                M[i][j] = scan.nextInt();
            }
        }
        System.out.println("O valor da matriz M digitado acima foi: ");
        for(int i = 0; i<M.length; i++){
            System.out.print("[");
            for(int j = 0; j<M[i].length; j++){
                if(M[i][j]%2 == 0){
                    qtdPares++;
                } else if (M[i][j]%2 !=0) {
                    qtdImpares++;
                }
                System.out.print(M[i][j]+ " ");
            }
            System.out.println("]");
        }
        System.out.println("A quantidade de números pares inseridos: " + qtdPares);
        System.out.println("A quatidade de números ímpares inseridos: " + qtdImpares);
    }
}
