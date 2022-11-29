package com.ngelgames.h.gogogogo
import androidx.recyclerview.widget.DiffUtil

class UsersDiffUtilllllll: DiffUtil.ItemCallback<SingleUserrrrrr>() {
    override fun areItemsTheSame(oldItem: SingleUserrrrrr, newItem: SingleUserrrrrr): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: SingleUserrrrrr, newItem: SingleUserrrrrr): Boolean {
        return oldItem == newItem
    }
}