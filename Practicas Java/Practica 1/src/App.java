public class App {
    public static void main(String[] args) throws Exception {
        int n1 = 1;
        int suma = 0;
        while ((n1 != 5 || n1 % 10 != 5) && n1 <=100){
            suma = suma + n1;
            n1++;
        }
        System.out.println(suma);
    }
}