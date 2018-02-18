package com.bakery_app.jitcodez.bakeryapp.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bakery_app.jitcodez.bakeryapp.R;
import com.bakery_app.jitcodez.bakeryapp.model.Recipe;

import java.util.List;

/**
 * Created by jitu on 18/2/18.
 */

public class MainRecipeAdapter extends RecyclerView.Adapter<MainRecipeAdapter.MainReciepeViewHolder> {

    List<Recipe> mRecipes;
    Context mContext;
    public MainRecipeAdapter()
    {

    }
    public MainRecipeAdapter(List<Recipe> recipes, Context context)
    {
        mRecipes=recipes;
        mContext=context;
    }


    @Override
    public MainReciepeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView= LayoutInflater.from(mContext).inflate(R.layout.recipe_item,parent,false);
        MainReciepeViewHolder mv = new MainReciepeViewHolder(itemView);
        return mv;
    }

    @Override
    public void onBindViewHolder(MainReciepeViewHolder holder, int position) {
        holder.bindData(position);
    }

    @Override
    public int getItemCount() {
        return mRecipes.size();
    }

    public class MainReciepeViewHolder extends RecyclerView.ViewHolder {

        TextView recipeTitle;
        public MainReciepeViewHolder(View itemView) {
            super(itemView);
            recipeTitle=(TextView)itemView.findViewById(R.id.recipe_title);
        }

        public void bindData(int position)
        {
            recipeTitle.setText(mRecipes.get(position).getName());
        }
    }
}
