package main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       
        int [] a = {6, -9, 8, -4, 6, 12, 9 , -7};
        System.out.println("Secventa de suma maxima este: " + SecventaMaxima.secventaMaxima(a));
        
        System.out.println("Sirul este: " + Arrays.toString(SecventaMaxima.secventaMaximaSir(a)));

    }
    
}
