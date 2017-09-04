
/**
 * Ejercicios resuletos de codingBat- Recursion2.
 * 
 * @author Santiago Soto && Andres Sanchez 
 * @version 08/2017
 */
public class Recursion2
{
    //Recursion-2 > groupSum6 
    public boolean groupSum6(int start, int[] nums, int target) 
    {
        if(start>=nums.length) return target==0; //C1+C2
  
        if(nums[start]==6) //C3
            return groupSum6(start+1,nums,target-nums[start]); //C4+T(n-1)
  
        return groupSum6(start+1,nums,target-nums[start]) || groupSum6(start+1,nums,target); //T(n-1)+T(n-1)  
    }
    
    //Recursion-2 > groupNoAdj 
    public boolean groupNoAdj(int start, int[] nums, int target) 
    {
        if(start>=nums.length) return target==0;//C1+C2

        return groupNoAdj(start+2,nums,target-nums[start]) || groupNoAdj(start+1,nums,target);//T(n-1)+T(n-1)
    }
    
    //Recursion-2 > groupSumClump
    public boolean groupSumClump(int start, int[] nums, int target)
    {
        if (start>=nums.length) return target==0;//C1+C2

        int sum=nums[start];//C3+C4
        int cont=1;//C5
        for (int i=start+1;i<nums.length;i++)//C6*n
        {
            if (nums[i]==nums[start])//C7*n
            {
                sum+=nums[i];//C8*n
                cont++;//C9*n
            }
        }

        return groupSumClump(start + cont, nums, target - sum)|| groupSumClump(start + cont, nums, target);//T(n-1)+T(n-1)
    }
 
    //Recursion-2 > groupSum5 
    public boolean groupSum5(int start, int[] nums, int target) 
    {
        if(start>=nums.length) return target==0;//C1+C2
  
        if(nums[start]%5==0)//C3
        {
            if(start<nums.length-1 && nums[start+1]==1)//C4+C5
                return groupSum5(start+2,nums,target-nums[start]);//T(n-2)
    
            return groupSum5(start+1,nums,target-nums[start]);//T(n-1)
        }
        
        return groupSum5(start+1,nums,target-nums[start]) || groupSum5(start+1,nums,target);//T(n-1)+T(n-1) 
    }
    
    //Recursion-2 > splitArray 
    public boolean splitArray(int[] nums) 
    {
        return axuliar(0,nums,0,0);//C1
    }
    //Auxiliary method of splitArray 
    public boolean axuliar(int start, int[] nums, int sum1, int sum2)
    {
        if(start>=nums.length) return sum1==sum2;//C2+C3
  
        return axuliar(start+1,nums,sum1+nums[start],sum2) || axuliar(start+1,nums,sum1,sum2+nums[start]);//T(n-1)+T(n-1)
    }

}
