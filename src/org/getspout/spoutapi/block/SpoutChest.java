package org.getspout.spoutapi.block;

import org.bukkit.block.Chest;
import org.bukkit.inventory.Inventory;
import org.getspout.spoutapi.inventory.DoubleChestInventory;

public interface SpoutChest extends Chest{
	
	/**
	 * Is true if the chest is part of a larger double chest
	 * @return true if is double chest
	 */
	public boolean isDoubleChest();
	
	/**
	 * Gets the other side of the larger double chest, if a double chest, or null if it is a single chest
	 * @return other chest
	 */
	public SpoutChest getOtherSide();
	
	/**
	 * Gets the full double inventory of the double chest, or null if a single chest
	 * @return full inventory
	 */
	public DoubleChestInventory getFullInventory();
	
	/**
	 * Gets the largest possible inventory associated with this block
	 * If this block is part of a double chest, it will return the double inventory
	 * otherwise it will return the single inventory for this chest block
	 * @return largest inventory
	 */
	public Inventory getLargestInventory();
	
	/**
	 * Gets the inventory for this single chest block
	 * @return inventory
	 */
	public Inventory getInventory();
}
