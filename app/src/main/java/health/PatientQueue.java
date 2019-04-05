package health;

import people.Doctor;
import people.Patient;
import java.util.ArrayList;



public class PatientQueue{

    private ArrayList<Patient> patients = new ArrayList<Patient>();
    private String sairaala;
    private String osasto;
    private Doctor hoitavaLekuri;

    /**
     *
     * @param sairaala sairaalan nimi
     * @param osasto osaston nimi
     * @param hoitavaLekuri hoitava lääkäri
     */

    public PatientQueue(String sairaala, String osasto, Doctor hoitavaLekuri){

        this.sairaala = sairaala;
        this.osasto = osasto;
        this.hoitavaLekuri = hoitavaLekuri;
    }

    /**
     *
     * @param pat uus potilas
     */
    public void lisaaJonoon(Patient pat){
        this.patients.add(pat);
    }

    /**
     *
     * @return palauttaa sairaalan nimen, lääkärin nimen, osaston, sekä käy potilasjonon läpi ja tulostaa sen.
     */
    public String getInfo(){
        String temp = "*** Treatment Queue in " + this.sairaala;
        temp += "\n Doctor in charge: " + this.hoitavaLekuri.getInfo();
        temp += "\n Osasto: " + this.osasto;
        int i = 1;
        for(Patient p : this.patients){

            temp += "\n " + p.getInfo();
            i++;
        }
        return temp;
    }

}
