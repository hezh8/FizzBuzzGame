package com.xxx.demo;

public class Teacher {
    private int currentNumber = 0;

    public void prepare() {
        this.currentNumber = 0;
    }

    public int getNextNumber() {
    	this.currentNumber++;
        return this.currentNumber;
    }

	public int getCurrentNumber() {
		return currentNumber;
	}

	public void setCurrentNumber(int currentNumber) {
		this.currentNumber = currentNumber;
	}
    
}