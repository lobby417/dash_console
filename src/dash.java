import java.util.Scanner;
import java.awt.Desktop;

public class dash {

    //Print
    public static void print(String message) {
        System.out.println(message);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String startQuery;
        int select;
        print("Dash 1.02 | Initialized | Idea: Ian Murray | Code: Liam Newman | Better Code: Felix Angell");
        System.out.print("/");
        startQuery = scanner.nextLine();
        print("-----[Services]-----");
        print("1> Google");
        String google = "http://www.google.com/search?q=";
        print("2> Bing");
        String bing = "http://www.bing.com/search?q="; //Probably gonna remove this, who uses bing anyways?
        print("3> Yahoo");
        String yahoo = "http://search.yahoo.com/search;_ylt=?p=";
        print("4> AOL");
        String aol = "http://search.aol.com/aol/search?q=";
        print("5> DuckDuckGo");
        String ddg = "http://duckduckgo.com/?q=";
        print("6> Facebook");
        String fb = " http://www.facebook.com/search/more/?q=";
        print("7> Twitter");
        String twitter = "http://twitter.com/search?q=";
        print("8> Youtube");
        String youtube = "http://www.youtuhbe.com/results?search_query=";
        print("9> Amazon");
        String amazon = "http://www.amazon.com/s/field-keywords=";
        print("0> Wikipedia");
        String wiki = "http://en.wikipedia.org/w/index.php?search=";
        print("Input NUMBERS ONLY; Strings will crash the program!");
        System.out.print("Service: ");
        select = scanner.nextInt();
        Desktop d = Desktop.getDesktop();
        String query = startQuery.replaceAll(" ", "+");
        try {
            switch (select) {

                case 1:
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(google + query));
                    break;

                case 2:
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(bing + query));
                    break;

                case 3:

                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(yahoo + query));

                    break;

                case 4:
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(aol + query));
                    break;

                case 5:
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(ddg + query));
                    break;

                case 6:
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(fb + query));
                    break;

                case 7:

                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(twitter + query));
                    break;

                case 8:
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(youtube + query));
                    break;

                case 9:
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(amazon + query));
                    break;

                case 0:
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(wiki + query));
                    break;
            }
        } catch (Exception e) {

        }


    }
}