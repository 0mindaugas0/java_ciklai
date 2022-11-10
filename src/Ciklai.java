public class Ciklai {
    public static void main(String[] args){


        int sk1 = 2;
        int sk2 = 4;
        int sk3 = 6;

        visiSkaiciaiDideja(sk1, sk3);
        visiSkaiciaiMazeja(sk3, sk1);


    }
    public static void visiSkaiciaiDideja (int pradzia, int pabaiga){
        for (int i = pradzia; i <= pabaiga; i ++){
            System.out.println(+ i);
        }
    }
    public static void visiSkaiciaiMazeja (int pabaiga, int pradzia){
        for (int i = pabaiga; i >= pradzia; i --){
            System.out.println(+ i);
        }
    }


}