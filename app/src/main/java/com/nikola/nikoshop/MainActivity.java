package com.nikola.nikoshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nikola.nikoshop.adaptser.CategoryAdapter;
import com.nikola.nikoshop.adaptser.CoursesAdapter;
import com.nikola.nikoshop.modules.Category;
import com.nikola.nikoshop.modules.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, coursesRecycler;

    CategoryAdapter categoryAdapter;
    CoursesAdapter coursesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1,"Игры"));
        categoryList.add(new Category(2,"Сайты"));
        categoryList.add(new Category(3,"Языки"));
        categoryList.add(new Category(4,"Прочее"));

        setCategoryRecycler(categoryList);

        //////////////////////////////////////////////////////////////////////////

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(new Course(1,"java", "Профессия Java\nразработчик", "1 Января", "Junior", "#424345"));
        coursesList.add(new Course(2,"python", "Профессия Python\nразработчик", "15 Января", "Junior", "#9FA52D"));

        setCourseRecycler(coursesList);

    }



    private void setCategoryRecycler (List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }



    private void setCourseRecycler (List<Course> coursesList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false);

        coursesRecycler = findViewById(R.id.coursesRecycler);
        coursesRecycler.setLayoutManager(layoutManager);

        coursesAdapter = new CoursesAdapter(this, coursesList);
        coursesRecycler.setAdapter(coursesAdapter);
    }
}