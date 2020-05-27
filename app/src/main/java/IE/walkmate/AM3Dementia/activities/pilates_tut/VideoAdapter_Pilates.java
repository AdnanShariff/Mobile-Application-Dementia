package IE.walkmate.AM3Dementia.activities.pilates_tut;

import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import IE.walkmate.AM3Dementia.Adapter.VideoAdapter;
import IE.walkmate.AM3Dementia.Model.YouTubeVideos;
import IE.walkmate.AM3Dementia.R;

public class VideoAdapter_Pilates extends RecyclerView.Adapter<VideoAdapter_Pilates.VideoViewHolder>{

    List<YouTubeVideos_Pilates> youtubeVideoList;

    //   List<VideoItems> mListVideo;


    public VideoAdapter_Pilates() {
    }

    public VideoAdapter_Pilates(List<YouTubeVideos_Pilates> youtubeVideoList) {
        this.youtubeVideoList = youtubeVideoList;
    }

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.video_view_pilates, parent, false);

        return new VideoViewHolder(view);

    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {

        String uncodedHtml = "<html><body> Hello world </body></html>";
        String encodedHtml = Base64.encodeToString(uncodedHtml.getBytes(), Base64.NO_PADDING);
        holder.videoWeb.loadData( youtubeVideoList.get(position).getVideoUrl(), "text/html" , "utf-8" );

        //holder.videoWeb.loadData(encodedHtml,"text/html","base64");
    }


    @Override
    public int getItemCount() {
        return youtubeVideoList.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder{

        WebView videoWeb;

        public VideoViewHolder(View itemView) {
            super(itemView);

            videoWeb = (WebView) itemView.findViewById(R.id.videoWebView_pilates);

            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient() {


            } );
        }
    }
}
