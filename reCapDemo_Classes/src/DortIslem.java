public class DortIslem {

    public int Topla(int... sayilar){
        int toplam =0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public int Carpim(int... sayilar){
        int carpim =1;
        for(int sayi:sayilar){
            carpim= carpim*sayi;
        }
        return carpim;

    }
    public int Bolum(int sayi1, int sayi2){
       int bolum=sayi1/sayi2;

        return bolum;

    }
    public int Cikarma(int... sayilar){
        int cikarma =0;
        for(int sayi:sayilar){
            cikarma=sayi-cikarma;

        }
        return cikarma;

    }
}

