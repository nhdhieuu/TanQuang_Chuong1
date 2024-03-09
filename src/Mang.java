import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//cau 5,8
public class Mang {
    private  List<Integer> arr;
    public void Nhap(){
        arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            Integer temp = scanner.nextInt();
            arr.add(temp);
        }
    }
    public  void Xuat(){
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
    public Double TrungBinh(){
        Double sum = 0.0;
        for (Integer integer : arr) {
            sum += integer;
        }
        return sum / arr.size();
    }
    public Integer TimMax(){
        Integer max = arr.get(0);
        for (Integer integer : arr) {
            if (integer > max){
                max = integer;
            }
        }
        return max;
    }
    public Integer TimMin(){
        Integer min = arr.get(0);
        for (Integer integer : arr) {
            if (integer < min){
                min = integer;
            }
        }
        return min;
    }
    public void XuatNguoc(){
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
    public void SapXepTang(){
        List<Integer> temp = new ArrayList<>();
        temp = arr;
        temp.sort(Integer::compareTo);
        for (Integer integer : temp) {
            System.out.print(integer + " ");
        }
    }
    public void SapXepGiam(){
        arr.sort((o1, o2) -> o2 - o1);
    }
    public void Them(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can them: ");
        Integer temp = scanner.nextInt();
        arr.add(temp);
    }
    public void Xoa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa: ");
        Integer temp = scanner.nextInt();
        arr.remove(temp);
    }
    public void Sua(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vi tri can sua: ");
        Integer index = scanner.nextInt();
        System.out.println("Nhap gia tri moi: ");
        Integer temp = scanner.nextInt();
        arr.set(index, temp);
    }

    public void TimKiemSoGanTrungBinh(){
        Double trungBinh = TrungBinh();
        Integer min = arr.get(0);
        for (Integer integer : arr) {
            if (Math.abs(integer - trungBinh) < Math.abs(min - trungBinh)){
                min = integer;
            }
        }
        System.out.println("So gan trung binh nhat la: " + min);
    }

}
