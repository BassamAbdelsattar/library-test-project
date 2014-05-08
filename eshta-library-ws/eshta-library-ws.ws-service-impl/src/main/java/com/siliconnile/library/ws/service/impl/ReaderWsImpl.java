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
	public Reader AddOrEditeReader(String name, long id) throws Exception {

		Reader reader = new Reader();
		reader.setId(id);
		reader.setReaderName(name);
		reader.setRegistrationDate(new Date());

		return readerService.addOrEditReader(reader);

	}

	@Override
	public void deletReaderByID(long id) throws Exception {
		Reader reader = new Reader();
		reader = readerService.findReaderByUsingId(id);
		System.out.println(reader.toString());
		readerService.deletReader(reader);

	}

	@Override
	public void updateReaderById(long id, String name) throws Exception {
		//Reader reader = new Reader();
		Reader reader = readerService.findReaderByUsingId(id);
		if (reader!= null) {
			reader.setRegistrationDate(new Date());
			reader.setReaderName(name);
			readerService.addOrEditReader(reader);
			
		}

	}

}
