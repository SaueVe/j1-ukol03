package cz.czechitas.ukol3.model;

public class Disk {
    private long kapacitaDisku;
    private long vyuziteMisto;
    private boolean dostatekMista;

    public long getKapacitaDisku() {
        return kapacitaDisku;
    }

    public long setKapacitaDisku(long kapacita) {
        this.kapacitaDisku = kapacita;
        return kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        if (vyuziteMisto > kapacitaDisku) {
//            System.err.println("Nedostatek místa.");
            setDostatekMista(false);
        } else if (vyuziteMisto <= kapacitaDisku) {
            setDostatekMista(true);
        }
        if (vyuziteMisto < 0) {
//            System.err.println("Využité místo nemůže být záporné.");
            setDostatekMista(false);
        }
        this.vyuziteMisto = vyuziteMisto;
    }

    public void setDostatekMista(boolean dostatekMista) {
        this.dostatekMista = dostatekMista;
    }

    public boolean isDostatekMista() {
        return dostatekMista;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Kapacita disku je " + kapacitaDisku + " bajtů. ");
        builder.append("Na disku je využito " + vyuziteMisto + " bajtů. ");

        return builder.toString();
    }


}
