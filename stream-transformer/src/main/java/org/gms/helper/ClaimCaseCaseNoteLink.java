package org.gms.helper;


import org.gms.model.input.avro.*;

public class ClaimCaseCaseNoteLink {
    private final ClaimCase cc;
    private final CaseNoteLink cnl;


    public ClaimCaseCaseNoteLink(ClaimCase cc, CaseNoteLink cnl) {
        this.cc = cc;
        this.cnl = cnl;
    }

    public long caCaseID() {
        return cc.getCACaseID();
    }
}
