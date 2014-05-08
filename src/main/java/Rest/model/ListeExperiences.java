package Rest.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by LYES-PC on 06/05/14.
 */

@XmlRootElement(name="Experiences")
public class ListeExperiences {


    private List<experience> listeexperiences;


    public ListeExperiences(List<experience> listeexperiences) {
        this.listeexperiences = listeexperiences;
    }

    public ListeExperiences() {
    }

    public List<experience> getListeexperiences() {
        return listeexperiences;
    }

    public void setListeexperiences(List<experience> listeexperiences) {
        this.listeexperiences = listeexperiences;
    }

}
