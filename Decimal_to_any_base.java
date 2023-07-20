import java.util.Scanner;

public class Decimal_to_any_base{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int base = sc.nextInt();
        String result="";
        while(numb>0){

            if(numb==1){
                result+="1";
            }
            else {
                result += String.valueOf(numb % base);
            }
            numb/=base;
        }


        String rrr="";
        for (int i=0; i<result.length(); i++)
        {
            char ch= result.charAt(i);
            rrr= ch+rrr;
        }
        int rnum=Integer.parseInt(rrr);
        System.out.println(rnum);
    }
}


