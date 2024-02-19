package news;

import java.util.ArrayList;

public class NewsFeed {

	private ArrayList<Post> newsList;
	
	public void addPost(Post author) {
		newsList.add(author);
	}
	
	public void searchPost(String author) {
		for(Post m : newsList) {
			if(m.getAuthor().equals(author)) {
				System.out.println(m);
			}
		}
	}
	
	public ArrayList<Post> getNewsList() {
		return newsList;
	}
 
	public void setNewsFeed(ArrayList<Post> newsList) {
		this.newsList = newsList;
	}
	public void addMediaToNewsFeed(Post media) {
			newsList.add(media);
	}
	public void deleteMediaFromNewsFeed(Post p) {
		newsList.remove(p);
	}
	public ArrayList<Post> findPostFromUser(String authorName){
		ArrayList<Post> tmp = new ArrayList<Post>();
		for(Post p : newsList) {
			if(p.getAuthor().equalsIgnoreCase(authorName)) {
				tmp.add(p);
			}
		}
		return tmp;
	}
	public void printAllPostsOut() {
		for(Post p : newsList) {
			System.out.println(p);
		}
	}
	
	public ArrayList<Post> postWithHashtag(ArrayList<String> hashtag) {
		ArrayList<Post> tmp = new ArrayList<Post>();
		for(Post p : newsList) {
			if(p.getHashtag().equals(hashtag)) {
				tmp.add(p);
			}
		}
		return tmp;
	}
	
}
