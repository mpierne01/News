package com.marcpierne.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.marcpierne.news.model.NewsArticle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView newsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<NewsArticle> newsArticles = new ArrayList<>();
        newsArticles.add(new NewsArticle("Doctors share gun stories, demand action after NRA tells them to 'stay in their lane","Two signs of the times: another mass shooting and more Twitter outrage. This time, though, the barbs over social media came from the medical community in response to a tweet from the National Rifle Association.",
                "https://cdn.cnn.com/cnnnext/dam/assets/151008102129-gun-american-flag-illustration-exlarge-tease.jpg", "today,","https://www.cnn.com/2018/11/08/health/nra-tweet-doctors-react/index.html"));

        newsArticles.add(new NewsArticle("Turkey shares tapes on Khashoggi's death", "Istanbul, Turkey (CNN)Recordings related to Saudi journalist Jamal Khashoggi's death have been passed on to Saudi Arabia, the United States, the United Kingdom, Germany and France, Turkey's President Recep Tayyip Erdogan said Saturday.",
                "https://cdn.cnn.com/cnnnext/dam/assets/181003085839-01-jamal-khashoggi-file-medium-tease.jpg", "today", "https://www.cnn.com/2018/11/10/middleeast/turkey-saudi-khashoggi-investigation-intl/index.html"));

        NewsStore.setNewsArticles(newsArticles);
        NewsStore.setNewsArticles(newsArticles);

        newsRecyclerView = (RecyclerView) findViewById(R.id.activity_main_recyclerview);
        newsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        HomeNewsAdapter homeNewsAdapter = new HomeNewsAdapter(NewsStore.getNewsArticles());
        newsRecyclerView.setAdapter(homeNewsAdapter);
    }
}
