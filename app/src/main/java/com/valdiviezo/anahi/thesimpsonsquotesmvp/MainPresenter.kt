package com.valdiviezo.anahi.thesimpsonsquotesmvp

import com.valdiviezo.anahi.thesimpsonsquotes.model.TheSimpsonsQuote

/**
 * @author Anahi Valdiviezo
 */
class MainPresenter (var view : MainMVP.View) : MainMVP.Presenter {
    val interactor = MainInteractor(this)

    override fun displayQuoteList(list: List<TheSimpsonsQuote>?) {
        view.setQuoteListAdapter(list)
    }

    override fun setContentToAdapter() {
        interactor.getQuotesFromServer()
    }


}