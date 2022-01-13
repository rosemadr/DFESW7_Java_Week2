package coinsRefactor;

//Given a cost and an amount, work out the change given in specific coinage./

public class Money {

	private int value;

	private int quantity;

	private String name;

	public Money(int value, int quantity, String name) {
		super();
		this.value = value;
		this.quantity = quantity;
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Money type: " + name + ", value " + value + "p, quantity: " + quantity;
	}

}
