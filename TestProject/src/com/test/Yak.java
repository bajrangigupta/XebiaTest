package com.test;

/**
 * 
 * @author Bajrangi Gupta
 * @Description
 */
public class Yak {
	
    private double initialAgeInYears;
    private String name;
    
    public Yak(String name, double intialAgeInYears){
        this.name = name;
        this.initialAgeInYears = intialAgeInYears;
    }
    public boolean isAlive(int onDay){
    	if(initialAgeInYears*100 + onDay <= 1000)
    	{
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    public double getMilkInLit(int onDay){
        // 50 - 0.03 * currentAgeInDays
    	return 50 - 0.03 * getCurrentAgeInDays(onDay);
    }
    public double getCurrentAgeInDays(int onDay)
    {
	    return initialAgeInYears*100+ onDay;
    }
	public double getInitialAgeInYears() {
		return initialAgeInYears;
	}
	public void setInitialAgeInYears(double initialAgeInYears) {
		this.initialAgeInYears = initialAgeInYears;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
