package com.test;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 * @author Bajrangi Gupta
 * @Description
 */
public class YakShop {
    private Set<Yak> yaks = new LinkedHashSet<>();
    public void todaysStatus(int onDay){
        double milkQty = 0;
        int woolSkins = yaks.size();
        for (Yak yak : yaks) 
        {
            for (int days = 0; days < onDay; days++) 
            {
             milkQty += yak.getMilkInLit(days);             
            }
	        woolSkins= woolSkins + (int)((onDay-1)/(8 + yak.getCurrentAgeInDays(onDay) * 0.01));        
	        System.out.println(yak.getName() + " - " + yak.getCurrentAgeInDays(onDay)/100);
        }
        System.out.println("Total Milk stock: " + milkQty);
        System.out.println("Total Skins: " + woolSkins);
    }   
    
  /**
   * 	
   * @param args
   * @Description unit test case
   */
  public static void main(String args[])
  {
	  YakShop YakShop=new YakShop(); 
	  YakShop.yaks.add(new Yak("Betty-1",4));
	  YakShop.yaks.add(new Yak("Betty-2",8));
	  YakShop.yaks.add(new Yak("Betty-3",9.5));
	  YakShop.todaysStatus(14);
  } 
}

