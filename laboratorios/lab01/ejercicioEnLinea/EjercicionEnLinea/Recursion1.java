
/**
 * Ejercicios resuletos de codingBat- Recursion2.
 * 
 * @author Santiago Soto && Andres Sanchez 
 * @version 08/2017
 */
public class Recursion1
{
    //Recurción-1 > fibonacci
    public int fibonacci(int n) 
    {
        if(n<=1){ //c1
            return n; //c2
        }else { //c1
            return fibonacci(n-1) + fibonacci(n-2); //t(n-1) + t(n-2)
        }
    }
    
    //Recurción-1 > triangle
    public int triangle(int rows) 
    {
        if(rows<2){ //c1
            return rows; //c2
        } else { //c1
            return rows + triangle(rows-1); //c3 + t(n-1)
        }
    }
    
    //Recurción-1 > bunnyEars2
    public int bunnyEars2(int bunnies)
    {
        if (bunnies == 0){ //c1
            return 0; //c2
        } else if (bunnies % 2 == 1){ //c1 + c2
            return 2 + bunnyEars2(bunnies - 1); //c3 + t(n-1)
        } else { //c1 + c2
            return 3 + bunnyEars2(bunnies - 1); //c4 + t(n-1)
        }
    }

    //Recurción-1 > noX
    public String noX(String str) 
    {
        if (str.length()==0){ //c1
            return ""; //c2
        } else if(str.charAt(0)=='x'){ //c1 + c2
            return noX(str.substring(1)); // t(n-1)
        } else { //c1 + c2
            return str.charAt(0) + noX(str.substring(1)); //c3 + t(n-1)
        }
    }

    //Recurción-1 > powerN
    public int powerN(int base, int n) {
        if(n==0){ //c1
            return 1; //c2
        }
        else if(n==1){ //c1 +c2
            return base; //c4
        } else { //c1 + c2
            return base * powerN(base, n-1); //c5 + t(n-1)
        }
    }
}
