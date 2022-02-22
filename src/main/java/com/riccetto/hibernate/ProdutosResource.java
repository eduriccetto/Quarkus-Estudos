package com.riccetto.hibernate;


import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

// ---------------------------------------  Endpoint
@Path("/produtos")
public class ProdutosResource {

    @Inject EntityManager entityManager;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
                     // O Quarkus sujere que não utilizemos o "privite" em atributos injetados
    public List<Produto> getProdutos() {
        return entityManager.createQuery("select p from Produto p", Produto.class).getResultList();
    }

}
