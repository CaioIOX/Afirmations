package com.caioiox.afirmations.data

import com.caioiox.afirmations.R
import com.caioiox.afirmations.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {

        return listOf<Affirmation>(
            Affirmation(R.string.afirmations1),
            Affirmation(R.string.afirmations2),
            Affirmation(R.string.afirmations3),
            Affirmation(R.string.afirmations4),
            Affirmation(R.string.afirmations5),
            Affirmation(R.string.afirmations6),
            Affirmation(R.string.afirmations7),
            Affirmation(R.string.afirmations8),
            Affirmation(R.string.afirmations9),
            Affirmation(R.string.afirmations10)
        )
    }
}