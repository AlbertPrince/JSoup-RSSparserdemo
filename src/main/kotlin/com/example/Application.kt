package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import org.jsoup.Jsoup
import org.jsoup.nodes.Element
import org.jsoup.parser.Parser
import javax.lang.model.util.Elements

//import org.jsoup.select.Elements

val rss_site = "http://rss.cnn.com/rss/edition_africa.rss"

fun main() {
    val doc = Jsoup.connect(rss_site).parser(Parser.xmlParser()).get()
//    println(doc)
    val first = doc.select("title").first()
    val titleText: String = first.text()
    println(titleText)
//    val link: Element = doc.select("description").first()
//    println(link)
    for(some in doc.select("title")){
        println(some)
//    }
//    val
//    fun filterString()
}

