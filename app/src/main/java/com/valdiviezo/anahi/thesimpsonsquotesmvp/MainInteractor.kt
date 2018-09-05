package com.valdiviezo.anahi.thesimpsonsquotesmvp

import com.valdiviezo.anahi.thesimpsonsquotes.model.TheSimpsonsQuote
import com.valdiviezo.anahi.thesimpsonsquotesmvp.api.TheSimpsonsQuoteRetriver
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * @author Anahi Valdiviezo
 */
class MainInteractor(var presenter : MainMVP.Presenter) : MainMVP.Interactor {


    override fun getQuotesFromServer() {
        var quotes : List<TheSimpsonsQuote>?

        val retrieverRandomQuote = TheSimpsonsQuoteRetriver()

        var callbackQuoteList = object : Callback<List<TheSimpsonsQuote>> {
            override fun onFailure(call: Call<List<TheSimpsonsQuote>>?, t: Throwable?) {
                val message: String = "There was a failure."
            }

            override fun onResponse(call: Call<List<TheSimpsonsQuote>>?, response: Response<List<TheSimpsonsQuote>>?) {
                quotes = response?.body()
                presenter.displayQuoteList(quotes)
            }

        }

        retrieverRandomQuote.getTheSimpsonsQuotesList(callbackQuoteList)    }


}