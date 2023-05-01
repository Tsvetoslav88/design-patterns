package org.example;

public class CDBuilder {
    public CDType buildSonyCD() {
        CDType cdType = new CDType();
        cdType.addItem(new Sony());
        return cdType;
    }

    public CDType buildSamsung() {
        CDType cdType = new CDType();
        cdType.addItem(new Samsung());
        return cdType;
    }
}
