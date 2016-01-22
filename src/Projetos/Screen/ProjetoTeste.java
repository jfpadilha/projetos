package Projetos.Screen;

import DAO.DAOCidade;
import Projetos.Controll.Cidade;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author joao
 */
public class ProjetoTeste
{

    public static void main( String[] args )
    {
        
        Cidade cid = new Cidade();
//        cid.setCodcid(104);
//        cid.setNome("Santiago da Patrulha");
//        cid.setUf("RS");
        
        cid.listCidade();
        
        System.exit(0);
       
    }

}
