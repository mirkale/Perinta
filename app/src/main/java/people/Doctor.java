package people;

public class Doctor extends Person{        // 1. perintä kuka on super?

    private String titteli;

    /**
     *
     * @param nimi nimi
     * @param titteli lääkärin työnimike...
     */
    public Doctor(String nimi, String titteli){         //2. perintä kutsu superin muodostinta
        super(nimi);                                    // pakko olla ennen muita lauseita...
        this.titteli = titteli;
    }

    /**
     *
     * @return palauttaa lääkärin nimen ja tittelin
     */
    @Override
    public String getInfo(){
        return super.getInfo() + ", " + this.titteli;
    }
}
