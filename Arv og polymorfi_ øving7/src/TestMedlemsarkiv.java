import java.time.LocalDate;

class TestMedlemsarkiv {
    public static void main(String[] args){
        Personalia ole = new Personalia("Olsen", "Ole", "ole.olsen@dot.com", "ole");
        Personalia tove = new Personalia("Hansen", "Tove", "tove.hansen@dot.com", "tove");
        Personalia moha = new Personalia("Jan", "Mohammad", "tove.hansen@dot.com", "moha");
        Personalia anna = new Personalia("Nana", "Anna", "tove.hansen@dot.com", "anna");
        LocalDate testdato = LocalDate.of(2000,3,10);
        LocalDate testdato2 = LocalDate.of(2011, 2, 10);
        LocalDate testdato3 = LocalDate.of(2001, 2, 10);
        //LocalDate idag = LocalDate.of(2006,3,10);
        //LocalDate idag2 = LocalDate.of(2000,10,1);
        System.out.println("Tester");


        Medlemsarkiv arkivet= new Medlemsarkiv();
        int a=arkivet.nyMedlem(ole,testdato);
        int b=arkivet.nyMedlem(tove,testdato);
        int c=arkivet.nyMedlem(moha,testdato);
        int d=arkivet.nyMedlem(anna,testdato);
        System.out.println(a);

        arkivet.registrerPoeng(a,26000);
        arkivet.registrerPoeng(b,100000);
        arkivet.registrerPoeng(c,10000);
        arkivet.registrerPoeng(d,25001);
        System.out.println(arkivet.registrerPoeng(a,300));



        System.out.println(arkivet.toString());


        arkivet.sjekkMedlemmer(testdato2);

        System.out.println("Etter sjekking: \n");
        System.out.println(arkivet.toString());

        System.out.println("Etter sjekking2222: \n");
        arkivet.sjekkMedlemmer(testdato3);
        System.out.println(arkivet.toString());
    }
}

