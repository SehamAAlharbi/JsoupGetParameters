import org.jsoup.Jsoup;

public class JSoupChangeText {

	public void changeText() {

		String htmlString = """
				<html><head><title>My title</title></head>
				<body>Body content</body></html>""";

		var doc = Jsoup.parse(htmlString);
		doc.body().text("Lorem ipsum dolor sit amet");

		System.out.println(doc);
	}
}