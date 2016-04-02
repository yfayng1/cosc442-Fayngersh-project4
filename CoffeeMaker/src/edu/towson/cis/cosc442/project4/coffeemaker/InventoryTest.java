package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import junit.framework.TestCase;

import static org.junit.Assert.*;

public class InventoryTest extends TestCase {
	private Inventory inv;
	
	public void setUp() {
		inv = new Inventory();
	}
	
	//Setting chocolate to 0 with a negative input
	public void testSetChocolate1() {
		int chocolate = -1;
		inv.setChocolate(chocolate);
		assertEquals(inv.getChocolate(), 0);
	}

	//Setting coffee to 0 with a negative input
	public void testSetCoffee1() {
		int coffee = -1;
		inv.setCoffee(coffee);
		assertEquals(inv.getCoffee(), 0);
	}
	
	//Setting milk to 0 with a negative input
	public void testSetMilk1() {
		int milk = -1;
		inv.setMilk(milk);
		assertEquals(inv.getMilk(), 0);
	}
	
	//Setting sugar to 0 with a negative input
	public void testSetSugar1() {
		int sugar = -1;
		inv.setSugar(sugar);
		assertEquals(inv.getSugar(), 0);
	}
}
