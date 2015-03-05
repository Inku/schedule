package com.ifeng.schedule.groovy

/**
 * Created by zhengpeng on 15/3/5.
 */

class Song {
    def name
    def artist
    def genre

    String toString(){
        "${name}, ${artist}, ${getGenre()}"
    }

    def getGenre(){
        genre?.toUpperCase()
    }
}