package eu.sblendorio.bbs.tenants.petscii;

import java.util.LinkedHashMap;

public class OneRssMprPetscii extends OneRssPetscii {

    @Override
    protected void readSections() throws Exception {
        sections = new LinkedHashMap<>();
        sections.put("1", new NewsSection("", "https://www.mprnews.org/feed/homepage"));
        newlineAfterDate = false;
        LOGO_SECTION = readBinaryFile("petscii/mpr.seq");
    }
}
