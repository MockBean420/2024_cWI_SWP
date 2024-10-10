import com.example.newsbroker.NewsAgency;
import com.example.newsbroker.NewsChannel;
public class App {
    public static void main(String[] args) throws Exception {

        //News Agencies initialisieren
        var apa = new NewsAgency("APA");
        var reuters = new NewsAgency("Reuters");
        var legoCity = new NewsAgency("Lego City News/Radio");

        //News Channels initialisieren
        var orf = new NewsChannel("orf.at");
        var nzz = new NewsChannel("nzz.ch");
        var nytimes = new NewsChannel("nytimes.com");

        //Subscribe to APA
        apa.subscribe(orf);
        apa.subscribe(nzz);

        //Subscribe to Reuters
        reuters.subscribe(nytimes);
        reuters.subscribe(nzz);

        //Subscribe to Lego City News
        legoCity.subscribe(orf);
        legoCity.subscribe(nzz);
        legoCity.subscribe(nytimes);

        //Broadcast news
        apa.broadcast("Auf der Suche nach der nächsten Regierung.");

        reuters.broadcast("Harris campaign raises $55 million over two weeks, campaign official says.");

        legoCity.broadcast("(Everybody sing)\n Everything is AWESOME! Everything is cool when you part of a team.");
    }
}