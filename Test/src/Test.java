import java.util.Scanner;

public class Test {
     public static void main(String[] args) {
    	 	Scanner sc = new Scanner(System.in);
    	 	System.out.println("�ݾ��� ������ �ּ��� : ");
    	 	int money = sc.nextInt();
    	 	System.out.println("��ǰ�� ���� : ");
    	 	int price = sc.nextInt();
           Test getChange = new Test();
           getChange.getChange(money - price);
           
     }
     private void getChange(int money) {
           
           System.out.println("�ܵ�: " + money + "��");
           
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
           
           if(ocheon != 0 ) System.out.println("��õ�� : "+ocheon);
           if(cheon != 0 ) System.out.println("õ�� : "+cheon);
           if(obeak != 0 ) System.out.println("����� : "+obeak);
           if(beak != 0 ) System.out.println("��� : "+beak);
           if(five != 0 ) System.out.println("���ʿ� : "+ five);
           if(ten != 0 ) System.out.println("�ʿ� : "+ ten);
           if(money == 0 ) System.out.println("�Ž����� ����");
           
     }
}