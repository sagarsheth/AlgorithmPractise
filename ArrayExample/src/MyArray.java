public class MyArray {

	int[] array;
	int size = 0;

	public MyArray(int i) {
		array = new int[i];
	}

	public boolean add(int i) {
		if (size == array.length) {
			return false;
		}
		array[size] = i;
		size++;
		return true;
	}

	public int getAtIndex(int index) {
		if (index >= array.length) {
			return -1;
		}
		return array[index];
	}

	public boolean deleteAtIndex(int index) {
		if (index > array.length) {
			return false;
		}

		this.size = index;
		while (add(getAtIndex(this.size + 1)) == true)
			;

		// for (int i = index; i < array.length; i++) {
		// System.out.println("array[i]: " + array[i]);
		// System.out.println("getAtIndex(i + 1): " + getAtIndex(i + 1));
		// array[i] = getAtIndex(i + 1);
		// }

		index--;

		return true;
	}

	public boolean printArray(int[] values) {
		int[] newArray = values;
		if (newArray == null) {
			newArray = array;
		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.print(" " + newArray[i] + ", ");
		}
		System.out.println("");
		return true;
	}

	public int[] reverseArray() {
		int[] reverseArray = new int[array.length];
		for (int i = array.length; i > 0; i--) {
			reverseArray[array.length - i] = array[i - 1];
		}
		return reverseArray;

	}

	public int[] getObjectArray() {
		return array;
	}

	// O(2n)
	public int[] rotateArray(int times) {
		int[] temp = new int[times];
		for (int i = 0; i < array.length; i++) {
			if (i < times) {
				temp[i] = array[i];
				System.out.println("Temp value :" + temp[i]);
			} else {
				array[i - times] = array[i];
				System.out.println("array value :" + array[i - times]);
			}
		}

		for (int i = 0; i < temp.length; i++) {
			array[array.length - times + i] = temp[i];
			System.out.println("+temp value :" + temp[i]);
		}

		return array;
	}

	// O(n)
	public int[] rotateArray1(int times) {
		int[] tempArray = new int[array.length];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (i < (array.length - times)) {
				index++;
				tempArray[i] = array[i + times];
			} else {
				tempArray[i] = array[array.length - times - index];
				index--;
			}
		}

		printArray(tempArray);
		return array;
	}
}