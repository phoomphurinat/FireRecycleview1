package com.example.phurinat.firerecycleview1;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private android.support.v7.widget.RecyclerView mBloglist;
    private com.google.firebase.database.DatabaseReference mDatabase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDatabase=com.google.firebase.database.FirebaseDatabase.getInstance().getReference().child("Global");
        mDatabase.keepSynced(true);

        mBloglist=(android.support.v7.widget.RecyclerView)findViewById(R.id.myRecycleView);
        mBloglist.setHasFixedSize(true);
        mBloglist.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));


    }

    @Override
    public void onStart(){
        super.onStart();
        FirebaseRecyclerAdapter<Blog,BlogViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter <Blog, BlogViewHolder>

                (Blog.class,R.layout.card,BlogViewHolder.class,mDatabase)
        {

            public void populateViewHolder(BlogViewHolder viewHolder, Blog model, int position){
                viewHolder.setTitle(model.getTitle());
                viewHolder.setDesc(model.getDesc());
                viewHolder.setImage(getApplicationContext(),model.getImage());

            }


        };

        mBloglist.setAdapter(firebaseRecyclerAdapter);

    }

    public static class BlogViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder

    {
        android.view.View mView;
        public BlogViewHolder(android.view.View itemView)
        {
            super(itemView);
            mView=itemView;
            }
            public void setTitle(String title)
            {
                android.widget.TextView post_title= (android.widget.TextView) mView.findViewById(R.id.post_title);
                post_title.setText(title);
            }

            public void setDesc(String desc)
            {
                android.widget.TextView post_desc=(android.widget.TextView)mView.findViewById(R.id.post_desc);
                post_desc.setText(desc);

            }

            public void setImage(android.content.Context ctx, String image)
           {
                android.widget.ImageView post_Image = (android.widget.ImageView)mView.findViewById(R.id.post_image);
                Picasso.with(ctx).load(image).into(post_Image);
           }

    }


}
