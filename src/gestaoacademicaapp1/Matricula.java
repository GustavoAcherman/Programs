package gestaoacademicaapp1;



public class Matricula {
    
    private Estudante estudante;
    private Disciplina disciplina;

    public Matricula(Estudante estudante, Disciplina disciplina) {
        this.estudante = estudante;
        this.disciplina = disciplina;
    }

    public Matricula(){
        
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    

}
