package IE.walkmate.AM3Dementia.activities.chair_tut;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

import IE.walkmate.AM3Dementia.activities.pilates_tut.VideoItem_Pilates;

public class VideoTitleAdapter_Chair extends PagerAdapter {

    List<VideoItem_Chair> VideoItemList;
    private TextView videotitle;


    public VideoTitleAdapter_Chair(List<VideoItem_Chair> VideoItemList) {
        this.VideoItemList = VideoItemList;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {


        // videotitle = videotitle.findViewById(R.id.textView_vd);
        videotitle.setText(VideoItemList.get(position).getVideo_Title());
        return super.instantiateItem(container, position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
}