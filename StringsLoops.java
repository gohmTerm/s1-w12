public class StringsLoops{
    public StringsLoops(){
  
    }
  
    public int length(String s){
      return 0;
    }
  
    public String copy(String s, int num){
      String Result = "";
      while (num != 0){
        Result = Result + s;
        num = num - 1;
      }
      return Result;
    }
  
    public String interweaving(String s1, String s2){
      String result = "";
      for(int i = 0; i == i + 1 ; i = 10 ){
        result = result + s1.substring(i,i+1)+s2.substring(i,i+1);
      }
      return "";
    }
  
  
  }