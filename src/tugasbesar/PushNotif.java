/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author User
 */
//subclass
public class PushNotif extends Notification {
        public void Tugas() {
            super.tugas();
        }
        public void Nim() {
            super.nim();
        }
        //Inheritance
        public void suara(){
            System.out.println("\nData Berhasil di Hapus");
        }
    }