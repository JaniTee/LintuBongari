/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jt
 */
import java.util.Scanner;

public class Kayttoliittyma {

    private Scanner lukija;
    private Tietokanta tietokanta;

    public Kayttoliittyma(Scanner lukija, Tietokanta tietokanta) {
        this.lukija = lukija;
        this.tietokanta = tietokanta;
    }

    public void kaynnista() {
        while (true) {
            System.out.println("?");
            String komento = this.lukija.nextLine();
            
            if (komento.equals("Lopeta")) {
                break;
            }
            
            if (komento.equals("Lisaa")) {
                System.out.println("Nimi: ");
                String nimi = lukija.nextLine();
                System.out.println("Latinankielinen nimi: ");
                String latina = lukija.nextLine();
                this.tietokanta.lisaa(new Linnut(nimi, latina));
            } else if (komento.equals("Tilasto")) {
                this.tietokanta.tulosta();
            } else if (komento.equals("Havainto")) {
                System.out.println("Mikä havaittu?");
                String havaittuLintu = lukija.nextLine();
                for(int i = 0; i < this.tietokanta.tietokannanKoko(); i++) {
                    String nimi = this.tietokanta.haeKannasta(i).getNimi();
                    if(nimi.equals(havaittuLintu)) {
                        this.tietokanta.lisaaHavainto(tietokanta.haeKannasta(i));
                    }
                }
            } else if(komento.equals("Nayta")) {
                System.out.println("Mikä?");
                String naytettava = lukija.nextLine();
                for(int i = 0; i < this.tietokanta.tietokannanKoko(); i++) {
                    if(naytettava.equals(this.tietokanta.haeKannasta(i).getNimi())) {
                        System.out.println(this.tietokanta.haeKannasta(i));
                    }
                }
            }
            
        }

    }

}
