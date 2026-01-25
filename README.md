# Hytale Empty World Generator

This plugin adds a **Void** world generator to the `/world create` command and spawns players on a single **Rock_Bedrock** block at (0, 180, 0).

> **⚠️ Early Access Warning**
> Hytale is currently in Early Access. Features, APIs, and this template are subject to frequent changes. Please ensure you are using the latest version of the template for the best experience.

---

## Prerequisites

Before you begin, ensure your environment is ready:

* **Hytale Launcher**: Installed and updated.
* **Java 25 SDK**: Required for modern Hytale development.
* **IntelliJ IDEA**: (Community or Ultimate) Recommended for full feature support.

---

## Quick Start

### 1. Importing the Project

1. Open IntelliJ IDEA and select **Open**.
2. Navigate to the template folder and click **OK**.
3. Wait for the Gradle sync to finish. This will automatically download dependencies, create a `./run` folder, and generate the **HytaleServer** run configuration.

### 2. Authenticating your Test Server

You **must** authenticate your local server to connect to it:

1. Launch the **HytaleServer** configuration in IDEA.
2. In the terminal, run: `auth login device`.
3. Follow the printed URL to log in via your Hytale account.
4. Once verified, run: `auth persistence Encrypted`.

---

## Developing & Testing

### Running the Server

If you do not see the **HytaleServer** run configuration in the top-right dropdown, click "Edit Configurations..." to unhide it. Press the **Green Play Button** to start, or the **Bug Icon** to start in Debug Mode to enable breakpoints.

### Using the Void Generator

1. Launch your standard Hytale Client.
2. Connect to `Local Server` (127.0.0.1).
3. Run `/world create <name> Void`.
4. Join the world and you will spawn on a single Rock_Bedrock block.

### Bundling Assets

You can include models and textures by placing them in `src/main/resources/Common/` or `src/main/resources/Server/`. These are editable in real-time using the in-game **Asset Editor**.

---

## Building the Plugin

To create a shareable `.jar` file for distribution:

1. Open the **Gradle Tab** on the right side of IDEA.
2. Navigate to `Tasks` -> `build` -> `build`.
3. Your compiled plugin will be in: `build/libs/<project-name>-<version>.jar`.

To install it manually, drop the JAR into `%appdata%/Hytale/UserData/Mods/`.

---

## Documentation

For detailed guides on commands, event listeners, and professional patterns, visit our full documentation:
👉 **[Hytale Modding Documentation](https://britakee-studios.gitbook.io/hytale-modding-documentation)**

---

## Troubleshooting

* **Sync Fails**: Check that your Project SDK is set to **Java 25** via `File > Project Structure`.
* **Cannot Connect**: Ensure you ran the `auth` commands in the server console.
* **Void Generator Missing**: Ensure the plugin JAR is in `%appdata%/Hytale/UserData/Mods/` and restart the server.

---

**Need Help?** Visit our full guide here: **[Hytale Modding Documentation](https://britakee-studios.gitbook.io/hytale-modding-documentation)**
