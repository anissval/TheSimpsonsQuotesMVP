package com.valdiviezo.anahi.thesimpsonsquotesmvp

import com.valdiviezo.anahi.thesimpsonsquotes.model.TheSimpsonsQuote

/**
 * @author Anahi Valdiviezo
 */
class MainMVP {

    interface View {
        fun setQuoteListAdapter(list: List<TheSimpsonsQuote>?)
    }

    interface Presenter {
        fun displayQuoteList(list : List<TheSimpsonsQuote>?)
        fun setContentToAdapter()
    }

    interface Interactor {
        fun getQuotesFromServer()
    }

}