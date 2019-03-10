package part2;

import part2.accessories.AutoRifle;
import part2.accessories.Flamethrower;
import part2.accessories.Laser;
import part2.accessories.RocketLauncher;
import part2.suits.Dec;
import part2.suits.Ora;
import part2.suits.Tor;

public class Main {

    public static void main(String[] Args) {

        Suit dec = new Dec();
        Suit ora = new Ora();
        Suit tor = new Tor();

        System.out.println("BASE PRICES");
        System.out.println("-----------");
        System.out.println(dec.getType() + ": " + dec.cost() + "k TL, " + dec.weight() + " kg");
        System.out.println(ora.getType() + ": " + ora.cost() + "k TL, " + ora.weight() + " kg");
        System.out.println(tor.getType() + ": " + tor.cost() + "k TL, " + tor.weight() + " kg");
        System.out.println("-------------------------\n");

        System.out.println("DEC WITH ACCESSORIES");
        System.out.println("--------------------");
        dec = new Flamethrower(dec);
        System.out.println(dec.getType() + ": " + dec.cost() + "k TL, " + dec.weight() + " kg");
        dec= new Flamethrower(dec);
        System.out.println(dec.getType() + ": " + dec.cost() + "k TL, " + dec.weight() + " kg");
        dec = new Laser(dec);
        System.out.println(dec.getType() + ": " + dec.cost() + "k TL, " + dec.weight() + " kg");
        dec = new Laser(dec);
        System.out.println(dec.getType() + ": " + dec.cost() + "k TL, " + dec.weight() + " kg");
        System.out.println("--------------------------------------------------------------------\n");

        System.out.println("TOR WITH ACCESSORIES");
        System.out.println("--------------------");
        tor = new Laser(tor);
        System.out.println(tor.getType() + ": " + tor.cost() + "k TL, " + tor.weight() + " kg");
        tor = new Laser(tor);
        System.out.println(tor.getType() + ": " + tor.cost() + "k TL, " + tor.weight() + " kg");
        tor = new Laser(tor);
        System.out.println(tor.getType() + ": " + tor.cost() + "k TL, " + tor.weight() + " kg");
        tor = new Laser(tor);
        System.out.println(tor.getType() + ": " + tor.cost() + "k TL, " + tor.weight() + " kg");
        System.out.println("--------------------------------------------------------------------\n");

        System.out.println("ORA WITH ACCESSORIES");
        System.out.println("--------------------");
        ora = new Flamethrower(ora);
        System.out.println(ora.getType() + ": " + ora.cost() + "k TL, " + ora.weight() + " kg");
        ora= new AutoRifle(ora);
        System.out.println(ora.getType() + ": " + ora.cost() + "k TL, " + ora.weight() + " kg");
        ora = new RocketLauncher(ora);
        System.out.println(ora.getType() + ": " + ora.cost() + "k TL, " + ora.weight() + " kg");
        ora = new Laser(ora);
        System.out.println(ora.getType() + ": " + ora.cost() + "k TL, " + ora.weight() + " kg");
        System.out.println("--------------------------------------------------------------------\n");




    }
}
