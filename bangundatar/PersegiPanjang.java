/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

import Interfaces.Simetri;
import Interfaces.Keliling;
/**
 *
 * @author HP 240 G8
 */
public class PersegiPanjang extends BangunDatar implements Keliling, Simetri{
    public int panjang;
    public int lebar;

    @Override
    public double hitungLuas(){
        return this.panjang * this.lebar;
    }
    
    @Override
    public double hitungKeliling(){
        return 2 * (this.panjang + this.lebar) ;
    }
    
    @Override
    public double hitungSimLipat(){
        return 2.0;
    }
    
    @Override
    public double hitungSimPutar(){
        return 2.0;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("luas = "+this.hitungLuas());
        System.out.println("keliling = "+this.hitungKeliling());
        System.out.println("sim. putar = "+this.hitungSimLipat());
        System.out.println("sim. lipat= "+this.hitungSimPutar());
    }
}

