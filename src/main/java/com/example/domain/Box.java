package com.example.domain;

public class Box<T> {
	private T t;
    public void set(T t) { 
    	this.t = t; 
    }
    public T get() { 
    	return t; 
    }
}
