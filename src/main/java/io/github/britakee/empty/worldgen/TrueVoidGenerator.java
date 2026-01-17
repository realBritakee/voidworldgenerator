package io.github.britakee.empty.worldgen;

import com.hypixel.hytale.math.vector.Transform;
import com.hypixel.hytale.server.core.universe.world.worldgen.*;

import java.util.concurrent.CompletableFuture;
import java.util.function.LongPredicate;
import javax.annotation.Nullable;

public class TrueVoidGenerator implements IWorldGen {
    // Spawn coordinates
    private static final int SPAWN_X = 0;
    private static final int SPAWN_Y = 180;
    private static final int SPAWN_Z = 0;

    // Block ID - ID 7 = Crude Platform (the one you wanted!)
    // Change this number to try different blocks if needed
    private static final int SPAWN_BLOCK_ID = 178;

    @Override
    public CompletableFuture<GeneratedChunk> generate(int seed, long index, int x, int z, LongPredicate stillNeeded) {
        return CompletableFuture.supplyAsync(() -> {
            if (stillNeeded != null && !stillNeeded.test(index)) {
                return null;
            }

            // Create empty chunk
            GeneratedChunk chunk = new GeneratedChunk();

            // Get the auto-created block chunk
            GeneratedBlockChunk blockChunk = chunk.getBlockChunk();

            // Set the coordinates correctly
            blockChunk.setCoordinates(index, x, z);

            // Generate height map (required for grass tinting and other systems)
            blockChunk.generateHeight();

            // Check if this chunk contains the spawn point (0, 180, 0)
            // Chunks are 32x32, so check if spawn point is within this chunk's bounds
            int chunkMinX = x * 32;
            int chunkMaxX = chunkMinX + 31;
            int chunkMinZ = z * 32;
            int chunkMaxZ = chunkMinZ + 31;

            if (SPAWN_X >= chunkMinX && SPAWN_X <= chunkMaxX &&
                    SPAWN_Z >= chunkMinZ && SPAWN_Z <= chunkMaxZ) {

                // Calculate local coordinates within the chunk
                int localX = SPAWN_X - chunkMinX;
                int localZ = SPAWN_Z - chunkMinZ;

                // Place block at spawn
                // Parameters: x, y, z, blockId, rotation, filler
                blockChunk.setBlock(localX, SPAWN_Y, localZ, SPAWN_BLOCK_ID, 0, 0);
            }

            return chunk;
        });
    }

    @Override
    public Transform[] getSpawnPoints(int i) {
        // This works for /spawn command and should work for initial spawn too
        return new Transform[]{new Transform(
                (float) SPAWN_X + 0.5f,  // Center of block
                (float) SPAWN_Y + 1.0f,   // One block above the platform
                (float) SPAWN_Z + 0.5f    // Center of block
        )};
    }

    @Nullable
    @Override
    public WorldGenTimingsCollector getTimings() {
        return null;
    }
}