/**
 * La clase Array2 contiene 5 ejercicios resueltos de la pagina
 * codingbat-Array-2.
 * 
 * @author Santiago Soto Marulanda, Andrés Sanchez Castrillón, Jamerson Correa Correa. 
 * @version 2017/09/09
 */
public class Array2
{
    //no14
    public boolean no14(int[] nums) {
        int unos = 0; //c1
        int cuatros = 0; //c2
        for(int i = 0;i <= nums.length - 1;i++){ //c3 + c4*n
            if(nums[i] == 1 ){ // c5*n
                unos++; //c6*n
            }
            if(nums[i] == 4){ //c6*n
                cuatros++; //c7*n
            }

            if(unos > 0 && cuatros > 0){ //(c8 + c9)*n
                return false; //c10*n
            }
        }  
        return true; //c11
    }

    //isEverywhere
    public boolean isEverywhere(int[] nums, int val) {
        boolean esta = true; //c1
        for (int i = 0; i <nums.length-1;i++) //c2 + c3*n
        {
            if ( nums[i] == val || nums[i+1] == val){ //(c4 + c5)*n

            }
            else{ 
                esta=false; //c6*n
            }
        }
        return esta; //c7
    }

    //either24
    public boolean either24(int[] nums) {
        boolean dos = false; //c1
        boolean cuatro = false;//c2
        for(int i = 0;i < nums.length-1;i++){ //c3 + c4*n
            if(nums[i] == 2 && nums[i+1] == 2){ //(c5 + c6)*n
                dos = true; //c7*n
            }
            if(nums[i] == 4 && nums[i+1] == 4){ //(c7 + c8)
                cuatro = true; // c9*n
            }
            if(dos == true && cuatro == true){ //(c10 + c11)*n
                return false; //c12*n
            }
        }
        return dos || cuatro; //c13 + c14
    }

    //has77
    public boolean has77(int[] nums) {
        for(int i = 0;i < nums.length - 1; i++){ //c1 + c2*n
            if(nums[i] == 7 && nums[i+1] == 7){ //(c3 + c4)*n
                return true; //c5*n
            }
            if(i<nums.length-2 && nums[i] == 7 && nums[i+2] == 7){ //(c6 + c7 +c8)*n
                return true; //c9*n
            }
        }
        return false; //c10*n
    }

    //only14
    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++){ //c1 + c2*n
            if (nums[i] != 1 && nums[i] != 4) { //(c3 + c4)*n 
                return false; //c5*n
            }
        }
        return true; // c6
    }

}
