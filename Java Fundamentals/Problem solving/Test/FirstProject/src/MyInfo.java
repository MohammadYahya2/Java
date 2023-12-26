public class MyInfo {
    public static void main(String[] args) {
        String myString = "Hello";
        int hashCode = System.identityHashCode(myString);
        String addressString = Integer.toHexString(hashCode);
        System.out.println(addressString);
    }
}
