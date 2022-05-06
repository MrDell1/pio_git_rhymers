package edu.kis.vh.nursery.list;

/**
 * @author Marcin Leszczyński
 *
 */
public class IntLinkedList {
	public static final int DEFAULT_VALUE = -1;

	private class Node {

		private int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			this.value = i;
		}
	}

	private Node last;

	/**
	 * @param i value to be pushed
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	/**
	 * @return true if list is empty, false if not
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * @return always return false
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * @return last value of list or DEFAULT_VALUE if list is empty
	 */
	public int top() {
		if (isEmpty())
			return DEFAULT_VALUE;
		return last.value;
	}
	
	/**
	 * @return DEFAULT_VALUE if list is empty or last value of list
	 */
	public int pop() {
		if (isEmpty())
			return DEFAULT_VALUE;

		int ret = last.value;
		last = last.prev;

		return ret;
	}

}