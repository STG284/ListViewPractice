package com.stg.great.verma.listviewpractice;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.stg.great.verma.listviewpractice.R;

public class CustomListAdapter extends ArrayAdapter  {
    private final Activity context;
    private final Integer[] ImageIdArray;
    private final String[] nameArray;
    private final String[] infoArray;
    private boolean Flag_btn_fav_clicked ;

    public CustomListAdapter(Activity context, Integer[] ImageIdArrayParam,
                             String[] nameArrayParam, String[] infoArrayParam){
        super(context, R.layout.listview_row,nameArrayParam);
        this.context = context;
        this.ImageIdArray = ImageIdArrayParam;
        this.infoArray = infoArrayParam;
        this.nameArray = nameArrayParam;
        this.Flag_btn_fav_clicked = false;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview_row,null,true);
        TextView nameTextField = rowView.findViewById(R.id.nametextView);
        TextView infoTextField = rowView.findViewById(R.id.infotextView);
        ImageView imageview = rowView.findViewById(R.id.imageView);

        final Button btn_fav = rowView.findViewById(R.id.buttonfav);
        btn_fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"clicked",Toast.LENGTH_SHORT).show();
                if(Flag_btn_fav_clicked == false){
                    Flag_btn_fav_clicked = true;
                    btn_fav.setBackgroundResource(R.drawable.btn_star_big_on);
                }else{
                    Flag_btn_fav_clicked = false;
                    btn_fav.setBackgroundResource(R.drawable.btn_star_big_off);
                }

            }
        });

        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageview.setImageResource(ImageIdArray[position]);
        return rowView;
    }
}
