package cz.czechitas.ukol3.model;

public class Procesor {
    private String vyrobce;
    private long rychlost;

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public long getRychlost() {
        return rychlost;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Výrobcem procesoru je " + vyrobce + ". ");
        builder.append("Rychlost procesoru je " + rychlost + " hertzů. ");

        return builder.toString();
    }
}

