package com.siliconnile.library.dao;

import com.pearlox.framework.dao.BasicDao;
import com.siliconnile.library.domain.Reader;

public interface ReaderDao  extends BasicDao<Reader> {
	Reader findByName(String name) throws Exception;
	
	

}
