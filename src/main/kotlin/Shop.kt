import java.lang.Exception
import java.time.YearMonth

var warteZeit = Thread.sleep(2000)
var langeWarteZeit = Thread.sleep(60000 / 1000)

open class Shop() {

    var auto1: Auto = Auto("Audi", "A8", 12000.0, true, 240, "Diesel",
            2015, 132000.0,
            "Weiß", "Ratingen", "Automatik", "4/5", 5, "01434934383",
            1, "Euro 6", "4(Grün)", "Klimaautomatik", YearMonth.of(2023, 8), 2400.0)

    var auto2: Auto = Auto("VW", "Tiguan", 8000.0, false, 150, "Elektro-Diesel",
            2013, 143000.0,
            "Rot", "Essen", "Manuell", "4/5", 7, "0134323422", 1,
            "Euro 5", "4(Grün)", "2 Zone Klimaautomatik", YearMonth.of(2024, 10), 2158.0)

    var auto3: Auto = Auto("BMW", "3er", 6000.0, true, 220, "Benzin",
            2009, 143.000,
            "Silber", "Duisburg", "Manuell", "2/3", 4,
            "0172736", 2, "Euro 4", "4(Grün)", "Klimaanlage oder automatik",
            YearMonth.of(2023, 12), 2700.0)

    private var auto4: Auto = Auto("VW", "Golf", 1000.0, false, 120, "Diesel",
            2010, 127000.0, "Grün", "Essen", "Manuell",
            "4/5", 5, "012373772", 3, "Euro 4", "4(Grün)", "Klimaautomatik",
            YearMonth.of(2025, 1), 1678.0)

    private var auto5: Auto = Auto("Tesla", "Modell X", 45000.0, true, 525, "Elektro",
            2016, 80000.0, "Schwarz", "Hagen", "Automatik",
            "4/5", 5, "01222783", 0, "Euro 5", "4(Grün)", "3-Zone Klimaautomatik",
            YearMonth.of(2024, 3), 3100.0)

    private var auto6: Auto = Auto("Audi", "A3", 22790.0, true, 300, "Benzin",
            2014, 125653.0, "Silber", "Duisburg", "Halbautomatik",
            "4/5", 5, "01223243", 2, "Euro 5", "4(Grün)", "klimaautomatik",
            YearMonth.of(2023, 11), 1750.0)

    private var auto7: Auto = Auto("Audi", "A3", 20390.0, false, 200, "Benzin",
            2013, 96929.0, "Weiß", "Köln", "Automatik",
            "4/5", 5, "01223243", 2, "Euro 5", "4(Grün)", "klimaautomatik",
            YearMonth.of(2023, 11), 1750.0)

    private var auto8: Auto = Auto("Tesla", "Modell Y", 25890.0, true, 230, "Elektro",
            2017, 100929.0, "Weiß", "Essen", "Automatik",
            "4/5", 5, "01223243", 2, "Euro 6", "6(Blau)", "4-Zone-Klimaautomatik",
            YearMonth.of(2024, 11), 3000.0)

    private var auto9: Auto = Auto("BMW", "X5", 14500.0, false, 160, "Diesel",
            2012, 296929.0, "Silber", "Ratingen", "Manuell",
            "4/5", 5, "01223243", 4, "Euro 5", "4(Grün)", "2-Zone-klimaautomatik",
            YearMonth.of(2024, 11), 2800.0)

    private var motorrad1: Motorrad = Motorrad("Honda", "CBR 600 F", 4000.0, 210, "Benzin", 2017,
            30000.0, "Düsseldorf",
            "Schwarz", "Zahnriemen", "Automatik", "0232313313", 1500.0,1, YearMonth.of(2024, 5))

    private var motorrad2: Motorrad = Motorrad("Suzuki", "B King", 3000.0, 150, "Benzin", 2014,
            38000.0, "Neuss",
            "Rot", "Kette", "Manuell", "01223344", 1600.0 ,3, YearMonth.of(2025, 3))

    private var motorrad3: Motorrad = Motorrad("BMW", "R 1150 GS", 4000.0, 210, "Benzin", 2017,
            30000.0, "Düsseldorf",
            "Schwarz", "Zahnriemen", "Automatik", "011222334", 600.0,
            2, YearMonth.of(2024, 8))

    private var motorrad4: Motorrad = Motorrad("BMW", "F 650 GS", 3900.0, 71, "Benzin", 2009,
            15600.0, "Düsseldorf",
            "Schwarz", "Zahnriemen", "Manuell", "0112223334", 656.0,
            4, YearMonth.of(2024, 2))

    private var motorrad5: Motorrad = Motorrad("Motobi", "DL 125 ", 4100.0, 14, "Benzin", 2014,
            10000.0, "Köln",
            "Rot", "Kette", "Manuell", "01723333", 1700.0, 2, YearMonth.of(2023, 9))

