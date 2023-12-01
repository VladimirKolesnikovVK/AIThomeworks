package de.ait.homework54;

public class MusicUtil {
    MucicGenre mucicGenre;
    MucicGerreDescription gerreDescription;

    public MusicUtil(MucicGenre mucicGenre, MucicGerreDescription gerreDescription) {
        this.mucicGenre = mucicGenre;
        this.gerreDescription = gerreDescription;
    }

    public MucicGenre getMucicGenre() {
        return mucicGenre;
    }

    public void setMucicGenre(MucicGenre mucicGenre) {
        this.mucicGenre = mucicGenre;
    }

    public MucicGerreDescription getGerreDescription() {
        return gerreDescription;
    }

    public void setGerreDescription(MucicGerreDescription gerreDescription) {
        this.gerreDescription = gerreDescription;
    }
}
