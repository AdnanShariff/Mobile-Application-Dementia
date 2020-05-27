package IE.walkmate.AM3Dementia.activities.pilates_tut;

public class YouTubeVideos_Pilates {


    private String videoUrl;
    private String header;

    public YouTubeVideos_Pilates() {

    }

    public YouTubeVideos_Pilates(String videoUrl) {
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
