package gestaoacademicaapp1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestaoAcademicaApp1 {

    public static void main(String[] args) throws IOException {

       
        int controle = 1;
        int opcao;
        int escolha;
        String option = null;
        String optionn=null;
 
        Scanner entrada = new Scanner(System.in);

       
        String nome = null;
        String codigo = null;
        String creditos = null;
        int i=0;
        List<Estudante> list = new ArrayList<>();

        Universidade universidade = new Universidade();
        Disciplina disciplina = new Disciplina();
        Estudante estudante = new Estudante();

        //MENU PRINCIPAL
        while (controle != 2) {
            System.out.println("SISTEMA DE GESTÃO ACADÊMICA \n");
            System.out.println("O QUE VOCÊ DESEJA FAZER? ESCOLHA AS OPÇÕES ABAIXO!");
            System.out.println("1:   Listar todos os estudantes");
            System.out.println("2: - Listar o codigo de todas as disciplinas");
            System.out.println("3: - Listar informações dos estudantes matriculados em uma determinada disciplina");
            System.out.println("4: - Listar todas as disciplinas de 1 estudante especifico");
            System.out.println("5: - Sair");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Os estudantes cadastrados no sistema são: ");
                   // universidade.carregarDadosArquivo1(option);
                    universidade.getEstudantes();
                    break;

                case 2:
                    System.out.println("Os codigos e creditos são");
                    universidade.getDisciplinas();
                    break;
                    
                case 3:
                    System.out.println("Os dados dos estudantes e as respectivas matriculas são: ");
                    estudante.getDisciplinasMatriculadas();
                    break;
                    
                default:
                    System.out.println("Opção inválida, digite novamente!");
                    break;
            }
        }
    }
}
