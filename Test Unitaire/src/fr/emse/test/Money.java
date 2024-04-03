package fr.emse.test;
import java.util.Objects;

public class Money {

	private int fAmount;
	private String fCurrency;
	public Money(int amount, String currency) {
	fAmount = amount;
	fCurrency = currency;
	}
	public int amount() {
	return fAmount;
	}
	public String currency() {
	return fCurrency;
	}
	public Money add(Money m) {
	return new Money(amount() + m.amount(), currency());
	}
	 @Override
	    public boolean equals(Object money) {
	        if (this == money) {
	            return true;
	        }
	        if (money == null || getClass() != money.getClass()) {
	            return false;
	        }
	        Money money1 = (Money) money;
	        return fAmount == money1.fAmount && Objects.equals(fCurrency, money1.fCurrency);
	    }
	}
