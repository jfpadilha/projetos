package Projetos.Controll;
// Generated 22/01/2016 10:59:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * OcorrenciaId generated by hbm2java
 */
public class OcorrenciaId  implements java.io.Serializable {


     private String idproj;
     private int sequencia;
     private Date dataocor;
     private String horaocor;

    public OcorrenciaId() {
    }

    public OcorrenciaId(String idproj, int sequencia, Date dataocor, String horaocor) {
       this.idproj = idproj;
       this.sequencia = sequencia;
       this.dataocor = dataocor;
       this.horaocor = horaocor;
    }
   
    public String getIdproj() {
        return this.idproj;
    }
    
    public void setIdproj(String idproj) {
        this.idproj = idproj;
    }
    public int getSequencia() {
        return this.sequencia;
    }
    
    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }
    public Date getDataocor() {
        return this.dataocor;
    }
    
    public void setDataocor(Date dataocor) {
        this.dataocor = dataocor;
    }
    public String getHoraocor() {
        return this.horaocor;
    }
    
    public void setHoraocor(String horaocor) {
        this.horaocor = horaocor;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OcorrenciaId) ) return false;
		 OcorrenciaId castOther = ( OcorrenciaId ) other; 
         
		 return ( (this.getIdproj()==castOther.getIdproj()) || ( this.getIdproj()!=null && castOther.getIdproj()!=null && this.getIdproj().equals(castOther.getIdproj()) ) )
 && (this.getSequencia()==castOther.getSequencia())
 && ( (this.getDataocor()==castOther.getDataocor()) || ( this.getDataocor()!=null && castOther.getDataocor()!=null && this.getDataocor().equals(castOther.getDataocor()) ) )
 && ( (this.getHoraocor()==castOther.getHoraocor()) || ( this.getHoraocor()!=null && castOther.getHoraocor()!=null && this.getHoraocor().equals(castOther.getHoraocor()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdproj() == null ? 0 : this.getIdproj().hashCode() );
         result = 37 * result + this.getSequencia();
         result = 37 * result + ( getDataocor() == null ? 0 : this.getDataocor().hashCode() );
         result = 37 * result + ( getHoraocor() == null ? 0 : this.getHoraocor().hashCode() );
         return result;
   }   


}


