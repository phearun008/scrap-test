package scrap;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TestScrap {
	
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://www.kaymu.com.kh/men-polos/").get();
		Elements elements = doc.select(".product");
		//System.out.println(elements);
		
		for(Element e: elements){
			String image = e.select("img").attr("data-layzr");
			String title = e.select(".ellipsis").text();
			String price = e.select(".price").text();
			String link = e.select(".card-overlay").attr("href");
		
			System.out.println(image);
			System.out.println(title);
			System.out.println(price);
			System.out.println(link + "\n");
		}
	}
}
