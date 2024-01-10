/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctr;


import ent.entobat0901;
import java.util.ArrayList;
/**
 *
 * @author SATYA
 */
public class ctrobat0901 {
    entobat0901 o = new entobat0901();
    
    public void setKdObat(String p){
        o.setKdObat0901(p);
        o.cariObat0901();
    }
    
    public ArrayList<String> getDataPelanggan(){
        ArrayList<String> vLst = new ArrayList<String>();
        vLst.add(o.getKdPlg());
        vLst.add(o.atNmObat0901);
        vLst.add(o.atSatuan0901);
        vLst.add(o.atDosis0901);
        vLst.add(o.atStok0901);
        vLst.add(o.atHarga0901);
        
        return vLst;
    }
    
    public void setDataPelanggan(ArrayList<String> p){
        o.setKdObat0901(p.get(0));
        o.atNmObat0901 = p.get(1);
        o.atSatuan0901 = p.get(2);
        o.atDosis0901 = p.get(3);
        o.atStok0901 = p.get(4);
        o.atHarga0901 = p.get(4);
    }
    
    public void simpan(){
        o.insert0901();
    }
    
    public void edit(){
        o.update0901();
    }
    
    public void hapus(){
        o.delete0901();
    }

}
