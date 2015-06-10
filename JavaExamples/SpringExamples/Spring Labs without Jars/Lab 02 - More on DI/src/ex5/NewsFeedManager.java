package ex5;

//This is a singleton bean depending upon a non singleton bean
public abstract class NewsFeedManager {

	public abstract NewsFeed getNewsFeed();
	
	public void printNews() {
		NewsFeed newsFeed = getNewsFeed();
		System.out.println(newsFeed.getNews());
	}
}

