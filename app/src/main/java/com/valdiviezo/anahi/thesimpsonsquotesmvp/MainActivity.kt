package com.valdiviezo.anahi.thesimpsonsquotesmvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.valdiviezo.anahi.thesimpsonsquotes.model.TheSimpsonsQuote
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Anahi Valdiviezo
 */
class MainActivity : AppCompatActivity(), MainMVP.View {

    val presenter: MainPresenter by lazy { MainPresenter(this)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_thesimpsonsquotes.layoutManager = LinearLayoutManager(this)
        rv_thesimpsonsquotes.hasFixedSize()
        presenter.setContentToAdapter()
    }

    override fun setQuoteListAdapter(list: List<TheSimpsonsQuote>?) {
        rv_thesimpsonsquotes.adapter = TheSimpsonsQuoteAdapter(list)
    }

}
