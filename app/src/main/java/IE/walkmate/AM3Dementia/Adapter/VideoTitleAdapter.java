package IE.walkmate.AM3Dementia.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

import IE.walkmate.AM3Dementia.Model.VideoItem;
import IE.walkmate.AM3Dementia.R;

public class VideoTitleAdapter extends PagerAdapter {

    List<VideoItem> VideoItemList;
    private TextView videotitle;


    public VideoTitleAdapter(List<VideoItem> VideoItemList) {
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
