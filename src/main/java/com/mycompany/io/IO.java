/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.io;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
/**
 *
 * @author fadhi
 */
public class IO {

    static void writeNote(String fileName,String writeContent){
        try(FileWriter myWrite = new FileWriter(fileName);){
          myWrite.write(writeContent);
          System.out.println("Berhasil menulis file");
        }catch(Exception e){
            System.out.println("Kesalahan saat menulis catatan");
        }
    }
    
    static void readNote(String fileName){
       File file = new File(fileName);
       try(Scanner scanner = new Scanner(file)){
        while (scanner.hasNextLine()) {
        String data = scanner.nextLine();
        System.out.println(data);
      }
       }catch(Exception e){
          System.out.println("Kesalahan saat membaca catatan");
       }
    }
    
    public static void main(String[] args) {
       try(Scanner scanner = new Scanner(System.in);){
          boolean isNext = false;
          do{
           if(isNext){

           } 
           if(!isNext){
             isNext = true;
           }
           System.out.println("+========================+");
           System.out.println("| Jelajahi catatan Anda! |");
           System.out.println("+========================+");
           System.out.println("1.Tulis catatan baru");
           System.out.println("2.Baca catatan");
           System.out.println("3.Keluar");
           System.out.print("Pilihan anda : ");
           int option = scanner.nextInt();
           scanner.nextLine();
           switch(option){
              case 1 : {
                String fileName,writeContent;
                  System.out.print("Nama file :");
                  fileName = scanner.nextLine();
                  System.out.print("Apa isinya :");
                  writeContent = scanner.nextLine();
                  writeNote(fileName,writeContent);
                  break;
              }    
                 
              case 2: {
                 System.out.print("Nama filenya :");
                 String fileName = scanner.nextLine();
                 readNote(fileName);
                 break;
                }
              case 3:    
              default: 
                 isNext = false;
                 break;
           }
          }while(isNext);
          System.out.println("Selesai");
          
       }catch(Exception e){
          System.out.println("Error saat menjalankan operasi");
       }
    }
}