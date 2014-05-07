package com.siliconnile.library.ws.service.api;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.siliconnile.library.domain.Reader;
@Path("/")
public interface ReaderWsApi {
	@Path(" /AddOrEditeReader")
	@GET
	public Reader AddOrEditeReader( @QueryParam(value = "name") String name,  @QueryParam(value = "registrationDate")Date registrationDate) throws Exception;

	public Reader DeletReaderByID(@QueryParam(value="id") long id);

}
