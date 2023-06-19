import java.lang.Exception

var warteZeit = Thread.sleep(1500)
var langeWarteZeit = Thread.sleep(60000 / 1000)


open class Shop() {


    var auto1: Auto = Auto("Audi", "A8", 12.000, true, 240, "Diesel",
            2015, 132.000,
            "Weiß", "Rattingen", "Automatik")

    var auto2: Auto = Auto("VW", "Tiguan", 8.000, false, 150, "Elektro-Diesel",
            2013, 143.000,
            "Rot", "Essen", "Manuell")

    var auto3: Auto = Auto("Bmw", "3er", 6.000, true, 220, "Benzin",
            2009, 143.000,
            "Silber", "Duisburg", "Manell")

    var auto4: Auto = Auto("vw", "Golf", 1000.0, false, 120, "Diesel",
            2010, 127.000, "Grün", "Essen", "Manuell")

    var auto5: Auto = Auto("Tesla", "X", 45.000, true, 525, "Elektro",
            2016, 105.000, "Schwarz", "Hagen", "Automatik")

    var auto6: Auto = Auto("Audi", "S3", 22.790, true, 300, "Benzin",
            2014, 96.929, "Silber", "Duisburg", "Halbautomatik")


    var motorrad1: Motorrad = Motorrad("Honda", "CBR 600 F", 4000.0, 210, "Benzin", 2017,
            30.000, "Düsseldorf",
            "Schwarz", "Zahnriemen", "Automatik")

    var motorrad2: Motorrad = Motorrad("Suzuki", "B King", 3000.0, 150, "Benzin", 2014,
            38.000, "Neuss",
            "Rot", "Kette", "Manuell")

    var motorrad3: Motorrad = Motorrad("BMW", "R 1150 GS", 4000.0, 210, "Benzin", 2017,
            30.000, "Düsseldorf",
            "Schwarz", "Zahnriemen", "Automatik")


    var motorrad4: Motorrad = Motorrad("BMW", "F 650 GS", 3900.0, 71, "Benzin", 2009,
            15.600, "Düsseldorf",
            "Schwarz", "Zahnriemen", "Manuell")

    var motorrad5: Motorrad = Motorrad("Motobi", "DL 125 ", 4100.0, 14, "Benzin", 2014,
            10.000, "Köln",
            "Rot", "Kette", "Manuell")

    var motorrad6: Motorrad = Motorrad("Honda", "CB", 6290.0, 181, "Benzin", 2012,
            45.000, "Düsseldorf",
            "Schwarz", "Kette", "Automatik")


    var lkw1: Lkw = Lkw("Volvo", "FH16", 20.000, 8.000, "4x2", 360, "Diesel",
            2011, 123.000, "Wuppertal",
            "Weiß", "Manuell")

    var lkw2: Lkw = Lkw("Mercedes-Benz", "Actros", 30.000, 17.000, "4x4", 400, "Diesel", 2010,
            89.000, "Solingen", "Grün", "Automatik")

    var lkw3: Lkw = Lkw("Daf", "XG", 20.000, 8.000, "4x2", 250, "Diesel",
            2011, 123.000, "Wuppertal",
            "Weiß", "Automatik")


    var lkw4: Lkw = Lkw("man", "TGX", 20.000, 8.000, "4x2", 400, "Diesel",
            2011, 123.000, "Wuppertal",
            "Weiß", "Manuell")

    var lkw5: Lkw = Lkw("Mercedes-Benz", "Actros", 22.000, 18.000, "4x2", 360, "Diesel", 2012,
            490.000, "Solingen", "Grün", "Manuell")

    var lkw6: Lkw = Lkw("Nissan", "M90", 7.900, 9.000, "4x2", 155, "Diesel", 1995,
            575.000, "Wuppertal",
            "Weiß", "Automatik")


    fun menu() {
        println(
                """Herzlich Willkommen!
            |
            |[1] Suchen 
            |[2] Anzeige Erstellen
        """.trimMargin()
        )


        val input = readln()

        when (input) {

            "1", "Suchen", "suchen" -> suchen()


            "2", "Anzeige Erstellen", "anzeige erstellen", "erstellen", "Erstellen" -> erstellen()
        }

    }


