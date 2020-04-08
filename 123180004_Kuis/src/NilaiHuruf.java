/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ASUS
 */
public class NilaiHuruf {
    public String Huruf(float hasilratarata){
        if (hasilratarata>=80 && hasilratarata <=100)return "A";
        else if (hasilratarata>=75 && hasilratarata < 80) return "B+";
        else if (hasilratarata>=65 && hasilratarata < 75) return "B";
        else if (hasilratarata>=60 && hasilratarata < 65) return "C+";
        else if (hasilratarata>=50 && hasilratarata < 60) return "C";
        else if (hasilratarata>=20 && hasilratarata < 50) return "D";
        else if (hasilratarata>=0 && hasilratarata < 20) return "E";
        else return "Error";
    }
}
