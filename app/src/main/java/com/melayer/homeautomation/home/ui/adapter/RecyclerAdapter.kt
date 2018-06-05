package com.melayer.homeautomation.home.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.melayer.homeautomation.R
import com.melayer.homeautomation.home.ui.model.RecyclerItem
import kotlinx.android.synthetic.main.recycler_item.view.*

/**
 * Created by aniruddha on 26/3/18.
 */
class RecyclerAdapter(
        private val dataSet: ArrayList<RecyclerItem>
) : RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {

        return RecyclerViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        )
    }

    override fun getItemCount(): Int = dataSet.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bindView(dataSet[position])
    }

    class RecyclerViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        fun bindView(item: RecyclerItem) {
            itemView.txtMsg.text = item.name
        }
    }
}