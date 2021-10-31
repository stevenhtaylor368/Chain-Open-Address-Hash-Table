
public class HashDriver {
	public static void main(String[] args) {
		//
		ChainedHashTable cht = new ChainedHashTable(20);
		OpenAddressedHashTable oaht = new OpenAddressedHashTable(20);
		System.out.println("Chained Hash Table using LinkedList array for pos and Linked Lists for table storage");
		cht.enter(3);
		cht.enter(20);
		cht.enter(5);
		cht.enter(7);
		cht.enter(15);
		cht.enter(29);
		cht.enter(54);
		cht.enter(60);
		cht.enter(39);
		cht.enter(87);
		cht.enter(72);
		cht.enter(33);
		cht.enter(30);
		cht.enter(8);
		cht.enter(10);
		cht.enter(99);
		cht.enter(77);
		cht.enter(66);
		cht.enter(11);
		cht.enter(22);
		cht.printTable();
		System.out.println("Removing 99, 5, 3, 66, 29 from Chained Hash Table");
		cht.rmv(99);
		cht.rmv(5);
		cht.rmv(3);
		cht.rmv(66);
		cht.rmv(29);
		// 5 in list
		cht.printTable();
		System.out.println("5 good searches");
		System.out.println(cht.search(22));
		System.out.println(cht.search(11));
		System.out.println(cht.search(33));
		System.out.println(cht.search(54));
		System.out.println(cht.search(87));
		// 5 not in list
		System.out.println("5 bad searches");
		System.out.println(cht.search(99));
		System.out.println(cht.search(5));
		System.out.println(cht.search(66));
		System.out.println(cht.search(3));
		System.out.println(cht.search(29));
		System.out.println("Open Address Hash Table using array for position and storage");
		oaht.insert(45);
		oaht.insert(90);
		oaht.insert(30);
		oaht.insert(88);
		oaht.insert(15);
		oaht.insert(44);
		oaht.insert(12);
		oaht.insert(24);
		oaht.insert(33);
		oaht.insert(66);
		oaht.insert(77);
		oaht.insert(6);
		oaht.insert(99);
		oaht.insert(7);
		oaht.insert(45);
		oaht.insert(63);
		oaht.insert(30);
		oaht.insert(49);
		oaht.insert(77);
		oaht.insert(1);
		oaht.printTable();

		oaht.delete(45);
		oaht.delete(77);
		oaht.delete(6);
		oaht.delete(88);
		oaht.delete(44);
		oaht.printTable();
		// search in list
		System.out.println("5 good searches");
		System.out.println(oaht.search(30));
		System.out.println(oaht.search(63));
		System.out.println(oaht.search(66));
		System.out.println(oaht.search(33));
		System.out.println(oaht.search(77));
		// search not in list
		System.out.println("5 bad searches");
		System.out.println(oaht.search(0));
		System.out.println(oaht.search(92));
		System.out.println(oaht.search(6));
		System.out.println(oaht.search(88));
		System.out.println(oaht.search(44));
		System.out.println("Extra credit attempt");
		ChainUAttempt extra = new ChainUAttempt(20, 37);
		extra.enter(3);
		extra.enter(20);
		extra.enter(5);
		extra.enter(7);
		extra.enter(15);
		extra.enter(29);
		extra.enter(54);
		extra.enter(912939);
		extra.enter(39);
		extra.enter(87);
		extra.enter(72);
		extra.enter(33);
		extra.enter(30);
		extra.enter(8);
		extra.enter(10);
		extra.enter(99);
		extra.enter(77);
		extra.enter(66);
		extra.enter(11);
		extra.enter(22);
		extra.printTable();
		System.out.println("Removing 99, 5, 3, 66, 29 from Chained Hash Table");
		extra.rmv(99);
		extra.rmv(5);
		extra.rmv(3);
		extra.rmv(66);
		extra.rmv(29);
		// 5 in list
		extra.printTable();
		System.out.println("5 good searches");

		System.out.println(extra.search(22));
		System.out.println(extra.search(11));
		System.out.println(extra.search(33));
		System.out.println(extra.search(54));
		System.out.println(extra.search(87));
		// 5 bad searches
		System.out.println("5 bad searches");
		System.out.println(extra.search(99));
		System.out.println(extra.search(5));
		System.out.println(extra.search(66));
		System.out.println(extra.search(3));
		System.out.println(extra.search(29));

	}

}