    private var motorrad6: Motorrad = Motorrad("Honda", "CB", 6290.0, 181, "Benzin", 2012,
            45000.0, "Düsseldorf",
            "Schwarz", "Kette", "Automatik","020223334543",1700.0 ,1,YearMonth.of(2024, 3))

    private var motorrad7: Motorrad = Motorrad("Suzuki", "CB", 9390.0, 200, "Benzin", 2013,
            60000.0, "Düsseldorf", "Rot", "Kette", "Automatik", "565623334543", 1000.0,2,
            YearMonth.of(2024,7))

    private var lkw1: Lkw = Lkw("Volvo", "FH16", 20000.0, 8000.0, "4x2", 360, "Diesel",
            2013, 123000.0, "Wuppertal",
            "Weiß", "Manuell", "2-Zone-Klimaautomatik", "01234567823", 2, "Euro 5",
            "4(Grün)", YearMonth.of(2024, 11))

    private var lkw2: Lkw = Lkw("Volvo", "FMX", 34000.0, 14000.0, "4x4", 450, "Diesel", 2013,
            289000.0, "Solingen", "Grün", "Automatik", "3-Zone-Klimaautomatik", "01227346463",
            2, "Euro 5", "4(Grün)", YearMonth.of(2024, 11))

    private var lkw3: Lkw = Lkw("Daf", "CF", 44000.0, 16000.0, "4x4", 550, "Diesel", 2015,
            89000.0, "Köln", "Silber", "Automatik", "4-Zone-Klimaautomatik", "0122767463",
            1, "Euro 5", "4(Grün)", YearMonth.of(2025, 1))

    private var lkw4: Lkw = Lkw("Daf", "XG", 15000.0, 8000.0, "4x2", 250, "Diesel",
            2005, 323000.0, "Wuppertal",
            "Weiß", "Automatik", "2", "01223456546", 3, "Euro 3", "4(Gelb)",
            YearMonth.of(2023, 7))

    private var lkw5: Lkw = Lkw("Man", "TGX", 20000.0, 8000.0, "4x2", 400, "Diesel",
            2011, 123000.0, "Wuppertal",
            "Weiß", "Manuell", "2-Zone-Klimaautomatik", "0090987654423", 4, "Euro 4",
            "4(Grün)", YearMonth.of(2025, 6))

    private var lkw6: Lkw = Lkw("Man", "TGS", 21000.0, 10000.0, "4x2", 350, "Diesel",
            2013, 135000.0, "Neuss", "Gelb", "Automatik", "3-Zone-Klimaautomatik", "0443987654423",
            3, "Euro 5", "4(Grün)", YearMonth.of(2024, 12))

    private var lkw7: Lkw = Lkw("Mercedes-Benz", "Actros", 22000.0, 18000.0, "4x2", 360, "Diesel", 2011,
            490000.0, "Solingen", "Grün", "Manuell", "Klimaautomatik", "002343293", 3,
            "Euro 5", "4(Grün)", YearMonth.of(2024, 1))

    private var lkw8: Lkw = Lkw("Mercedes-Benz", "Actros", 26000.0, 18000.0, "4x2", 340, "Diesel", 2013,
            290000.0, "Düsseldorf", "Grün", "Automatik", "3-Zone-Klimaautomatik", "00000123293", 2,
            "Euro 5", "4(Grün)", YearMonth.of(2024, 1))

    private var lkw9: Lkw = Lkw("Nissan", "M90", 7900.0, 9000.0, "4x2", 155, "Diesel", 1995,
            575000.0, "Wuppertal",
            "Weiß", "Automatik", "Klimaautomatik", "01223364763", 5, "Euro 3", "3(Gelb)",
            YearMonth.of(2023, 8))

    private var lkw10: Lkw = Lkw("Nissan", "NT500", 15900.0, 11000.0, "4x2", 250, "Diesel", 2007,
            180000.0, "Leverkusen", "Rot", "Manuell", "2-Zone-Klimaautomatik", "01223364763", 3,
            "Euro 4", "4(Grün)", YearMonth.of(2023, 9))


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


    var autosList = mutableListOf<Auto>(auto1, auto2, auto3, auto4, auto5, auto6, auto7, auto8, auto9)
    val motorraederList = mutableListOf<Motorrad>(motorrad1, motorrad2, motorrad3, motorrad4, motorrad5, motorrad6, motorrad7)
    val lkwList = mutableListOf<Lkw>(lkw1, lkw2, lkw3, lkw4, lkw5, lkw6, lkw7, lkw8, lkw9, lkw10)


