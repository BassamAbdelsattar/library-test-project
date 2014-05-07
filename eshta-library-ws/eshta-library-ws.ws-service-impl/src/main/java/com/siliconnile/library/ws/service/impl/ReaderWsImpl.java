package com.siliconnile.library.ws.service.impl;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;

import com.siliconnile.library.domain.Reader;
import com.siliconnile.library.service.api.ReaderServiceApi;
import com.siliconnile.library.ws.service.api.ReaderWsApi;

public class ReaderWsImpl implements ReaderWsApi {
@Autowired
ReaderServiceApi readerService;

	@Override
	public Reader AddOrEditeReader(String name, Date registrationDate) throws Exception {
		Reader reader =new Reader();
		reader.setReaderName(name);
		reader.setRegistrationDate(registrationDate);
		readerService.addOrEditReader(reader);
		return reader;
	}

	@Override
	public Reader DeletReaderByID(long id) {
		Reader reader =new Reader();
		reader.setId();
		return 
	}

}
