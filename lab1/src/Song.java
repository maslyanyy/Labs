/**
 * Created with IntelliJ IDEA.
 * User: Maslo
 * Date: 06.06.18
 * Time: 18:45
 * To change this template use File | Settings | File Templates.
 */
public class Song {
    private String name= "No name";
    private String singer ="Unnown" ;
    private double price = 0;
    private int year= 0;
    private String country = "Russia";
    private static int totalPrice=0;

    public Song() {
    };

    public Song(String name, String singer, double price, int year) {
        this.name = name;
        this.singer = singer;
        this.price = price;
        this.year = year;
        totalPrice += price;

    };

    public Song(String name, String singer, double price, int year, String country) {
        this.name = name;
        this.singer = singer;
        this.price = price;
        this.year = year;
        this.country = country;
        totalPrice += price;
    };
       public String toString(){
             return "Name:" + this.name + " Singer:" + this.singer+ " Price:" + this.price + " Year:" + this.year + "Country:" + this.country;
       }   ;
    public  void printSum(){
        System.out.println(totalPrice);
    }   ;
    public static   void printStaticSum(){
        System.out.println(totalPrice);
    }   ;
    public void  resetValues(String name, String singer, double price, int year, String country) {
        this.name = name;
        this.singer = singer;
        this.price = price;
        this.year = year;
        this.country = country;
    };


    public static int getTotalPrice() {
        return totalPrice;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        totalPrice += price;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
public static void main(String [] argsv){
         Song despacito = new Song();
         Song backInBlack = new Song ("Back in Black","AC/DC",50,1976);
         Song midleFIngerUp = new Song("Middle finger up","Atilla",40,200,"Ukraine");
        System.out.println(despacito.toString());
        System.out.println(backInBlack.toString());
        System.out.println(midleFIngerUp.toString());
        despacito.printSum();
        Song.printStaticSum();
        despacito.resetValues("bade song","very bad song",-1,-10,"Irland");
        System.out.println(despacito.toString());


}
}
