package br.com.alura.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDAO;
import br.com.alura.loja.dao.ProdutoDAO;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProdutos {

   public static void main(String[] args) {
        Categoria celulares = new Categoria("CELULARES");
	
	    EntityManager em = JPAUtil.getEntityManager();

	    em.getTransaction().begin();
	    
	    em.persist(celulares);
	    celulares.setNome("XPTO");
	     
	    em.flush();
	    em.clear();
	    
	    celulares = em.merge(celulares);
	    celulares.setNome("1234");
	    em.flush();
	    em.clear();
	    em.remove(celulares);
	    em.flush();
     }


}
