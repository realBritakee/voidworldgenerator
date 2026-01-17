package io.github.britakee.empty.worldgen;

import com.hypixel.hytale.codec.builder.BuilderCodec;
import com.hypixel.hytale.server.core.universe.world.worldgen.IWorldGen;
import com.hypixel.hytale.server.core.universe.world.worldgen.provider.IWorldGenProvider;

public class VoidWorldGenerator implements IWorldGenProvider {
    // BuilderCodec.builder() requires (Class, Supplier)
    // Supplier is a function that creates new instances
    public static final BuilderCodec<VoidWorldGenerator> CODEC = BuilderCodec
            .builder(VoidWorldGenerator.class, VoidWorldGenerator::new)
            .build();

    // Default constructor required by codec
    public VoidWorldGenerator() {
    }

    @Override
    public IWorldGen getGenerator() {
        return new TrueVoidGenerator();
    }
}