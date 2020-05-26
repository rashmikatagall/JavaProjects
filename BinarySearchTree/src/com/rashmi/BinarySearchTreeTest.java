package com.rashmi;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

	@Test
	void testBinarySearchTreeBasic() {
	BinarySearchTree bst = new BinarySearchTree(10);
	bst.add(5);
	bst.add(15);
	bst.add(13);
	bst.add(30);
	
	int[] vals = {5,10,13,15,30};
	List<Integer> list = bst.inOrdertraverse();
	//list.stream().forEach(System.out::println);
	assertArrayEquals(vals, bst.inOrdertraverse().stream().mapToInt(Integer::intValue).toArray());
	
	}
	
	@Test
	void testBinarySearchTree() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(30);
		bst.add(22);
		bst.add(24);
		int[] vals = {22,24,30};
		assertArrayEquals(vals,bst.inOrdertraverse().stream().mapToInt(Integer::intValue).toArray());
	}

}
