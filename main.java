package newpackage;
/**
 *
 * @author alexthebest9483
 */
import java.util.Random;
public class main
{
    public static void main(String[] args) 
    {
        short d [] = new short [11];
        int k = 0;
        for (short i = 24; i >= 4; i-=2)
        {
                d[k] = i;
                k++;
        }
        float min = -10;
        float max = 6;
        Random random = new Random();
        float x[] = new float[17];
        for (int i = 0; i < 17; i++)
        {
            x[i] = min + random.nextFloat() * (max-min);
        }
        double d1[][] =  new double [11][17];
        for (int i = 0; i < 11; ++i)
            for (int j = 0; j < 17; ++j)
            {
                if (d1[i][j] ==  6)
                    d1[i][j] = Math.pow((4*(2/3+Math.sin(Math.pow(x[j],1/3)))),3);
                else if (d[i] == 8 || d[i] == 10 || d[i] == 14 || d[i] == 20 || d[i] == 24)
                    d1[i][j] = 3/(Math.cos(Math.sin(x[j])));
                else 
                    d1[i][j] = 0.5 * (0.25 + Math.sin(x[j])*(Math.pow(x[j], 3)-4));
                System.out.printf ("%.2f %n", d1[i][j]);
            }
    } 
}
