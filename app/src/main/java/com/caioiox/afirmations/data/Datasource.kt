package com.caioiox.afirmations.data

import com.caioiox.afirmations.R
import com.caioiox.afirmations.model.Affirmation

class Datasource {

    /*Os dados exibidos no app podem vir de fontes diferentes
    (por exemplo, dentro do projeto do app ou de uma fonte externa que exija conexão
    com a Internet para fazer o download de dados). Como resultado, os dados podem não
    estar no formato exato que você precisa. O restante do app não precisa se preocupar
    com o local de origem dos dados ou o formato original deles. Você pode e precisa ocultar
    essa preparação de dados em uma classe Datasource separada que prepare os dados para o app.*/

    fun loadAffirmations(): List<Affirmation> {

        return listOf<Affirmation>(
            Affirmation(R.string.afirmations1, R.drawable.image1),
            Affirmation(R.string.afirmations2, R.drawable.image2),
            Affirmation(R.string.afirmations3, R.drawable.image3),
            Affirmation(R.string.afirmations4, R.drawable.image4),
            Affirmation(R.string.afirmations5, R.drawable.image5),
            Affirmation(R.string.afirmations6, R.drawable.image6),
            Affirmation(R.string.afirmations7, R.drawable.image7),
            Affirmation(R.string.afirmations8, R.drawable.image8),
            Affirmation(R.string.afirmations9, R.drawable.image9),
            Affirmation(R.string.afirmations10, R.drawable.image10)
        )
    }
}