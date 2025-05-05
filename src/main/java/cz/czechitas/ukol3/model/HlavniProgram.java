package cz.czechitas.ukol3.model;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Disk disk1 = new Disk();
        disk1.setKapacita(121_020_000_000L);
        disk1.setVyuziteMisto(44_380_000_000L);
        System.out.println(disk1);

        Pamet pamet1 = new Pamet();
        pamet1.setKapacita(8_000_000_000L);
        System.out.println(pamet1);

        Procesor procesor1 = new Procesor();
        procesor1.setRychlost(2_300_000_000L);
        procesor1.setVyrobce("Intel");
        System.out.println(procesor1);

        Pocitac pocitac1 = new Pocitac();
        pocitac1.setCpu(procesor1);
        pocitac1.setRam(pamet1);
        pocitac1.setPevnyDisk(disk1);
        System.out.println(pocitac1);

        pocitac1.isJeZapnuty();
        pocitac1.zapniSe();
        pocitac1.isJeZapnuty();
        pocitac1.vypniSe();
        pocitac1.isJeZapnuty();
        pocitac1.vypniSe();


    }
}
