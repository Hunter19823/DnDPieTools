package pie.ilikepiefoo2.dndpietools;

/**
 * An interface for attaching/keeping track of a character's notes.
 */
public interface INotes {
    /**
     *  A set of notes about an object.
     *  @return String The notes.
     */
    String getNotes();

    /**
     * Sets the content of the notes.
     *
     * @param notes The notes being stored.
     */
    void setNotes(String notes);

    /**
     *  Checks if there is any notes.
     *  @return  boolean
     */
    default boolean hasNotes(){
        return getNotes() != null ? getNotes().length() > 0 : false;
    }
}
