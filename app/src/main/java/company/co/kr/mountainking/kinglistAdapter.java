package company.co.kr.mountainking;

import android.app.Activity;
import android.support.v7.widget.ListViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jaeheon on 2017-04-25.
 */

public class kinglistAdapter extends ArrayAdapter<String> {
    private final Activity context;

    public kinglistAdapter(Activity context){
        super(context, R.layout.mountain_list_item, Fragment_kinglist.titles);
        this.context = context;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        String[] ttt = Fragment_kinglist.titles;
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mountain_list_item, null, true);
        ImageView mt_Image = (ImageView) rowView.findViewById(R.id.list_mt_image);
        TextView mt_height = (TextView) rowView.findViewById(R.id.mountain_name);
        TextView mt_name = (TextView) rowView.findViewById(R.id.mountain_name);
        TextView jungbok = (TextView) rowView.findViewById(R.id.jungbok_king);
        TextView jungbok_count = (TextView) rowView.findViewById(R.id.jungbok_count);
        TextView speedking = (TextView) rowView.findViewById(R.id.speed_king);
        TextView speed_record = (TextView) rowView.findViewById(R.id.speed_record);

        mt_Image.setImageResource(images[position]);
        return rowView;

    }
}
