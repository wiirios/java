package org.william;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Inventory<T> {
	private ArrayList<T> inventory;
	private Queue<T> itemsQueue;
	private int size;
	
	public Inventory() {
		this.inventory = new ArrayList<T>();
		this.itemsQueue = new LinkedList<T>();
	}
	
	public void addItem(T item) {
		this.inventory.add(item);
		this.itemsQueue.add(item);
		size++;
	}
	
	/**
	 * removes the specified item from the inventory. if the item exist in the inventory.
	 * it is removes, the FIFO Queue is cleared and the items from the inventory are re-added to the queue the method returns true if the item was successfully removed,
	 * false if the item was not found
	 * @param item to be removed from the inventory
	 * @return true if the item was removed successfully, false if the item was not found
	 */
	
	public boolean removeItem(T item) {
		boolean r = false;
		for (int i = 0; i < size; i++) {
			if (inventory.get(i) == item) {
				this.inventory.remove(item);
				this.itemsQueue.clear();
				this.itemsQueue.addAll(inventory);
				size--;
				r = true;
			}
		}
		return r;
	}
	
	/**
	 * Get item by name (String) or by .getModel() method.
	 * 
	 * 
	 * @param item to be found
	 * @return true if this list contains the specified element or false if not exist in inventory
	 */
	
	public boolean getItem(T item) {
		boolean r = false;
		for (int i = 0; i < size; i++) {
			if (inventory.get(i) == item) {
				r = true;
				break;
			}
		}
		return r;
	}
	
	public T getCurrentItem() {
		return this.itemsQueue.peek();
	}
	
	/**
	 * Returns inventory size
	 * 
	 * @return size
	 */
	
	public int size() {
		return size;
	}
	
	public void getInventory() {
		if (this.inventory.isEmpty()) {
			System.out.println("Inventory is empty");
		} for (T item : inventory) {
			System.out.println(item);
		}
	}
	
	public void changeItem() {
		T r = this.itemsQueue.peek();
		this.itemsQueue.remove();
		this.itemsQueue.add(r);
	}
	
}
