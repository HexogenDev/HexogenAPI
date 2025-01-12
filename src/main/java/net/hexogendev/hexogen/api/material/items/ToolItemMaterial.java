package net.hexogendev.hexogen.api.material.items;

import net.hexogendev.hexogen.api.entity.EntityLivingBase;
import net.hexogendev.hexogen.api.entity.alive.player.Player;
import net.hexogendev.hexogen.api.inventory.item.ItemStack;
import net.hexogendev.hexogen.api.material.Material;
import net.hexogendev.hexogen.api.utils.BlockSide;
import net.hexogendev.hexogen.api.world.Position;
import net.hexogendev.hexogen.api.world.World;

public class ToolItemMaterial extends ItemMaterial {

	private boolean damageable;
	private int maxDurability;

	public ToolItemMaterial(String StringId, int Id, int metadata, int customData) {
		super(StringId, Id, metadata, customData);
	}

	public ToolItemMaterial(String stringId, int Id, int metadata) {
		this(stringId, Id, metadata, 0);
	}

	public ToolItemMaterial(String stringId, int Id) {
		this(stringId, Id, 0);
	}

	public ToolItemMaterial(Material material) {
		this(material.getStringId(), material.getId(), material.getMinecraftData(), material.getCustomData());
	}

	public int getMaxDurability() {
		return maxDurability;
	}

	public void setMaxDurability(int durability) {
		maxDurability = durability;
	}

	public boolean isDamageable() {
		return damageable;
	}

	public void setDamageable(boolean flag) {
		damageable = flag;
	}

	@Override
	public boolean onItemUse(ItemStack stack, Player player, World world, Position pos, BlockSide side) {
		stack.setDurability(stack.getDurability() - 1);
		return true;
	}

	@Override
	public boolean onHitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		stack.setDurability(stack.getDurability() - 1);
		return true;
	}

}
