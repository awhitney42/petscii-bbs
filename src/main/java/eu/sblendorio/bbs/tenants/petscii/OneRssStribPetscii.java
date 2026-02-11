package eu.sblendorio.bbs.tenants.petscii;

import java.util.LinkedHashMap;

public class OneRssStribPetscii extends OneRssPetscii {

    @Override
    protected void readSections() throws Exception {
        sections = new LinkedHashMap<>();
        sections.put("1", new NewsSection("", "https://www.startribune.com/rss"));
        newlineAfterDate = false;
        LOGO_SECTION = readBinaryFile("petscii/newsTechdirt.seq");
    }
}
