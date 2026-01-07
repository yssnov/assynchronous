package content;

import java.time.Year;
import java.util.ArrayList;

public class ContentDemo {
    public static void main(String[] args) {

        int currentYear = Year.now().getValue();

        ArrayList<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("Java OOP Basics", 2024, 90, "HD"));
        items.add(new VideoLecture("Advanced Java", 2022, 120, "4K"));

        items.add(new PodcastEpisode("Tech Talks", 2023, 45, "Alex Johnson"));
        items.add(new PodcastEpisode("Startup Stories", 2021, 60, "Sarah Lee"));

        for (ContentItem item : items) {
            System.out.println(item +
                    " | licenseCost=" +
                    item.getLicenseCost(currentYear));

            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println("Max downloads/day: " + d.getMaxDownloadsPerDay());
            }

            System.out.println("----------------------------");
        }
    }
}

