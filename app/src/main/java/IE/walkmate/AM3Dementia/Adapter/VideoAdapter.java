package IE.walkmate.AM3Dementia.Adapter;

import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import IE.walkmate.AM3Dementia.Model.YouTubeVideos;
import IE.walkmate.AM3Dementia.R;


//import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import java.util.List;

    public class
    VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

        List<YouTubeVideos> youtubeVideoList;

     //   List<VideoItems> mListVideo;


        public VideoAdapter() {
        }

        public VideoAdapter(List<YouTubeVideos> youtubeVideoList) {
            this.youtubeVideoList = youtubeVideoList;
        }

        @Override
        public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.video_view, parent, false);

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

                videoWeb = (WebView) itemView.findViewById(R.id.videoWebView);

                videoWeb.getSettings().setJavaScriptEnabled(true);
                videoWeb.setWebChromeClient(new WebChromeClient() {


                } );
            }
        }
    }


