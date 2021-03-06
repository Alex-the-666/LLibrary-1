package net.ilexiconn.llibrary.server.structure;

import net.ilexiconn.llibrary.server.structure.rule.PlaceRule;
import net.ilexiconn.llibrary.server.structure.rule.RepeatRule;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author jglrxavpok
 * @since 1.1.0
 */
public class ComponentInfo {
    public HashMap<BlockPos, BlockList> blocks;
    public List<RepeatRule> repeats;
    public EnumFacing front;
    public EnumFacing top;

    public ComponentInfo() {
        front = EnumFacing.EAST;
        top = EnumFacing.UP;
        blocks = new HashMap<>();
        repeats = new ArrayList<>();
        repeats.add(new PlaceRule());
    }
}
