package com.ngelgames.h.gogogogo

import androidx.recyclerview.widget.DiffUtil
import com.ngelgames.h.gogogogo.SlotElement

class DiffUtilItem : DiffUtil.ItemCallback<SlotElement>() {
    override fun areItemsTheSame(oldItem: SlotElement, newItem: SlotElement): Boolean {
        return oldItem.edfrtgt == newItem.edfrtgt
    }

    override fun areContentsTheSame(oldItem: SlotElement, newItem: SlotElement): Boolean {
        return oldItem == newItem
    }
}