package Projetos.Controll;
// Generated 22/01/2016 10:59:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Funcao generated by hbm2java
 */
public class Funcao  implements java.io.Serializable {


     private int codfunc;
     private String nome;
     private Set participanteativs = new HashSet(0);

    public Funcao() {
    }

	
    public Funcao(int codfunc, String nome) {
        this.codfunc = codfunc;
        this.nome = nome;
    }
    public Funcao(int codfunc, String nome, Set participanteativs) {
       this.codfunc = codfunc;
       this.nome = nome;
       this.participanteativs = participanteativs;
    }
   
    public int getCodfunc() {
        return this.codfunc;
    }
    
    public void setCodfunc(int codfunc) {
        this.codfunc = codfunc;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getParticipanteativs() {
        return this.participanteativs;
    }
    
    public void setParticipanteativs(Set participanteativs) {
        this.participanteativs = participanteativs;
    }




}


