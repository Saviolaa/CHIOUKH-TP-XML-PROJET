package Rest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by LYES-PC on 01/04/14.
 */
@XmlRootElement(name = "cv")
public class Cv {

    private String lastName;
    private String firstName;
    private String objectives;

    public Cv() {}

    public Cv(String lastName, String firstName, String objectives) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.objectives = objectives;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        objectives = objectives;
    }
}
