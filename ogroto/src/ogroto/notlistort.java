
package ogroto;
import java.io.*;
public class notlistort implements interface1{
    public static void not(){
		int num;
		int s=0;
		int count=0;
		System.out.println("Kayıtlı Ögrenci Listesi:");
		for(int m=0;m<10;m++){		
			if(ogrisim[m] != null || ogrno[m] != 0){  count++;
			
			System.out.printf("%d.Ogrenci ->%s\t%d\n",number[count],ogrisim[m],ogrno[m]);
			}
			else{s++; continue;}
		} 	
		if(s == 10 ) System.out.println("KAYITLI ÖGRENCİ BULUNMAMAKTADIR.\nLütfen Ögrenci Kaydı Yapınız.\n"); 
		else {
		System.out.println("Kaçıncı Sıradaki Ögrencinin Notlarını Listelemek Istersiniz\n(Örnek Olarak:1.ögrenci için 1'i,2.ögrenci icin 2'yi TUSLAYINIZ..):");
		num=input.nextInt();
		for(int k=1;k<=10;k++){ 
		if(num == number[k]){
			notlist(number[k]);
		break;
		}
		else if(k == 10){System.out.println("Hatalı Sıra Girişi.\n(Örnek Olarak:5.Sıradaki ögrenci icin '5' seklinde giris yapınız.)\n"); 
		break; }
			}	
		}
	}
	
