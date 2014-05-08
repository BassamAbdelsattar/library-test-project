package com.siliconnile.library.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pearlox.framework.dao.impl.BasicJpaDao;
import com.siliconnile.library.dao.ReaderDao;
import com.siliconnile.library.domain.Reader;

@Repository
public class ReaderDaoImpl extends BasicJpaDao<Reader> implements ReaderDao {
	public ReaderDaoImpl() {
		super(Reader.class);

	}

	@Override
	@Transactional(readOnly = true)
	public Reader findByName(String name) throws Exception {

		return this.entityManager.find(this.type, name);
	}
}
