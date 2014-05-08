package com.siliconnile.library.ws.service.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.siliconnile.library.domain.Reader;

@Path("/")
public interface ReaderWsApi {

	@Path("/AddOrEditeReader")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Reader AddOrEditeReader(@QueryParam("name") String reader_name,
			@QueryParam("id") long id) throws Exception;

	@DELETE
	@Path("/DeletReaderByID")
	public void deletReaderByID(@QueryParam("id") long id) throws Exception;

	@Path("/updateReader")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void updateReaderById(@FormParam("id")long id,@FormParam("name") String name) throws Exception;

}
