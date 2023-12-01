package de.ait.homework54;

public class MusicLibrary {
    public static void main(String[] args) {
        MusicUtil popAlbom = new MusicUtil(MucicGenre.POP,MucicGerreDescription.POP);
        MusicUtil rockAlbom = new MusicUtil(MucicGenre.ROCK,MucicGerreDescription.ROCK);
        MusicUtil jazzAlbom = new MusicUtil(MucicGenre.JAZZ,MucicGerreDescription.JAZZ);
        MusicUtil classicalAlbom = new MusicUtil(MucicGenre.CLASSICAL,MucicGerreDescription.CLASSICAL);
        MusicUtil electronicAlbom = new MusicUtil(MucicGenre.ELECTRONIC,MucicGerreDescription.ELECTRONIC);
        MusicUtil hiphopAlbom = new MusicUtil(MucicGenre.HIPHOP, MucicGerreDescription.HIPHOP);

        System.out.println(popAlbom.getMucicGenre().ordinal());
        System.out.println(popAlbom.getGerreDescription().ordinal());
        System.out.println(MucicGenre.values()[0]);
        System.out.println(MucicGerreDescription.valueOf("POP").getDescription());

        System.out.println(popAlbom.mucicGenre.equals(MucicGenre.POP));


        switch (popAlbom.getGerreDescription()){
            case ROCK -> System.out.println("No");
            case POP -> System.out.println("Yes");
            default -> System.out.println("Don`t know");
        }

    }
}
