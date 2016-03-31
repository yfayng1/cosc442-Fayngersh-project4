package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import junit.framework.TestCase;
import static org.junit.Assert.*;

import org.junit.Test;

public class RecipeTest extends TestCase{
	private Recipe r;

	public void setUp() {
		r = new Recipe();
	}
	
	//Setting chocolate to 0 with a negative input
	public void testSetAmtChocolate1() {
		int chocolate = -1;
		r.setAmtChocolate(chocolate);
	}
	
	//Setting coffee to 0 with a negative input
	public void testSetAmtCoffee1() {
		int coffee = -1;
		r.setAmtCoffee(coffee);
	}
	
	//Setting milk to 0 with a negative input
	public void testSetAmtMilk1() {
		int milk = -1;
		r.setAmtMilk(milk);
	}
	
	//Setting sugar to 0 with a negative input
	public void testSetAmtSugar1() {
		int sugar = -1;
		r.setAmtSugar(sugar);
	}
	
	//Setting price to 0 with a negative input
	public void testPrice() {
		int price = -1;
		r.setPrice(price);
	}
}
