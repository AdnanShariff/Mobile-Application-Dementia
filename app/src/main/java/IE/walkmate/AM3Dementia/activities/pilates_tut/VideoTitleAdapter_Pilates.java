package IE.walkmate.AM3Dementia.activities.pilates_tut;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

import IE.walkmate.AM3Dementia.activities.tai_chi_tut.VideoItem_Tai;

public class VideoTitleAdapter_Pilates extends PagerAdapter {

    List<VideoItem_Pilates> VideoItemList;
    private TextView videotitle;


    public VideoTitleAdapter_Pilates(List<VideoItem_Pilates> VideoItemList) {
        this.VideoItemList = VideoItemList;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {


        // videotitle = videotitle.findViewById(R.id.textView_vd);
        videotitle.setText(VideoItemList.get(position).getVideo_Title());
        return super.instantiateItem(container, position);
    }



    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
}
