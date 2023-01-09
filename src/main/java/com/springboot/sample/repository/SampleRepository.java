package com.springboot.sample.repository;

public interface SampleRepository<T>{
	
	public void save(T t);
	
	public T findById(Integer id);
	
}
