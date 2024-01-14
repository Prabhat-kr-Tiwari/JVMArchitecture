package DeepakSir.Multithreading.ThreadClassMethod.Synchronization;



class BookTheaterSeat{

    int total_seats=10;
    synchronized void BookSeats(int seats){
        if (total_seats>=seats){
            System.out.println(seats+"    Seats Booked Successfully");
            total_seats=total_seats-seats;
            System.out.println("Seats Left  "+(total_seats));

        }else{
            System.out.println("Sorry seats cannot be booked");
            System.out.println("Seats left"+total_seats);
        }

    }
}
public class MovieBookApp extends Thread{
    static BookTheaterSeat b;
    int seats;
    @Override
    public void run() {
        b.BookSeats(seats);
    }

    public static void main(String[] args) {
        b=new BookTheaterSeat();
        MovieBookApp deepak=new MovieBookApp();
        deepak.seats=7;
        deepak.start();

        MovieBookApp amit=new MovieBookApp();
        amit.seats=6;
        amit.start();




    }
}
