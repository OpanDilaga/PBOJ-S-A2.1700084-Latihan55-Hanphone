/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan55;

/**
 *
 * @author acer
 * Nama     : Opan Dilaga
 * NIM      : A2.1700084
 * Kelas    : TI IV E J&S
 */
public class Android extends Handphone {
    private String keyStore;
    public Android (String man,String os,String model,int harga, String keyStore){
        super(man,os,model,harga);
        this.keyStore = keyStore;
    }

    public String getKeyStore(){
        return keyStore;
    }
    
    public void setKeyStore(String keyStore){
        this.keyStore = keyStore;
    }
 
    //methode
   
}
