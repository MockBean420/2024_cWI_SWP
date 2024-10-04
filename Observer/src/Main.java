import at.htldornbirn._4cwi.swp.observer.NewsAgency;
import at.htldornbirn._4cwi.swp.observer.NewsChannel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var newsAgency = new NewsAgency( "APA");

        System.out.println(newsAgency);

        var newsChannel = new NewsChannel("orf.at");

        System.out.println(newsChannel);
    }
}