package com.siliconnile.library.ws.service.api;

import javax.ws.rs.GET;
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
	public Reader AddOrEditeReader( @QueryParam("name") String reader_name) throws Exception ;
	
	
	@GET
	@Path("/DeletReaderByID")
	public void DeletReaderByID(@QueryParam("id") long id) throws Exception;

}
