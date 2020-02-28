class Bank{
   
   private int accountNum;
   private String name;
   
   public static final int DEFAULT_ACCOUNT_NUM = 0;
   
   //Constructor
   public Bank(int accountNum, String name){
      this.accountNum = accountNum;
      this.name = name;
   }
   //Constructor
   public Bank(String name){
      this(DEFAULT_ACCOUNT_NUM, name);
         
   }      
}