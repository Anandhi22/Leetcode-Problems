class Solution 
{
    public int findComplement(int num)
    {
        int number = (int)(Math.log(num)/Math.log(2))+1;;
        return ((1 << number)-1) ^ num;
     
    }
}