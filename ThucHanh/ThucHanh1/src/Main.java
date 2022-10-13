import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bộ phân giải phương trình tuyến tính:  ");
        System.out.println("Hãy viết phương trình 'a*x+b=0', please nhập hằng số vào đây ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Hãy nhập a= ");
        double a = sc.nextDouble();

        System.out.print("Hãy nhập b= ");
        double b = sc.nextDouble();

        System.out.print("Hãy nhập c= ");
        double c = sc.nextDouble();

        if(a !=0){
            double truongHop = -b/a;
            System.out.printf("nghiệm của phương trình là: %f!",truongHop);
        }else{
            if(b==0){
                System.out.print("phuong trinh vo so nghiem");
            }else {
                System.out.println("phuong trinh khong co nghiem");
            }
        }
    }
}