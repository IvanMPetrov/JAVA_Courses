package ArticlesTWO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Articles> articlesList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();

            String title = command.split(", ")[0];
            String content = command.split(", ")[1];
            String author = command.split(", ")[2];

            articlesList.add(new Articles(title,content,author));

        }
        for (Articles articles : articlesList) {
            System.out.println(articles.toString());
        }

    }

}
