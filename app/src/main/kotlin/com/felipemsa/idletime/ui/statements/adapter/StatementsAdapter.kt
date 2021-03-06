package com.felipemsa.idletime.ui.statements.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.felipemsa.idletime.R
import com.felipemsa.idletime.data.Statement

class StatementsAdapter(private val items: List<Statement>) : RecyclerView.Adapter<StatementViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int) =
            StatementViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_transaction, parent, false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: StatementViewHolder, position: Int) {
        holder.bind(items[position])
    }

}