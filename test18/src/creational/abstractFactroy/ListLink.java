package creational.abstractFactroy;

public class ListLink extends Link{
	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<a> href=\""+url+"\"> "+caption+"</a>";
	}
	

}
