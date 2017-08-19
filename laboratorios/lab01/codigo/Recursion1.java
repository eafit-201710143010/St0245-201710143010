
/**
 * Write a description of class Recursion1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursion1
{
    public int fibonacci(int n) {
        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    public int triangle(int rows) {
        if(rows<2){
            return rows;
        } else {
            return rows + triangle(rows-1);
        }
    }
    
    public int sumDigits(int n) {
        if(n<10){
            return n;
        }else{
            return sumDigits(n/10) + sumDigits(n%10);
        }
    }

    public int count7(int n) {
        if(n<10){
            if(n==7){
                return 1;
            } else {
                return 0;
            }
        } else {
            return count7(n/10) + count7(n%10);
        }
    }

    public int powerN(int base, int n) {
        if(n==0){
            return 1;
        }
        else if(n==1){
            return base;
        } else {
            return base * powerN(base, n-1);
        }
    }
}
