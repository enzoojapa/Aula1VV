public class Primos {
   public static boolean isPrime(int i){
         if(i <= 1) {
            return false;
         }
         for (int j = 2; j < i; j++){
            if (i % j == 0){
                return false;
            }
         }
        return true;
   }

   public static void main(String[] args){
       int numero = 7;
       if(isPrime(numero)){
           System.out.println("O número é Primo");
       } else {
           System.out.println("O número não é Primo!");
       }
   }
    
}