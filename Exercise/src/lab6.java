

public class lab6 {
    public static void main(String[] args) {
       /*  System.out.println("First 20 palindrome prime:");
        ArrayList<Integer>palind_prime=new ArrayList<>();
        int num=2;
        while (palind_prime.size()<20) { 
            if (isPalindrome(num)) {
                palind_prime.add(num);
            }
            num++;
        }
        System.out.println(palind_prime);
        System.out.println("First 20 emirp:");
        ArrayList<Integer>emirp=new ArrayList<>();
        int number=2;
        while (emirp.size()<20) { 
            if(isEmirp(number)){
                emirp.add(number);
            }
            number++;
        }
        System.out.println(emirp);
    }

    
    public static boolean isEmirp(int num){
        return isPrime(num)&& !isPalindromePrime(num)&& isPrime(reverse_num(num));
    }
    
    public static int reverse_num(int num){
        int reverse=0;
        while (num!=0) { 
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
       return reverse;
    }
    public static boolean isPalindromePrime(int num){
        return isPalindrome(num)&&isPrime(num);
    }

    public static boolean isPalindrome(int num){
        int reverse=0;
        int original=num;
        while (num!=0) { 
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        return reverse==original;
    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        else if(num==2){
            return true;
        }
        else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        } */


   
    }

}
