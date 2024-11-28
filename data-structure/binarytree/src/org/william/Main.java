package org.william;

class Node {
	int value;
	Node left;
	Node right;
	
	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

class Tree {
	Node root;
	
	public Tree() {
		this.root = null;
	}
	
	public void insert(int value) {
		Node node = new Node(value);

		if (this.root == null) {
			this.root = node;
		} else {
			Node current = root;
			Node previous;
			
			while (true) {
				previous = current;
				if (value <= current.value) {
					current = current.left;
					if (current == null) {
						previous.left = node;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						previous.right = node;
						return;
					}
				}
			}
		}
	}
	
	public boolean find(int value) {
		boolean result = false;
		if (this.root == null) return false;
		Node current = root;
		
		while (true) {
			if (current.value == value) {
				result = true;
				break;
			}
			else if (value <= current.value) current = current.left;
			else current = current.right;
			if (current == null) {
				return false;
			}
		}
		
		return result;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(8);
		tree.insert(9);
		
		System.out.println(tree.find(9));
	}
}