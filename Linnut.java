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

public class Linnut {
    private String lintu;
    private String latina;
    private int havainnot;
    
    public Linnut(String lintu, String latina) {
        this.lintu = lintu;
        this.latina = latina;
        this.havainnot = 0;
    }
    
    public void lisaaHavainto() {
        this.havainnot++;
    }
    
    public String getNimi() {
        return this.lintu;
    }
    
    public String getLatina() {
        return this.latina;
    }
    
    public String toString() {
        return lintu + " (" + latina + "):" + this.havainnot + " havaintoa";
    }
    
}
