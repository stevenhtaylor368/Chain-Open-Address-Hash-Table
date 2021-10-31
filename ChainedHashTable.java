import java.util.LinkedList;

/**
 * @author Steven Taylor
 * @version: 9/26/2020
 * @category CSCI 333 Homework5 HashTable
 * @description: Chained Hash Table implementation. Linked List array of Integer
 *               is used as primary instance variable. constructor takes value
 *               of n total input expected, the array is set to size of m which
 *               is 2 to the power of x until which the value is greater than n.
 *               insert method takes the value to be inserted which is passed to
 *               the hash method for positioning. Search returns output based
 *               upon if key is found if so it will return which list the value
 *               is being stored in and at which corresponding index within the
 *               linked list.
 * 
 */
public class ChainedHashTable {
	private LinkedList<Integer>[] table;

	public ChainedHashTable(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("Table size must be greater than zero!");
		}
		// iterate until 2 pow x is greater than n.
		double j = 2;
		int x = 1;
		while (j <= n) {
			j = Math.pow(2, x);
			x++;

		}

		int m = (int) j;
		table = new LinkedList[m];
		for (int i = 0; i < table.length; i++) {
			table[i] = new LinkedList<Integer>();
		}
	}

//insert
	public void enter(Integer x) {
		int hash = hash(x.intValue());
		insert(hash, x);
	}

	public void insert(Integer T, Integer x) {
		table[T].add(x);
	}

//delete
	public void rmv(Integer x) {
		int hash = hash(x);
		delete(hash, x);
	}

	public void delete(Integer T, Integer x) {
		try {
			table[T].remove(x);
		} catch (IndexOutOfBoundsException e) {
			// System.out.println("element not deleted");
		}
	}

//search

	public int search(int key) {

		if (table[hash(key)].indexOf(key) >= 0) {
			// System.out.println("element found in list: "+ hash(key) +" at index "
			// +table[hash(key)].indexOf(key));
			return hash(key);
		}

		return -1;

	}

//printTable/
	public void printTable() {
		for (int i = 0; i < table.length; i++) {

			System.out.println("List:" + i + " " + table[i].toString());

		}
	}

//hash
	private int hash(int key) {
		int m = table.length;
		double res2 = m * (key * 0.6180339887 % 1);
		int result = (int) res2;
		return result;
	}
}
