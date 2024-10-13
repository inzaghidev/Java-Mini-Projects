import java.util.*;
import java.util.Date;
import java.text.*;
import java.math.RoundingMode;

public class Penanggalan {
    int Leap, Tahun, Bulan, Tanggal;
    int Harmun, Harke;
    float Jam, Menit, Detik;
    float Persen, Permun, DateCal;

    public void DateDisplay() {
        Date month = new Date();
        SimpleDateFormat mn = new SimpleDateFormat("MMMMM");
        Date day = new Date();
        SimpleDateFormat dy = new SimpleDateFormat("EEEEE");

        Calendar cal = Calendar.getInstance();

        Tahun = cal.get(Calendar.YEAR);
        Bulan = cal.get(Calendar.MONTH)+1;
        Tanggal = cal.get(Calendar.DATE);

        System.out.println("Tahun                    : " + Tahun);
        System.out.println("Bulan                    : " + Bulan+" ("+mn.format(month)+")");
        System.out.println("Tanggal                  : " + Tanggal);
        System.out.println("Hari                     : " + dy.format(day));
    }

    public void DisplayCurrentTime(){
        String shortPattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(shortPattern);
        String shortDate = simpleDateFormat.format(new Date());
        
        String longPattern = "EEEEE, dd MMMMM yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(longPattern);
        String longDate = dateFormat.format(new Date());

        String pattern = "HH:mm:ss";
        SimpleDateFormat timeFormat = new SimpleDateFormat(pattern);
        String time = timeFormat.format(new Date());

        String dayYear = "D";
        SimpleDateFormat dayinayear = new SimpleDateFormat(dayYear);
        String harke = dayinayear.format(new Date());
        
        if (Tahun % 400 == 0){
          Leap = 366;
        }
        else if (Tahun % 100 == 0){
          Leap = 365;
        }
        else if (Tahun % 4 == 0){
          Leap = 366;
        }
        else {
          Leap = 365;
        }

        Harke = Integer.parseInt(harke);
        Harmun = 1+Leap-Harke;
        
        DateCal = (Harke-1)+((float)Jam/24)+((float)Menit/1440)+((float)Detik/86400);
        Persen = (float)(100*DateCal/Leap);
        Permun = 100-Persen;
        
        DecimalFormat df = new DecimalFormat("#.####");
        
        System.out.println("Hari ke (dalam Setahun)  : " + Harke);
        System.out.println("Sisa Hari (Tahun depan)  : " + Harmun);
        System.out.println("Persentase dalam Setahun : " + Persen+"%");
        System.out.println("Persentase Hitung Mundur : " + Permun+"%");
        System.out.println();
        
        System.out.println(shortDate);
        System.out.println(longDate);
        System.out.println(time);
        System.out.print("Day-"+harke);
        System.out.print(" ("+df.format(Persen)+"%)");
    }

    public void TimeDisplay() {
        Calendar tme = Calendar.getInstance();

        DecimalFormat wkt = new DecimalFormat("#");

        Jam = tme.get(Calendar.HOUR_OF_DAY);
        Menit = tme.get(Calendar.MINUTE);
        Detik = tme.get(Calendar.SECOND);

        System.out.println("Jam                      : " + wkt.format(Jam));
        System.out.println("Menit                    : " + wkt.format(Menit));
        System.out.println("Detik                    : " + wkt.format(Detik));
    }

    public static void main(String args[]) {
        Penanggalan tanggalWaktu = new Penanggalan();
        tanggalWaktu.DateDisplay();
        tanggalWaktu.TimeDisplay();
        tanggalWaktu.DisplayCurrentTime();
    }
}