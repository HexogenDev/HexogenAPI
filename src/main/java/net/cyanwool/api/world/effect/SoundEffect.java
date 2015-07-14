package net.cyanwool.api.world.effect;

public enum SoundEffect implements Effect {

	CLICK(1000), EMPTY_DISPENSER_CLICK(1001), FIRE_PROJECTILE(1002), DOOR(1003), FIZZLE(1004), PLAY_RECORD(1005), GHAST_CHARGE(1007), GHAST_FIRE(1008), BLAZE_FIRE(1009), POUND_WOODEN_DOOR(1010), POUND_METAL_DOOR(1011), BREAK_WOODEN_DOOR(1012), WITHER_SPAWN(1013), WITHER_SHOOT(1014), BAT_TAKE_OFF(1015), INFECT_VILLAGER(1016), DISINFECT_VILLAGER(1017), ENDER_DRAGON_DEATH(1018), ANVIL_BREAK(1020), ANVIL_USE(1021), ANVIL_LAND(1022);

	private int id;

	SoundEffect(int id) {
		this.id = id;
	}

	@Override
	public int getID() {
		return id;
	}

}
