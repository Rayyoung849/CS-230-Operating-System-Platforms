# Module 08 - Portfolio Journal

## Project Summary
The client is The Gaming Room. They have a game called "Draw It or Lose It" that originally ran only on Android. They asked us to plan and design a version that can run as a web application and support more platforms (desktop and mobile browsers). The software design document covers how the game should work on the server and on the client, how names and game sessions are managed, how images are stored and served, and what platforms make the most sense for deployment.

## What I Did Well
I think I did well explaining the rules and limits the system has to follow. For example, only one game service should exist at a time, and each game, team, and player needs a unique name. I wrote how to solve those problems using patterns like Singleton (for one shared game service) and Iterator (to check for duplicate names safely). I also kept the language straightforward so someone who is not deep in programming could still understand why those choices were made.

## How the Design Document Helped With Code
Writing the design first made the coding easier. Instead of jumping straight into classes and guessing where things should go, the design document forced me to think about structure: what objects we need (game, team, player), what they share (id and name), and how they connect. That is where the base `Entity` class came from. It also helped call out the big rules early, like “names must be unique” and “only one game manager can exist,” so those rules were already clear when I wrote `GameService` in code.

## What I Would Revise
If I could revise one part, I would tighten the platform recommendation section so it lines up perfectly with the evaluation table. My earlier draft leaned a little too much on Windows, but based on cost, scaling, and cloud hosting, Linux is the better main server platform. I would make that more direct and make sure the final recommendation matches the technical analysis.

## Understanding User Needs
The user needs for The Gaming Room were things like, the game must support multiple teams and players at the same time, names must be unique so players do not get confused, and gameplay has to be smooth. I tried to design around that instead of just thinking “what code can I write.” For example, I made sure the design supported checking names before creating a new game or team, so players are not allowed to create duplicates. I also planned for images to load quickly and on time so rounds feel fair. It is important to design for user needs first because if those needs are not built into the design, you end up rewriting a lot of code later.

## My Approach to Software Design
My approach was to start with requirements, write out the rules, then match those to patterns that solve real problems. I used object oriented design (a shared base class called `Entity`, inheritance for Game/Team/Player, private fields and getters for encapsulation). I also used known patterns like Singleton to control how many copies of a service can exist and Iterator to search through lists in a clean way. Going forward, I would use the same process: collect requirements, map out data and relationships in a UML diagram, then pick patterns that solve real constraints instead of forcing patterns just because they are common.

## Files Included

- This reflection journal in module-08
