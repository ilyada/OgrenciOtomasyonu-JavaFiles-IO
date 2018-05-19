
package ogroto;
import java.io.*;
public class ogretimgrvdersata implements interface2 {
    public static void dersata(){
		int s=0;
		System.out.println("DERSLER:\nFizik\nKimya\nMatematik\n");
		System.out.println("KAYITLI OLAN ÖGRETİM ÜYELERİ:");
		for(int m=0;m<10;m++){
			if(ogrtisim[m] != null || ogrtsoyad[m] != null){
		System.out.printf("%s\t%s\n",ogrtisim[m],ogrtsoyad[m]);
			}
			else{s++; continue;}
		} 	
		if(s == 10 ) System.out.println("KAYITLI ÖGRETİM ÜYESİ BULUNMAMAKTADIR.\nLütfen Ögretim Üyesi Kaydı Yapınız.\n");
		else
		derssecimi();
	}

	public static void derssecimi(){
		int secim=55;
		while(secim != 0){
			System.out.println("Fizik Dersine Atama İçin ->1\nKimya Dersine Atama İçin ->2\nMatematik Dersine Atama İçin ->3\n"
					+ "Ders Atama Bölümünden Cıkmak için ->0 'i TUSLAYINIZ.");
		System.out.println("Hangi Derse Atama Yapmak İstersiniz?");
		secim=input.nextInt();
		switch(secim){
		case 1:
			System.out.println("Fizik Dersine atanacak ögretim üyesinin Adını giriniz(Lütfen Sadece Adını giriniz):");
			String fizikisim=new String(input.next());
			System.out.printf("Fizik Dersine atanacak %s'nin Soyadını giriniz:",fizikisim);
			String fiziksoyad=new String(input.next());
			for(int t=0;t<ogrtisim.length;t++){
				if(!ogrtisim[t].equalsIgnoreCase(fizikisim) || !ogrtsoyad[t].equalsIgnoreCase(fiziksoyad)){
					continue;
				}
				else{ dosyayaata(fizikisim,fiziksoyad,"Fizik"); break; } }
			break;
		case 2: int cont2=0;
			System.out.println("Kimya Dersine atanacak ögretim üyesinin Adını giriniz(Lütfen Sadece Adını giriniz):");
			String kimyaisim=new String(input.next());
			System.out.printf("Kimya Dersine atanacak %s'nin Soyadını giriniz:",kimyaisim);
			String kimyasoyad=new String(input.next());
			for(int t=0;t<ogrtisim.length;t++){
				if(!ogrtisim[t].equalsIgnoreCase(kimyaisim) || !ogrtsoyad[t].equalsIgnoreCase(kimyasoyad)){
					continue;
				}
				else{ dosyayaata(kimyaisim,kimyasoyad,"Kimya"); break; } }
                        
			break;	
		case 3:
			System.out.println("Matematik Dersine atanacak ögretim üyesinin Adını giriniz(Lütfen Sadece Adını giriniz):");
			String matematikisim=new String(input.next());
			System.out.printf("Matematik Dersine atanacak %s'nin Soyadını giriniz:",matematikisim);
			String matematiksoyad=new String(input.next());
			for(int t=0;t<ogrtisim.length;t++){
				if(!ogrtisim[t].equalsIgnoreCase(matematikisim) || !ogrtsoyad[t].equalsIgnoreCase(matematiksoyad)){
					continue;
				}
				else{ dosyayaata(matematikisim,matematiksoyad,"Matematik"); break; } }
			break;
		case 0:
			System.out.println("DERS ATAMA ISLEMI DURDURULDU.");
			break;
		default:
			System.out.println("HATALI DEGER GİRDİNİZ."); break;
		} 
	}
	}
	
	public static void dosyayaata(String ogrtisim1,String ogrtsoyad2,String ders){
		dosyasil();
		dosyaolustur();
               
			try{		
	        FileOutputStream f=new FileOutputStream("C:/Users/vitally/Desktop/ogretimuyedersatama.txt",true) ;
	        PrintStream dosyayayazdir=new PrintStream(f);
	    	
	        dosyayayazdir.printf("%s\t%s -> %s",ogrtisim1,ogrtsoyad2,ders);
	        dosyayayazdir.println();	
	          
			 System.out.println("Ögretim üyesi ders listesi ogretimuyedersatama.txt Dosyasina Taşınmıştır.\n");
		    } catch(IOException e){   
	    	  System.out.println("HATA OLUSTU");
	      }
	}
        
	public static void dosyaolustur(){
		File DosyaOlustur = new File("C:/Users/vitally/Desktop/ogretimuyedersatama.txt");
	    if(!DosyaOlustur.exists()) { 
	        try {
	            DosyaOlustur.createNewFile(); 
	        } catch (IOException ex) {
	            System.out.println("Dosya oluşturma Hatası(Dosya Yolunu Degistirin) : " + ex);
	        }
	      }
		}
	
	public static void dosyasil(){
	    File dosyaSil = new File("C:/Users/vitally/Desktop/ogretimuyedersatama.txt");
	    try {
	        if (dosyaSil.exists()) {
	            dosyaSil.delete();
	        }
	    } catch (Exception e) {
	    }
	  }
}
