# armour-durability-minecraft
```markdown
# Armor Durability Side Hotbar (Fabric)

Displays a vertical side hotbar with your worn armor pieces and their durability percentages.

## Tech
- Fabric (client-side)
- Java (JDK 17+)
- Fabric API

## Quick start (dev)
1. Install JDK 17+
2. Open the project in IntelliJ or run from command line.
3. In project root:
   - ./gradlew runClient  (launches Minecraft dev client)
   - ./gradlew build      (builds the mod jar in build/libs)

4. To test in your normal game: copy the built jar from `build/libs` into `%appdata%/.minecraft/mods` (or `~/.minecraft/mods`) and run a Fabric loader instance for the matching Minecraft version.

## Notes
- This is client-side only (no server components).
- If you change Minecraft/Fabric versions, update `build.gradle.kts` mappings/deps accordingly.
- Positioning, styling and toggles can be customized in the mod source.

## Next improvements you might add
- Toggle keybind to show/hide the hotbar
- Config file for position/scale/colors
- Background slot renderer and armor order preference
```
