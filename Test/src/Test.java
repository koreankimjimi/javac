import java.util.Scanner;

public class Test {
     public static void main(String[] args) {
    	 	Scanner sc = new Scanner(System.in);
    	 	System.out.println("금액을 지불해 주세요 : ");
    	 	int money = sc.nextInt();
    	 	System.out.println("상품의 가격 : ");
    	 	int price = sc.nextInt();
           Test getChange = new Test();
           getChange.getChange(money - price);
           
     }
     private void getChange(int money) {
           
           System.out.println("잔돈: " + money + "원");
           
           int ocheon = 0;
           int cheon = 0;
           int obeak = 0;
           int beak = 0;
           int five = 0;
           int ten = 0;
           
           ocheon = money / 5000;
           cheon = money % 5000 / 1000;
           obeak = money % 5000 % 1000 / 500;
           beak = money % 5000 % 1000 % 500 / 100;
           five = money % 5000 % 1000 % 500 % 100 / 50 ;
           ten = money % 5000 % 1000 % 500 % 100 % 50 / 10 ;
           
           if(ocheon != 0 ) System.out.println("오천원 : "+ocheon);
           if(cheon != 0 ) System.out.println("천원 : "+cheon);
           if(obeak != 0 ) System.out.println("오백원 : "+obeak);
           if(beak != 0 ) System.out.println("백원 : "+beak);
           if(five != 0 ) System.out.println("오십원 : "+ five);
           if(ten != 0 ) System.out.println("십원 : "+ ten);
           if(money == 0 ) System.out.println("거스름돈 없음");
           
     }
}