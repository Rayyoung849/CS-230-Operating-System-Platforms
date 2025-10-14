package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Singleton pattern:
 * - We need exactly one GameService to coordinate all games.
 * - A private static 'instance' holds the single object.
 * - The constructor is private to block new GameService() calls.
 * - getInstance() creates the object once and returns the same one every time.
 */

/**
 * Iterator pattern:
 * - Use Java's Iterator to traverse the internal List<Game> without exposing it.
 * - In addGame(), we iterate to prevent duplicate names.
 * - In getGame(id/name), we iterate to find a specific Game efficiently and safely.
 */
public class GameService {

    /**
     * A list of the active games
     */
    private static List<Game> games = new ArrayList<Game>();

    /*
     * Holds the next unique identifiers
     */
    private static long nextGameId = 1;
    private static long nextTeamId = 1;
    private static long nextPlayerId = 1;

    // The one and only shared instance of GameService (Singleton)
    private static GameService instance;

    // Private constructor prevents direct instantiation
    private GameService() {}

    //Returns the single instance of GameService 
    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    /**
     * Construct a new game instance
     * 
     * @param name the unique name of the game
     * @return the game instance (new or existing)
     */
    public Game addGame(String name) {

        // a local game instance
        Game game = null;

        // Use iterator to look for existing game with same name
        for (Iterator<Game> it = games.iterator(); it.hasNext();) {
            Game g = it.next();
            if (g.getName().equalsIgnoreCase(name)) {
                game = g;
                break;
            }
        }

        // if not found, make a new game instance and add to list of games
        if (game == null) {
            game = new Game(nextGameId++, name);
            games.add(game);
        }

        // return the new/existing game instance to the caller
        return game;
    }

    /**
     * Returns the game instance at the specified index.
     * <p>
     * Scope is package/local for testing purposes.
     * </p>
     */
    Game getGame(int index) {
        return games.get(index);
    }

    /**
     * Returns the game instance with the specified id.
     */
    public Game getGame(long id) {
        Game game = null;

        // Use iterator to look for existing game with same id
        for (Iterator<Game> it = games.iterator(); it.hasNext();) {
            Game g = it.next();
            if (g.getId() == id) {
                game = g;
                break;
            }
        }

        return game;
    }

    /**
     * Returns the game instance with the specified name.
     */
    public Game getGame(String name) {
        Game game = null;

        // Use iterator to look for existing game with same name
        for (Iterator<Game> it = games.iterator(); it.hasNext();) {
            Game g = it.next();
            if (g.getName().equalsIgnoreCase(name)) {
                game = g;
                break;
            }
        }

        return game;
    }

    /**
     * Returns the number of games currently active
     */
    public int getGameCount() {
        return games.size();
    }

    /**
     * Returns the next unique team id
     */
    public long getNextTeamId() {
        return nextTeamId++;
    }

    /**
     * Returns the next unique player id
     */
    public long getNextPlayerId() {
        return nextPlayerId++;
    }
}
