package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a team
 * 
 * <p>
 * This class extends Entity, so it inherits the id and name.
 * Each team also has a list of players.
 * </p>
 */
public class Team extends Entity {

    // A list of players in this team
    private List<Player> players = new ArrayList<Player>();

    /*
     * Constructor with an identifier and name
     */
    public Team(long id, String name) {
        super(id, name); // call the Entity constructor
    }

    /**
     * Add a new player to this team
     * 
     * @param name unique name of the player
     * @return the player instance (new or existing)
     */
    public Player addPlayer(String name) {

        // a local player instance
        Player player = null;

        // Use iterator to check for duplicate player names
        for (Iterator<Player> it = players.iterator(); it.hasNext();) {
            Player p = it.next();
            if (p.getName().equalsIgnoreCase(name)) {
                player = p; // if found, use existing player
                break;
            }
        }

        // If not found, create a new player with a unique id
        if (player == null) {
            long id = GameService.getInstance().getNextPlayerId();
            player = new Player(id, name);
            players.add(player);
        }

        return player;
    }

    @Override
    public String toString() {
        return "Team [id=" + getId() + ", name=" + getName() + "]";
    }
}

