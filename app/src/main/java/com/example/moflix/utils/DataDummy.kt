package com.example.moflix.utils

import com.example.moflix.R
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.data.source.remote.response.MoviesResponse
import com.example.moflix.data.source.remote.response.TvshowResponse

object DataDummy {

    fun generateRemoteDummyMovies(): List<MoviesResponse>{
        val movies = ArrayList<MoviesResponse>()

        movies.add(
            MoviesResponse("578701"
        ,"Those Who Wish Me Dead",
        "Seorang bintang musik country yang karirnya mulai memudar, Jackson Maine (Bradley Cooper) menemukan sebuah talenta yang sangat berbakat di dalam diri dari seorang musisi muda bernama Ally (Lady Gaga). Maine berhasil mengorbitkan Ally menjadi seorang bintang muda yang menjanjikan. Namun keduanya terlibat hubungan yang lebih jauh dari sekedar mentor dan anak didik. Seiring dengan meroketnya karir dari Ally dan dirinya, Maine mengalami dilema mengenai masalah ini.",
        "05-10-2018",
        "7.5/10",
        "R.drawable.poster_a_start_is_born")
        )
        movies.add(
            MoviesResponse("460465"
                ,"Mortal Kombat",
                "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "14-02-2019",
                "7.2/10",
                "R.drawable.poster_alita")
        )
        movies.add(
            MoviesResponse("567189"
                ,"Tom Clancy's Without Remorse",
                "Dulunya rumah bagi peradaban paling maju di Bumi, Atlantis sekarang menjadi kerajaan bawah air yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan besar yang dimilikinya, Orm berencana untuk menaklukkan orang-orang samudra yang tersisa dan kemudian dunia permukaan. Yang menghalangi jalannya adalah Arthur Curry, saudara setengah manusia Orm, saudara setengah Atlantis dan pewaris sejati takhta.",
                "21-12-2018",
                "6.9/10",
                "R.drawable.poster_aquaman")
        )
        movies.add(
            MoviesResponse("399566"
                ,"Creed II",
                "Antara kewajiban pribadi dan pelatihan untuk pertarungan besar berikutnya melawan lawan yang terkait dengan masa lalu keluarganya, Adonis Creed menghadapi tantangan dalam hidupnya.",
                "21-11-2018",
                "6.9/10",
                "R.drawable.poster_creed")
        )
        movies.add(
            MoviesResponse("615457"
                ,"How to Train Your Dragon: The Hidden World",
                "Ketika Hiccup memenuhi mimpinya untuk menciptakan utopia naga yang damai, penemuan Toothless 'dari pasangan yang tak teruji dan sukar ditangkap membuat Night Fury menjauh. Ketika bahaya meningkat di rumah dan pemerintahan Hiccup sebagai kepala desa diuji, baik naga dan pengendara harus membuat keputusan yang mustahil untuk menyelamatkan jenis mereka.",
                "09-01-2019",
                "7.8/10",
                "R.drawable.poster_how_to_train")
        )
        movies.add(
            MoviesResponse("632357"
                ,"Avengers: Infinity War",
                "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                "27-04-2018",
                "8.3/10",
                "R.drawable.poster_infinity_war")
        )
        movies.add(
            MoviesResponse("813258"
                ,"Overlord",
                "Prancis, Juni 1944. Menjelang D-Day, beberapa pasukan terjun payung Amerika tertinggal di belakang garis musuh setelah pesawat mereka jatuh saat dalam misi untuk menghancurkan menara radio di sebuah desa kecil dekat pantai Normandia. Setelah mencapai target mereka, pasukan terjun payung yang selamat menyadari bahwa, selain melawan pasukan Nazi yang berpatroli di desa, mereka juga harus melawan hal lain.",
                "09-11-2018",
                "6.7/10",
                "R.drawable.poster_overlord")
        )
        movies.add(
            MoviesResponse("811367"
                ,"Ralph Breaks the Internet",
                "Si penjahat video game Ralph dan Vanellope von Schweetz harus mengambil risiko dengan melakukan perjalanan ke World Wide Web untuk mencari suku cadang pengganti untuk menyelamatkan video game Vanellope, Sugar Rush. Jauh di atas kepala mereka, Ralph dan Vanellope mengandalkan warga internet - para netizen - untuk membantu menavigasi jalan mereka, termasuk seorang wirausahawan bernama Yesss, yang merupakan kepala algoritme dan jantung serta jiwa situs pembuat tren BuzzzTube.",
                "21-11-2018",
                "7.2/10",
                "R.drawable.poster_ralph")
        )
        movies.add(
            MoviesResponse("635302"
                ,"Spider-Man: Into the Spider-Verse",
                "Miles Morales menyulap hidupnya antara menjadi siswa sekolah menengah dan menjadi manusia laba-laba. Ketika Wilson \"Kingpin\" Fisk menggunakan super collider, yang lain dari seberang Spider-Verse dipindahkan ke dimensi ini.",
                "14-12-2018",
                "8.4/10",
                "R.drawable.poster_spiderman")
        )
        movies.add(
            MoviesResponse("791373"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesResponse("573680"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesResponse("527774"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesResponse("726684"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesResponse("804435"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesResponse("634528"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesResponse("808023"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesResponse("681260"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesResponse("643586"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesResponse("717192"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesResponse("825597"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )


        return movies
    }

    fun generateRemoteDummyTvshow(): List<TvshowResponse>{

        val tvShows = ArrayList<TvshowResponse>()

        tvShows.add(
            TvshowResponse("120168",
            "Game of Thrones",
            "Tujuh keluarga bangsawan berjuang untuk menguasai tanah mitos Westeros. Gesekan antara rumah-rumah mengarah ke perang skala penuh. Semua sementara kejahatan yang sangat kuno terbangun di utara terjauh. Di tengah-tengah perang, perintah militer yang diabaikan, Night's Watch, adalah yang berdiri di antara alam manusia dan kengerian es di luarnya.",
            "04-11-2011",
            "8.4/10",
                " R.drawable.poster_god"
        )
        )
        tvShows.add(
            TvshowResponse("60735",
            "Gotham",
            "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui tentang kisah Gordon dan kenaikannya dari detektif pemula ke Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia? Dan keadaan apa yang menciptakan mereka - persona yang lebih besar dari kehidupan yang akan menjadi Catwoman, The Penguin, The Riddler, Two-Face dan The Joker?",
            "22-9-2014",
            "7.5/10",
                "R.drawable.poster_gotham"
        )
        )
        tvShows.add(
            TvshowResponse("71712",
            "Dragon Ball",
            "Dahulu kala di pegunungan, seorang master pertempuran yang dikenal sebagai Gohan menemukan seorang bocah aneh yang ia beri nama Goku. Gohan membesarkannya dan melatih Goku dalam seni bela diri sampai dia mati. Bocah muda dan sangat kuat itu sendirian, tetapi mudah dikelola. Kemudian suatu hari, Goku bertemu dengan seorang gadis remaja bernama Bulma, yang pencariannya untuk bola naga membawanya ke rumah Goku. Bersama-sama, mereka berangkat untuk menemukan ketujuh bola naga dalam sebuah petualangan yang akan mengubah hidup Goku selamanya. Lihat bagaimana Goku bertemu teman-teman seumur hidupnya Bulma, Yamcha, Krillin, Master Roshi dan banyak lagi.",
            "26-2-1986",
            "8.1/10",
                " R.drawable.poster_dragon_ball"
        )
        )
        tvShows.add(
            TvshowResponse("88396",
            "Fairy Tail",
            "Lucy adalah seorang gadis berusia 17 tahun, yang ingin menjadi penyihir sejati. Suatu hari ketika mengunjungi Kota Harujion, dia bertemu dengan Natsu, seorang pemuda yang mudah sakit dengan segala jenis transportasi. Tapi Natsu bukan sembarang anak biasa, dia adalah anggota dari salah satu guild penyihir paling terkenal di dunia: Fairy Tail.",
            "12-10-2009",
            "7.8/10",
                "R.drawable.poster_fairytail"
        )
        )
        tvShows.add(
            TvshowResponse("1416",
            "Family Guy",
            "Seri animasi animasi Freakin 'Sweet yang sakit, terpelintir, dan salah, menampilkan petualangan keluarga Griffin yang disfungsional. Peter yang kikuk dan Lois yang sudah lama menderita memiliki tiga anak. Stewie (bayi yang brilian tetapi sadis yang bertekad membunuh ibunya dan mengambil alih dunia), Meg (yang tertua, dan merupakan gadis yang paling tidak populer di kota) dan Chris (anak tengah, dia tidak terlalu cerdas tetapi memiliki hasrat untuk film ). Anggota terakhir keluarga itu adalah Brian - anjing yang bisa bicara dan lebih dari sekadar hewan peliharaan, ia menjaga Stewie, sementara menghirup Martinis dan memilah-milah masalah hidupnya sendiri.",
            "31-1-1999",
            "7.0/10",
                "R.drawable.poster_family_guy"
        )
        )
        tvShows.add(
            TvshowResponse("95557",
            "The Flash",
            "Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat. Meskipun awalnya senang dengan kekuatan barunya, Barry terkejut menemukan bahwa dia bukan satu-satunya \"manusia meta\" yang diciptakan setelah ledakan akselerator - dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan. Barry bermitra dengan S.T.A.R. Lab dan mendedikasikan hidupnya untuk melindungi yang tidak bersalah. Untuk saat ini, hanya beberapa teman dekat dan rekan yang tahu bahwa Barry secara harfiah adalah manusia tercepat, tetapi tidak lama sebelum dunia mengetahui apa yang menjadi Barry Allen ... The Flash.",
            "7-10-2014",
            "7.7/10",
                "R.drawable.poster_flash"
        )
        )
        tvShows.add(
            TvshowResponse("63174",
            "Naruto Shippuuden",
            "Naruto Shippuuden adalah kelanjutan dari serial TV animasi asli Naruto. Kisah ini berkisah tentang Uzumaki Naruto yang lebih tua dan sedikit lebih matang dan upayanya untuk menyelamatkan temannya Uchiha Sasuke dari cengkeraman Shinobi seperti ular, Orochimaru. Setelah 2 setengah tahun, Naruto akhirnya kembali ke desanya Konoha, dan mulai mewujudkan ambisinya, meskipun itu tidak akan mudah, karena Ia telah mengumpulkan beberapa musuh (lebih berbahaya), seperti organisasi shinobi. ; Akatsuki.",
            "15-02-2007",
            "8.6/10",
                "R.drawable.poster_naruto_shipudden"
        )
        )
        tvShows.add(
            TvshowResponse("86831",
            "The Simpsons",
            "Bertempat di Springfield, kota rata-rata di Amerika, pertunjukan ini berfokus pada kejenakaan dan petualangan sehari-hari keluarga Simpson; Homer, Marge, Bart, Lisa dan Maggie, serta ribuan pemain virtual. Sejak awal, serial ini telah menjadi ikon budaya pop, menarik ratusan selebriti menjadi bintang tamu. Acara ini juga menjadi terkenal karena satirnya yang tak kenal takut terhadap kehidupan politik, media, dan Amerika secara umum.",
            "17-12-1989",
            "7.8/10",
                "R.drawable.poster_the_simpson"
        )
        )
        tvShows.add(
            TvshowResponse("79008",
            "Supergirl",
            "Kara Zor-El yang berusia dua puluh empat tahun, yang diambil oleh keluarga Danvers ketika dia berusia 13 tahun setelah diusir dari Krypton, harus belajar merangkul kekuatannya setelah sebelumnya menyembunyikannya. The Danvers mengajarinya untuk berhati-hati dengan kekuatannya, sampai dia harus mengungkapkannya selama bencana yang tidak terduga, menempatkannya dalam perjalanan kepahlawanannya.",
            "26-10-2015",
            "7.3/10",
                "R.drawable.poster_supergirl"
        )
        )
        tvShows.add(
            TvshowResponse("93484",
            "The Walking Dead",
            "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
            "31-10-2010",
            "8.1/10",
                "R.drawable.poster_the_walking_dead"
        )
        )
        tvShows.add(
            TvshowResponse("69050",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowResponse("93741",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowResponse("105971",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowResponse("62286",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowResponse("1399",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowResponse("80240",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowResponse("95057",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowResponse("69478",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowResponse("1402",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowResponse("79460",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )


        return tvShows
    }

    fun generateDummyMovies(): ArrayList<MoviesEntity>{
        val movies = ArrayList<MoviesEntity>()

        movies.add(
            MoviesEntity("578701"
                ,"Those Who Wish Me Dead",
                "Seorang bintang musik country yang karirnya mulai memudar, Jackson Maine (Bradley Cooper) menemukan sebuah talenta yang sangat berbakat di dalam diri dari seorang musisi muda bernama Ally (Lady Gaga). Maine berhasil mengorbitkan Ally menjadi seorang bintang muda yang menjanjikan. Namun keduanya terlibat hubungan yang lebih jauh dari sekedar mentor dan anak didik. Seiring dengan meroketnya karir dari Ally dan dirinya, Maine mengalami dilema mengenai masalah ini.",
                "05-10-2018",
                "7.5/10",
                "R.drawable.poster_a_start_is_born")
        )
        movies.add(
            MoviesEntity("460465"
                ,"Mortal Kombat",
                "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "14-02-2019",
                "7.2/10",
                "R.drawable.poster_alita")
        )
        movies.add(
            MoviesEntity("567189"
                ,"Tom Clancy's Without Remorse",
                "Dulunya rumah bagi peradaban paling maju di Bumi, Atlantis sekarang menjadi kerajaan bawah air yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan besar yang dimilikinya, Orm berencana untuk menaklukkan orang-orang samudra yang tersisa dan kemudian dunia permukaan. Yang menghalangi jalannya adalah Arthur Curry, saudara setengah manusia Orm, saudara setengah Atlantis dan pewaris sejati takhta.",
                "21-12-2018",
                "6.9/10",
                "R.drawable.poster_aquaman")
        )
        movies.add(
            MoviesEntity("399566"
                ,"Creed II",
                "Antara kewajiban pribadi dan pelatihan untuk pertarungan besar berikutnya melawan lawan yang terkait dengan masa lalu keluarganya, Adonis Creed menghadapi tantangan dalam hidupnya.",
                "21-11-2018",
                "6.9/10",
                "R.drawable.poster_creed")
        )
        movies.add(
            MoviesEntity("615457"
                ,"How to Train Your Dragon: The Hidden World",
                "Ketika Hiccup memenuhi mimpinya untuk menciptakan utopia naga yang damai, penemuan Toothless 'dari pasangan yang tak teruji dan sukar ditangkap membuat Night Fury menjauh. Ketika bahaya meningkat di rumah dan pemerintahan Hiccup sebagai kepala desa diuji, baik naga dan pengendara harus membuat keputusan yang mustahil untuk menyelamatkan jenis mereka.",
                "09-01-2019",
                "7.8/10",
                "R.drawable.poster_how_to_train")
        )
        movies.add(
            MoviesEntity("632357"
                ,"Avengers: Infinity War",
                "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                "27-04-2018",
                "8.3/10",
                "R.drawable.poster_infinity_war")
        )
        movies.add(
            MoviesEntity("813258"
                ,"Overlord",
                "Prancis, Juni 1944. Menjelang D-Day, beberapa pasukan terjun payung Amerika tertinggal di belakang garis musuh setelah pesawat mereka jatuh saat dalam misi untuk menghancurkan menara radio di sebuah desa kecil dekat pantai Normandia. Setelah mencapai target mereka, pasukan terjun payung yang selamat menyadari bahwa, selain melawan pasukan Nazi yang berpatroli di desa, mereka juga harus melawan hal lain.",
                "09-11-2018",
                "6.7/10",
                "R.drawable.poster_overlord")
        )
        movies.add(
            MoviesEntity("811367"
                ,"Ralph Breaks the Internet",
                "Si penjahat video game Ralph dan Vanellope von Schweetz harus mengambil risiko dengan melakukan perjalanan ke World Wide Web untuk mencari suku cadang pengganti untuk menyelamatkan video game Vanellope, Sugar Rush. Jauh di atas kepala mereka, Ralph dan Vanellope mengandalkan warga internet - para netizen - untuk membantu menavigasi jalan mereka, termasuk seorang wirausahawan bernama Yesss, yang merupakan kepala algoritme dan jantung serta jiwa situs pembuat tren BuzzzTube.",
                "21-11-2018",
                "7.2/10",
                "R.drawable.poster_ralph")
        )
        movies.add(
            MoviesEntity("635302"
                ,"Spider-Man: Into the Spider-Verse",
                "Miles Morales menyulap hidupnya antara menjadi siswa sekolah menengah dan menjadi manusia laba-laba. Ketika Wilson \"Kingpin\" Fisk menggunakan super collider, yang lain dari seberang Spider-Verse dipindahkan ke dimensi ini.",
                "14-12-2018",
                "8.4/10",
                "R.drawable.poster_spiderman")
        )
        movies.add(
            MoviesEntity("791373"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesEntity("573680"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesEntity("527774"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesEntity("726684"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesEntity("804435"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesEntity("634528"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesEntity("808023"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesEntity("681260"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesEntity("643586"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesEntity("717192"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )
        movies.add(
            MoviesEntity("825597"
                ,"T-34",
                "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertarungan sengit, cinta yang tak terpatahkan, dan keajaiban legendaris.",
                "01-01-2019",
                "6.9/10",
                "R.drawable.poster_t34")
        )


        return movies
    }

    fun generateDummyTvshow(): ArrayList<TvshowEntity>{

        val tvShows = ArrayList<TvshowEntity>()

        tvShows.add(
            TvshowEntity("120168",
                "Game of Thrones",
                "Tujuh keluarga bangsawan berjuang untuk menguasai tanah mitos Westeros. Gesekan antara rumah-rumah mengarah ke perang skala penuh. Semua sementara kejahatan yang sangat kuno terbangun di utara terjauh. Di tengah-tengah perang, perintah militer yang diabaikan, Night's Watch, adalah yang berdiri di antara alam manusia dan kengerian es di luarnya.",
                "04-11-2011",
                "8.4/10",
                " R.drawable.poster_god"
            )
        )
        tvShows.add(
            TvshowEntity("60735",
                "Gotham",
                "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui tentang kisah Gordon dan kenaikannya dari detektif pemula ke Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia? Dan keadaan apa yang menciptakan mereka - persona yang lebih besar dari kehidupan yang akan menjadi Catwoman, The Penguin, The Riddler, Two-Face dan The Joker?",
                "22-9-2014",
                "7.5/10",
                "R.drawable.poster_gotham"
            )
        )
        tvShows.add(
            TvshowEntity("71712",
                "Dragon Ball",
                "Dahulu kala di pegunungan, seorang master pertempuran yang dikenal sebagai Gohan menemukan seorang bocah aneh yang ia beri nama Goku. Gohan membesarkannya dan melatih Goku dalam seni bela diri sampai dia mati. Bocah muda dan sangat kuat itu sendirian, tetapi mudah dikelola. Kemudian suatu hari, Goku bertemu dengan seorang gadis remaja bernama Bulma, yang pencariannya untuk bola naga membawanya ke rumah Goku. Bersama-sama, mereka berangkat untuk menemukan ketujuh bola naga dalam sebuah petualangan yang akan mengubah hidup Goku selamanya. Lihat bagaimana Goku bertemu teman-teman seumur hidupnya Bulma, Yamcha, Krillin, Master Roshi dan banyak lagi.",
                "26-2-1986",
                "8.1/10",
                " R.drawable.poster_dragon_ball"
            )
        )
        tvShows.add(
            TvshowEntity("88396",
                "Fairy Tail",
                "Lucy adalah seorang gadis berusia 17 tahun, yang ingin menjadi penyihir sejati. Suatu hari ketika mengunjungi Kota Harujion, dia bertemu dengan Natsu, seorang pemuda yang mudah sakit dengan segala jenis transportasi. Tapi Natsu bukan sembarang anak biasa, dia adalah anggota dari salah satu guild penyihir paling terkenal di dunia: Fairy Tail.",
                "12-10-2009",
                "7.8/10",
                "R.drawable.poster_fairytail"
            )
        )
        tvShows.add(
            TvshowEntity("1416",
                "Family Guy",
                "Seri animasi animasi Freakin 'Sweet yang sakit, terpelintir, dan salah, menampilkan petualangan keluarga Griffin yang disfungsional. Peter yang kikuk dan Lois yang sudah lama menderita memiliki tiga anak. Stewie (bayi yang brilian tetapi sadis yang bertekad membunuh ibunya dan mengambil alih dunia), Meg (yang tertua, dan merupakan gadis yang paling tidak populer di kota) dan Chris (anak tengah, dia tidak terlalu cerdas tetapi memiliki hasrat untuk film ). Anggota terakhir keluarga itu adalah Brian - anjing yang bisa bicara dan lebih dari sekadar hewan peliharaan, ia menjaga Stewie, sementara menghirup Martinis dan memilah-milah masalah hidupnya sendiri.",
                "31-1-1999",
                "7.0/10",
                "R.drawable.poster_family_guy"
            )
        )
        tvShows.add(
            TvshowEntity("95557",
                "The Flash",
                "Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat. Meskipun awalnya senang dengan kekuatan barunya, Barry terkejut menemukan bahwa dia bukan satu-satunya \"manusia meta\" yang diciptakan setelah ledakan akselerator - dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan. Barry bermitra dengan S.T.A.R. Lab dan mendedikasikan hidupnya untuk melindungi yang tidak bersalah. Untuk saat ini, hanya beberapa teman dekat dan rekan yang tahu bahwa Barry secara harfiah adalah manusia tercepat, tetapi tidak lama sebelum dunia mengetahui apa yang menjadi Barry Allen ... The Flash.",
                "7-10-2014",
                "7.7/10",
                "R.drawable.poster_flash"
            )
        )
        tvShows.add(
            TvshowEntity("63174",
                "Naruto Shippuuden",
                "Naruto Shippuuden adalah kelanjutan dari serial TV animasi asli Naruto. Kisah ini berkisah tentang Uzumaki Naruto yang lebih tua dan sedikit lebih matang dan upayanya untuk menyelamatkan temannya Uchiha Sasuke dari cengkeraman Shinobi seperti ular, Orochimaru. Setelah 2 setengah tahun, Naruto akhirnya kembali ke desanya Konoha, dan mulai mewujudkan ambisinya, meskipun itu tidak akan mudah, karena Ia telah mengumpulkan beberapa musuh (lebih berbahaya), seperti organisasi shinobi. ; Akatsuki.",
                "15-02-2007",
                "8.6/10",
                "R.drawable.poster_naruto_shipudden"
            )
        )
        tvShows.add(
            TvshowEntity("86831",
                "The Simpsons",
                "Bertempat di Springfield, kota rata-rata di Amerika, pertunjukan ini berfokus pada kejenakaan dan petualangan sehari-hari keluarga Simpson; Homer, Marge, Bart, Lisa dan Maggie, serta ribuan pemain virtual. Sejak awal, serial ini telah menjadi ikon budaya pop, menarik ratusan selebriti menjadi bintang tamu. Acara ini juga menjadi terkenal karena satirnya yang tak kenal takut terhadap kehidupan politik, media, dan Amerika secara umum.",
                "17-12-1989",
                "7.8/10",
                "R.drawable.poster_the_simpson"
            )
        )
        tvShows.add(
            TvshowEntity("79008",
                "Supergirl",
                "Kara Zor-El yang berusia dua puluh empat tahun, yang diambil oleh keluarga Danvers ketika dia berusia 13 tahun setelah diusir dari Krypton, harus belajar merangkul kekuatannya setelah sebelumnya menyembunyikannya. The Danvers mengajarinya untuk berhati-hati dengan kekuatannya, sampai dia harus mengungkapkannya selama bencana yang tidak terduga, menempatkannya dalam perjalanan kepahlawanannya.",
                "26-10-2015",
                "7.3/10",
                "R.drawable.poster_supergirl"
            )
        )
        tvShows.add(
            TvshowEntity("93484",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowEntity("69050",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowEntity("93741",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowEntity("105971",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowEntity("62286",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowEntity("1399",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowEntity("80240",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowEntity("95057",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowEntity("69478",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowEntity("1402",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )
        tvShows.add(
            TvshowEntity("79460",
                "The Walking Dead",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan.",
                "31-10-2010",
                "8.1/10",
                "R.drawable.poster_the_walking_dead"
            )
        )


        return tvShows
    }

}