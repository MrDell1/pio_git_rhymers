package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int MAX_SIZE = 12;
	public static final int DEFAULT = -1;
	public static final int INITIAL = -1;
	private final int[] NUMBERS = new int[MAX_SIZE];

	public int total = INITIAL;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == DEFAULT;
	}

	public boolean isFull() {
		return total == MAX_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT;
		return NUMBERS[total--];
	}

}