    private fun erstellen() {
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
        var bauJahrconvertToInt = readln()
        var baujahr: Int = 0
        var bauJahreingabeKorrekt = false

        while (!bauJahreingabeKorrekt) {

            try {
                baujahr = bauJahrconvertToInt.toInt()
                bauJahreingabeKorrekt = true


            } catch (e: Exception) {
                println("Eingabe ist falsch")
                bauJahrconvertToInt = readln()
            }


        }

        println("Leistung")
        var leistungConvertToInt = readln()
        var leistung = 0
        var leistungEingabeKorrekt = false

        while (!leistungEingabeKorrekt) {

            try {
                leistung = leistungConvertToInt.toInt()
                leistungEingabeKorrekt = true
            } catch (e: Exception) {
                println("Falsche eingabe")
                leistungConvertToInt = readln()
            }
        }

        println("Kraftstoff")
        val kraftstoff = readln()

        println("kilometer")
        val kilometer = readln().toDouble()

        println("Getriebe")
        val getriebe = readln()

        println("farbe")
        val farbe = readln()

        println("standOrt")
        val standOrt = readln()

        println("Telefonnummer:")
        val telNr = readln()


        println("Fahrzeughalter:")
        val fahrzeugHalter = readln().toInt()



        if (fahrzeugType == "auto" || fahrzeugType == "Auto" || fahrzeugType == "AUTO" || fahrzeugType == "pkw" || fahrzeugType == "Pkw" || fahrzeugType == "PKW") {

            println("Hubraum")
            val hubraum = readln().toDouble()



            println("Anhängerkupplung")
            val anhaengerkupplung = readln().toBoolean()


            println("Anzahl Tür")
            val anzahlTür = readln()

            println("Klimatisierung")
            val klimatisierung = readln()

            println("schadstoffklasse")
            val schadstoffklasse = readln()

            println("umweltplakette")
            val umweltplakette = readln()

            println("Sitzplätze")
            val sitzPlaetze = readln().toInt()

            println("HU Jahr")
            val huJahr = readln()
            println("HU Monat")
            val huMonat = readln()
            val datum = YearMonth.of(huMonat.toInt(), huJahr.toInt())




            println("geschafft, Ihr Fahrzeug wird in zwei Minuten Online")

            val neuAuto = Auto(marke = marke, modell = modell, preis = preis, baujahr = baujahr, leistung = leistung, kraftstoff = kraftstoff,
                    kilometer = kilometer, farbe = farbe, getriebe = getriebe, anhaengerkupplung = anhaengerkupplung, standOrt = standOrt,
                    anzahlTür = anzahlTür, sitzPlaetze = sitzPlaetze, kontaktNummer = telNr, fahrzeugHalter = fahrzeugHalter, klimatisierung = klimatisierung,
                    schadstoffklasse = schadstoffklasse, umweltplakette = umweltplakette, datum = datum, hubraum = hubraum)

            autosList.add(neuAuto)
            println("""Ihre $fahrzeugType Informationen: 
                |Marke:                     $marke
                |Modell:                    $modell
                |Preis:                     $preis
                |Baujahr:                   $baujahr
                |Leistung:                  $leistung
                |Kraftstoff:                $kraftstoff
                |Kilometer:                 $kilometer
                |HU:                        $datum
                |Farbe:                     $farbe
                |Getriebe:                  $getriebe
                |Hubraum:                   $hubraum
                |Standort:                  $standOrt
                |Telefonnummer:             $telNr
                |Anhängerkupplung:          $anhaengerkupplung
                |""".trimMargin())

            return menu()


        }







        if (fahrzeugType == "lkw" || fahrzeugType == "LKW" || fahrzeugType == "Lkw") {


            println("Achsen")
            val achsen = readln().toInt()

            println("Achsen")
            val gesamtGewicht = readln().toDouble()

            println("Radformel")
            val radformel = readln()

            println("Anzahl Tür")
            val anzahlTür = readln()

            println("Sitzplätze")
            val sitzPlaetze = readln().toInt()

            println("Schadstoffklasse")
            val schadstoffklasse = readln()

            println("Klimatisierung")
            val klimatisierung = readln()

            println("Umweltplakette")
            val umweltplakette = readln()


            println("HU Jahr")
            val huJahr = readln()
            println("HU Monat")
            val huMonat = readln()
            val datum = YearMonth.of(huJahr.toInt(), huMonat.toInt())


            val neuLkw = Lkw(marke = marke, modell = modell, preis = preis, baujahr = baujahr, leistung = leistung, kraftstoff = kraftstoff,
                    kilometerstand = kilometer, farbe = farbe, standort = standOrt, gesamtGewicht = gesamtGewicht, radformel = radformel, getriebe = getriebe,
                    fahrzeugHalter = fahrzeugHalter, kontaktNummer = telNr, umweltplakette = umweltplakette, schadstoffklasse = schadstoffklasse,
                    klimatisierung = klimatisierung, datum = datum)
            lkwList.add(neuLkw)

            println("""Ihre $fahrzeugType Informationen: 
                |Marke:                     $marke
                |Modell:                    $modell
                |Preis:                     $preis
                |Baujahr:                   $baujahr
                |Sitzplätze:                $sitzPlaetze
                |Anzahl Tür:                $anzahlTür
                |Leistung:                  $leistung
                |Kraftstoff:                $kraftstoff
                |Kilometer:                 $kilometer
                |HU:                        $datum
                |Farbe:                     $farbe
                |Getriebe:                  $getriebe
                |Klimatisierung:            $klimatisierung
                |Gesamtgewicht:             $gesamtGewicht
                |Schadstoffklasse:          $schadstoffklasse
                |Umweltplakette:            $umweltplakette
                |Standort:                  $standOrt
                |Telefonnummer:             $telNr
                |Achsen:                    $achsen
                |Radformel:                 $radformel
                |
                |""".trimMargin())

        }

        if (fahrzeugType == "motorrad" || fahrzeugType == "Motorrad") {

            println("Hubraum")
            val hubraum = readln().toDouble()

            println("Antriebsart")
            val antriebsArt = readln()

            println("HU Jahr")
            val huJahr = readln()
            println("HU Monat")
            val huMonat = readln()
            val datum = YearMonth.of(huJahr.toInt(), huMonat.toInt())

            val neuMotorrad = Motorrad(marke = marke, modell = modell, preis = preis, baujahr = baujahr, leistung = leistung,
                    kraftstoff = kraftstoff, kilometer = kilometer, farbe = farbe, standOrt = standOrt, antriebsArt = antriebsArt, getriebe = getriebe,
                    fahrzeugHalter = fahrzeugHalter, kontaktNummer = telNr, datum = datum, hubraum = hubraum,)
            motorraederList.add(neuMotorrad)

            println("""Ihre $fahrzeugType Informationen: 
                |Marke:                 $marke
                |Modell:                $modell
                |Preis:                 $preis
                |Baujahr:               $baujahr
                |Leistung:              $leistung
                |Kraftstoff:            $kraftstoff
                |Kilometer:             $kilometer
                |HU:                    $datum
                |Farbe:                 $farbe
                |Getriebe:              $getriebe
                |Hubraum:               $hubraum
                |Standort:              $standOrt
                |Telefonnummer:         $telNr
                |""".trimMargin())
        }
    }
    private fun suchen() {
        println(
                """Suchen
            |Wählen Sie Fahrzeugtyp aus:
            |
            |[1] PKW
            |[2] Motorrad
            |[3] LKW
        """.trimMargin()
        )


        val input = readln()

        when (input) {

            "1", "pkw", "PKW", "auto", "Auto", "suchen" -> autos()
            "2", "motorrad", "Motorrad", "motorräder", "Motorräder", "zweiräder", "Zweiräder" -> motorraeder()
            "3", "lkw", "Lkw", "LKW", "Lastwagen", "Lastkraftwagen" -> lkws()
        }

    }

