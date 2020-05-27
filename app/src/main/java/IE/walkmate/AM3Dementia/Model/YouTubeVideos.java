package IE.walkmate.AM3Dementia.Model;
/*
Author: Team B40
Version: 01
@YouTubeVideos() is default constructor
 */

/**
 *YouTubeVideos class, basically responsible for Instantiating
 * @getter and setter methods are declared for string url
 */
public class YouTubeVideos {

    private String videoUrl;
    private String header;

    public YouTubeVideos() {

    }

    public YouTubeVideos(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    //public YouTubeVideos(String header){this.header=header;}

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}

