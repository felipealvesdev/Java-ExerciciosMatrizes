package javabasico.aula20arraymultidimensional;

public class ArrayMulti {
    public static void main(String[] args){
        // Aula 20 parte 1 começa aqui
        double[][] notasAlunos = new double[2][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 10;

        notasAlunos[1][0] = 1;
        notasAlunos[1][1] = 6;
        notasAlunos[1][2] = 3;
        notasAlunos[1][3] = 9;

        for(int i = 0; i< notasAlunos.length; i++){
            for(int j = 0; j<notasAlunos[i].length; j++){
                System.out.println("Nota do aluno " + i +" é: " + notasAlunos[i][j]);
            }
        }
// Aula 20 parte 2 começa aqui
        System.out.println("Segunda parte da aula começa aqui: ");
        notasAlunos[0][0] = 5;
        for(int i = 0; i< notasAlunos.length; i++){
            for(int j = 0; j<notasAlunos[i].length; j++){
                System.out.println("Nota do aluno " + i +" é: " + notasAlunos[i][j]);
            }
        }

        double[] notasAluno1 = {7, 8, 9, 10};
        double[][] notasAlunos2 = {{7, 8, 9, 10}, {8, 6, 7, 10} };
        System.out.println("Output da matriz notasAlunos2: ");

        for(int i = 0; i< notasAlunos2.length; i++){
            for(int j = 0; j<notasAlunos2[i].length; j++){
                System.out.println("Nota do aluno " + i +" é: " + notasAlunos2[i][j]);
            }
        }
// Aula 20 parte 3 começa aqui
        int[][][] matrizTridimensional = new int[3][3][3];
        System.out.println("A matriz tridimensional vira a seguir: ");
        for (int i = 0; i< matrizTridimensional.length; i++){
            for (int j = 0; j<matrizTridimensional[i].length; j++){
                for(int k = 0; k<matrizTridimensional[i][j].length; k++){
                    matrizTridimensional[i][j][k] = i + j+ k;
                }
            }
        }
        int soma=0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i< matrizTridimensional.length; i++){
            for (int j = 0; j<matrizTridimensional[i].length; j++){
                for(int k = 0; k<matrizTridimensional[i][j].length; k++){
                    soma+= matrizTridimensional[i][j][k];
                    if(matrizTridimensional[i][j][k]%2== 0){
                        somaPares+= matrizTridimensional[i][j][k];
                    } else if (matrizTridimensional[i][j][k]%2!= 0){
                        somaImpares+= matrizTridimensional[i][j][k];
                    }
                }
            }
        }
        System.out.println("O resultado de soma: " + soma);
        System.out.println("O resultado da soma dos pares é: " + somaPares);
        System.out.println("O resultado da soma dos impares é: " + somaImpares);



    }
}