    private fun autos() {
        println("PKW")


        println("""Was möchten Sie filtern? 1 für Marke, 2 für Modell, 3 für Kilometer, 4 für Preis, 5 für Kraftstoff, 6 für Farbe,
            |7 für Leistung in PS, 8 für Baujahr, 9 für Standort, 10 für GetriebeArt, 11 für Anhängerkupplung, 12 für Sitzplätze, 13 für Schadstoffklasse, 14 für Umweltplakette
        """.trimMargin())

        val auswahl = readln()

        var filtered: List<Auto> = mutableListOf()

        when (auswahl) {
            "1" -> {
                println("Marke")
                val filter0 = filtterListAuto(autosList, autoSortTyp.MARKE)
                println("$filter0")
            }

            "2" -> {
                println("Modell")
                val filter1 = filtterListAuto(autosList, autoSortTyp.MODELL)
                println("$filter1")
            }

            "3" -> {
                println("Kilometerstand")
                val filter2 = filtterListAuto(autosList, autoSortTyp.KILOMETERSTAND)
                println("$filter2")
            }

            "4" -> {
                println("Preis")
                val filtere3 = filtterListAuto(autosList, autoSortTyp.PREIS)
                println("$filtere3")
            }

            "5" -> {
                println("Kraftstoff")
                val filter4 = filtterListAuto(autosList, autoSortTyp.KRAFTSTOFF)
                println("$filtered")
            }

            "6" -> {
                println("Farbe")
                val filter5 = filtterListAuto(autosList, autoSortTyp.FARBE)
                println("$filter5")
            }

            "7" -> {
                println("Leistung")
                val filter6 = filtterListAuto(autosList, autoSortTyp.LEISTUNG)
                println("$filter6")
            }

            "8" -> {
                println("Baujahr")
                val filter7 = filtterListAuto(autosList, autoSortTyp.BAUJAHR)
                println("$filter7")
            }

            "9" -> {
                println("Standort")
                val filter8 = filtterListAuto(autosList, autoSortTyp.STANDORT)
                println("$filter8")
            }

            "10" -> {
                println("Getriebe")
                val filter9 = filtterListAuto(autosList, autoSortTyp.GETRIEBE)
                println("$filter9")
            }

            "11" -> {
                println("Anhängerkupplung")
                val filter10 = filtterListAuto(autosList, autoSortTyp.ANHAENGERKUPPLUNG)
                println("$filter10")
            }

            "12" -> {
                println("Anzahl der Sitzplätze")
                val filter11 = filtterListAuto(autosList, autoSortTyp.SITZPLÄTZE)
                println("$filter11")
            }

            "13" -> {
                println("Schadstoffklasse")
                val filtered = filtterListAuto(autosList, autoSortTyp.SCHADSTOFFKLASSE)
                println("$filtered")
            }

            "14" -> {
                println("Umweltplakette")
                val filtered = filtterListAuto(autosList, autoSortTyp.UMWELTPLAKETTE)
                println("$filtered")
            }

            else -> {
                println("Falsche Eingabe")
            }


        }

        for (fahrzeuge in filtered) {

            println("${fahrzeuge.fahrzeugtyp}, ${fahrzeuge.marke}, ${fahrzeuge.preis}, ${fahrzeuge.modell}, ${fahrzeuge.kraftstoff}")
        }


    }

