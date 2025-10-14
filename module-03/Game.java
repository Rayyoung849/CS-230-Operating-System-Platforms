package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * This class extends Entity, which means it inherits 
 * the id and name fields. 
 * 
 * A Game can contain multiple Team objects. To keep names unique,
 * we check existing teams before adding a new one.
 * </p>
 */
public class Game extends Entity {

    // List of teams that belong to this game
    private List<Team> teams = new ArrayList<Team>();

    /**
     * Hide the default constructor to prevent creating empty instances.
     * This is intentional; use the overloaded constructor instead.
     */
    private Game() {
        super();
    } 

    /**
     * Constructor with an identifier and name
     * 
     * @param id unique identifier for the game
     * @param name unique name of the game
     */
    public Game(long id, String name) {
        super(id, name); // call the Entity constructor
    }

    /**
     * Add a team to this game, preventing duplicate team names.
     * 
     * Iterator pattern:
     * - We iterate through the teams list and compare names (case-insensitive).
     * - If a match is found, return the existing team instead of creating a new one.
     * - If not found, create a new Team using a unique id from GameService.
     * 
     * @param name unique team name
     * @return the team instance (new or existing)
     */
    public Team addTeam(String name) {
        // local team reference
        Team team = null;

        // look for existing team with the same name
        for (Iterator<Team> it = teams.iterator(); it.hasNext();) {
            Team t = it.next();
            if (t.getName().equalsIgnoreCase(name)) {
                team = t; // reuse existing team
                break;
            }
        }

        // if not found, create and add a new team
        if (team == null) {
            long newId = GameService.getInstance().getNextTeamId(); // get a unique team id
            team = new Team(newId, name);
            teams.add(team);
        }

        return team;
    }

    /**
     * Package/local accessor for tests or inspection
     * 
     * @return the list of teams in this game
     */
    List<Team> getTeams() {
        return teams;
    }

    /**
     * @return a string with game information
     */
    @Override
    public String toString() {
        return "Game [id=" + getId() + ", name=" + getName() + ", teams=" + teams.size() + "]";
    }
}
