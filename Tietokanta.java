/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jt
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Tietokanta {

    private ArrayList<Linnut> tietokanta;

    public Tietokanta(ArrayList tietokanta) {
        this.tietokanta = tietokanta;
    }

    public void lisaa(Linnut lintu) {
        tietokanta.add(lintu);
    }

    public void lisaaHavainto(Linnut lintu) {
        lintu.lisaaHavainto();
    }

    public void tulosta() {
        for (int i = 0; i < tietokanta.size(); i++) {
            System.out.println(tietokanta.get(i));
        }
    }

    public int tietokannanKoko() {
        return this.tietokanta.size();
    }

    public Linnut haeKannasta(int i) {
        return this.tietokanta.get(i);
    }

}
