package tadumadzerati.chat.firebase.app.extensions

import android.support.design.widget.TextInputLayout

fun TextInputLayout.getText() : String {

    return editText?.text.toString()
}