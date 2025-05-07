package cz.czechitas.ukol3.model;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Disk disk1 = new Disk();
        disk1.setKapacitaDisku(121_020_000_000L);
        disk1.setVyuziteMisto(44_440_000_000L);
        System.out.println(disk1);

        Pamet pamet1 = new Pamet();
        pamet1.setKapacitaPameti(8_000_000_000L);
//        System.out.println(pamet1);

        Procesor procesor1 = new Procesor();
        procesor1.setRychlost(2_300_000_000L);
        procesor1.setVyrobce("Intel");
//        System.out.println(procesor1);

        Pocitac pocitac = new Pocitac();
        pocitac.setCpu(procesor1);
        pocitac.setRam(pamet1);
        pocitac.zapniSe();
        pocitac.isJeZapnuty();
        pocitac.setPevnyDisk(disk1);
//        System.out.println(pocitac);

        pocitac.vytvorSouborOVelikosti(7_000_000_000L);
        pocitac.vymazSouboryOVelikosti(2_000_000_000L);

        pocitac.isJeZapnuty();
        pocitac.zapniSe();
        pocitac.isJeZapnuty();
        pocitac.zapniSe();

        pocitac.vytvorSouborOVelikosti(7_000_000_000L);
        pocitac.vytvorSouborOVelikosti(800_000_000_000L);
        pocitac.vymazSouboryOVelikosti(10_000_000_000L);
        pocitac.vymazSouboryOVelikosti(700_000_000_000L);
        System.out.println(disk1);

        pocitac.vypniSe();
        pocitac.vytvorSouborOVelikosti(3_000_000_000L);
        pocitac.vymazSouboryOVelikosti(20_000_000_000L);
        System.out.println(disk1);
        pocitac.vypniSe();


    }
}
