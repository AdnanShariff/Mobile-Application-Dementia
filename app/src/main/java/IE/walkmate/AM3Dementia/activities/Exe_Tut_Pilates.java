package IE.walkmate.AM3Dementia.activities;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import IE.walkmate.AM3Dementia.R;
import IE.walkmate.AM3Dementia.activities.pilates_tut.VideoAdapter_Pilates;
import IE.walkmate.AM3Dementia.activities.pilates_tut.VideoItem_Pilates;
import IE.walkmate.AM3Dementia.activities.pilates_tut.VideoTitleAdapter_Pilates;
import IE.walkmate.AM3Dementia.activities.pilates_tut.YouTubeVideos_Pilates;

public class Exe_Tut_Pilates extends AppCompatActivity {

    RecyclerView recyclerView;
    private ActionBar actionBar;

    ArrayList<YouTubeVideos_Pilates> youtubeVideos = new ArrayList<YouTubeVideos_Pilates>();
    final List<VideoItem_Pilates> mListTitlePilates = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exe_pilates);


        recyclerView = (RecyclerView) findViewById(R.id._exe_pilates_recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        //youtubeVideos.add( new YouTubeVideos_Pilates("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/9vljJ0u-avg\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos_Pilates("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/t4X7vWF4UQY\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos_Pilates("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fWI1Ezgm3sA\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos_Pilates("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4kt9sp2qL2c\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos_Pilates("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/VL4an7UC3wA\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos_Pilates("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/pCpiteBel8E\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos_Pilates("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/GYe1WeAEbZY\" frameborder=\"0\" allowfullscreen></iframe>") );
       // youtubeVideos.add( new YouTubeVideos_Pilates("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/i3PYS_jsA1c\" frameborder=\"0\" allowfullscreen></iframe>") );
        //youtubeVideos.add( new YouTubeVideos_Pilates("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/j_u0DQ3DKUQ\" frameborder=\"0\" allowfullscreen></iframe>") );
        //youtubeVideos.add( new YouTubeVideos_Pilates("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/LKQzfHYaHio\" frameborder=\"0\" allowfullscreen></iframe>") );
       // youtubeVideos.add( new YouTubeVideos_Pilates("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/PLseEst8sYZkSVKyHkC9rjkPnSsKThxfbu\" frameborder=\"0\" allowfullscreen></iframe>") );
        VideoTitleAdapter_Pilates videoTitleAdapter = new VideoTitleAdapter_Pilates(mListTitlePilates);
        VideoAdapter_Pilates videoAdapter = new VideoAdapter_Pilates(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);

    }
}
