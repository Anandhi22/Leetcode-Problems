class Solution {
    public String reverseOnlyLetters(String s) 
    {
       
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j)
        {
              if(((int)ch[i]>=65 && (int)ch[i]<=90) 
                    || ((int)ch[i]>=97 && (int)ch[i]<=122))
               {
              if (((int)ch[j]>=65 && (int)ch[j]<=90) 
                    ||((int)ch[j]>=97 && (int)ch[j]<=122))
                   {
                       char temp = ch[i];
                       ch[i] = ch[j];
                       ch[j]= temp;
                       i++;
                       j--;
                   }
                else j--;
               }
            else i++;
        }
        return new String(ch);
    }
}