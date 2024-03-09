import java.util.Scanner;
//cau 7
public class PhanSo {
    private Integer tu;
    private Integer mau;
    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu: ");
        tu = scanner.nextInt();
        System.out.println("Nhap mau: ");
        mau = scanner.nextInt();
    }
    public void Xuat(){
        System.out.println(tu + "/" + mau);
    }

    public Double TinhGiaTri(){
        return (double) tu / mau;
    }
}
