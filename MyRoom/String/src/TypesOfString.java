public class TypesOfString {
    public static void main(String[] args) {

        String brand = "Puma";
        System.out.println(brand);
        brand.concat(",Banglore");
        System.out.println(brand);

        brand = brand.concat(",Banglore");
        System.out.println(brand);

        StringBuilder brand1 = new StringBuilder("Nike");
        System.out.println(brand1);
        brand1.append(",Hydrabaad");
        System.out.println(brand1);
    }
}