    val autosList = mutableListOf<Auto>(auto1, auto2, auto3, auto4, auto5, auto6)
    val motorraederList = mutableListOf<Motorrad>(motorrad1, motorrad2, motorrad3, motorrad4, motorrad5, motorrad6)
    val lkwList = mutableListOf<Lkw>(lkw1, lkw2, lkw3, lkw4, lkw5, lkw6)
    var bauJahr = mutableListOf<Int>(1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2001, 2002, 2003, 2004, 2005, 2006,
            2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023)


    fun erstellen() {
        println(
                """Erstellen
        |
    """.trimMargin()
        )

        println("Fahrzeugtyp")
        val fahrzeugType = readln()

        println("Marke")
        val marke = readln()

        println("Modell")
        val modell = readln()

        println("Preis")
        val preis = readln().toDouble()

        println("Baujahr")
        val baujahr = readln().toInt()

        try {
            if (baujahr !in bauJahr) {
                println("Die Eingabe ist nicht erkannt! Bitte geben Sie nochmal ein. ")

            }


        } catch (e: Exception) {


        }


        println("Leistung")
        val leistung = readln().toInt()

        println("Kraftstoff")
        val kraftstoff = readln()

        println("kilometer")
        val kilometer = readln().toDouble()

        println("Getriebe")
        val getriebe = readln()


        println("farbe")
        val farbe = readln()

        println("Hubraum")
        val hubraum = readln().toDouble()



        println("standOrt")
        val standOrt = readln()

        println("Telefonnummer:")
        var telNr = readln().toInt()



        if (fahrzeugType == "auto" || fahrzeugType == "Auto") {


            println("Anhängerkupplung")
            val anhaengerkupplung = readln().toBoolean()

            println("geschafft, Ihr Fahrzeug wird in zwei Minuten Online")

            val neuAuto = Auto(marke = marke, modell = modell, preis = preis, baujahr = baujahr, leistung = leistung, kraftstoff = kraftstoff,
                    kilometer = kilometer, farbe = farbe, getriebe = getriebe, anhaengerkupplung = anhaengerkupplung, standOrt = standOrt)
            autosList.add(neuAuto)

            return menu()


        }







        if (fahrzeugType == "lkw" || fahrzeugType == "LKW" || fahrzeugType == "Lkw") {


            println("Achsen")
            val achsen = readln().toInt()

            println("Achsen")
            val gesamtGewicht = readln().toDouble()

            println("Radformel")
            val radformel = readln()


            val neuLkw = Lkw(marke = marke, modell = modell, preis = preis, baujahr = baujahr, leistung = leistung, kraftstoff = kraftstoff,
                    kilometer = kilometer, farbe = farbe, standort = standOrt, gesamtGewicht = gesamtGewicht, radformel = radformel, getriebe = getriebe)
            lkwList.add(neuLkw)

        }




        if (fahrzeugType == "motorrad" || fahrzeugType == "Motorrad") {


            println("Antriebsart")
            val antriebsArt = readln()


            val neuMotorrad = Motorrad(marke = marke, modell = modell, preis = preis, baujahr = baujahr, leistung = leistung,
                    kraftstoff = kraftstoff, kilometer = kilometer, farbe = farbe, standOrt = standOrt, antriebsArt = antriebsArt, getriebe = getriebe)
            motorraederList.add(neuMotorrad)

        }


    }

    fun printListe(listeFahrzeug: List<Fahrzeug>) {

        for (fahrzeug in listeFahrzeug) {
            println("${fahrzeug.marke} ${fahrzeug.modell}")


        }
    }


    fun suchen() {
        println("Suchen")

        println("Fahrzeugtyp")
        val fahrzeugtyp = readln()


        when (fahrzeugtyp) {
            "1", "auto", "Auto", "Autos", "PKW", "pkw", "Pkw" -> printListe(autosList)
            "2", "motorrad", "Motorrad", "motorräder", "Motorräder" -> printListe(motorraederList)
            "3", "lkw", "Lkw", "LKW", "lastwagen", "Lastwagen", "lastkraftwagen", "Lastkraftwagen" -> printListe(lkwList)

        }

        println("Marke")
        val marken = readln()
    }





    fun filtterListMArke(list: List<Fahrzeug>, eingabe: String): List<Fahrzeug> {

        var filteredList: MutableList<Fahrzeug> = mutableListOf()

        for (fahrzeug in list) {
            if (fahrzeug.marke == eingabe) {

            }

        }


    }

}

