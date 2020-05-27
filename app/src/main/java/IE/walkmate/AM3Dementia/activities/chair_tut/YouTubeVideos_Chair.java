package IE.walkmate.AM3Dementia.activities.chair_tut;

public class YouTubeVideos_Chair {

    private String videoUrl;
    private String header;

    public YouTubeVideos_Chair() {

    }

    public YouTubeVideos_Chair(String videoUrl) {
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
