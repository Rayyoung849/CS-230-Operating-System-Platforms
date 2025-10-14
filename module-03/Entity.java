package com.gamingroom;

/**
 * Base class to hold common data for all entities in the game (id and name).
 * Protected so only subclasses in the package can use default construction.
 */
public abstract class Entity {
    protected long id;
    protected String name;

    // Hide empty constructor from outside
    protected Entity() { }

    // Common constructor used by subclasses
    protected Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /** @return the id */
    public long getId() {
        return id;
    }

    /** @return the name */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [id=" + id + ", name=" + name + "]";
    }
}