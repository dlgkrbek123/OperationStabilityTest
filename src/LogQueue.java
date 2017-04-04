public class LogQueue {
	private Order[] queue;
	private static final int size = 20;
	private int numOfOrder;

	public LogQueue() {
		queue = new Order[size];
		numOfOrder = 0;
	}

	public int insert(Order order) {
		if (order == null)
			return -1;
		if (numOfOrder == size)
			return -2;

		queue[numOfOrder] = order;
		numOfOrder++;
		return numOfOrder;
	}

	public int getNumOfOrder() {
		return numOfOrder;
	}

	public Order getOrder(int i) {
		if (i < 0 || i >= numOfOrder)
			return null;
		else
			return queue[i];
	}
}
