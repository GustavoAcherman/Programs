package gestaoacademicaapp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudante {

    private long id;
    private String nome;
    private String email;
    private List<Matricula> matriculas;
    private  Universidade universidade;

    public Estudante() {

    }

    public Estudante(long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;

    }
    


    public List<Disciplina> getDisciplinasMatriculadas() {

         return null;
    }

    @Override
    public String toString() {
        return "Estudante{" + "id=" + id + ", nome=" + nome + ", email=" + email + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

}
