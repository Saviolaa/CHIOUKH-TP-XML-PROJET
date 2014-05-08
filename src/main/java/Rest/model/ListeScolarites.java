package Rest.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by LYES-PC on 08/05/14.
 */
@XmlRootElement(name="scolarites")
public class ListeScolarites {

    private List<scolarite> scolarites;

    public ListeScolarites(List<scolarite> scolarites) {
        this.scolarites = scolarites;
    }

    public ListeScolarites() {

    }

    public List<scolarite> getScolarites() {
        return scolarites;
    }

    public void setScolarites(List<scolarite> scolarites) {
        this.scolarites = scolarites;
    }
}

