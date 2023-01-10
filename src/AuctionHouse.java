public class AuctionHouse {
    public static void main(String[] args) {

        Auction auction1 = new Auction();
        auction1.title = "Xbox One" ;
        auction1.description = "Konsola dla wymagających ";
        auction1.price = 999_999;
        auction1.seller = new Person() ;
        auction1.seller.firstName = "Jan" ;
        auction1.seller.lastName = "Kowalski";
        auction1.seller.adress = new Adress();
        auction1.seller.adress.city = "Wrocław" ;
    }
}