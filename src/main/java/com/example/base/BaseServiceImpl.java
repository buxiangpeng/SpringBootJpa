package com.example.base;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseServiceImpl<T extends BaseModel,K> implements BaseService<T>{

	@Autowired
	public K baseDao;
	
	

}
