package com.ifeng.schedule.groovy

/**
 * Created by zhengpeng on 15/3/5.
 */
class SongDemo {
    static void main(args) {
        def sng = new Song(name: "Le Freak",
                artist: "Chic", genre: "Disco")
        sng.setGenre "Disco"

        def sng4 = new Song(name:"Thriller", artist:"Michael Jackson")
        println sng4
    }
}
