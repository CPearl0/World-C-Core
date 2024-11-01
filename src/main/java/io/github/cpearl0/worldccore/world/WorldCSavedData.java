package io.github.cpearl0.worldccore.world;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.saveddata.SavedData;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class WorldCSavedData extends SavedData {
    public int timeState = DAY;
    public static final int DAY = 0;
    public static final int NORMAL = 1;

    public WorldCSavedData(int timeState) {
        this.timeState = timeState;
    }

    public WorldCSavedData() {
        this(DAY);
    }

    @Override
    public @NotNull CompoundTag save(CompoundTag pTag, HolderLookup.Provider pRegistries) {
        pTag.putInt("state", timeState);
        return pTag;
    }

    public static WorldCSavedData load(CompoundTag tag, HolderLookup.Provider provider) {
        var data = new WorldCSavedData();
        data.timeState = tag.getInt("state");
        return data;
    }
}
