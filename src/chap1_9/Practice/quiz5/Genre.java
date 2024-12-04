package chap1_9.Practice.quiz5;

public enum Genre {

    FICTION("픽션"),
    NON_FICTION("논픽션"),
    SCIENCE("공상과학"),
    HISTORY("역사");

    private final String genreInKorean;

    Genre(String genreInKorean) {
        this.genreInKorean = genreInKorean;
    }

    public String getGenreInKorean() {
        return genreInKorean;
    }
}
