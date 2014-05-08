package com.siliconnile.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siliconnile.library.dao.ReaderDao;
import com.siliconnile.library.domain.Reader;
import com.siliconnile.library.service.api.ReaderServiceApi;

@Service
public class ReaderServiceImpl implements ReaderServiceApi {
	@Autowired
	ReaderDao readerDao;

	@Override
	public Reader addOrEditReader(Reader reader){

		
		try {
			return readerDao.saveOrUpdate(reader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deletReader(Reader reader) throws Exception {

		readerDao.delete(reader);

	}

	@Override
	public Reader findReaderByUsingId(long id) throws Exception {
		return readerDao.findById(id);

	}

}
