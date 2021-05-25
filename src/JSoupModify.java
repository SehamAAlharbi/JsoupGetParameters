import org.jsoup.Jsoup;

public class JSoupModify {

	public void modifyText() {

		String htmlString = """
				<html><head><title>My title</title></head>
				<body></body></html>""";

		var doc = Jsoup.parse(htmlString);

		var e = doc.select("body").first();
		e.append("<p>hello there!</p>");
		e.prepend("<h1>Heading</h1>");

		System.out.println(doc);
	}
}