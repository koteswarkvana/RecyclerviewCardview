package com.koti.apple.recyclerviewcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Movie> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        mAdapter = new MoviesAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        // adding the row line
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        // added adapter to the recycler view.
        mRecyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    // add items constructor to the list
    private void prepareMovieData() {
        movieList.add(new Movie("Mad Max: Fury Road", "Action & Adventure", "2015"));

        movieList.add(new Movie("Inside Out", "Animation, Kids & Family", "2015"));

        movieList.add(new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015"));

        movieList.add(new Movie("Shaun the Sheep", "Animation", "2015"));

        movieList.add(new Movie("The Martian", "Science Fiction & Fantasy", "2015"));

        movieList.add(new Movie("Mission: Impossible Rogue Nation", "Action", "2015"));

        movieList.add(new Movie("Up", "Animation", "2009"));

        movieList.add(new Movie("Star Trek", "Science Fiction", "2009"));

        movieList.add(new Movie("The LEGO Movie", "Animation", "2014"));

        movieList.add(new Movie("Iron Man", "Action & Adventure", "2008"));

        movieList.add(new Movie("Aliens", "Science Fiction", "1986"));

        movieList.add(new Movie("Chicken Run", "Animation", "2000"));

        movieList.add(new Movie("Back to the Future", "Science Fiction", "1985"));

        movieList.add(new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981"));

        movieList.add(new Movie("Goldfinger", "Action & Adventure", "1965"));

        movieList.add(new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014"));

        mAdapter.notifyDataSetChanged();
    }

}
