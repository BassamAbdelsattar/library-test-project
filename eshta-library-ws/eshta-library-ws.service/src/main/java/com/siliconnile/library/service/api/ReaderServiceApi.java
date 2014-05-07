package com.siliconnile.library.service.api;

import com.siliconnile.library.domain.Reader;

public interface ReaderServiceApi {

	public Reader addOrEditReader(Reader reader) throws Exception;

	public Reader deletReader(Reader reader)throws Exception;

}
