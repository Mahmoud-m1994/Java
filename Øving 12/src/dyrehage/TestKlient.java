package dyrehage;

public class TestKlient {
        public static void main(String[] args){


            SkandinaviskeRovdyr skandinaviskeRovdyr=new Hunnindivid("Hulk",2019,2018,"Trondheim","Hanndyr",false,"hund","Dog","DOGS",1);

            System.out.println(skandinaviskeRovdyr.getAlder());
            System.out.println(skandinaviskeRovdyr.getFdato());
            System.out.println(skandinaviskeRovdyr.skrivUtInfo());

            skandinaviskeRovdyr.flytt("Kristiansand");

            Rovdyrfabrikk fabrikken=new Rovdyrfabrikk();
            SkandinaviskeRovdyr o= fabrikken.nyHannbjoern("Bjørn", 2016, 2011, "South Africa");
            fabrikken.nyBinne("Bjørninne", 2010, 2000, "Trondheim",4);
            fabrikken.nyUlvehann("Ulven", 2017, 2007, "Russland");

            System.out.println("Bjørn som er laget via fabrikken:\n"+o.toString());

            // tester utvide metoder
            System.out.println(skandinaviskeRovdyr.getAntKull());
            skandinaviskeRovdyr.leggTilKull(3);
            skandinaviskeRovdyr.leggTilNyttKull();
            System.out.println("Svaret  er : "+skandinaviskeRovdyr.getAntKull());
        }
}
