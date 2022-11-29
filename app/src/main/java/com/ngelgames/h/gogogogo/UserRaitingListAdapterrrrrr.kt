package com.ngelgames.h.gogogogo

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ngelgames.h.R
import com.ngelgames.h.databinding.OneeeeUssserBinding
import kotlin.random.Random


class UserRaitingListAdapterrrrrr() :
    ListAdapter<SingleUserrrrrr, UserRaitingListAdapterrrrrr.IDJrjfthguth>(UsersDiffUtilllllll()) {

    private var gtgt: ((person: SingleUserrrrrr) -> Unit)? = null
    private var gtgthyhy: ((recipe: SingleUserrrrrr) -> Unit)? = null

    class IDJrjfthguth(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = OneeeeUssserBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IDJrjfthguth {
        LayoutInflater.from(parent.context)
            .inflate(R.layout.oneeee_ussser, parent, false).also {
                return IDJrjfthguth(it)
            }
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: IDJrjfthguth, position: Int) {
        val currentItem = getItem(position)
        val listNames = listOf(
            "sasha",
            "masha",
            "roma",
            "denis",
            "eva",
            "nastya",
            "kolya",
            "john",
            "noname",
            "rembo",
            "frodo",
            "gimli"
        )

        val tgthyjuu = listOf(
            R.drawable.dfrgty,
            R.drawable.dddd,
            R.drawable.eeee,
            R.drawable.lll,
            R.drawable.sss,
        )
        holder.binding.apply {
            val ggttgt = tgthyjuu.random()
            val hyhyhy = Random.nextInt(1, 5000)
            tvName.text = currentItem.name
            tvScore.text = hyhyhy.toString()
            imgPersonAvataer.setImageResource(ggttgt)
            root.setOnClickListener {
                gtgt?.invoke(currentItem)
            }

        }
    }

    fun gyhftgyh(listener: (person: SingleUserrrrrr) -> Unit) {
        gtgt = listener
    }
}