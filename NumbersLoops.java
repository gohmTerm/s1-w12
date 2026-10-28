public class NumbersLoops{
    public NumbersLoops(){
      int index = 0;
      while(index < 11){
        System.out.println(index);
        index++;
      }

      for(int index2 = 0; index2 < 11;index2++){
        System.out.println(index2);
      }
    }
  
    public int digitSum(int num){
      int sum = 0;
      for(int index = 0; index <= num; index++){
        sum = sum + index;
      }
      return sum;
    }
  


    public int reverseNum(int num){
      int newNum = 0;
      int digit = 0;
      int addingthing = 1;
      while(num != 0){
        if (digit == 0){
          newNum = num % 10;
        } else{
          for(int dig = 0; dig != digit; dig++){
            addingthing = addingthing*10;
          }
          newNum = newNum + (num % 10)*addingthing;
        } 
        num = num/10;
        digit++;
        addingthing = 1;
      }
      return newNum;
    }
    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    public int palindromeCount(int start, int finish){
      int index = 0;
      for(; start <= finish;){
        if(start ++ == reverseNum(start))
          ++index;
        
      }
      return index;
    }
  
  
  }
