package io.github.britakee.empty;

import com.hypixel.hytale.codec.lookup.Priority;
import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.server.core.universe.world.worldgen.provider.IWorldGenProvider;
import io.github.britakee.empty.worldgen.VoidWorldGenerator;
import javax.annotation.Nonnull;

public class EmptyWorldGenerator extends JavaPlugin {
    public EmptyWorldGenerator(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        super.setup();

        // Register the void world generator - just pass the codec directly
        IWorldGenProvider.CODEC.register(Priority.DEFAULT, "Void",
                VoidWorldGenerator.class, VoidWorldGenerator.CODEC);

        ((HytaleLogger.Api)getLogger().atInfo()).log("EmptyWorldGenerator plugin loaded - Void generator registered!");
    }
}
