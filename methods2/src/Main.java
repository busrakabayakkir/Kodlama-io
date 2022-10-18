public class Main {
    public static void main(String[] args) {
        String mesaj  = " mesaj ver";
        String yeniMesaj = mesaj.substring(2,4);
        System.out.println(yeniMesaj);
        int sayi = topla(17,15);
        System.out.println(sayi);
        int toplam = topla2(1,1,1,1,1);
        System.out.println(toplam);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){
        //veriable args üç nokta ile ifade edilir ve sınırsız sayıda değişken alabilir demek.Bir array gibi çalışıyor.
        int toplam =0;

        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}