package com.nikola.nikoshop.adaptser;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nikola.nikoshop.R;
import com.nikola.nikoshop.modules.Category;

import java.util.List;
import java.util.Locale;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    Context Context;
    List<Category> Categories;

    public CategoryAdapter(android.content.Context context, List<Category> categories) {
        Context = context;
        Categories = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View CategoryItems = LayoutInflater.from(Context).inflate(R.layout.category_item, parent, false );

        return new CategoryViewHolder(CategoryItems);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
    holder.CategoryTitle.setText(Categories.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return Categories.size();
    }

    public static final class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView CategoryTitle;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            CategoryTitle = itemView.findViewById(R.id.categoryTitle);
        }
    }

}
