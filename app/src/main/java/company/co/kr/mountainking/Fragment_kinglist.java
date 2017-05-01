package company.co.kr.mountainking;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Jaeheon on 2017-04-25.
 */

public class Fragment_kinglist extends ListFragment{

    ListView list;
    public static String[] titles = {
            "지리산",
            "설악산",
            "광교산",
            "한라산",
            "불악산"
    };

    public static Integer[] images = {
            R.drawable.mountains,
            R.drawable.mountains,
            R.drawable.mountains,
            R.drawable.mountains,
            R.drawable.mountains
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

    }
}
