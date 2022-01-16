package coinsRefactor;

public class ChangeCalc {

	public void calcChange(int payment, int cost) {

//		Money[] coins = { new Money(5000, 0, "£50 notes"), new Money(2000, 0, "£20 notes"),
//				new Money(1000, 0, "£10 notes"), new Money(500, 0, "£5 notes"), new Money(200, 0, "£2 coins"),
//				new Money(100, 0, "£1 coins"), new Money(50, 0, "50p coins"), new Money(20, 0, "20p coins"),
//				new Money(10, 0, "10p coins"), new Money(5, 0, "5p coins"), new Money(2, 0, "2p coins"),
//				new Money(1, 0, "1p coins") };
//
//		
		int remainder = payment - cost;

		while (remainder > 0) {
			for (Money i : coins) {
				if (coins.get(i) >= remainder)
					;

			}
		}

	}

}
