package com.duytran.buoi29t3h

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FileAdapter(private val fileDataList: List<FileData>, private val onItemClick: (FileData) -> Unit) :
    RecyclerView.Adapter<FileAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val fileNameTextView: TextView = itemView.findViewById(R.id.fileNameTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_file, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fileData = fileDataList[position]
        holder.fileNameTextView.text = fileData.fileName
        holder.itemView.setOnClickListener { onItemClick(fileData) }
    }

    override fun getItemCount(): Int {
        return fileDataList.size
    }
}