	public static void notlist(int num){
		System.out.printf("%d.Ogrencinin Hangi Ders Notlarını Listelemek Istersiniz:\n",num);
		System.out.println("Fizik Notları icin ->1\nKimya Notları icin ->2\nMatematik Notları icin ->3\nCıkıs icin ->4'u TUSLAYINIZ..");
		int secim1=input.nextInt();
		switch(secim1){
		case 1: {
                      int k,j=1,s=0;
                       dosyasil();
                       dosyaolustur();
			System.out.println("Secilen Ögrencinin Fizik Notları:");
			System.out.printf("Fizik 1.Sınav Notu:%d",fiziknotu[num][0]); System.out.println();
			System.out.printf("Fizik 2.Sınav Notu:%d",fiziknotu[num][1]); System.out.println();
                          try{
                            FileOutputStream f=new FileOutputStream("C:/Users/vitally/Desktop/ogrencinotlari.txt",true) ;
                            PrintStream dosyayayazdir=new PrintStream(f);
                                
	    			dosyayayazdir.printf("%d)%d.Ogrencinin Fizik 1.Sınav Notu:%d\n",j,num,fiziknotu[num][0]);
	    			dosyayayazdir.println(); j++;	
                                dosyayayazdir.printf("%d)%d.Ogrencinin Fizik 2.Sınav Notu:%d\n",j,num,fiziknotu[num][1]);
                                 }catch(IOException e){   
	    	           System.out.println("HATA OLUSTU");
                            } 
			   System.out.printf("%d.Ogrencinin Fizik Notları ogrencinotlari.txt Dosyasina Taşınmıştır.\n",num);			                      
                        break;
		}
		case 2:
                {
                    int k,j=1,s=0;
                       dosyasil();
                       dosyaolustur();
			System.out.println("Secilen Ögrencinin Kimya Notları:");
			System.out.printf("Kimya 1.Sınav Notu:%d",kimyanotu[num][0]); System.out.println();
			System.out.printf("Kimya 2.Sınav Notu:%d",kimyanotu[num][1]); System.out.println(); 
                          try{
                            FileOutputStream f=new FileOutputStream("C:/Users/vitally/Desktop/ogrencinotlari.txt",true) ;
                            PrintStream dosyayayazdir=new PrintStream(f);
                                
	    			dosyayayazdir.printf("%d)%d.Ogrencinin Kimya 1.Sınav Notu:%d\n",j,num,kimyanotu[num][0]);
	    			dosyayayazdir.println(); j++;	
                                dosyayayazdir.printf("%d)%d.Ogrencinin Kimya 2.Sınav Notu:%d\n",j,num,kimyanotu[num][1]);
                                 }catch(IOException e){   
	    	           System.out.println("HATA OLUSTU");
                            } 
			   System.out.printf("%d.Ogrencinin Kimya Notları ogrencinotlari.txt Dosyasina Taşınmıştır.\n",num);     
                break;
		}
		case 3:{
                       int k,j=1,s=0;
                       dosyasil();
                       dosyaolustur();
			System.out.println("Secilen Ögrencinin Matematik Notları:");
			System.out.printf("Matematik 1.Sınav Notu:%d",matematiknotu[num][0]); System.out.println();
			System.out.printf("Matematik 2.Sınav Notu:%d",matematiknotu[num][1]); System.out.println(); 
                          try{
                            FileOutputStream f=new FileOutputStream("C:/Users/vitally/Desktop/ogrencinotlari.txt",true) ;
                            PrintStream dosyayayazdir=new PrintStream(f);
                                dosyayayazdir.println();
	    			dosyayayazdir.printf("%d)%d.Ogrencinin Matematik 1.Sınav Notu:%d",j,num,matematiknotu[num][0]);
	    			dosyayayazdir.println(); j++;	
                                dosyayayazdir.printf("%d)%d.Ogrencinin Matematik 2.Sınav Notu:%d",j,num,matematiknotu[num][1]);
                                
                                 }catch(IOException e){   
	    	           System.out.println("HATA OLUSTU");
                            } 
			   System.out.printf("%d.Ogrencinin Matematik Notları ogrencinotlari.txt Dosyasina Taşınmıştır.\n",num);
                           break;
		}
		case 4:{
			System.out.println("NOT LISTELEME DURDURULDU");
			break;
		}
		default : {
			System.out.println("Hatalı Deger Girdiniz."); break;
		}
		
		}	
	}         
        public static void notort(){
		int num;
		int s=0;
		int count=0;
		System.out.println("Kayıtlı Ögrenci Listesi:");
		for(int m=0;m<10;m++){		
			if(ogrisim[m] != null || ogrno[m] != 0){  count++;
			
			System.out.printf("%d.Ogrenci ->%s\t%d\n",number[count],ogrisim[m],ogrno[m]);
			}
			else{s++; continue;}
		} 	
		if(s == 10 ) System.out.println("KAYITLI ÖGRENCİ BULUNMAMAKTADIR.\nLütfen Ögrenci Kaydı Yapınız.\n"); 
		else {
		System.out.println("Kaçıncı Sıradaki Ögrencinin Not Ortalamasını Hesaplamak Istersiniz\n(Örnek Olarak:1.ögrenci için 1'i,2.ögrenci icin 2'yi TUSLAYINIZ..):");
		num=input.nextInt();
		for(int k=1;k<=10;k++){ 
		if(num == number[k]){
			ortlist(number[k]);
		break;
		}
		else if(k == 10){System.out.println("Hatalı Sıra Girişi.\n(Örnek Olarak:5.Sıradaki ögrenci icin '5' seklinde giris yapınız.)\n"); 
		break; }
			}	
		}
	}
        
        public static double orthesapla(int not1,int not2){
            return (double)(not1+not2)/2;
        }
        
