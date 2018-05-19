
package ogroto;

import java.io.*;
public class ogretimgrvekle implements interface2 {
    static int count=0;
	public static void ögretmenkaydet(){
		System.out.println("OGRETİM ÜYESİ KAYIT");
		System.out.println("Ogretim üyesi adi(Lütfen Sadece Adını giriniz):"); 
		ogrtisim[count]=input.next();
		System.out.println("Ogretim üyesi Soyadi:");
		ogrtsoyad[count]=input.next();
		count++;
		System.out.println("KAYIT İŞLEMİ BASARILI\n");
	}
	public static void ogretmenlistele(){
		dosyasil();
		dosyaolustur();
		int k,j=1;
                int s=0;
		
		System.out.println("KAYITLI OLAN ÖGRETİM ÜYELERİ:");
		for(int m=0;m<10;m++){
			if(ogrtisim[m] != null || ogrtsoyad[m] != null){
		System.out.printf("%s\t%s\n",ogrtisim[m],ogrtsoyad[m]);
			}
			else{s++; continue;}
		} 	
		if(s == 10 ) System.out.println("KAYITLI ÖGRETİM ÜYESİ BULUNMAMAKTADIR.\nLütfen Ögretim Üyesi Kaydı Yapınız.\n");
                else{
			try{		
	        FileOutputStream f=new FileOutputStream("C:/Users/vitally/Desktop/ogretimuyelistesi.txt",true) ;
	        PrintStream dosyayayazdir=new PrintStream(f);
	    	for(k=0;k<ogrtisim.length;k++){
	    		if(ogrtisim[k] == null || ogrtsoyad[k] == null) continue;
	    		else{
	        dosyayayazdir.printf("%d)%s\t%s",j,ogrtisim[k],ogrtsoyad[k]);
	        dosyayayazdir.println();	j++;
	            } 
			  } System.out.println("Ögretim üyesi listesi ogretimuyelistesi.txt Dosyasina Taşınmıştır.\n");
		    } 
	      catch(IOException e){   
	    	  System.out.println("HATA OLUSTU");
	      }
	}
        }
        
	public static void dosyaolustur(){
	File DosyaOlustur = new File("C:/Users/vitally/Desktop/ogretimuyelistesi.txt");
    if(!DosyaOlustur.exists()) { 
        try {
            DosyaOlustur.createNewFile(); 
        } catch (IOException ex) {
            System.out.println("Dosya oluşturma Hatası(Dosya Yolunu Degistirin): " + ex);
        }
      }
	}
	
	public static void dosyasil(){
    File dosyaSil = new File("C:/Users/vitally/Desktop/ogretimuyelistesi.txt");
    try {
        if (dosyaSil.exists()) {
            dosyaSil.delete();
        }
    } catch (Exception e) {
    }
  }
	
}
