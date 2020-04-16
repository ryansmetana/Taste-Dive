package models;

import play.mvc.*;
import java.util.List;
import models.Media;

public class FilterList {
    private String mediaName;
    private boolean filterBook;
    private boolean filterGame;
    private boolean filterMovie;
    private boolean filterMusic;
    private boolean filterShow;
    private boolean filterPodcast;
    private boolean filterAuthor;

    public FilterList(String mediaName, boolean filterBook, boolean filterGame, boolean filterMovie, boolean filterMusic, boolean filterShow, boolean filterPodcast, boolean filterAuthor) {
        this.setMediaName(mediaName);
        this.setFilterBook(filterBook);
        this.setFilterGame(filterGame);
        this.setFilterMovie(filterMovie);
        this.setFilterMusic(filterMusic);
        this.setFilterShow(filterShow);
        this.setFilterPodcast(filterPodcast);
        this.setFilterAuthor(filterAuthor);
    }

    public FilterList(){}

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

    public boolean isFilterShow() {
        return filterShow;
    }

    public void setFilterShow(boolean filterShow) {
        this.filterShow = filterShow;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public boolean isFilterPodcast(){return filterPodcast;}

    public void setFilterPodcast(boolean filterPodcast){this.filterPodcast = filterPodcast;}

    public boolean isFilterAuthor(){return filterAuthor;}

    public void setFilterAuthor(boolean filterAuthor){this.filterAuthor = filterAuthor;}

}