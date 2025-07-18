package com.example.dto;

public abstract sealed class Parent permits Child,GrandChild {

	public abstract String getMessage();
}
