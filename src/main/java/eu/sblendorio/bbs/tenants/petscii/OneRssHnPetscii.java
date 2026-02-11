package eu.sblendorio.bbs.tenants.petscii;

import java.util.LinkedHashMap;

public class OneRssHnPetscii extends OneRssPetscii {

    @Override
    protected void readSections() throws Exception {
        sections = new LinkedHashMap<>();
        sections.put("1", new NewsSection("", "https://hnrss.org/newest"));
        newlineAfterDate = false;
        //LOGO_SECTION = readBinaryFile("petscii/newsTechdirt.seq");
    }
}
