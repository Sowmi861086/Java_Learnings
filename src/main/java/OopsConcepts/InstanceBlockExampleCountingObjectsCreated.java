package OopsConcepts;

public class InstanceBlockExampleCountingObjectsCreated {
	static int count = 0;
	{
		count++;
	}

	public InstanceBlockExampleCountingObjectsCreated() {

	}

	public InstanceBlockExampleCountingObjectsCreated(int i) {
		this(10,23);
		System.out.println(i);

	}

	public InstanceBlockExampleCountingObjectsCreated(int i, int j) {
		System.out.println(i +" "+j);
	}

	public static void main(String[] args) {

		InstanceBlockExampleCountingObjectsCreated i = new InstanceBlockExampleCountingObjectsCreated();
		InstanceBlockExampleCountingObjectsCreated i1 = new InstanceBlockExampleCountingObjectsCreated(10);
		InstanceBlockExampleCountingObjectsCreated i2 = new InstanceBlockExampleCountingObjectsCreated(10,20);
		System.out.println(count);
	}

}
