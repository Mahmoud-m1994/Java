import java.util.Arrays;

class Main {
    public static void main(String[] args){
        String [] navnene= {"Jan","Ali", "Tomas", "OLE"};
        Tribune[] tribunene=new Tribune[4];
        tribunene[0] =new Staa("Staa plasser",300,50);
        tribunene[1] =new Staa("Staa plasser B",100,50);
        Sitte sitte = new Sitte("Sitte A",200, 100, 20);
        VIP vip =new VIP("VIP",20,400,2);
        Billett[] staaBillettene= tribunene[0].kjøpBilletter1(10);
        Billett[] staaBillettene1= tribunene[1].kjøpBilletter2(navnene);
        Billett[] sitteBillettene= sitte.kjøpBilletter1(2);
        Billett[] vipBillettene= vip.kjøpBilletter2(navnene);
        for(int i=0;i<staaBillettene.length;i++){
            System.out.println(staaBillettene[i]);
        }
        for(int i=0;i<staaBillettene1.length;i++){
            System.out.println(staaBillettene1[i]);
        }

        for(int i=0;i<sitteBillettene.length;i++){
            System.out.println(sitteBillettene[i].toString());
        }


		for(int i=0;i<vipBillettene.length;i++){
			System.out.println(vipBillettene[i]);
		}
		System.out.println("Ikke sortert:\n");
		for(int i=0;i<tribunene.length;i++){
			System.out.println(tribunene[i].toString());
		}
		Arrays.sort(tribunene, new Sortbypris());
		System.out.println("sortert:\n");
		for(int i=0;i<tribunene.length;i++){
			System.out.println(tribunene[i].toString());
		}
    }
}

