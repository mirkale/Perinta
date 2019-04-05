package people;

/**
 * @author viivi
 * @version 1.0
 */
public class Person {
    private String nimi;

    /**
     * Creates a person w nimi
     * @param nimi
     */

    public Person(String nimi){
        this.nimi = nimi;
    }

    /**
     * all info of a person
     * @return
     */
    public String getInfo(){
        return this.nimi;
    }
}
