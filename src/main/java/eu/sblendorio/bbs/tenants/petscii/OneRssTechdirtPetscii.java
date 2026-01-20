package eu.sblendorio.bbs.tenants.petscii;

import java.util.LinkedHashMap;

public class OneRssTechdirtPetscii extends OneRssPetscii {

    @Override
    protected void readSections() throws Exception {
        sections = new LinkedHashMap<>();
        sections.put("1", new NewsSection("", "https://www.techdirt.com/techdirt_rss.xml"));
        newlineAfterDate = false;
        LOGO_SECTION = readBinaryFile("petscii/newsTechdirt.seq");
    }
}
