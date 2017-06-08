package main;

public class SecventaMaxima {
    
    public static int secventaMaxima(int a[])
    {
        int lungime = a.length;
        int maximActual = Integer.MIN_VALUE;
        int maxim = 0;
 
        for (int i = 0; i < lungime; i++)
        {
            maxim = maxim + a[i];
            if (maximActual < maxim)
            {
                maximActual = maxim;
            }
            if (maxim < 0)
            {
                maxim = 0;
            }
        }
        
        return maximActual;
    }
    
    public static int[] secventaMaximaSir(int a[])
    {
        int lungime = a.length;
        int maximActual = Integer.MIN_VALUE;
        int maxim = 0;
        int [] sirMaxim = new int[lungime];
        
        for(int i=0; i<lungime; i++)
        {
            sirMaxim[i] = Integer.MIN_VALUE;
        }
        
        int indexMax = 0;
        int indexMin = 0;
        int contor = 0;
        for (int i = 0; i < lungime; i++)
        {
            maxim = maxim + a[i];
            contor++;
            if (maximActual < maxim)
            {
                maximActual = maxim;
                indexMax = i;
                indexMin = i - contor + 1;
            }
            if (maxim < 0)
            {
                maxim = 0;
                contor = 0;
            }
        }
        for(int i = indexMin; i<=indexMax; i++)
        {
            sirMaxim[i] = a[i];
        }
        
        return sirMaxim;
    }
}
