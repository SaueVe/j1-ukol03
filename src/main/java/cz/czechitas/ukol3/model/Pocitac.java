package cz.czechitas.ukol3.model;

import cz.czechitas.ukol3.model.Disk;

public class Pocitac {
    private boolean jeZapnuty = false;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    private Disk druhyDisk;
    private long velikostSouboru;


    public void vytvorSouborOVelikosti(long velikostSouboru) {
        if (jeZapnuty == true) {
            long puvodniVyuziteMistoPevnehoDisku = pevnyDisk.getVyuziteMisto();
            long puvodniVolneMistoPevnehoDisku = pevnyDisk.getKapacitaDisku() - puvodniVyuziteMistoPevnehoDisku;
            pevnyDisk.setVyuziteMisto(velikostSouboru + pevnyDisk.getVyuziteMisto());
            if (pevnyDisk.isDostatekMista() == false) {
                druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto() + (velikostSouboru - puvodniVolneMistoPevnehoDisku));
                if (druhyDisk.isDostatekMista() == false) {
                    pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikostSouboru);
                    druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto() - (velikostSouboru - puvodniVolneMistoPevnehoDisku));
                    System.err.println("Kapacita obou disků je pro tento soubor nízká.");
                    return;
                } else if (druhyDisk.isDostatekMista() == true) {
                    pevnyDisk.setVyuziteMisto(pevnyDisk.getKapacitaDisku());
                    System.out.println("Část souboru je uložená na druhém disku.");
                    return;
                }
            } else if (pevnyDisk.isDostatekMista() == true) {
                return;
            }
        } else if (!jeZapnuty) {
            return;
        }
    }

    public void vymazSouboryOVelikosti(long velikostSouboru) {
        if (jeZapnuty == true) {
            long puvodniVyuziteMistoPevnehoDisku = pevnyDisk.getVyuziteMisto();
            long puvodniVolneMistoPevnehoDisku = pevnyDisk.getKapacitaDisku() - puvodniVyuziteMistoPevnehoDisku;
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikostSouboru);
            if (pevnyDisk.isDostatekMista() == false) {
                druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto() - (velikostSouboru - puvodniVyuziteMistoPevnehoDisku));

                if (druhyDisk.isDostatekMista() == false) {
                    pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikostSouboru);
                    druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto() + (velikostSouboru - puvodniVyuziteMistoPevnehoDisku));
                    System.err.println("Z disků není možné vymazat takto velký soubor.");
                    System.err.println("Využité místo nemůže být záporné.");
                    return;
                } else if (druhyDisk.isDostatekMista() == true) {
                    pevnyDisk.setVyuziteMisto(0);
                    System.out.println("Část souboru se vymazala z druhého disku.");
                    return;
                }
            } else if (pevnyDisk.isDostatekMista() == true) {
                return;
            }
        } else if (!jeZapnuty) {
            return;
        }
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public Disk getDruhyDisk() {
        return druhyDisk;
    }

    public void setDruhyDisk(Disk druhyDisk) {
        this.druhyDisk = druhyDisk;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(cpu);
        builder.append(ram);
        builder.append(pevnyDisk);

        return builder.toString();
    }

    public void zapniSe() {
        if (jeZapnuty == false) {
            if (cpu == null || ram == null || pevnyDisk == null) {
                System.err.println("Počítač nemá všechny komponenty");
                setJeZapnuty(false);
            } else if (cpu != null & ram != null & pevnyDisk != null) {
                System.out.println("PC se zapnul.");
                setJeZapnuty(true);
            }
        } else if (jeZapnuty == true) {
            System.err.println("PC už je zapnutý.");
        }
    }

    public boolean isJeZapnuty() {
        if (jeZapnuty == true) {
            System.out.println("PC je zapnutý.");
            return true;
        }
        if (jeZapnuty == false) {
            System.out.println("PC je vypnutý.");
            return false;
        }
        return false;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }

    public void vypniSe() {
        if (jeZapnuty == true) {
            System.out.println("PC se vypnul.");
            setJeZapnuty(false);
        }
    }

    public long getVelikostSouboru() {
        return velikostSouboru;
    }

    public void setVelikostSouboru(long velikostSouboru) {
        this.velikostSouboru = velikostSouboru;
    }
}
