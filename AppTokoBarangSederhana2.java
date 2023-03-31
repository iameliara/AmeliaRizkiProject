
package finalprojectbp.apptokobarangsederhana2;

import java.util.Date;
import java.util.Scanner;


public class AppTokoBarangSederhana2  {

    //searching
    static int mCari(String[] Data, int[] Harga, String cari) {
        int indexKetemu = Data.length;
        boolean ketemu = false;
        
        for (int i = 0; i < Data.length; i++) {
            if (Data[i].equals(cari)){
                ketemu = true;
                System.out.println("Data Ditemukan");
                System.out.println(Data[i] + " Rp " + Harga[i]);
                indexKetemu = i;
            }
        }
        
        if (ketemu == false){
            System.out.println("Data Tidak Ditemukan");
        }
        
        return indexKetemu;
    }
    
    static String[] tambahDataString(String[] Data, String dataBaru) {
        String hasil[] = new String[data.length + 1];
      
        for (int i = 0; i < Data.length; i++) {
            hasil[i] = Data[i];
        }

        hasil[data.length] = dataBaru;

        return hasil;
        
    }
    
    static int[] tambahDataInt(int[] Data, int dataBaru) {
        int hasil[] = new int[Data.length + 1];
      
        for (int i = 0; i < Data.length; i++) {
            hasil[i] = Data[i];
        }

        hasil[data.length] = dataBaru;

        return hasil;
    }
    
    static String[] hapusData(String[] Data, int indexHapus) {
        String hasil[] = new String[Data.length - 1];
        
        for (int i = 0, indexBaru = 0; i < Data.length; i++) {
            if(indexHapus != i){
              hasil[indexBaru++] = Data[i];
            }
        }

        return hasil;
    }
    
    static int[] hapusHarga(int[] harga, int indexHapus) {
         int hasil[] = new int[Harga.length - 1];
        
        for (int i = 0, indexBaru = 0; i < Harga.length; i++) {
            if(indexHapus != i){
               hasil[indexBaru++] = Harga[i];
            }
        }

        return hasil;
    }

