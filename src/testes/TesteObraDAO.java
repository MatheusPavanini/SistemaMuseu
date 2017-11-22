package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Acervo;
import com.fatec.museu.model.Obra;
import com.fatec.museu.util.FactoryObraDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteObraDAO {
    
    private Obra obra;
    private DAO dao;
    
    public TesteObraDAO() {
        FactoryObraDAO factory = new FactoryObraDAO();
        dao = factory.criarDao();
        obra = new Obra();
    }
    
    public void testeSalvar() {
        obra.setTitulo("Monalisa");
        obra.setAutor("Leonardo Da Vinci");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            obra.setDataDeObra(format.parse("15/03/1503"));
        } catch (ParseException ex) {
            Logger.getLogger(TesteObraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        obra.setAcervo(new Acervo());
        obra.getAcervo().setIdAcervo(5L);
        dao.salvar(obra);
    }
    
    public void testeListar() {
        
    }
    
    public void testeBuscar() {
        
    }
    
    public void testeRemover() {
        
    }
    
    public static void main(String[] args) {
        TesteObraDAO teste = new TesteObraDAO();
        teste.testeSalvar();
    }
    
}
