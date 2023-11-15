package com.nikola.nikoshop.adaptser;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nikola.nikoshop.R;
import com.nikola.nikoshop.modules.Course;


public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.CourseViewHolder> {
    Context context;
    List<Course> courses;

    public CoursesAdapter(Context context, List<Course> courses) {
        this.context = context;
        this.courses = courses;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View CourseItems = LayoutInflater.from(context).inflate(R.layout.corses_item, parent, false );


        return new CoursesAdapter.CourseViewHolder(CourseItems);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        holder.courseBg.setBackgroundColor(Color.parseColor(courses.get(position).getColor()));

        int imageId = context.getResources().getIdentifier( "ic_" + courses.get(position).getImg(), "drawable", context.getPackageName());
        holder.courseIMG.setImageResource(imageId);

        holder.courseTitle.setText(courses.get(position).getTitle());
        holder.courseLevel.setText(courses.get(position).getLavel());
        holder.courseData.setText(courses.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    public static final class CourseViewHolder extends RecyclerView.ViewHolder{

        LinearLayout courseBg;
        ImageView courseIMG;
        TextView courseTitle, courseData, courseLevel;
        public CourseViewHolder(@NonNull View itemView) {
             super(itemView);

            courseBg = itemView.findViewById(R.id.courseBg);
            courseIMG = itemView.findViewById(R.id.courseIMG);
            courseTitle = itemView.findViewById(R.id.CoursesTtle);
            courseData = itemView.findViewById(R.id.CourseDate);
            courseLevel = itemView.findViewById(R.id.CourseLevel);
        }
    }

   // Context context;
}