    //sorting
    static void sortingTerlaris(String[] Data, int[] Harga, int[]  terlaris){
        int tempInt;
        String tempString;
        for (int i = 0; i < Data.length - 1; i++) {
            if(terlaris[i] < terlaris[i+1]){
                tempInt = terlaris[i];
                terlaris[i] = terlaris[i+1];
                terlaris[i+1] = tempInt;
                tempInt = Harga[i];
                Harga[i] = Harga[i+1];
                Harga[i+1] = tempInt;
                tempString = Data[i];
                Data[i] = Data[i+1];
                Data[i+1] = tempString;
            }
        }
        for (int i = 0; i < Data.length; i++) {
            System.out.println((i+1) + ". " + Data[i] + " Rp " + Harga[i] + " terjual " + terlaris[i] + "x");
        }
    }
    

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int User=0, Pilih, GrandTotal = 0;
    int indexKetemu ;
    int terlaris[] = {0, 0, 0, 0, 0};
    String laporan[] = {};
    String cari = "",
               dataBaru;
    int pilihMode = 1, 
            pilihMenu = 1,
            jumlah = 0, 
            totalBayar = 0, 
            UangYangDibayarkan=0, 
            Kembalian=0,
            hargaBaru = 0;
    //array untuk data master
    String Data[]={"Sabun,Tepung,Beras,Galon"};
    int Harga[] = {2500,9000,12000,19000};
    int total=0;
    int idx=0;
   
   
  
    
    do{
        System.out.println("=============USER=============");
        System.out.println("1. Kasir");
        System.out.println("2. Admin");
        System.out.println("3. Owner");
        System.out.println("4. Exit");
        System.out.println("Pilih = ");
        User = sc.nextInt();
        if(User==1){
            do{
                System.out.println("======================USER KASIR=========================");
                System.out.println("\n---------Selamat Datang di Toko Sederhana---------");
                System.out.println("       Kepuasan Anda Adalah Tanggung Jawab Kami");
                System.out.println("    Toko Sederhana Menyediakan Berbagai Macam Sembako");
                System.out.println("=========================================================");
                System.out.println("\n1. Daftar Produk Toko Sederhana");
                System.out.println("2. Cari Produk ");
                System.out.println("3. Selesai ");
                System.out.println("Pilih = ");
                PilihA = sc.nextInt();
                switch(PilihA){
                    case 1 :
                        System.out.println("\n======================DAFTAR PRODUK===============");
                        System.out.println("No. \tNama Produk\t\tHarga");
                        for (int i = 0; i < jumlah; i++){
                            System.out.println((i+1)+"." + "\t" + Data[i] + "\t" + Harga[i]);
                        }
                        System.out.println("Pilih = ");
                        int pilih = sc.nextInt();
                        System.out.println("Jumlah = ");
                        porsi[idx] = sc.nextInt();
                       System.out.println("");
                                System.out.println("Total Bayar : " + totalBayar);
                                while(UangYangDibayarkan < totalBayar) {
                                    System.out.print("Masukkan uang pembeli : ");
                                    UangYangDibayarkan = insert.nextInt();
                                    if(UangYangDibayarkan < totalBayar){
                                        System.out.println("Uang Pembeli Kurang");
                                    } else {
                                        Kembalian= UangYangDibayarkan - totalBayar;
                                        
                                        if(Kembalian > 0){
                                            System.out.println("Kembalian anda Rp " + Kembalian);
                                        }
                                        laporan = tambahDataString(laporan, "Total Bayar Rp " + totalBayar +  " Uang Pembeli Rp " + uangPembeli);
                                        System.out.println("Terimakasih");
                                        totalBayar = 0;
                        break;
                    case 2 :
                        cari = ""; 
                        while(!"q".equals(cari)){
                        System.out.println("");
                        System.out.println("Ketik 'q' untuk keluar");
                        System.out.print("Cari barang : ");
                        cari = sc.next();
                        if(!"q".equals(cari)){
                        System.out.println("");
                        indexKetemu = mCari(Data, Harga, cari);
                        if(indexKetemu < Data.length){
                        System.out.print("Masukkan jumlah beli : ");
                        jumlah = sc.nextInt();
                        totalBayar = Harga[indexKetemu]*jumlah ;
                        terlaris[indexKetemu] = jumlah;
                        System.out.println("Data berhasil ditambahkan");
                         System.out.println("");
                                        }
                                    }
                                }
                        break;
                    case 3 :
                        System.out.println("\n\t            Selamat Datang di Toko Sederhana            ");
                        System.out.println("           Kepuasan Anda Adalah Tanggung Jawab Kami         ");
                        System.out.println("                       Daftar Pesanan                       ");
                        System.out.println("============================================================");
                        System.out.println("No.\tDaftar Barang\t\tHarga\t\tPorsi\tTotal");
                        for (int i = 0; i < idx; i++){
                            System.out.println((i+1)+"."+"\t"+data[i]+"\t"+harga[i]+"\t"+"\t"+porsi[i]+"\tRp"+porsi[i]*harga[i]);
                        }
                            System.out.println("========================================================");
                            System.out.println("\t"+"\t"+"\t"+"t"+"\t"+"Total     : Rp."+GrandTotal);
                            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"Pembayaran : Rp");
                            UangYangDibayarkan=sc.nextInt();
                            Kembalian = UangYangDibayarkan - GrandTotal;
                            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"Kembalian : Rp"+Kembalian);
                            laporan = tambahDataString(laporan, "Total Bayar Rp " + GrandTotal +  " Uang Pembeli Rp " + UangYangDibayarkan);
                                        System.out.println("Terimakasih");
                                        GrandTotal = 0;
                                        
                            System.out.println("\n-------------------Terima Kasih------------------------");
                            System.out.println("                 Selamat Datang Kembali                  ");
                        break;
                        }
            }while(PilihA!=3);
        }else if (User==2){
                    do{
                        System.out.println("=============================USER ADMIN====================");
                        System.out.println("1. Tambah Produk");
                        System.out.println("2. Hapus Produk");
                        System.out.println("3. Selesai");
                        System.out.println("Pilih = ");
                        PilihB = sc.nextInt();
                            switch(PilihB){
                                case 1 :
                                    for (int i = 0; i < data.length; i++) {
                                System.out.println((i + 1) + ". " + Data[i] + " Rp " + Harga[i]);
                            }
                                    System.out.println("Masukkan Nama Produk Baru");
                                    String produk = sc.next();
                                    System.out.println("Masukkan Harga Produk Baru");
                                    int biaya = sc.nextInt();
                                    Data = tambahDataString(Data, produk);
                                    Harga = tambahDataInt(Harga, biaya);
                                    terlaris = tambahDataInt(terlaris, 0);
                                    System.out.println("No.\tDaftar Barang\t\tHarga");
                                    System.out.println("================Penambahan Sukses==========");
                                    jumlah++;
                                    break;
                                case 2 :
                                //hapus produk
                                    System.out.println("Masukkan Nama Produk Yang Akan Dihapus");
                                    String databaru = sc.next();
                                    System.out.println("");
                                    indexKetemu = mCari(Data, Harga, databaru);
                                        if(indexKetemu < Data.length){
                                        Data = hapusData(Data, indexKetemu);
                                        Harga = hapusHarga(Harga, indexKetemu);
                                        }
                                        System.out.println("====================Penghapusan Sukses============");
                                        jumlah--;
                                        break;
                    
                                    
                            
                            }
                    }while(PilihB!=3);
        }else if (User==3){
            do{
                System.out.println("===============================USER OWNER=========================");
                System.out.println("1. Laporan Pembelian");
                System.out.println("2. Menu Paling Laris");
                System.out.println("3. Selesai");
                System.out.println("Pilih = ");
                PilihC = sc.nextInt();
                switch(PilihC){
                    case 1 :
                        //rekap pembelian
                        Date date = new Date();
                        System.out.println("===========REKAP PEMBELIAN TOKO SEDERHANA=========");
                        System.out.println("No. \t.Tangga\t\t\t\tProduk\t\tHarga\tJumlah\tTotal");
                         if (laporan.length > 0) {
                                    for (int i = 0; i < laporan.length; i++) {
                                        System.out.println((i+1) + ". " + laporan[i]);
                                    }System.out.println("----------------------------------------------");
                        System.out.println("Total Penjualan = "+ GrandTotal);
                        System.out.println("--------------------------------------------------------");
                                } else {
                                    System.out.println("Laporan masih kosong");
                }
                        
                        break;
                    case 2 :
                        //5 produk terlaris
                        System.out.println("Daftar Produk Terlaris : ");
                        sortingTerlaris(Data, Harga, terlaris);
                               
                        break;
                    case 3 :
                        System.out.println("Anda Berhasil Keluar Dari User Owner");
                        break;
                }
            }while(PilihC!=3);
        }
    }while(User!=4);
    System.out.println("Terimakasih");
}
}
            
                        
                                 
                            
                    
                                        
                                       
                        
                    
                        
                        
                        
                        
                        
                       
                        
                        
                
   

