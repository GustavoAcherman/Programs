/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaoacademicaapp1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Universidade {

    private String nome;
    private List<Estudante> estudantes;
    private List<Disciplina> disciplinas;

    public Universidade(String nome) {
        this.nome = nome;

    }
public Universidade(){
    
}

    public void carregarDadosArquivo1(String nomeArquivoEstudantes) throws FileNotFoundException, IOException {

        FileInputStream stream = new FileInputStream("C:\\estudantes-.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        while (linha != null) {

            String id = linha.substring(0, linha.indexOf('|'));
            String nome = linha.substring(linha.indexOf('|') + 1, linha.lastIndexOf('|'));
            String email = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
            System.out.println("O ID é: " + id);
            System.out.println("O NOME é: " + nome);
            System.out.println("O EMAIL é: " + email);
            linha = br.readLine();
        }

    }

    public void carregarDadosArquivo2(String nomeArquivoDisciplina) throws FileNotFoundException, IOException {

        FileInputStream streamn = new FileInputStream("C:\\disciplinas-.txt");
        InputStreamReader readerr = new InputStreamReader(streamn);
        BufferedReader bra = new BufferedReader(readerr);
        String linhas = bra.readLine();
        while (linhas != null) {
            String codigo = linhas.substring(0, linhas.indexOf('|'));
            //String creditos= linhas.substring(linhas.indexOf('|') + 1, linhas.lastIndexOf('|'));
            String creditos = linhas.substring(linhas.lastIndexOf('|') + 1, linhas.length());
            System.out.println("O CODIGO é: " + codigo);
            System.out.println("O CREDITOS são: " + creditos);
            linhas = bra.readLine();
        }

    }

    public void carregarDadosArquivo3(String nomeArquivoMatricula) throws FileNotFoundException, IOException {

        FileInputStream streamn = new FileInputStream("C:\\matriculas-.txt");
        InputStreamReader readerr = new InputStreamReader(streamn);
        BufferedReader bra = new BufferedReader(readerr);
        String linhas = bra.readLine();
        while (linhas != null) {
            String codigo = linhas.substring(0, linhas.indexOf('|'));
            //String codmat= linhas.substring(linhas.indexOf('|') + 1, linhas.lastIndexOf('|'));
            String codmat = linhas.substring(linhas.lastIndexOf('|') + 1, linhas.length());
            System.out.println("O CODIGO DO ESTUDANTE é: " + codigo);
            System.out.println("O CODIGO DA MATRICULA é: " + codmat);
            //System.out.println("O NOME é: "+nome);
            linhas = bra.readLine();
        }

    }

    public void getDisciplinas() {
        List<Disciplina> disc = new ArrayList<Disciplina>();
        Disciplina disciplina = new Disciplina ("ENEC1544",40);
        Disciplina disciplina2 = new Disciplina ("ENEC1426",40);
        Disciplina disciplina3 = new Disciplina ("ENEC1000",20);
        disc.add(disciplina);
        disc.add(disciplina2);
        disc.add(disciplina3);
        layout2(disc);

    }

    public void getEstudantes() {
        List<Estudante> est = new ArrayList<Estudante>();
        Estudante estudante = new Estudante(1, "Gustavo", "gus9312@mackenzista.com.br");
        Estudante estudante2 = new Estudante(2, "Nicolle", "nini@mackenzista.com.br");
        Estudante estudante3 = new Estudante(3, "James", "jaja@mackenzista.com.br");
        est.add(estudante);
        est.add(estudante2);
        est.add(estudante3);
        layout(est);
    }
    
    private static void layout2(List<Disciplina> disci) {
        Disciplina discis;
        File dir = new File("C:\\TutorialArquivos");
        //Cria um novo arquivo
        File arq = new File(dir, "User3.txt");

        try {
            arq.createNewFile();
            FileWriter fileWriter = new FileWriter(arq, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            //Utilizamos o método print() para escrever na
            // mesma linha e um ponto e vírgula no final.
            //O println forçará a troca de linha
            // para o próximo user.
            for (Disciplina disc :disci) {
                printWriter.print(disc.getCodigo() + ";");
                printWriter.print(disc.getCreditos() + ";");
                
               
            }
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            //Lista que irá guardar o resultado, ou seja,
            // cada linha do arquivo que corresponde a um User
            List<String> result = new ArrayList<String>();

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
                int amp=0;
               // if (linha != null &amp; &amp; !linha.isEmpty()) {
                    result.add(linha);
                
            }
            fileReader.close();
            bufferedReader.close();

            for (String s : result) {
                //Usamos o método split da classe String
                // para separar as partes entre os ponto e vírgulas.
                //Guardamos o resultado em um array
                String[] user = s.split(";");

                //Criamos um objeto User e setamos em seus atributos
                //as posições correspondentes do array
                Disciplina d = new Disciplina();
                d.setCodigo((user[0]));
                d.setCreditos(Integer.valueOf(user[1]));
                

                //exibe o conteúdo do objeto u
                System.out.println(d.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static void layout(List<Estudante> est) {
        Estudante estud;
       
        File dir = new File("C:\\TutorialArquivos");
        //Cria um novo arquivo
        File arq = new File(dir, "User2.txt");

        try {
            arq.createNewFile();
            FileWriter fileWriter = new FileWriter(arq, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            //Utilizamos o método print() para escrever na
            // mesma linha e um ponto e vírgula no final.
            //O println forçará a troca de linha
            // para o próximo user.
            for (Estudante est1 :est) {
                printWriter.print(est1.getId() + ";");
                printWriter.print(est1.getNome() + ";");
                printWriter.print(est1.getEmail() + ";");
                
            }
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            //Lista que irá guardar o resultado, ou seja,
            // cada linha do arquivo que corresponde a um User
            List<String> result = new ArrayList<String>();

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
                int amp=0;
               // if (linha != null &amp; &amp; !linha.isEmpty()) {
                    result.add(linha);
                
            }
            fileReader.close();
            bufferedReader.close();

            for (String s : result) {
                //Usamos o método split da classe String
                // para separar as partes entre os ponto e vírgulas.
                //Guardamos o resultado em um array
                String[] user = s.split(";");

                //Criamos um objeto User e setamos em seus atributos
                //as posições correspondentes do array
                Estudante u = new Estudante();
                u.setId(Integer.valueOf(user[0]));
                u.setNome(user[1]);
                u.setEmail(user[2]);
                

                //exibe o conteúdo do objeto u
                System.out.println(u.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

}
