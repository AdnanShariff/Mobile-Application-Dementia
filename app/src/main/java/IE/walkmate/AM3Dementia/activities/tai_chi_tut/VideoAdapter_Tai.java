package IE.walkmate.AM3Dementia.activities.tai_chi_tut;

import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import IE.walkmate.AM3Dementia.R;
import IE.walkmate.AM3Dementia.activities.pilates_tut.VideoAdapter_Pilates;
import IE.walkmate.AM3Dementia.activities.pilates_tut.YouTubeVideos_Pilates;

public class VideoAdapter_Tai extends RecyclerView.Adapter<VideoAdapter_Tai.VideoViewHolder>{

    List<YouTubeVideos_Tai> youtubeVideoList;

    //   List<VideoItems> mListVideo;


    public VideoAdapter_Tai() {
    }

    public VideoAdapter_Tai(List<YouTubeVideos_Tai> youtubeVideoList) {
        this.youtubeVideoList = youtubeVideoList;
    }

    @Override
    public VideoAdapter_Tai.VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.video_view_tai, parent, false);

        return new VideoAdapter_Tai.VideoViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        String uncodedHtml = "<html><body> Hello world </body></html>";
        String encodedHtml = Base64.encodeToString(uncodedHtml.getBytes(), Base64.NO_PADDING);
        holder.videoWeb.loadData( youtubeVideoList.get(position).getVideoUrl(), "text/html" , "utf-8" );

    }



    @Override
    public int getItemCount() {
        return youtubeVideoList.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder{

        WebView videoWeb;

        public VideoViewHolder(View itemView) {
            super(itemView);

            videoWeb = (WebView) itemView.findViewById(R.id.videoWebView_tai_chi);

            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient() {


            } );
        }
    }
}
