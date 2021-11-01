package ro.fasttrackit.curs7.homework;

public class ProductMain {
    public static void main(String[] args) {
        Product product=new Product("mar","1,05",100,true);
        String category={"fructe", "dulciuri", "mezeluri"};
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());
        System.out.println(product.getCategory());
        System.out.println(product.hasStock());
        System.out.println(product.isCategory((String-> category)));
    }
}
