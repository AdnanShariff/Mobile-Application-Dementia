package IE.walkmate.AM3Dementia.activities.tai_chi_tut;

public class YouTubeVideos_Tai {
    private String videoUrl;
    private String header;

    public YouTubeVideos_Tai() {

    }

    public YouTubeVideos_Tai(String videoUrl) {
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
