/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Pillar Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Pillar
 * 
 * Pillar is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [25/06/2016, 18:08:37 (GMT)]
 */
package vazkii.pillar.schema;

import java.util.List;

import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTable;
import vazkii.pillar.StructureLoader;

public final class StructureSchema {
	
	public transient String structureName;
	
	public GeneratorType generatorType;
	public int offsetX, offsetY, offsetZ;
	public Mirror mirrorType;
	public int maxY, minY;
	
	public List<Integer> dimensionSpawns;
	public List<String> biomeNameSpawns;
	public List<String> biomeTagSpawns;

	public int integrity, decay;
	public int rarity;
	
	public LootTable lootTableData;
	public boolean lootTableMode;
	
	@Override
	public String toString() {
		return StructureLoader.jsonifySchema(this);
	}
}
