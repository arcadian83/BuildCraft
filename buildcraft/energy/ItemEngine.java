package buildcraft.energy;

import net.minecraft.server.ItemBlock;
import net.minecraft.server.ItemStack;

public class ItemEngine extends ItemBlock
{
    public ItemEngine(int var1)
    {
        super(var1);
        this.setMaxDurability(0);
        this.a(true);
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int filterData(int var1)
    {
        return this.getPlacedBlockMetadata(var1);
    }

    public int getPlacedBlockMetadata(int var1)
    {
        return var1;
    }

    public String a(ItemStack var1)
    {
        return var1.getData() == 0 ? "tile.engineWood" : (var1.getData() == 1 ? "tile.engineStone" : "tile.engineIron");
    }
}
