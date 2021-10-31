
import java.util.LinkedList;
import java.util.Random;

public class ChainUAttempt {
	private LinkedList<Integer>[] table;
	private int a;
	private int b;
	private int p;

	public ChainUAttempt(int n, int prime) {
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
		p = prime;
		Random rand = new Random();
		a = rand.nextInt(p - 1) + 1;
		b = rand.nextInt(p);
	}

	// insert
	public void enter(Integer x) {
		int hash = hash(x.intValue());
		insert(hash, x);
	}

	public void insert(Integer T, Integer x) {
		table[T].add(x);
	}

	// delete
	public void rmv(Integer x) {
		int hash = hash(x);
		delete(hash, x);
	}

	public void delete(Integer T, Integer x) {
			table[T].remove(x);

	}

	// search

	public int search(int key) {
		if (table[hash(key)].indexOf(key) >= 0) {
			// System.out.println("element found in list: "+ hash(key) +" at index "
			// +table[hash(key)].indexOf(key));
			return hash(key);
		}
		return -1;

	}

	// printTable/
	public void printTable() {
		for (int i = 0; i < table.length; i++) {

			System.out.println("List:" + i + " " + table[i].toString());

		}
	}

	// hash
	private int hash(int key) {
		int m = table.length;
		int h = (int) ((Math.abs(key * a + b) % p) % m);
		return h;
	}
}
