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
public class Aluno {
    
   private String RA;
   private String nome;
   private String curso;
   private String endereço;
   private String telefone;
   private String sexo;
   
   Aluno (/*double RA, String nome, String curso, String endereço, String telefone, String sexo*/){
       
       this.RA=RA;
       this.curso=curso;
       this.endereço=endereço;
       this.nome=nome;
       this.sexo=sexo;
       this.telefone=telefone;
       
   }

    /**
     * @return the RA
     */
    public String getRA() {
        return RA;
    }

    /**
     * @param RA the RA to set
     */
    public void setRA(String RA) {
        this.RA = RA;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the endereço
     */
    public String getEndereço() {
        return endereço;
    }

    /**
     * @param endereço the endereço to set
     */
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
   
   
  
    
    
}
