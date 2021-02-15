package practice1;

public class currencynotes {



    static int a[] = {1,2,5,50,100};
   /* public static int denomination(int amt) {
   int notes = 0; 
   for(int i=5; i >=0; i--) { 
       if((amt/a[i])!=0) {
           notes += amt/a[i];
           amt=amt%a[i];
           if(amt==0)
           return notes;
       }
   }
   return notes;
}*/
    public static void main(String []args){
       int amt = 104;
       int res = denominition(amt);
       System.out.println(res);
    }

static int denominition (int amt) {
   int notes = 0;
   

notes += amt/100;
amt %= 100;
notes += amt/50; 
amt %= 50;

notes += amt/5;
amt %= 5;

notes += amt/2;
amt %= 2;

notes += amt/1; 
amt %= 1;

return notes;
}

}
