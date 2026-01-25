# VoidWorldGenerator
VoidWorldGenerator adds a clean void world generator to the /world add command. It creates an empty world with a spawn platform and proper sky and biome tint handling.

## Recent Changes
- Fixed sky rendering by setting environments per column in void worldgen.
- Fixed grass/foliage tinting by setting a chunk tint map.
- Updated spawn platform block id to 609.

## Highlights
- True void world with a spawn platform at 0,180,0
- Proper sky and tint handling for foliage and grass
- Works with built-in void generator id: --gen=Void
- Includes asset pack for default void biome setup

## Commands
- /world add <name> --gen=Void

## Requirements
- Hytale Server (as dependency)
- Java 25

## Installation
1. Drop VoidWorldGenerator into your server mods folder
2. Start the server once to load the generator
3. Create a world with /world add <name> --gen=Void

## Support
Questions or issues? Join the https://discord.gg/gCRv62araB or contact Britakee.

## Support Development
If you want to support the project, you can donate on Ko-fi: https://ko-fi.com/britakeestudio
