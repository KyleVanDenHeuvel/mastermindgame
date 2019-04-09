package gameLogic;

/**
 * class for storing the data for each achievement
 */
public class Achievement {

    private String name;
    private String description;
    private int id;
    private int imageID;
    private boolean earned;

    /**
     * Creates an achievement object based on the given achievement name, description, and id, along with the
     * accompanying image id and whether the achievement has been earned or not
     * @param name name of achievement
     * @param description description of achievement
     * @param id achievement id number
     * @param imageID id number for image corresponding to achievement
     * @param earned boolean value showing whether or not the achievement has been unlocked
     */
    public Achievement(String name, String description, int id, int imageID, boolean earned) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.imageID = imageID;
        this.earned = earned;
    }

    /**
     * @return returns the achievement name
     */
    public String getName() {
        return name;
    }

    /**
     * @return returns the achievement description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return returns the achievement id
     */
    public int getID() {
        return id;
    }

    /**
     * @return returns the imageID of the achievement
     */
    public int getImageID() {
        return imageID;
    }

    /**
     * @return returns the boolean showing if the the achievement has been unlocked
     */
    public boolean getEarned() {
        return earned;
    }

    /**
     * Set the name of the achievement
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the description of the achievement
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Set the ID of the achievement
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Set the image ID of the achievement
     * @param imageID
     */
    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    /**
     * Set whether the achievement has been earned or not.  Achievement has been earned if true, and not earned if
     * false.
     * @param earned
     */
    public void setEarned(boolean earned) {
        this.earned = earned;
    }
}
