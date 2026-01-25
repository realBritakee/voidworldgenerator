# Hytale Empty World Generator

This plugin adds a **Void** world generator to the `/world create` command and spawns players on a single **Rock_Bedrock** block at (0, 180, 0).

> **⚠️ Early Access Warning**
> Hytale is currently in Early Access. Features, APIs, and this template are subject to frequent changes. Please ensure you are using the latest version of the template for the best experience.

## Recent Changes
- Fixed sky rendering by setting environments per column in void worldgen.
- Fixed grass/foliage tinting by setting a chunk tint map.
- Updated spawn platform block to use the Rock_Bedrock block key.

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

## Documentation

For detailed guides on commands, event listeners, and professional patterns, visit our full documentation:
👉 **https://britakee-studios.gitbook.io/hytale-modding-documentation**

## Support
Questions or issues? Join the https://discord.gg/gCRv62araB or contact Britakee.

## Support Development
If you want to support the project, you can donate on Ko-fi: https://ko-fi.com/britakeestudio
