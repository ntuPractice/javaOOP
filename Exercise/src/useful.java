




public class useful {
    public static void main(String[] args) {
        //Median
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the size of the array:");
        // int size=sc.nextInt();

        // int[]array=new int[size];
        // for(int i=0;i<size;i++){
        //     System.out.println("Enter element of the array:");
        //     array[i]=sc.nextInt();
        // }

        // //sort the array
        // Arrays.sort(array);
        // double median;
        // if(array.length%2!=0){
        //     median=array[size/2];
        // }else{
        //     median=(array[size/2]+(array[(size/2)-1]))/2.0;
        // }
        // System.out.println("Median:"+median);
        
        

        //power and sqaure root
        // double base=5.0;
        // double exponent=2.0;
        // System.out.println("5 power of 2 is:"+Math.pow(base, exponent));
        // System.out.println("Sqaure root of 24 is:"+Math.sqrt(24.0));
        


        //sum of two matrix
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };
        
        int[][] sum=new int[firstMatrix.length][firstMatrix[0].length];
        for(int i=0;i<firstMatrix.length;i++){
            for(int j=0;j<firstMatrix[0].length;j++){
                sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
            }
        }

        System.out.println("Sum of two matrices is:");
        for(int[] row:sum){
            for(int column:row){
                System.out.print(column+"  ");
            }
            System.out.println();
        }

    //----------------------------------------------------------------------//
    
    /* Flow control set Lab Test */
    // int row=5;
    // for(int i=1;i<=row;i++){
    //     //print the space
    //     for (int j = 1; j <=row-i; j++) {
    //         System.out.print(" ");
    //     }

    //     for(int k=i;k>=1;k--){
    //         System.out.print(k);
    //     }

    //     for(int l=2;l<=i;l++){
    //         System.out.print(l);
    //     }
    //     System.out.println();
    // }

    

    //Reverse Integer
/*     Scanner scanner=new Scanner(System.in);
    System.out.println("Enter an integer:");
    int num=scanner.nextInt();
    int reverse_integer=0;
    boolean is_negative=false;
    if(num<0){
        is_negative=true;
    }
    num=Math.abs(num);
    while (num!=0) { 
        int digit=num%10;
        reverse_integer=reverse_integer*10+digit;
        num/=10;
    }

    if(is_negative){
        reverse_integer=-1*reverse_integer;
    }
    System.out.println("Reversed integer:"+reverse_integer); */






    //STRONG NUMBER
/*     Scanner sc=new Scanner(System.in);
    System.out.println("Enter strong number:");
    boolean is_Strong;
    int strong=sc.nextInt();
    int ori_strong=strong;
    int total_sum=0;
    while (strong!=0) { 
        int total=1;
        int digit=strong%10;
        for(int i=1;i<=digit;i++){
            total=total*i;
        }
        total_sum+=total;
        strong=strong/10;
    }
    if(total_sum==ori_strong){
        System.out.println("Is strong number");
    }else{
        System.out.println("Not a strong number");
    } */

    //PASSWORD
    
    // Scanner scanner=new Scanner(System.in);
    // System.out.println("Enter a string:");
    // String password=scanner.nextLine();
    // boolean hasLowerCase=false;
    // boolean hasUpperCase=false;
    // boolean hasDigit=false;
    // boolean hasSpecialChar=false;
    // String special_Char="!@#$%^&*()_+";
    // String strength;
    // for(char c:password.toCharArray()){
    //     if(Character.isUpperCase(c)){
    //         hasUpperCase=true;
    //     }
    //     if(Character.isLowerCase(c)){
    //         hasLowerCase=true;
    //     }
    //     if(Character.isDigit(c)){
    //         hasDigit=true;
    //     }
    //     if(special_Char.contains(String.valueOf(c))){
    //         hasSpecialChar=true;
    //     }
    // }
    // if(password.length()>=8 && hasLowerCase&&hasUpperCase&& hasDigit &&hasSpecialChar){
    //     strength="Strong";
    // }else if(password.length()>=6 &&hasLowerCase&&hasUpperCase&&hasSpecialChar){
    //     strength="Moderate";
    // }else{
    //     strength="Weak";
    // }
    // System.out.println("Strength of password:"+strength);

    
    }
}
