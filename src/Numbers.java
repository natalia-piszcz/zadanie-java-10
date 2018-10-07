//Napisz program, który wyświetli na ekranie liczby z przedziału [0, 3] ze zmianą co 0.1,

public class Numbers {
    public static void main(String[] args) {
        double i = 0;

        while (i<3){
            System.out.print(i +", ");
            i = i+ 0.1;
        }
    }
}

