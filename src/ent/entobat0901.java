/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ent;

import DbConnection.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author SATYA
 */
public class entobat0901 {
    private String atKdObat0901 = "";
    public String atNmObat0901 = "";
    public String atSatuan0901 = "";
    public String atDosis0901 = "";
    public String atStok0901 = "";
    public String atHarga0901 = "";
    
     public void setKdObat0901(String pKdObat0901){
        this.atKdObat0901 = pKdObat0901;
    }
    
    public String getKdPlg(){
        return this.atKdObat0901;
    }
    
    public void cariObat0901(){
        String vSql =   "SELECT obat0901.KdObat0901, obat0901.NmObat0901, obat0901.Satuan0901, obat0901.Dosis0901, Obat0901.Stok0901, obat0901.Harga0901 " +
                        "FROM obat0901 " +
                        "WHERE obat0901.KdObat09011='"+ this.atKdObat0901 +"'";
        DbConnection db = new DbConnection();
        Connection con = db.koneksiDB();
        PreparedStatement stat = null;
        try{
            stat = con.prepareStatement(vSql);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                this.atKdObat0901=rs.getString("KdObat0901");
                this.atNmObat0901=rs.getString("NmObat0901");
                this.atSatuan0901=rs.getString("Satuan0901");
                this.atDosis0901=rs.getString("Dosis0901");  
                this.atStok0901=rs.getString("Stok0901");
                this.atHarga0901=rs.getString("Harga0901"); 
            }else{
                this.atNmObat0901 = "";
                this.atSatuan0901 = "";
                this.atDosis0901 = "";
                this.atStok0901 = "";
                this.atHarga0901 = "";
            }
                      
        } catch (SQLException e){
            System.out.println("error----->"+e.toString());
        } 
    }
    public void insert0901() {
       
        String vSql =   "INSERT INTO obat0901 " +
                        "(obat0901.KdObat0901, obat0901.NmObat0901, obat0901.Satuan0901, obat0901.Dosis0901, Obat0901.Stok0901, obat0901.Harga0901 " +
                        "VALUES ('"+ this.atKdObat0901 +"', '"+ this.atNmObat0901 +"', '"+ this.atSatuan0901 +"', '"+ this.atDosis0901 +"', '"+ this.atStok0901 +"', '"+ this.atHarga0901 +"')";
        DbConnection db = new DbConnection();
        Connection con = db.koneksiDB();
        PreparedStatement Stat = null;
        try{
            Stat = con.prepareStatement(vSql);           
            Stat.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error -> "+ex.toString());
        }
    }
    public void update0901() {
        String vSql =   "UPDATE obat0901 SET " +
                        "obat0901.NmObat0901='"+ this.atNmObat0901 +"', obat0901.Satuan0901='"+ this.atSatuan0901 +"', " +
                        "obat0901.Dosis0901='"+ this.atDosis0901 +"', obat0901.Stok0901='"+ this.atStok0901 +"', obat0901.Harga0901='"+ this.atHarga0901 +"' " +
                        "WHERE obat0901.KdObat0901='"+ this.atKdObat0901 +"'";
        DbConnection db = new DbConnection();
        Connection con = db.koneksiDB();
        PreparedStatement Stat = null;
        try{
            Stat = con.prepareStatement(vSql);                                                
            Stat.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error -> "+ex.toString());
        }
   }
    public void delete0901() {
        String vSql="DELETE FROM obat0901 WHERE obat0901.KdObat0901='"+this.atKdObat0901+"'";
        DbConnection db = new DbConnection();
         Connection con = db.koneksiDB();
         PreparedStatement Stat = null;
         try{
             Stat = con.prepareStatement(vSql);                                                
             Stat.executeUpdate();
         } catch (SQLException ex) {
             System.out.println("Error -> "+ex.toString());
         }
    }

    public static void main(String[] args){
        entobat0901 o = new entobat0901();
//        o.setKdObat0901("003");
//        o.delete();
        
//        o.setKdObat0901("003");
//        o.atNmObat0901="ABC";
//        o.atSatuan0901="baru";
//        o.atDosis1="63";
//        o.atStok0901="123";
//        o.atHarga0901="109993";
//        o.update();

//        o.setKdObat0901("002");
//        o.atNmObat0901="Bius";
//        o.atSatuan0901="lama";
//        o.atDosis0901="89";
//        o.atStok0901="133";
//        o.atHarga0901="103223";
//        o.insert0901();

//        o.setKdNama0901("002");
//        o.cariObat();
//        System.out.println("Kd Obat : "+o.getKdObat());
//        System.out.println("Nama Obat : "+o.atNmObat0901);
//        System.out.println("Satuan : "+o.atSatuan0901);
//        System.out.println("Dosis :"+o.atDosis0901);
//        System.out.println("Stok :"+o.atStok0901);
//        System.out.println("Harga :"+o.atHarga0901);
    }
}