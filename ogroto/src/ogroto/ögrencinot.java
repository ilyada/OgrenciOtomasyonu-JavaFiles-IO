
package ogroto ;

public class ögrencinot implements interface1{
    public static void ogral(){
		number[0]=0;
		int num;
		int s=0;
		int count=0;
		for(int n=1;n<=10;n++){
			number[n]=n; }
			System.out.println("Kayıtlı Ögrenci Listesi:");
		for(int m=0;m<10;m++){		
			if(ogrisim[m] != null || ogrno[m] != 0){ 
		    count++;
			System.out.printf("%d.Ogrenci ->%s\t%d\n",number[count],ogrisim[m],ogrno[m]);
			}
			else{s++; continue;}
		} 	
		if(s == 10) { System.out.println("KAYITLI ÖGRENCİ BULUNMAMAKTADIR.\nLütfen Ögrenci Kaydı Yapınız.\n");  }
		else {
		System.out.println("Kaçıncı Sıradaki Ögrenciye Not Girisi Yapmak Istediginizi Giriniz\n(Örnek Olarak:1.ögrenci için 1'i TUSLAYINIZ..):");
		num=input.nextInt();
		for(int k=1;k<=10;k++){ 
		if(num == number[k]){
		System.out.printf("Ders Listesi:\n");
		System.out.println("Fizik\nKimya\nMatematik");	
		notekle(number[k]); break;
		}
		else if(k == 10){System.out.println("Hatalı Sıra Girişi.\n(Örnek Olarak:5.Sıradaki ögrenci icin '5' seklinde giris yapınız.)\n"); 
		break; }
	  }	
   }
}
	public static void notekle(int num){
		int secim=50;
		
		System.out.println("Hangi Dersin Notunu Girmek istersiniz:");
		System.out.println("Fizik Dersine Not Girisi İçin ->1\nKimya Dersine Not Girisi İçin ->2\nMatematik Dersine Not Girisi İçin ->3\n"
				+ "Not Girisi Bölümünden Cıkmak için ->4 'i TUSLAYINIZ.");
		secim=input.nextInt();
		switch(secim){
		case 1: {
			System.out.printf("%d.Ögrencinin Fizik Dersi 1.Sınav notunu giriniz:",num);
			 fiziknotu[num][0]=input.nextInt(); System.out.println();
			 System.out.printf("%d.Ögrencinin Fizik Dersi 2.Sınav notunu giriniz:",num);
			 fiziknotu[num][1]=input.nextInt(); System.out.println();
			 System.out.println("Fizik Notu Girisi BASARILI");
			 break;
		}
		case 2:{
			System.out.printf("%d.Ögrencinin Kimya Dersi 1.Sınav notunu giriniz:",num);
			 kimyanotu[num][0]=input.nextInt(); System.out.println();
			 System.out.printf("%d.Ögrencinin ögrencinin Kimya Dersi 2.Sınav notunu giriniz:",num);
			 kimyanotu[num][1]=input.nextInt(); System.out.println();
			 System.out.println("Kimya Notu Girisi BASARILI");
			 break;
		}
		case 3:{
			 System.out.printf("%d.Ögrencinin Matematik Dersi 1.Sınav notunu giriniz:",num);
			 matematiknotu[num][0]=input.nextInt(); System.out.println();
			 System.out.printf("%d.Ögrencinin ögrencinin Matematik Dersi 2.Sınav notunu giriniz:",num);
			 matematiknotu[num][1]=input.nextInt(); System.out.println();
			 System.out.println("Matematik Notu Girisi BASARILI");
			 break;
		}
		case 4:{
			System.out.println("NOT GIRISI ISLEMI DURDURULDU.");
			break;
		}
		default : {
			System.out.println("HATALI DEGER GİRDİNİZ."); break; }
	 }
  }
}
