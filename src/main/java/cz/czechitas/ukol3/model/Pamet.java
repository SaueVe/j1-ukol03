package cz.czechitas.ukol3.model;

public class Pamet {
    private long kapacitaPameti;

    public long getKapacitaPameti() {
        return kapacitaPameti;
    }

    public void setKapacitaPameti(long kapacita) {
        this.kapacitaPameti = kapacita;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Kapacita paměti je " + kapacitaPameti + " bajtů. ");
        builder.append(" ");

        return builder.toString();
    }

}
