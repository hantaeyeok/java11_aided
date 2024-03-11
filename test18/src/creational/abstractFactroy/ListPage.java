package creational.abstractFactroy;

public class ListPage extends Page {
	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();		//여러 문자열을 하나로 묶어주는
		buffer.append("<html><head><title>"+title+"</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("</body>\n");
		buffer.append("<h1>"+title+"</h1>");
		buffer.append("<u1>\n");
		buffer.append("</u1>\n");
		for(Object o : content) {
			Item item = (Item) o;
			buffer.append("<li>"+item.makeHTML()+"</li>");
		}
		buffer.append("</html>\n");
		
		return buffer.toString();
	} 
	
}
