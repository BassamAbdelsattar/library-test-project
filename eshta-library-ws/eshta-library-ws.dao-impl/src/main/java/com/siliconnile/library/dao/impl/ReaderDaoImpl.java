package com.siliconnile.library.dao.impl;

import com.pearlox.framework.dao.impl.BasicJpaDao;
import com.siliconnile.library.dao.ReaderDao;
import com.siliconnile.library.domain.Reader;

public class ReaderDaoImpl extends BasicJpaDao<Reader> implements ReaderDao {
	public ReaderDaoImpl() {
		super(Reader.class);

	}

}
