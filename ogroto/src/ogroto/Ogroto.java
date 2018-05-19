
package ogroto;
import java.util.Scanner;
public class Ogroto extends ögrenciisleri{

    public static void main(String[] args) {
       int secim=55,secim2=55,secim3=55;
		while(secim2 != 0){
		System.out.printf("Ögrenci Islemleri için ->1\nÖgretim Uyesi Islemleri için ->2"
				+ "\nÇıkış için->0'ı TUSLAYINIZ..");
		secim2=input.nextInt();
		switch(secim2){
		case 0: {
			System.out.println("UYGULAMA DURDURULDU.");
			break; }
		case 1: { int control1=1;
			while(true){ 
				
				System.out.println("\nÖgrenci Kaydetmek için ->1\nÖgrenci Silmek için ->2\n"
                                        + "Ögrenci Guncellemek icin ->3\nÖgrencileri Dosyada Görüntülemek için->4\n" 
						+"Not Eklemek için->5\nİstenen Öğrencinin Istenen Notunu Dosyada Görüntülemek için ->6\n"
						+ "İstenen Öğrencinin İstenen Dersinin Not Ortalamasını Görüntülemek icin->7"
						+ "\nCıkıs icin ->0'ı TUSLAYINIZ..");
				secim=input.nextInt(); 
			switch(secim){
			case 0: {System.out.println("ÖGRENCİ İSLEMLERİ DURDURULDU."); control1=0; break;} 
                            case 1: {
				Ogroto.ogrencikaydet(); 
				 break;
			}
                            case 2:{
				Ogroto.ogrencisil(); 
				 break;
			}
                            case 3:{
                                Ogroto.ogrenciguncelle();
                                        break;
                            }
                            case 4:{
				Ogroto.ogrencilistele();
				 break;
			}
                            case 5:{
				ögrencinot.ogral(); break;
			}
                            case 6:{
				notlistort.not(); break;
			}
                            case 7:{ 
                            notlistort.notort();
				break;
			}
                            default:{ System.out.println("Hatalı Deger Girdiniz."); break; }
			}
                            if(control1 == 0) {control1=1; break;}
                        }
                        break;
				}
		case 2:{ int control2=1; 
			while(true){
					System.out.println("\nÖgretim Görevlisi Eklemek için ->1\nÖgretim Görevlisine Ders Atama için->2\n"
					+ "Ögretim Görevlilerini Dosyada Görüntülemek için ->3\n"
					+ "Çıkış için->0'ı TUŞLAYINIZ..\n");
					secim3=input.nextInt(); 
			
			switch(secim3){
			case 0: {
				System.out.println("ÖGRETİM UYESİ İSLEMLERİ DURDURULDU."); control2=0;
				break; }
			case 1: {
				ogretimgrvekle.ögretmenkaydet(); break; 
			}
			case 2:{
				ogretimgrvdersata.dersata(); break;
			}
			case 3:{
				ogretimgrvekle.ogretmenlistele(); break;
			}
			default : {
				System.out.println("Hatalı Değer Girdiniz."); break;
			}
			}
                        if(control2 ==0 ){control2=1; break;}
		}
                        break;
		}
		default :{
			System.out.println("Hatalı Deger Girdiniz."); break; }
		}
		}
    }
    
}