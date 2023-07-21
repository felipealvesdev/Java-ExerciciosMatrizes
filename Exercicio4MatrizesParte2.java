package javabasico.aula20arraymultidimensional;


import java.util.Scanner;

public class Exercicio4MatrizesParte2 {
    public static void main(String[] args){
        // fazer exercicio 4 da agenda
        String[][] M = new String[24][32]; // 32 porque começa em zero e vai ate 31
        Scanner scan = new Scanner(System.in);
        boolean turnOnOff = true;
        boolean showMenu = true;

        int dia;
        int hora;

        String menu = "";

        while(turnOnOff){
            System.out.println("---------MENU----AGENDA-------");
            System.out.println("Deseja CONSULTAR compromisso ou deseja AGENDAR compromisso? c(CONSULTAR) / a(AGENDAR)");
            menu = scan.next();

            if(menu.equals("c")){
                System.out.println("Digite o dia");
                dia = scan.nextInt();
                System.out.println("Digita a hora que deseja consultar");
                hora = scan.nextInt();
                System.out.println("O que foi agendado para o dia "+ dia +" e hora " + hora+": "+ M[hora][dia]);

            }else if(menu.equals("a")){

                System.out.println("Digite o dia que deseja adicionar a tarefa: ");
                dia = scan.nextInt();

                System.out.println("Digite a hora que deseja adicionar a sua tarefa: ");
                hora = scan.nextInt();

                scan.nextLine();
                System.out.println("Digite a tarefa que será adicionada ao dia: " + dia + " E hora: " + hora);
                String tarefa = scan.nextLine();

                M[hora][dia] = tarefa;
                System.out.println(" ' " + tarefa + " ' foi adicionado ao dia " + dia + " e hora " + hora);

                System.out.println("Deseja continuar adicionando ou consultando tarefas? s(SIM) / n(NÃO)");

                String continuar = scan.next();
                if(continuar.equals("s")){
                    System.out.println("Voltando para o menu inicial");
                }else if(continuar.equals("n")){
                    turnOnOff = false;
                    System.out.println("Programa encerrado.");
                }
            }


        }




    }
}
