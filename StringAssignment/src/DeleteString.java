public class DeleteString {
    public static void main(String[] args) {

        String s1 = "Hello have a good day";

        System.out.println(s1.replaceAll("[BCDFGHJKLMNPQRSTVXZbcdfghjklmnpqrstvxz]", ""));
    }
}
