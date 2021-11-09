package com.example

import com.example.plugins.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.parser.Parser
import org.jsoup.select.Elements


//import org.jsoup.select.Elements

class Feeds {
    var title: String? = ""
    var description: String? = ""
    var link: String? = ""
    var image: String? = ""

    override fun toString(): String {
        return "$title"
    }

    var date: String? = ""
}

val rss_site = "http://rss.cnn.com/rss/edition_africa.rss"
val rss_site2 = "https://technovagh.com/feed/"

fun main() {
//    val elements: List<Element>
//
    val doc = Jsoup.connect(rss_site2).parser(Parser.xmlParser()).get()
//    for (e: Element in doc.select("item")){
//        elements
//    }

//    val elements: MutableList<Element> = ArrayList()
//    val doc = Jsoup.connect(rss_site).parser(Parser.xmlParser()).get()
////    println(doc)
////    for (e in doc.select("item")){
////        elements.add(e)
//        val title = doc.select("title").text()
//        val description = doc.select("description").text()
//        val link = doc.select("link").text()
////        val image = e.children().select("img").attr("src")
//
////        val feeds = ListItem()
////        val images: Elements = document.select("img[src~=(?i)\\.(png|jpe?g|gif)]")
//
//        println("$title - $link - $description")
//        println("$image")
//    }



//    {
//        val elements: MutableList<Element> = ArrayList()
//        try {
//            val doc: Document =
//                Jsoup.connect("http://ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topfreeapplications/limit=10/xml")
//                    .get()
//            for (e in doc.select("entry")) {
//                elements.add(e)
//                val updated = e.select("updated").text()
//                val artist = e.select("im|artist").text()
//                val releaseDate = e.select("im|releasedate").text()
//                println("$updated - $artist - $releaseDate")
//                val item = ListItem(updated, artist, releaseDate)
//                //rest of the code to add the new item to a data store
//            }
//            println("Number of entries: " + elements.size)
//        } catch (e: IOException) {
//            e.printStackTrace()
//        }
//    }




//    println(doc)
//    val first = doc.select("title").first()
//    val titleText: String = first.text()
//    println(titleText)
//    val link: Element = doc.select("description").first()
//    println(link)
    for (some in doc.select("title")) {
//        if (some.text().contains("Nigeria"))
//            println("description: " + some.ownText())
        println("description: " + some.text())
    }

//    val titles = doc.select("title").text()
//    for (title in titles) println(title)
//    val
//    fun filterString()
    }



//fun extractIt() {
//    val doc = Jsoup.connect(rss_site).parser(Parser.xmlParser()).get()
//    val feed = Feeds()
//
//    feed.title = doc.select("title").text()
//    feed.description = doc.select("description").text()
//    feed.date = doc.select("date").text()
//    feed.link = doc.select("link").text()
//}

