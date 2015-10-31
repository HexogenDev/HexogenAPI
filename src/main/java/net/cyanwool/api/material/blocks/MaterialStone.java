package net.cyanwool.api.material.blocks;

import net.cyanwool.api.material.Material;
import net.cyanwool.api.world.sounds.GeneralSounds;

public class MaterialStone extends TexturedMaterial {

	public MaterialStone(String StringId, int Id, int metadata, int customData) {
		super(StringId, Id, metadata, customData);
		setSolid(true);
		setBreakSound(GeneralSounds.DIG_STONE);
		setPlaceSound(GeneralSounds.DIG_STONE);
		setStepSound(GeneralSounds.STEP_STONE);
	}

	public MaterialStone() {
		this("stone", 1, 0, 0);
	}

	public MaterialStone(int metadata) {
		this("stone", 1, metadata, 0);
	}

	public MaterialStone(int metadata, int customData) {
		this("stone", 1, metadata, customData);
	}

	public MaterialStone(Material material) {
		this(material.getStringId(), material.getId(), material.getMinecraftData(), material.getCustomData());
	}
}
