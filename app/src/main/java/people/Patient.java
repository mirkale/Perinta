package people;

import people.Person;

public class Patient extends Person{  // 1. perintä kuka on super?

    private int ylaPaine;
    private int alaPaine;
    private String hoito;

    /**
     *
     * @param nimi lääkärin nimi
     * @param hoito hoitoToimenpide
     * @param ylaPaine potilaan yläpaine
     * @param alaPaine potilaan alapaine
     */
    public Patient(String nimi, String hoito, int ylaPaine, int alaPaine){        //2. perintä kutsu superin muodostinta
        super (nimi);                                               // pakko olla ennen muita lauseita...
        this.hoito = hoito;
        this.ylaPaine = ylaPaine;
        this.alaPaine = alaPaine;
    }

    /**
     *
     * @return palauttaa potilaan nimen, hoidon ja paineet
     */
    @Override                   // 3. perintä uudelleenmäärittää perittyjä metodeja...
    public String getInfo(){
        return super.getInfo() + ", " + this.hoito + ", " + "Yläpaine: " + this.ylaPaine + ", " + "Alapaine: " + this.alaPaine;
    }

}
