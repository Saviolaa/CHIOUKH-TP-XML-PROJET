package Rest;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by LYES-PC on 01/04/14.
 */
@XmlRootElement(name = "listcv")
public class CvArray {

    public List<Cv> cvList;
}
