import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.GregorianCalendar;
//cau 4,6
public class CalendarDate {
    private Integer year;
    private Integer month;
    private Integer day;
    public void NhapNgay(){
        System.out.println("Nhap nam: ");
        year = new java.util.Scanner(System.in).nextInt();
        System.out.println("Nhap thang: ");
        month = new java.util.Scanner(System.in).nextInt();
        System.out.println("Nhap ngay: ");
        day = new java.util.Scanner(System.in).nextInt();
    }
    public void XuatLich(){

        Calendar calendar = new GregorianCalendar(year, month, day);
        calendar.set(Calendar.DAY_OF_MONTH, 1); //Set the day of month to 1
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); //get day of week for 1st of month
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

//print month name and year
        System.out.println(new SimpleDateFormat("MMMM YYYY").format(calendar.getTime()));
        System.out.println(" S  M  T  W  T  F  S");

//print initial spaces
        String initialSpace = "";
        for (int i = 0; i < dayOfWeek - 1; i++) {
            initialSpace += "   ";
        }
        System.out.print(initialSpace);

//print the days of the month starting from 1
        for (int i = 0, dayOfMonth = 1; dayOfMonth <= daysInMonth; i++) {
            for (int j = ((i == 0) ? dayOfWeek - 1 : 0); j < 7 && (dayOfMonth <= daysInMonth); j++) {
                System.out.printf("%2d ", dayOfMonth);
                dayOfMonth++;
            }
            System.out.println();
        }
    }

    public void TongSoNgay(){
        // Get the number of days in that month
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println("Tong so ngay: " + daysInMonth);//28
    }
}
