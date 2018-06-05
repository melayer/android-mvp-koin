package com.melayer.homeautomation.home.ui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

import com.melayer.homeautomation.R
import com.melayer.homeautomation.home.mvp.HomeContract
import com.melayer.homeautomation.home.ui.adapter.RecyclerAdapter
import com.melayer.homeautomation.home.ui.model.RecyclerItem
import kotlinx.android.synthetic.main.fragment_one.*
import org.koin.android.ext.android.inject


/**
 * A simple [Fragment] subclass.
 */
class OneFragment : Fragment(), HomeContract.View {

    override val presenter: HomeContract.Presenter by inject()

    override fun openSecond() {
        (activity as HomeActivity).secondFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_one, container, false)
        val dataSet = arrayListOf<RecyclerItem>()
        dataSet.add(RecyclerItem("Android"))
        dataSet.add(RecyclerItem("Java"))
        dataSet.add(RecyclerItem("Kotlin"))
        dataSet.add(RecyclerItem("Php"))
        dataSet.add(RecyclerItem("CSharp"))

        rootView.findViewById<RecyclerView>(R.id.recycler).layoutManager = LinearLayoutManager(activity, LinearLayout.VERTICAL, false)

        rootView.findViewById<RecyclerView>(R.id.recycler).adapter = RecyclerAdapter(dataSet)

        return rootView
    }

}// Required empty public constructor