    private fun motorraeder() {

        println("Motorrad")

        println("""Was möchten Sie filtern? 1 für Marke, 2 für Modell, 3 für Kilometer, 4 für Preis, 5 für Kraftstoff, 6 für Farbe,
            |7 für Leistung in PS, 8 für Baujahr, 9 für Standort, 10 für Getriebe, 11 für Antriebsart
        """.trimMargin())

        val auswahl = readln()

        when (auswahl) {
            "1" -> {
                println("Marke")
                val filter1 = filtterListMotorrad(motorraederList, MotorradSort.MARKE)
                println("$filter1")
            }

            "2" -> {
                println("Modell")
                val filter2 = filtterListMotorrad(motorraederList, MotorradSort.MODELL)
                println("$filter2")
            }

            "3" -> {
                println("Kilometerstand")
                val filter3 = filtterListMotorrad(motorraederList, MotorradSort.KILOMETERSTAND)
                println("$filter3")
            }

            "4" -> {
                println("Preis")
                val filtere4 = filtterListMotorrad(motorraederList, MotorradSort.PREIS)
                println("$filtere4")
            }

            "5" -> {
                println("Kraftstoff")
                val filter5 = filtterListMotorrad(motorraederList, MotorradSort.KRAFTSTOFF)
                println("$filter5")
            }

            "6" -> {
                println("Farbe")
                val filter6 = filtterListMotorrad(motorraederList, MotorradSort.FARBE)
                println("$filter6")
            }

            "7" -> {
                println("Leistung")
                val filter7 = filtterListMotorrad(motorraederList, MotorradSort.LEISTUNG)
                println("$filter7")
            }

            "8" -> {
                println("Baujahr")
                val filter8 = filtterListMotorrad(motorraederList, MotorradSort.BAUJAHR)
                println("$filter8")
            }

            "9" -> {
                println("Standort")
                val filter9 = filtterListMotorrad(motorraederList, MotorradSort.STANDORT)
                println("$filter9")
            }

            "10" -> {
                println("Getriebe")
                val filter10 = filtterListMotorrad(motorraederList, MotorradSort.GETRIEBE)
                println("$filter10")
            }

            "11" -> {
                println("Antriebsart")
                val filter11 = filtterListMotorrad(motorraederList, MotorradSort.ANTRIEBSART)
                println("$filter11")
            }

            "12" -> {
                println("Hubraum")
                val filter14 = filtterListMotorrad(motorraederList, MotorradSort.HUBRAUM)
                println("$filter14")
            }

            "13" -> {
                println("TÜV")
                val filter11 = filtterListMotorrad(motorraederList, MotorradSort.TÜV)
                println("$filter11")
            }

            "14" -> {
                println("Kontaktnummer")
                val filter12 = filtterListMotorrad(motorraederList, MotorradSort.KONTAKTNUMMER)
                println("$filter12")
            }

            "15" -> {
                println("Fahrzeughalter")
                val filter13 = filtterListMotorrad(motorraederList, MotorradSort.FAHRZEUGHALTER)
                println("$filter13")
            }

            else -> {
                println("Falsche Eingabe")
            }
        }
    }

