
package ogroto;
import java.io.*;
public class ögrenciisleri implements interface1 {
    static int i=0;
	public static void ogrencikaydet  (){
		System.out.println("OGRENCİ KAYIT");
		System.out.println("Ogrenci adi(Lütfen Sadece Adını giriniz):"); 
		ogrisim[i]=input.next();
		System.out.println("Ogrenci no:");
		ogrno[i]=input.nextInt();
		i++;
		
		System.out.println("KAYIT İŞLEMİ BASARILI\n");

		}
        public static void ogrenciguncelle(){
                        int s=0;      
                        System.out.println("OGRENCI GUNCELLEME");
                        System.out.println("Kayıtlı Ögrenci Listesi:");
		for(int m=0;m<10;m++){		
			if(ogrisim[m] != null || ogrno[m] != 0){ 
			System.out.printf("%s\t%d\n",ogrisim[m],ogrno[m]);
			}
                        else s++; 
		} 	
		if(s == 10 ) System.out.println("KAYITLI ÖGRENCİ BULUNMAMAKTADIR.\nLütfen Ögrenci Kaydı Yapınız.\n"); 
		else { int count3=0;
			System.out.println("Guncellemek Istediginiz Ögrencinin Numarasını giriniz:");
			int guncelle=input.nextInt();
			for(int l=0;l<ogrno.length;l++){
				if(ogrno[l] == guncelle){
					System.out.println("Guncel ismi giriniz:");
                                        ogrisim[l]=input.next();
                                        System.out.println("Guncel Ogrenci Numarasini giriniz");
					ogrno[l]=input.nextInt(); count3--;
				}
				else if(ogrno[l] !=guncelle) count3++;
			}
                        if(count3 == ogrno.length) System.out.println("Ogrenci Numarası Bulunamadı.");
                        else 
                        System.out.println("GUNCELLEME İŞLEMİ BASARILI\n");
                
        }
        }
	public static void ogrencisil(){
		int s=0;
                
			System.out.println("OGRENCİ SİLME");
                        System.out.println("Kayıtlı Ögrenci Listesi:");
		for(int m=0;m<10;m++){		
			if(ogrisim[m] != null || ogrno[m] != 0){ 
			System.out.printf("%s\t%d\n",ogrisim[m],ogrno[m]);
			}
                        else s++; 
		} 	
		if(s == 10 ) System.out.println("KAYITLI ÖGRENCİ BULUNMAMAKTADIR.\nLütfen Ögrenci Kaydı Yapınız.\n"); 
		else { int count2=0;
			System.out.println("Silinecek Ögrencinin Numarasını giriniz:");
			int sil=input.nextInt();
			for(int l=0;l<ogrno.length;l++){
				if(ogrno[l] == sil){
					ogrisim[l]=null;
					ogrno[l]=0; count2--;
				}
				  else if(ogrno[l] !=sil) count2++;
			}
                        if(count2 == ogrno.length) System.out.println("Ogrenci Numarası Bulunamadı.");
                        else 
                        System.out.println("SİLME İŞLEMİ BASARILI\n");
                }
		
			      
		       
	}

	public static void ogrencilistele(){
		int k,j=1,s=0;
		dosyasil();
		dosyaolustur();
                          System.out.println("Kayıtlı Ögrenci Listesi:");
		for(int m=0;m<10;m++){		
			if(ogrisim[m] != null || ogrno[m] != 0){ 
			System.out.printf("%s\t%d\n",ogrisim[m],ogrno[m]);
			}
                        else s++; 
		} 	
		if(s == 10 ) System.out.println("KAYITLI ÖGRENCİ BULUNMAMAKTADIR.");
                else{
		try{	     
			 FileOutputStream f=new FileOutputStream("C:/Users/vitally/Desktop/ogrencilistesi.txt",true) ;
		        PrintStream dosyayayazdir=new PrintStream(f);
	    	for(k=0;k<ogrisim.length;k++){
	    		if(ogrisim[k] == null || ogrno[k] == 0) continue;
	    		else{
	    			dosyayayazdir.printf("%d)%s%10d",j,ogrisim[k],ogrno[k]);
	    			dosyayayazdir.println();	j++;
	            } 
			  } System.out.println("Ögrenci listesi ogrencilistesi.txt Dosyasina Taşınmıştır.\n");
			  
		    } 
	      catch(IOException e){   
	    	  System.out.println("HATA OLUSTU");
	      }
	}
        }
	//BUNLAR OLMADI TEKRAR BAK..
	public static void dosyaolustur(){
	File DosyaOlustur = new File("C:/Users/vitally/Desktop/ogrencilistesi.txt");
    if(!DosyaOlustur.exists()) { 
        try {
            DosyaOlustur.createNewFile(); 
        } catch (IOException ex) {
            System.out.println("Dosya oluşturma Hatası(Dosya Yolunu Degistirin):" + ex);
        }
      }
	}
	public static void dosyasil(){
	    File dosya = new File("C:/Users/vitally/Desktop/ogrencilistesi.txt");
	    try {
	        if (dosya.exists()) {
	            dosya.delete();
	        }
            }
	   catch (Exception e) { 
	    	}
        }
}
