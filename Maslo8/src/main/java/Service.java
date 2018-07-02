import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Response;

@Path("/techniques")
public class Service {
    private static Map<Integer, Technique> technicsMap = new HashMap<>();

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public final Technique getTechnique(final @PathParam("id") Integer id) {
        return technicsMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createTechnique(final Technique technique) {
        technicsMap.put(technique.getId(), technique);
        return Response.status(200).entity("Good").build();
    }

    @POST
    public final Response replaceTechnique(final Technique technique) {
        technicsMap.replace(technique.getId(), technique);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteTechique(final @PathParam("id") Integer id) {
        technicsMap.remove(id);
        return Response.status(200).entity("Good").build();
    }
}