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
public class WindowsPhone extends Handphone {
        private String wpKeyStore;
        public WindowsPhone (String man,String os,String model,int harga, String wpKeyStore){
        super(man,os,model,harga);
        this.wpKeyStore = wpKeyStore;
    } 
        
    
   public String getWpKeyStore(){
          return wpKeyStore;
    }
   public void setPinBB(){
       this.wpKeyStore = wpKeyStore;
   }
   
  //methode
}
