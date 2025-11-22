
package theater;

/**
 * Represents a play in the theater system.
 *
 * @null.none
 */
public class Play {

    /**
     * The name of the play.
     * @null.none
     */
    private String name;

    /**
     * The type of the play.
     * @null.none
     */
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public final String getName() {
        return name;
    }

    public final String getType() {
        return type;
    }
}
