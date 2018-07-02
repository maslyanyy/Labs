package skitechniques.Rest.service;

import skitechniques.tecniques.Techniques;
import skitechniques.persistence.dao.TechniquesDao;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Path("/techniques")
@SessionScoped
public class Json implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private TechniquesDao dao;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Techniques getTechniques(@PathParam("id") Integer id) {
        return dao.findById(id);
    }

    @PUT
    public Response createGood(Techniques good) {
        dao.persist(good);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteGood(@PathParam("id") Integer id) {
        dao.remove(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateGood(Techniques good) {
        dao.persist(good);
        return Response.status(200).entity("Good").build();
    }

    @GET
    @Path("/size")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_XML})
    public String getSize() {
        return "Yes";
    }

}