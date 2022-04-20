package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int SIZE = 12;
	public static final int ERR_CODE = -1;
	private final int[] NUMBERS = new int[SIZE];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == ERR_CODE;
	}

	public boolean isFull() {
		return total == SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return ERR_CODE;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return ERR_CODE;
		return NUMBERS[total--];
	}

}
