package eu.sblendorio.bbs.tenants.petscii;

import java.util.LinkedHashMap;

public class OneRssMilkcrunchPetscii extends OneRssPetscii {

    @Override
    protected void readSections() throws Exception {
        sections = new LinkedHashMap<>();
        sections.put("1", new NewsSection("", "https://milkcrunch.com/index.xml"));
        newlineAfterDate = false;
        //LOGO_SECTION = readBinaryFile("petscii/newsTechdirt.seq");
    }
}
