package com.siliconnile.library.ws.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.siliconnile.library.domain.Reader;
import com.siliconnile.library.service.api.ReaderServiceApi;
import com.siliconnile.library.ws.service.api.ReaderWsApi;

public class ReaderWsImpl implements ReaderWsApi {
	@Autowired
	ReaderServiceApi readerService;

	@Override
	public Reader AddOrEditeReader(String name) throws Exception
			 {
		Reader reader = new Reader();
		

		reader.setReaderName(name);
		reader.setRegistrationDate(new Date());
		
			return readerService.addOrEditReader(reader);
		

	}

	@Override
	public void DeletReaderByID(long id) throws Exception {
		Reader reader = new Reader();
		reader = readerService.findReaderByUsingId(id);
		readerService.deletReader(reader);

	}

}
