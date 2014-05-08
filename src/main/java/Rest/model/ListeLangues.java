package Rest.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by LYES-PC on 08/05/14.
 */
@XmlRootElement(name="languages")
public class ListeLangues {

    private List<langue> langues;

    public List<langue> getLangues() {
        return langues;
    }

    public void setLangues(List<langue> langues) {
        this.langues = langues;
    }

    public ListeLangues() {
    }

    public ListeLangues(List<langue> langues) {
        this.langues = langues;
    }
}