    private fun lkws() {
        println("Motorrad")


        println("""Was möchten Sie filtern? 1 für Marke, 2 für Modell, 3 für Kilometer, 4 für Preis, 5 für Kraftstoff, 6 für Farbe,
            |7 für Leistung in PS, 8 für Baujahr, 9 für Standort, 10 für GetriebeArt
        """.trimMargin())

        val auswahl = readln()

        when (auswahl) {
            "1" -> {
                println("Marke")
                val eingabe = readln()
                val filter0 = filtterListLkw(lkwList, eingabe, lkwSortTyp.MARKE)
                println("$filter0")

            }

            "2" -> {
                println("Modell")
                val eingabe = readln()
                val filter1 = filtterListLkw(lkwList, eingabe, lkwSortTyp.MODELL)
                println("$filter1")

            }

            "3" -> {
                println("Kilometer")
                val eingabe = readln()
                val filter2 = filtterListLkw(lkwList, eingabe, lkwSortTyp.KILOMETERSTAND)
                println("$filter2")

            }

            "4" -> {
                println("Preis")
                val eingabe = readln()
                val filtere3 = filtterListLkw(lkwList, eingabe, lkwSortTyp.PREIS)
                println("$filtere3")
            }

            "5" -> {
                println("Kraftstoff")
                val eingabe = readln()
                val filter4 = filtterListLkw(lkwList, eingabe, lkwSortTyp.KRAFTSTOFF)
                println("$filter4")
            }

            "6" -> {
                println("Farbe")
                val eingabe = readln()
                val filter5 = filtterListLkw(lkwList, eingabe, lkwSortTyp.FARBE)
                println("$filter5")
            }

            "7" -> {
                println("Leistung")
                val eingabe = readln()
                val filter6 = filtterListLkw(lkwList, eingabe, lkwSortTyp.LEISTUNG)
                println("$filter6")
            }

            "8" -> {
                println("Baujahr")
                val eingabe = readln()
                val filter7 = filtterListLkw(lkwList, eingabe, lkwSortTyp.BAUJAHR)
                println("$filter7")
            }

            "9" -> {
                println("Standort")
                val eingabe = readln()
                val filter8 = filtterListLkw(lkwList, eingabe, lkwSortTyp.STANDORT)
                println("$filter8")
            }

            "10" -> {
                println("Getriebe")
                val eingabe = readln()
                val filter9 = filtterListLkw(lkwList, eingabe, lkwSortTyp.GETRIEBE)
                println("$filter9")
            }

            else -> {
                println("Falsche Eingabe")
            }
        }
    }

    private fun filtterListAuto(list: List<Auto>, type: autoSortTyp): List<Auto> {

        var eingabe = readln()
        val autoFilteredList: MutableList<Auto> = mutableListOf()


        when (type) {


            autoSortTyp.MARKE -> {

                for (auto in list) {
                    if (auto.marke == eingabe) {
                        autoFilteredList.add(auto)
                    }

                }

            }

            autoSortTyp.MODELL -> {

                for (auto in list) {
                    if (auto.modell == eingabe) {
                        autoFilteredList.add(auto)
                    }

                }
            }

            autoSortTyp.SITZPLÄTZE -> {

                var eingabeKorrekt = false

                while (!eingabeKorrekt)

                    try {
                        val convertToInt = eingabe.toInt()
                        eingabeKorrekt = true
                        for (auto in list) {
                            if (auto.sitzPlaetze == convertToInt) {
                                autoFilteredList.add(auto)
                            }
                        }
                    } catch (e: Exception) {
                        println("Eingabe ist falsch")
                        eingabe = readln()
                    }
            }

            autoSortTyp.SCHADSTOFFKLASSE -> {

                for (auto in list) {
                    if (auto.schadstoffklasse == eingabe) {
                        autoFilteredList.add(auto)
                    }
                }
            }

            autoSortTyp.UMWELTPLAKETTE -> {

                for (auto in list) {
                    if (auto.umweltplakette == eingabe) {
                        autoFilteredList.add(auto)
                    }
                }
            }

            autoSortTyp.KRAFTSTOFF -> {

                for (auto in list) {
                    if (auto.kraftstoff == eingabe) {
                        autoFilteredList.add(auto)
                    }
                }
            }

            autoSortTyp.GETRIEBE -> {

                for (auto in list) {
                    if (auto.getriebe == eingabe) {
                        autoFilteredList.add(auto)
                    }
                }
            }

            autoSortTyp.HUBRAUM -> {
                var eingabeKorrekt = false

                while (!eingabeKorrekt)

                    try {
                        val convertToInt = eingabe.toDouble()
                        eingabeKorrekt = true
                        for (auto in list) {
                            if (auto.hubraum == convertToInt) {
                                autoFilteredList.add(auto)
                            }
                        }
                    } catch (e: Exception) {
                        println("Eingabe ist falsch")
                        eingabe = readln()
                    }
            }

            autoSortTyp.ANZEHLTÜREN -> {


                for (auto in list) {
                    if (auto.anzahlTür == eingabe) {
                        autoFilteredList.add(auto)
                    }
                }
            }

            autoSortTyp.KLIMATISIERUNG -> {

                for (auto in list) {
                    if (auto.klimatisierung == eingabe) {
                        autoFilteredList.add(auto)
                    }
                }
            }

            autoSortTyp.KILOMETERSTAND -> {
                var eingabeKorrekt = false

                while (!eingabeKorrekt) {


                    try {
                        val convertTODouble = eingabe.toDouble()
                        eingabeKorrekt = true
                        for (auto in list) {
                            if (auto.kilometerstand == convertTODouble) {
                                autoFilteredList.add(auto)
                            }

                        }
                    } catch (e: Exception) {
                        println("Falsche eingabe, Bitte geben Sie Kilometer Zahl ein.")
                        eingabe = readln()

                    }
                }
            }

            autoSortTyp.PREIS -> {
                var preisEingabeKorrekt = false

                while (!preisEingabeKorrekt) {
                    try {
                        val convertTODouble = eingabe.toDouble()
                        preisEingabeKorrekt = true
                        for (auto in list) {
                            if (auto.preis == convertTODouble) {
                                autoFilteredList.add(auto)
                            }

                        }
                    } catch (e: Exception) {
                        println("Bitte Geben Sie den Preis in Zahlen ein.")
                        eingabe = readln()
                    }
                }
            }

            else -> {}
        }

        return autoFilteredList
    }

