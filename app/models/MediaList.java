package models;

import play.mvc.*;
import java.util.List;
import models.Media;

public class MediaList {
    private boolean filterBook;
    private boolean filterGame;
    private boolean filterMovie;
    private boolean filterMusic;
    private boolean filterTVShow;

    public MediaList(boolean filterBook, boolean filterGame, boolean filterMovie, boolean filterMusic, boolean filterTVShow) {
        this.setFilterBook(filterBook);
        this.setFilterGame(filterGame);
        this.setFilterMovie(filterMovie);
        this.setFilterMusic(filterMusic);
        this.setFilterTVShow(filterTVShow);
    }

    public MediaList(){}

    public boolean isFilterBook() {
        return filterBook;
    }

    public void setFilterBook(boolean filterBook) {
        this.filterBook = filterBook;
    }

    public boolean isFilterGame() {
        return filterGame;
    }

    public void setFilterGame(boolean filterGame) {
        this.filterGame = filterGame;
    }

    public boolean isFilterMovie() {
        return filterMovie;
    }

    public void setFilterMovie(boolean filterMovie) {
        this.filterMovie = filterMovie;
    }

    public boolean isFilterMusic() {
        return filterMusic;
    }

    public void setFilterMusic(boolean filterMusic) {
        this.filterMusic = filterMusic;
    }

    public boolean isFilterTVShow() {
        return filterTVShow;
    }

    public void setFilterTVShow(boolean filterTVShow) {
        this.filterTVShow = filterTVShow;
    }
}