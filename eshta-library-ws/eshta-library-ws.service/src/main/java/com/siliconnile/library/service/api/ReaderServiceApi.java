package com.siliconnile.library.service.api;

import com.siliconnile.library.domain.Reader;

public interface ReaderServiceApi {

	public Reader addOrEditReader(Reader reader) throws Exception;

	public void deletReader(Reader reader) throws Exception;

	public Reader findReaderByUsingId(long id) throws Exception;

}
