package com.example.phurinat.firerecycleview1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FoodEnrollSearch extends AppCompatActivity {

    private EditText mSearchField;
    private ImageButton mSearchBtn;

    private RecyclerView mResultList;
    private DatabaseReference mUserDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_enroll_search);

//        mUserDatabase = FirebaseDatabase.getInstance().getReference("Users");
//
//        mSearchField = (EditText)findViewById(R.id.search_field);
//        mSearchBtn= (ImageButton) findViewById(R.id.search_btn);
//
//        mResultList= (RecyclerView)findViewById(R.id.result_list);
//        mResultList.setHasFixedSize(true);
//        mResultList.setLayoutManager(new LinearLayoutManager(this));
//
//
//        mSearchBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               firebaseUserSearch();
//            }
//        });


    }
//
//    private void firebaseUserSearch() {
//
//        FirebaseRecyclerAdapter<Users, UserViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Users, UserViewHolder>(
//                Users.class,
//                R.layout.searchresultlistlayout,
//                UserViewHolder.class,
//                mUserDatabase
//        ) {
//
//
//            protected void populateViewHolder(UserViewHolder viewHolder, Users model, int position) {
//
//
//                viewHolder.setDetails(getApplicationContext(),model.getName(), model.getStatus(), model.getImage());
//            }
//
//        };
//        mResultList.setAdapter(firebaseRecyclerAdapter);
//    }
//
//    //View holder class
//    public static class UserViewHolder extends RecyclerView.ViewHolder{
//
//        View mView;
//
//        public UserViewHolder(View itemView){
//
//            super (itemView);
//
//            mView = itemView;
//        }
//
//        public void setDetails(Context ctx, String userName, String userStatus, String userImage){
//
//            TextView user_name = (TextView)mView.findViewById(R.id.name_text);
//            TextView user_status = (TextView)mView.findViewById(R.id.status_text);
//            ImageView user_image = (ImageView) mView.findViewById(R.id.profile_image);
//
//
//            user_name.setText(userName);
//            user_status.setText(userStatus);
//
//            Glide.with(ctx).load(user_image).into(user_image);
//
//        }
//
//    }
}
