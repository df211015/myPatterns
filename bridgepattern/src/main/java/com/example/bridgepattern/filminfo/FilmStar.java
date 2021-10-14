package com.example.bridgepattern.filminfo;

public class FilmStar extends AbstractStar {
    public FilmStar() {
        super(new ActFilm());
    }

    public FilmStar(AbstractAction action) {
        super(action);
    }

    @Override
    public void doJob() {
        super.doJob();
    }
}
