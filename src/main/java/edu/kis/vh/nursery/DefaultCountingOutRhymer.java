package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int MAX_SIZE = 12;
	private static final int DEFAULT = -1;
	private static final int INITIAL = -1;
	private final int[] numbers = new int[getMaxSize()];

	private int total = getInitial();

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == getDefault();
	}

	public boolean isFull() {
		return total == getMaxSize() - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return getDefault();
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return getDefault();
		return numbers[total--];
	}

	public static int getMaxSize() {
		return MAX_SIZE;
	}

	public static int getDefault() {
		return DEFAULT;
	}

	public static int getInitial() {
		return INITIAL;
	}

}
