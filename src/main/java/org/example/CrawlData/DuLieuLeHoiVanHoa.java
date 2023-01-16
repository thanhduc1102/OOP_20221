package org.example.CrawlData;

import org.example.Objects.LeHoiVanHoa;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class DuLieuLeHoiVanHoa {
    public void DocDulieuLeHoiVanHoa() throws IOException {
        Document doc = Jsoup.connect("https://vi.wikipedia.org/wiki/Danh_s%C3%A1ch_Di_t%C3%ADch_qu%E1%BB%91c_gia_Vi%E1%BB%87t_Nam")
                .timeout(10000).get();
        Elements body = doc.select("table.prettytable.wikitable tbody");
        //System.out.println(body.select("tr").size());
        for (int i = 1; i < body.select("tr").size(); i++) {
            Element element=body.select("tr").get(i);
            if (element.children().select("td").size() != 5) continue;
            LeHoiVanHoa lhvh=new LeHoiVanHoa(element.select("td").get(0).text(),
                    element.select("td").get(1).text(),
                    element.select("td").get(2).text(),
                    element.select("td").get(3).text(),
                    element.select("td").get(4).text());
            System.out.println(lhvh.getTenLeHoi());
        }
    }
}
