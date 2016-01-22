package Projetos.Controll;
// Generated 22/01/2016 10:59:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cidade generated by hbm2java
 */
public class Cidade  implements java.io.Serializable {


     private int codcid;
     private String nome;
     private String uf;
     private Set clientes = new HashSet(0);
     private Set pessoas = new HashSet(0);

    public Cidade() {
    }

	
    public Cidade(int codcid) {
        this.codcid = codcid;
    }
    public Cidade(int codcid, String nome, String uf, Set clientes, Set pessoas) {
       this.codcid = codcid;
       this.nome = nome;
       this.uf = uf;
       this.clientes = clientes;
       this.pessoas = pessoas;
    }
   
    public int getCodcid() {
        return this.codcid;
    }
    
    public void setCodcid(int codcid) {
        this.codcid = codcid;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUf() {
        return this.uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }
    public Set getPessoas() {
        return this.pessoas;
    }
    
    public void setPessoas(Set pessoas) {
        this.pessoas = pessoas;
    }




}

