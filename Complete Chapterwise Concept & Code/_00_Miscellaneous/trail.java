public class trail {
    public static void main(String args[]){
        int a = 5; //101
        int b = 6; //110
        System.out.println(a & b); //100 -> 4
        System.out.println(a | b); //111 -> 7
        System.out.println(a^b);   //011 -> 3(XOR operator: Even(1) : 0 & Odd(1): 1)
        
        
        //Doubt
        System.out.println(~a); //010 -> 2
    }
    
}
