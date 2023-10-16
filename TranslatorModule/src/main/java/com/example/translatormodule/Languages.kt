package com.example.translatormodule

import android.widget.TextView
import com.google.mlkit.common.model.DownloadConditions
import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.TranslatorOptions

object Languages {

    private var conditions= DownloadConditions.Builder().requireWifi().build()

    fun LanguageTranslation(InputText : String, Output : TextView, From : String, To : String){
        val options= TranslatorOptions.Builder()
            .setSourceLanguage(From)
            .setTargetLanguage(To)
            .build()

        val translator= Translation.getClient(options)
        translator.downloadModelIfNeeded(conditions)
            .addOnSuccessListener {
                translator.translate(InputText)
                    .addOnSuccessListener {
                        Output.text = it
                    }
            }
            .addOnFailureListener {
//                toast(it.message.toString())
            }

    }

    fun English(): String {
        return TranslateLanguage.ENGLISH
    }

    fun Urdu(): String {
        return TranslateLanguage.URDU
    }

    fun Hindi(): String {
        return TranslateLanguage.HINDI
    }

    fun Arabic(): String {
        return TranslateLanguage.ARABIC
    }

    fun Bengali(): String {
        return TranslateLanguage.BENGALI
    }

    fun Chinese(): String {
        return TranslateLanguage.CHINESE
    }

    fun French(): String {
        return TranslateLanguage.FRENCH
    }

    fun German(): String {
        return TranslateLanguage.GERMAN
    }

    fun Greek(): String {
        return TranslateLanguage.GREEK
    }

    fun Japanese(): String {
        return TranslateLanguage.JAPANESE
    }

    fun Korean(): String {
        return TranslateLanguage.KOREAN
    }

    fun Italian(): String {
        return TranslateLanguage.ITALIAN
    }

    fun Turkish(): String {
        return TranslateLanguage.TURKISH
    }

    fun Russian(): String {
        return TranslateLanguage.RUSSIAN
    }

    fun Spanish(): String {
        return TranslateLanguage.SPANISH
    }

}