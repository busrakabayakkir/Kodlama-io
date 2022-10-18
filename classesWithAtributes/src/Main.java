public class Main {
    public static void main(String[] args) {
       Product product = new Product() ;
       product.set_name("LAPTOP");
       product.setId(1);
       product.set_price(2000);
       product.set_description("delllaptop");
       product.set_stockAmount(5);

       ProductManager productManager = new ProductManager();
       productManager.Add(product);
        System.out.println(product.getKod());
    }
}