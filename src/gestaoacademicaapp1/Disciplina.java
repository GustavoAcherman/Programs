package gestaoacademicaapp1;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
   private String codigo;
   private  int creditos;
   private List<Matricula> matriculas;

   
    public Disciplina(String codigo, int creditos) {
        this.codigo = codigo;
        this.creditos = creditos;
    }

   public Disciplina(){
       
   }
   public List<Estudante> getEstudantesMatriculados(Matricula matricula){
      return null;
       
   }
   

    @Override
    public String toString() {
        return "Disciplina{" + "codigo=" + codigo + ", creditos=" + creditos + ", matriculas=" + matriculas + '}';
    }
   
      public void addMatricula(Matricula matricula){
        matriculas.add(matricula);
        
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
   
   
    
 
}