    private fun filtterListMotorrad(list: List<Motorrad>, type: MotorradSort): List<Motorrad> {

        val motorradFilteredList: MutableList<Motorrad> = mutableListOf()

        var eingabe = readln()
        when (type) {

            MotorradSort.MARKE -> {

                for (motorrad in list) {
                    if (motorrad.marke == eingabe) {
                        motorradFilteredList.add(motorrad)
                    }
                }
            }

            MotorradSort.KRAFTSTOFF -> {

                for (motorrad in list) {
                    if (motorrad.kraftstoff == eingabe) {
                        motorradFilteredList.add(motorrad)
                    }
                }
            }

            MotorradSort.MODELL -> {
                for (motorrad in list) {
                    if (motorrad.modell == eingabe) {
                        motorradFilteredList.add(motorrad)
                    }
                }
            }

            MotorradSort.ANTRIEBSART -> {
                for (motorrad in list) {
                    if (motorrad.antriebsArt == eingabe) {
                        motorradFilteredList.add(motorrad)
                    }
                }
            }

            MotorradSort.STANDORT -> {
                for (motorrad in list) {
                    if (motorrad.standOrt == eingabe) {
                        motorradFilteredList.add(motorrad)
                    }
                }
            }

            MotorradSort.FARBE -> {

                for (motorrad in list) {
                    if (motorrad.farbe == eingabe) {
                        motorradFilteredList.add(motorrad)
                    }
                }
            }

            MotorradSort.GETRIEBE -> {

                for (motorrad in list) {
                    if (motorrad.getriebe == eingabe) {
                        motorradFilteredList.add(motorrad)
                    }
                }
            }

            MotorradSort.KILOMETERSTAND -> {
                var eingabeKorrekt = false

                while (!eingabeKorrekt) {


                    try {
                        val convertTODouble = eingabe.toDouble()
                        eingabeKorrekt = true
                        for (motorrad in list) {
                            if (motorrad.kilometerstand == convertTODouble) {
                                motorradFilteredList.add(motorrad)
                            }
                        }
                    } catch (e: Exception) {
                        println("Falsche eingabe, Bitte geben Sie Kilometer Zahl ein.")
                        eingabe = readln()
                    }
                }
            }

            MotorradSort.FAHRZEUGHALTER -> {
                var eingabeKorrekt = false

                while (!eingabeKorrekt) {


                    try {
                        val convertTODouble = eingabe.toInt()
                        eingabeKorrekt = true
                        for (motorrad in list) {
                            if (motorrad.fahrzeugHalter == convertTODouble) {
                                motorradFilteredList.add(motorrad)
                            }
                        }
                    } catch (e: Exception) {
                        println("Falsche eingabe, Bitte geben Sie Kilometer Zahl ein.")
                        eingabe = readln()
                    }
                }
            }

            MotorradSort.LEISTUNG -> {
                var eingabeKorrekt = false

                while (!eingabeKorrekt) {


                    try {
                        val convertTODouble = eingabe.toInt()
                        eingabeKorrekt = true
                        for (motorrad in list) {
                            if (motorrad.leistung == convertTODouble) {
                                motorradFilteredList.add(motorrad)
                            }
                        }
                    } catch (e: Exception) {
                        println("Falsche eingabe, Bitte geben Sie Kilometer Zahl ein.")
                        eingabe = readln()
                    }
                }
            }

            MotorradSort.PREIS -> {
                val preisEingabeKorrekt = false

                while (!preisEingabeKorrekt) {

                    try {
                        val converTODouble = eingabe.toDouble()
                        for (motorrad in list) {
                            if (motorrad.preis == converTODouble) {
                                motorradFilteredList.add(motorrad)
                            }
                        }
                    } catch (e: Exception) {
                        println("Bitte geben Sie Kilometerzahl ein: ")
                    }
                }
            }

            MotorradSort.BAUJAHR -> {
                val preisEingabeKorrekt = false

                while (!preisEingabeKorrekt) {

                    try {
                        val converTODouble = eingabe.toInt()
                        for (motorrad in list) {
                            if (motorrad.baujahr == converTODouble) {
                                motorradFilteredList.add(motorrad)
                            }
                        }
                    } catch (e: Exception) {
                        println("Bitte geben Sie Kilometerzahl ein: ")
                    }
                }
            }

            else -> {}
        }

        return motorradFilteredList
    }

