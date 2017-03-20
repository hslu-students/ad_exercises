package ch.hslu.ad.sw04.ex03;

class Node {

	private Object value;
	private Node next;

	public Node(Object value) {
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String toString() {
		return value.toString();
	}
}
