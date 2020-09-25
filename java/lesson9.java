
// JAVA ARRAYS
// _________________________________________________________
public class Newsfeed {
  
    String[] trendingArticles;
    int[] views;
    double[] ratings;
    
    public Newsfeed(String[] initialArticles, int[] initialViews, double[] initialRatings){
      trendingArticles = initialArticles;
      views = initialViews;
      ratings = initialRatings;
    }
    
    public String getTopArticle(){
      return trendingArticles[0];
    }
    
    public void viewArticle(int articleNumber){
      views[articleNumber] = views[articleNumber] + 1;
      System.out.println("The article '" + trendingArticles[articleNumber] + "' has now been viewed " + views[articleNumber] + " times!");
    }
    
    public void changeRating(int articleNumber, double newRating){
      if (newRating > 5 || newRating < 0) {
        System.out.println("The rating must be between 0 and 5 stars!");
      } else {
        ratings[articleNumber] = newRating;
        System.out.println("The article '" + trendingArticles[articleNumber] + "' is now rated " + ratings[articleNumber] + " stars!");
      }
    }
    
    public static void main(String[] args){
      String[] robotArticles = {"Oil News", "Innovative Motors", "Humans: Exterminate Or Not?", "Organic Eye Implants", "Path Finding in an Unknown World"};
      int[] robotViewers = {87, 32, 13, 11, 7};
      double[] robotRatings = {2.5, 3.2, 5.0, 1.7, 4.3};
      Newsfeed robotTimes = new Newsfeed(robotArticles, robotViewers, robotRatings);
      
      robotTimes.viewArticle(2);
      robotTimes.viewArticle(2);
      System.out.println("The top article is " + robotTimes.getTopArticle());
      robotTimes.changeRating(3, 5);
    }
  }

// _________________________________________________________

public class Newsfeed {

    public Newsfeed() {

    }

    // Create getTopics() below:
    public String[] getTopics() {
        String[] topics = { "Opinion", "Tech", "Science", "Health" };
        return topics;
    }

    public static void main(String[] args) {
        Newsfeed sampleFeed = new Newsfeed();

        String[] topics = sampleFeed.getTopics();
        System.out.println(topics);

    }
}

// _________________________________________________________
// In order to make our printout of the topics array more helpful, we
// are going to want to use the toString() method from the Arrays package.
// To use it, we first must import the Arrays package from java.util.
// Import the package at the top of the Newsfeed.java file.
// Now that you have the Arrays package, use its toString() method to
// print out the topics array in the main() method.

// import the Arrays package here:
import java.util.Arrays;

public class Newsfeed {
  
  
  public Newsfeed(){
    
  }
    
  public String[] getTopics(){
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    return topics;
  }
  

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    String[] topics = sampleFeed.getTopics();
    System.out.println(Arrays.toString(topics));
  }
}

// _________________________________________________________
import java.util.Arrays;

public class Newsfeed {

    String[] topics = { "Opinion", "Tech", "Science", "Health" };
    int[] views = { 0, 0, 0, 0 };

    public Newsfeed() {

    }

    public String[] getTopics() {
        return topics;
    }

    public String getTopTopic() {
        return topics[0];
    }

    public void viewTopic(int topicIndex) {
        views[topicIndex] = views[topicIndex] + 1;
    }

    public static void main(String[] args) {
        Newsfeed sampleFeed = new Newsfeed();

        System.out.println("The top topic is " + sampleFeed.getTopTopic());

        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);

        System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");

    }}

    // _________________________________________________________

    // _________________________________________________________

    // _________________________________________________________

    // _________________________________________________________
function findLargestIndex

public boolean isSpecial(String text) {


}
