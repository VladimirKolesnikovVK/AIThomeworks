package de.ait.homework54;

public enum MucicGerreDescription {
    POP("Popular and mainstream music"), ROCK(" blend of black rhythm-and-blues with white country-and-western"),

    JAZZ("improvisation and reaching people with spontaneous music"), CLASSICAL( "elegance, balance, and homophonic textures"),
    ELECTRONIC("created and produced by using electronic and electromechanical instruments"),
    HIPHOP("strong, rhythmic beat and a rapping vocal track");

    private final String description;

    MucicGerreDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
