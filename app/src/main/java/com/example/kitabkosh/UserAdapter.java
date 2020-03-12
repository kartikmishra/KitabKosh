package com.example.kitabkosh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class UserAdapter  extends RecyclerView.Adapter<UserAdapter.UserAdapterViewHolder> {

    private Context mContext;
    private List<User> userList;

    public UserAdapter(Context mContext, List<User> userList) {
        this.mContext = mContext;
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_user,parent,false);
        return new UserAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapterViewHolder holder, int position) {

        if(userList!= null) {
            holder.name.setText(userList.get(position).getUserName());
            holder.userId.setText(userList.get(position).getUserId());
            holder.schoolName.setText(userList.get(position).getSchoolName());
            holder.className.setText(userList.get(position).getClassName());

            Picasso.get().load(userList.get(position).getProfile_picture()).into(holder.profile);

        }

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    class UserAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView name,userId,schoolName,className;
        ImageView profile;

        public UserAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.text_username);
            userId = itemView.findViewById(R.id.text_user_id);
            schoolName = itemView.findViewById(R.id.text_school_name);
            className = itemView.findViewById(R.id.text_class);
            profile = itemView.findViewById(R.id.profileImage);
        }
    }
}
