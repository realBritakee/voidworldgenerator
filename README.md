# Void World Generator

Create pure void worlds for building, testing, and creative projects.

The VoidWorldGenerator plugin adds a completely empty void world generator to Hytale servers. Perfect for Skyblock, map making, and performance testing.

## Quick Start

1. Install the plugin by placing the JAR in your `plugins/` folder
2. Create a void world: `/world add <worldname> --gen=void`
3. Teleport to your world: `/tp world <worldname>`

## Features

- Fully empty void generation - No terrain, no structures
- Spawn platform at (0, 180, 0) using block ID 178 (Crude Platform)
- Lightweight & fast - Zero natural terrain generation
- Basic biome support with void environment (`Env_Skyblock_Void`)
- Customizable spawn coordinates in `TrueVoidGenerator.java`

## Commands

| Command | Description |
|---------|-------------|
| `/world add <worldname> --gen=void` | Creates a new void world |
| `/tp world <worldname>` | Teleports you to the world |

## Known Issues

- Grass blocks render black due to biome tinting issues in void worlds
- Currently under investigation for a future fix

## Project Structure

```
EmptyWorldGenerator/
├── src/main/java/io/github/britakee/empty/
│   ├── EmptyWorldGenerator.java      # Main plugin class
│   └── worldgen/
│       ├── VoidWorldGenerator.java   # WorldGen provider
│       └── TrueVoidGenerator.java    # Core generator logic
├── src/main/resources/
│   ├── manifest.json                 # Plugin manifest
│   ├── Common/                       # Common Folder
│   └── Server/HytaleGenerator/Biomes/
│       └── Basic.json                # Biome config
└── build.gradle                      # Gradle build config
```

## Configuration

Spawn Platform (`TrueVoidGenerator.java`):
```java
private static final int SPAWN_X = 0;
private static final int SPAWN_Y = 180;
private static final int SPAWN_Z = 0;
private static final int SPAWN_BLOCK_ID = 178; // Crude Platform
```

Biome Config (`src/main/resources/Server/HytaleGenerator/Biomes/Basic.json`):
- Environment: `Env_Skyblock_Void`
- Tint Color: `#5eb342` (green)

## Building

```bash
./gradlew build
```

Output JAR: `build/libs/EmptyWorldGenerator-1.0.0.jar`

## Asset Pack Structure

Ensure your `Basic.json` biome is in the correct location:
```
src/main/resources/Server/HytaleGenerator/Biomes/Basic.json
```

## Troubleshooting

Grass appears black?
- Verify `Basic.json` is in the correct assets folder
- Check server console for biome loading errors
- Ensure plugin registers the `void` generator on startup

World not generating?
- Confirm command syntax: `/world add <name> --gen=void`
- Check server logs for registration errors

## Changelog

### 1.0.0
- Initial release with void world generation
- Spawn platform support
- Basic biome integration

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Credits

- Britakee - Creator & Developer
- Hytale Server API by Hypixel Studios