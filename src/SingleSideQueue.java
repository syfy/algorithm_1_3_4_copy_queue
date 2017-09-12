
public class SingleSideQueue {
	public static int SIZE = 50;


	int[] queueContents = new int[SIZE];
	int headIndex = -1;
	int tailIndex = -1;
	public int[] getQueueContents() {
		return queueContents;
	}
	public void setQueueContents(int[] queueContents) {
		this.queueContents = queueContents;
	}
	public int getHeadIndex() {
		return headIndex;
	}
	public void setHeadIndex(int headIndex) {
		this.headIndex = headIndex;
	}
	public int getTailIndex() {
		return tailIndex;
	}
	public void setTailIndex(int tailIndex) {
		this.tailIndex = tailIndex;
	}
	SingleSideQueue(int firstContent) {
		headIndex++;
		tailIndex++;
		queueContents[tailIndex] = firstContent;
	}
	SingleSideQueue() {
		headIndex = 0;
	}
	SingleSideQueue(SingleSideQueue source) {
		SingleSideQueue queueOne= new SingleSideQueue();
		SingleSideQueue queueTwo= new SingleSideQueue();
	
		while(!source.booleanIsEmpty()){
			int content;
			try {
			
				content = source.dequeue();
				queueOne.enqueue(content);
				queueTwo.enqueue(content);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		
		while(!queueTwo.booleanIsEmpty()){
			int content;
			try {
			
				content = queueTwo.dequeue();
				source.enqueue(content);
			
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		this.setHeadIndex(queueOne.getHeadIndex());
		this.setQueueContents(queueOne.getQueueContents());
		this.setTailIndex(queueOne.getTailIndex());
		source = queueTwo;

	}

	public void enqueue(int content) {
		tailIndex++;
		queueContents[tailIndex] = content;

	}

	public int peek() {
		int returnValue = 0;
		if (headIndex >= 0) {
			returnValue = queueContents[headIndex];
		}
		return returnValue;

	}
	
	public boolean booleanIsEmpty(){
		System.out.println("Head "+headIndex+" Tail "+tailIndex);
		if (headIndex-1 ==tailIndex) {
			return true;
		} else {
			return false;
		}
	}

	public int dequeue() throws IllegalAccessException {
		int returnValue = queueContents[headIndex];

		if (headIndex < SIZE) {
			headIndex++;
		} else {
			throw new IllegalAccessException();
		}
		return returnValue;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int x = headIndex; x <= tailIndex; x++) {
			sb.append(" " + queueContents[x]);
		}
		return sb.toString();

	}
}