    private fun filtterListLkw(list: List<Lkw>, eingabe: String, type: lkwSortTyp): List<Lkw> {

        val lkwFilteredList: MutableList<Lkw> = mutableListOf()

        when (type) {

            lkwSortTyp.MARKE -> {

                for (lkw in list) {
                    if (lkw.marke == eingabe) {
                        lkwFilteredList.add(lkw)
                    }
                }
            }

            lkwSortTyp.MODELL -> {
                for (lkw in list) {
                    if (lkw.modell == eingabe) {
                        lkwFilteredList.add(lkw)
                    }
                }
            }

            lkwSortTyp.STANDORT -> {
                for (lkw in list) {
                    if (lkw.standOrt == eingabe) {
                        lkwFilteredList.add(lkw)
                    }
                }
            }

            lkwSortTyp.KLIMATISIERUNG -> {

                for (lkw in list) {
                    if (lkw.klimatisierung == eingabe) {
                        lkwFilteredList.add(lkw)
                    }
                }
            }

            lkwSortTyp.KRAFTSTOFF -> {

                for (lkw in list) {
                    if (lkw.kraftstoff == eingabe) {
                        lkwFilteredList.add(lkw)
                    }
                }
            }

            lkwSortTyp.SCHADSTOFFKLASSE -> {
                for (lkw in list) {
                    if (lkw.schadstoffklasse == eingabe) {
                        lkwFilteredList.add(lkw)
                    }

                }
            }

            lkwSortTyp.UMWELTPLAKETTE -> {
                for (lkw in list) {
                    if (lkw.umweltplakette == eingabe) {
                        lkwFilteredList.add(lkw)
                    }
                }
            }

            lkwSortTyp.RADFORMEL -> {
                for (lkw in list) {
                    if (lkw.radformel == eingabe) {
                        lkwFilteredList.add(lkw)
                    }
                }
            }

            lkwSortTyp.KILOMETERSTAND -> {
                var kilometerEingabeKorrekt = false

                while (!kilometerEingabeKorrekt) {
                    try {
                        val convertTODouble = eingabe.toDouble()
                        kilometerEingabeKorrekt = true
                        for (auto in list) {
                            if (auto.kilometerstand == convertTODouble) {
                                lkwFilteredList.add(auto)
                            }

                        }

                    } catch (e: Exception) {
                        println("Bitte geben Sie Kilometer Zahl ein.")
                    }
                }
            }

            lkwSortTyp.PREIS -> {

                var preisEingabeKorrekt = false
                while (!preisEingabeKorrekt) {
                    try {
                        val convertTODouble = eingabe.toDouble()
                        preisEingabeKorrekt = true

                        for (lkw in list) {
                            if (lkw.preis == convertTODouble) {
                                lkwFilteredList.add(lkw)
                            }
                        }
                    } catch (e: Exception) {
                        println("Bitte geben Sie Kilometer Zahl ein.")
                    }
                }
            }

            lkwSortTyp.GESAMTGEWICHT -> {

                var preisEingabeKorrekt = false
                while (!preisEingabeKorrekt) {
                    try {
                        val convertTODouble = eingabe.toDouble()
                        preisEingabeKorrekt = true

                        for (lkw in list) {
                            if (lkw.gesamtGewicht == convertTODouble) {
                                lkwFilteredList.add(lkw)
                            }
                        }
                    } catch (e: Exception) {
                        println("Bitte geben Sie Kilometer Zahl ein.")
                    }
                }
            }

            lkwSortTyp.BAUJAHR -> {

                var preisEingabeKorrekt = false
                while (!preisEingabeKorrekt) {
                    try {
                        val convertTODouble = eingabe.toInt()
                        preisEingabeKorrekt = true

                        for (lkw in list) {
                            if (lkw.baujahr == convertTODouble) {
                                lkwFilteredList.add(lkw)
                            }
                        }
                    } catch (e: Exception) {
                        println("Bitte geben Sie Kilometer Zahl ein.")
                    }
                }
            }

            lkwSortTyp.LEISTUNG -> {

                var preisEingabeKorrekt = false
                while (!preisEingabeKorrekt) {
                    try {
                        val convertTODouble = eingabe.toInt()
                        preisEingabeKorrekt = true

                        for (lkw in list) {
                            if (lkw.leistung == convertTODouble) {
                                lkwFilteredList.add(lkw)
                            }
                        }
                    } catch (e: Exception) {
                        println("Bitte geben Sie Kilometer Zahl ein.")
                    }
                }
            }

            lkwSortTyp.FAHZEUGHALTER -> {

                var preisEingabeKorrekt = false
                while (!preisEingabeKorrekt) {
                    try {
                        val convertTODouble = eingabe.toInt()
                        preisEingabeKorrekt = true

                        for (lkw in list) {
                            if (lkw.fahrzeugHalter == convertTODouble) {
                                lkwFilteredList.add(lkw)
                            }
                        }
                    } catch (e: Exception) {
                        println("Bitte geben Sie Kilometer Zahl ein.")
                    }
                }
            }

            else -> {}
        }
        return lkwFilteredList
    }
}