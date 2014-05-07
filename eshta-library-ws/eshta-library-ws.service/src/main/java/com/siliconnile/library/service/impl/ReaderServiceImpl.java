package com.siliconnile.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.siliconnile.library.dao.ReaderDao;
import com.siliconnile.library.domain.Reader;
import com.siliconnile.library.service.api.ReaderServiceApi;

public class ReaderServiceImpl implements ReaderServiceApi {
	@Autowired
	ReaderDao readerDao;

	@Override
	public Reader addOrEditReader(Reader reader) throws Exception {
		

		return readerDao.saveOrUpdate(reader);
	}

	@Override
	public Reader deletReader(Reader reader) throws Exception {

		readerDao.delete(reader);
		return reader;

	}

}
