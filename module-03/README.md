# Module 3 - Project One

## Overview

This module delivers two parts for The Gaming Room: a software design document and a working Java prototype of Draw It or Lose It in a web-ready architecture.

## What I delivered

- Part I: Software Design Document with an executive summary, design constraints for a web-based distributed app, and a domain model write-up.

- Part II: Java application that meets the client requirements: one GameService instance, unique game and team names, and teams with multiple players.

## Design and patterns used

- Singleton: GameService exposes getInstance() and uses a private constructor so only one service exists.
- Iterator: addGame() and getGame() scan existing games to enforce unique names; addTeam() and addPlayer() do the same for teams and players.
- Inheritance: Entity is a base class for Game, Team, and Player (shared id and name).
- Encapsulation with clear naming and comments.

## How to run

1. Open the project in Eclipse.
2. Build the project.
3. Run ProgramDriver.main() to exercise the features and view console output.

## Files

- software-design-template.docx
- src/com/gamingroom/Entity.java
- src/com/gamingroom/Game.java
- src/com/gamingroom/Team.java
- src/com/gamingroom/Player.java
- src/com/gamingroom/GameService.java
- src/com/gamingroom/ProgramDriver.java