        public static void ortlist(int num){
		System.out.printf("%d.Ogrencinin Hangi Ders Notlarının Ortalamasını Hesaplamak Istersiniz:\n",num);
		System.out.println("Fizik Notları icin ->1\nKimya Notları icin ->2\nMatematik Notları icin ->3\nCıkıs icin ->4'u TUSLAYINIZ..");
		int secim1=input.nextInt();
		switch(secim1){
		case 1: {
                      int k,j=1,s=0;
                       dosyasil();
                       dosyaolustur();
			System.out.printf("Secilen Ögrencinin Fizik Notu Ortalaması:%f",orthesapla(fiziknotu[num][0],fiziknotu[num][1]));
                          try{
                            FileOutputStream f=new FileOutputStream("C:/Users/vitally/Desktop/ogrencinotortalaması.txt",true) ;
                            PrintStream dosyayayazdir=new PrintStream(f);
                                dosyayayazdir.println();
	    			dosyayayazdir.printf("%d)%d.Ogrencinin Secilen Ögrencinin Fizik Notu Ortalaması:%f",j,num,orthesapla(fiziknotu[num][0],fiziknotu[num][1]));
	    			dosyayayazdir.println(); j++;	
                               
                                 }catch(IOException e){   
	    	           System.out.println("HATA OLUSTU");
                            } 
			   System.out.printf("\n%d.Ogrencinin Fizik Notları Ortalaması ogrencinotortalaması.txt Dosyasina Taşınmıştır.\n",num);			                      
                        break;
		}
		case 2:
                {
                      int k,j=1,s=0;
                       dosyasil();
                       dosyaolustur();
			System.out.printf("Secilen Ögrencinin Kimya Notu Ortalaması:%f",orthesapla(kimyanotu[num][0],kimyanotu[num][1]));
                          try{
                            FileOutputStream f=new FileOutputStream("C:/Users/vitally/Desktop/ogrencinotortalaması.txt",true) ;
                            PrintStream dosyayayazdir=new PrintStream(f);
                                dosyayayazdir.println();
	    			dosyayayazdir.printf("%d)%d.Ogrencinin Secilen Ögrencinin Kimya Notu Ortalaması:%f",j,num,orthesapla(kimyanotu[num][0],kimyanotu[num][1]));
	    			dosyayayazdir.println(); j++;	
                               
                                 }catch(IOException e){   
	    	           System.out.println("HATA OLUSTU");
                            } 
			   System.out.printf("\n%d.Ogrencinin Kimya Notları Ortalaması ogrencinotortalaması.txt Dosyasina Taşınmıştır.\n",num);			                      
                        break;
                }
		case 3:{
                           int k,j=1,s=0;
                       dosyasil();
                       dosyaolustur();
			System.out.printf("Secilen Ögrencinin Matematik Notu Ortalaması:%f",orthesapla(matematiknotu[num][0],matematiknotu[num][1]));
                          try{
                            FileOutputStream f=new FileOutputStream("C:/Users/vitally/Desktop/ogrencinotortalaması.txt",true) ;
                            PrintStream dosyayayazdir=new PrintStream(f);
                                dosyayayazdir.println();
	    			dosyayayazdir.printf("%d)%d.Ogrencinin Secilen Ögrencinin Matematik Notu Ortalaması:%f",j,num,orthesapla(matematiknotu[num][0],matematiknotu[num][1]));
	    			dosyayayazdir.println(); j++;	
                               
                                 }catch(IOException e){   
	    	           System.out.println("HATA OLUSTU");
                            } 
			   System.out.printf("\n%d.Ogrencinin Matematik Notları Ortalaması ogrencinotortalaması.txt Dosyasina Taşınmıştır.\n",num);			                      
                        break;
                }
		case 4:{
			System.out.println("NOT LISTELEME DURDURULDU");
			break;
		}
		default : {
			System.out.println("Hatalı Deger Girdiniz."); break;
		}
		
		}	
	}
  
        
        	public static void dosyaolustur(){
	File DosyaOlustur = new File("C:/Users/vitally/Desktop/ogrencinotlari.txt");
    if(!DosyaOlustur.exists()) { 
        try {
            DosyaOlustur.createNewFile(); 
        } catch (IOException ex) {
            System.out.println("Dosya oluşturma Hatası(Dosya Yolunu Degistirin) : " + ex);
        }
      }
	}

	public static void dosyasil(){
	    File dosya = new File("C:/Users/vitally/Desktop/ogrencinotlari.txt");
	    try {
	        if (dosya.exists()) {
	            dosya.delete();
	        }
            }catch (Exception e) { 
	    	}
        }
}
		
