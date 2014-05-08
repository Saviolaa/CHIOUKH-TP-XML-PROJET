package Rest.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by LYES-PC on 08/05/14.
 */

@XmlRootElement(name="langue")
@XmlType(propOrder = {"nome", "niveau" })
public class langue {

        private String nome;
        private int niveau;


    public langue(String nome, int niveau) {
        this.nome = nome;
        this.niveau = niveau;
    }

    public langue() {
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}