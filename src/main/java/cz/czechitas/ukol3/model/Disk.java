package cz.czechitas.ukol3.model;

public class Disk {
    private long kapacitaDisku;
    private long vyuziteMisto;

    public long getKapacita() {
        return kapacitaDisku;
    }

    public void setKapacita(long kapacita) {
        this.kapacitaDisku = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Kapacita disku je " + kapacitaDisku + " bajtů. ");
        builder.append("Na disku je využito " + vyuziteMisto + " bajtů. ");

        return builder.toString();
    }


}
