import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//cau 7
public class MangPhanSo {
    private List<PhanSo> arr;
    public void Nhap(){
        arr = new ArrayList<>();
        System.out.printf("Nhap so luong phan so: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan so thu " + (i + 1) + ": ");
            PhanSo phanSo = new PhanSo();
            phanSo.Nhap();
            arr.add(phanSo);
        }
    }
    public void TimMax(){
        PhanSo max = arr.get(0);
        for (PhanSo phanSo : arr) {
            if (phanSo.TinhGiaTri() < max.TinhGiaTri()){
                max = phanSo;
            }
        }
        System.out.println("Phan so lon nhat la: ");
        max.Xuat();
    }
    public void TimMin(){
        PhanSo min = arr.get(0);
        for (PhanSo phanSo : arr) {
            if (phanSo.TinhGiaTri() > min.TinhGiaTri()){
                min = phanSo;
            }
        }
        System.out.println("Phan so nho nhat la: ");
        min.Xuat();
    }
    public void Xuat(){
        for (PhanSo phanSo : arr) {
            phanSo.Xuat();
        }
    }

}
