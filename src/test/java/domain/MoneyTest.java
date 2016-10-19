package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication(){
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}
	
	@Test
	public void testFrancMultiplication(){
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}
	
	@Test
	public void testEquality(){
		assertEquals(Money.dollar(5), Money.dollar(5));
		assertNotEquals(Money.dollar(5), Money.dollar(10));
		assertEquals(Money.franc(5), Money.franc(5));
		assertNotEquals(Money.franc(5), Money.franc(10));
		assertNotEquals(Money.franc(5), Money.dollar(5));
	}
	
	@Test
	public void testCurrency(){
		assertEquals("USD" , Money.dollar(1).currency());
		assertEquals("CHF" , Money.franc(1).currency());
	}
	
	@Test
	public void testPlusReturnSum(){
		Money five = Money.dollar(5);
		Money ten = Money.dollar(10);
		Expression result = five.plus(ten);
		Sum sum = (Sum)result;
		assertEquals(five, sum.augend);
		assertEquals(ten, sum.addend);
		
	}
	
	@Test
	public void testSimpleAddition(){
		Money five = Money.dollar(5);
		
		Expression sum = five.plus(five);
		
		Bank bank = new Bank();
		
		Money result = bank.reduce(sum, "USD");
		
		assertEquals(result,  Money.dollar(10));
	}

}
