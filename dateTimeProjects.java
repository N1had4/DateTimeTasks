
import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class dateTimeProjects {
   public static void main(String[] args) {
//        // Iki tarix arasindaki ferq
////        Scanner scanner = new Scanner(System.in);
////        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
////
////        try {
////            System.out.println("Zehmet olmasa birinic tarixi daxil edin:(yyyy-MM-dd) ");
////            String date1= scanner.nextLine();
////            LocalDate parse1 = LocalDate.parse(date1, formatter);
////
////            System.out.println("Zehmet olmasa ikinci tarixi daxil edin:(yyyy-MM-dd)");
////            String date2 = scanner.nextLine();
////            LocalDate parse2 = LocalDate.parse(date2, formatter);
////
////            System.out.println("Iki tarix arasindaki gun ferqi: " + ChronoUnit.DAYS.between(parse1, parse2));
////
////
////        }
////        catch (Exception ex){
////            System.out.println("Sehv format daxil etmisiz");
////
////        }
////        scanner.close();
//
//        //Novbeti hefte gunu
////
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Zehmet olmasa heftenin gununu daxil edin: ");
////        String heftegunu = scanner.nextLine().toUpperCase();
////        DayOfWeek sonrakigun = DayOfWeek.valueOf(heftegunu);
////
////       LocalDate bugun = LocalDate.now();
////       DayOfWeek bgun = bugun.getDayOfWeek();
////
////        if (sonrakigun == bgun){
////            int gunferqi1 = (sonrakigun.getValue() - bgun.getValue() + 7 );
////            LocalDate novbeti2 = bugun.plusDays(gunferqi1);
////            System.out.println("Bu gun: " + bugun + " (" + bugun + ")");
////            System.out.println("Novbeti " + sonrakigun + " " + novbeti2);
////
////        }
////        else {
////            int gunferqi2 = (sonrakigun.getValue() - bgun.getValue() + 7) % 7;
////
////            LocalDate novbeti = bugun.plusDays(gunferqi2);
////            System.out.println("Bu gun: " + bugun + " (" + bugun + ")");
////            System.out.println("Novbeti " + sonrakigun + " " + novbeti);
////        }
////        scanner.close();
//
////        //Ilin sonuna qeder olan gunler
////        Scanner scanner = new Scanner(System.in);
////        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
////
////        System.out.println("Zehmet olmasa tarix daxil edin:(yyyy-MM-dd) ");
////        String date1= scanner.nextLine();
////        LocalDate parse1 = LocalDate.parse(date1, formatter);
////
////        System.out.println("Ili daxil edin: ");
////        int date2 = scanner.nextInt();
////        LocalDate il = LocalDate.of(date2,12,31);
////
////        System.out.println("Bu iki tarix arasindaki ferq: " + ChronoUnit.DAYS.between(parse1, il) + " gundur");
//
//
//        //Ad gunu
////        Scanner scanner = new Scanner(System.in);
////        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
////
////        try {
////            System.out.println("Zehmet olmasa dogum tarixinizi daxil edin:(yyyy-MM-dd) ");
////            String date1= scanner.nextLine();
////            LocalDate parse1 = LocalDate.parse(date1, formatter);
////
////            LocalDate today = LocalDate.now();
////
////            System.out.println("Sizin yasiniz: " + ChronoUnit.YEARS.between(parse1, today));
////
////
////        }
////        catch (Exception ex){
////            System.out.println("Sehv format daxil etmisiz");
////
////        }
////        scanner.close();
//
//
//        //Ayin gunu
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Zehmet olmasa nece ay sonrasini isteyirsiz daxil edin: ");
//        Integer ay = scanner.nextInt();
//        LocalDate date = LocalDate.now().plusMonths(ay);
//        System.out.println(ay + " ay sonra bu gunki tarix " + date.getDayOfWeek()+" gunune dusur");
//
//


        
    }
}
