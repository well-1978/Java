/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

/**
 *
 * @author FATEC
 */
public class SistemaAcademico {
private Aluno[] alunos;
private Professor[] professores;
SistemaAcademico(){
    alunos = new Aluno[100];
    professores = new Professor[100];
}

/**
 * Cadastrar aluno
 * @param aluno
 * @return 
 */
public boolean CadastrarAluno(Aluno aluno){
    
    for (int i=0; i<alunos.length; i++)
        
        if (alunos[i]== null){
            alunos[i]=aluno;
            return true;
        }
        return false;

}

public boolean CadastrarProfessor(Professor professor){
    
    for (int i=0; i<professores.length; i++)
        
        if (professores[i]== null){
            professores[i]=professor;
            return true;
        }
        return false;

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SistemaAcademico sa = new SistemaAcademico();
        Aluno aluno = new Aluno ();
        aluno.setRA("1234567890");
        sa.CadastrarAluno(aluno);
        //System.out.println(sa.alunos[0].getRA());
        Aluno aluno2 = new Aluno();
        sa.CadastrarAluno(aluno2);
        Aluno aluno3 = new Aluno();
        sa.CadastrarAluno(aluno3);
        Aluno aluno4 = new Aluno();
        sa.CadastrarAluno(aluno4);
        Aluno aluno5 = new Aluno();
        sa.CadastrarAluno(aluno5);
        Aluno aluno6 = new Aluno();
        sa.CadastrarAluno(aluno6);
        Aluno aluno7 = new Aluno();
        sa.CadastrarAluno(aluno7);
        Aluno aluno8 = new Aluno();
        sa.CadastrarAluno(aluno8);
        Aluno aluno9 = new Aluno();
        sa.CadastrarAluno(aluno9);
      
        
        
        
        for (int i=0; i<10; i++){
        System.out.println(sa.alunos[10]);
        }
        
    }
    
}
