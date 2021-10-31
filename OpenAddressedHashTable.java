import java.util.Arrays;

/**
 * @author Steven Taylor
 * @version: 9/26/2020
 * @category CSCI 333 Homework5HashTable
 * @description: Open Address Hash Table implementation, using linear probe
 *               method. Array of Integer is used as primary instance variable.
 *               constructor takes value of n total input expected, the array is
 *               set to size of m which is 2 to the power of x until which the
 *               value is greater than n. insert method takes the value to be
 *               inserted loops through array until empty is found. Delete
 *               method alters the value of table element to indicate deleted
 *               value not null. Hash Auxiliary implements linear probing
 *               method, taking the key value and the position in the array to
 *               return hash method of where to store/find/delete elements.
 *               Insertion method after deletion has worked given handle of this
 *               practice in that if a element is deleted and the hashed element
 *               will have the same pos the element will be overridden with the
 *               one passed after deletion. Search returns based upon if element
 *               is found, if so returns index of desired element.
 * 
 */

public class OpenAddressedHashTable {
	private Integer[] table;
	private static Integer deleted = Integer.MIN_VALUE;

	public OpenAddressedHashTable(int n) {
		double j = 2;
		int x = 1;
		while (j <= n) {
			j = Math.pow(2, x);
			x++;

		}

		int m = (int) j;
		table = new Integer[m];

	}

	public int delete(Integer x) {
		Integer k = x.intValue();
		for (int i = 0; i <= table.length - 1; i++) {
			int j = hashAux(k, i);
			if (table[j].intValue() == k) {
				table[j] = deleted;
				return j;

			}

		}
		return -1;

	}

	public Integer insert(Integer x) {
		try {
			Integer k = x.intValue();
			for (int i = 0; i <= table.length - 1; i++) {
				int j = hashAux(k, i);
				if (table[j] == null || table[j] == deleted) {
					table[j] = x;
					return j;

				}
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("hash table overflow");
		}
		return null;

	}

	public Integer search(int k) {
		for (int i = 0; i <= table.length - 1; i++) {
			int j = hashAux(k, i);
			if (table[j] == null) {
				return null;
			}
			if (table[j].intValue() == k) {
				return j;
			}
		}

		return null;
	}

	public void printTable() {
		System.out.println(Arrays.toString(table));
	}

	private int hashAux(int key, int i) {
		int res = (hash(key) + i) % table.length;
		return res;
	}

	private int hash(int key) {
		int m = table.length;
		double res2 = m * (key * 0.6180339887 % 1);
		int result = (int) res2;
		return result;
	}

}
