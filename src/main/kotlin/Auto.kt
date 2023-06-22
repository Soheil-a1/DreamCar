import java.time.YearMonth
class Auto(marke: String, modell: String, preis: Double, var anhaengerkupplung: Boolean, leistung: Int, kraftstoff: String, baujahr: Int,
           kilometer: Double, farbe: String, standOrt: String, getriebe: String, var anzahlTür: String, var sitzPlaetze: Int, kontaktNummer: String,
           fahrzeugHalter: Int, var schadstoffklasse: String, var umweltplakette: String, var klimatisierung: String, datum: YearMonth, var hubraum: Double) :

        Fahrzeug(marke, modell, preis, leistung, kraftstoff, baujahr, kilometer, farbe, standOrt, fahrzeugtyp = "Auto", getriebe,
                kontaktNummer, fahrzeugHalter, datum) {

    override fun toString(): String {

        return """
                        |Marke:                 $marke
                        |Modell:                $modell
                        |Preis:                 $preis
                        |Leistung(PS)           $leistung 
                        |Kraftstoff:            $kraftstoff
                        |Baujahr:               $baujahr
                        |Kilometer:             $kilometerstand
                        |Getriebe:              $getriebe
                        |Klimatisierung:        $klimatisierung
                        |Schadstoffklasse:      $schadstoffklasse
                        |Umweltplakette:        $umweltplakette
                        |HU:                    $datum
                        |Farbe:                 $farbe
                        |Anhängerkupplung:      $anhaengerkupplung
                        |Anzahl der Türen:      $anzahlTür
                        |Sitzplätze:            $sitzPlaetze
                        |Fahrzeughalter:        $fahrzeugHalter
                        |Hubraum                $hubraum
                        |Kontaktnummer:         $kontaktNummer
                        |Standort:              $standOrt
                        |-----------------------------------------------------
                        |""".trimMargin()
    }
}
enum class autoSortTyp() {
    MARKE, MODELL, PREIS, FARBE, GETRIEBE, KRAFTSTOFF, LEISTUNG, BAUJAHR, KILOMETERSTAND, STANDORT, SITZPLÄTZE, ANZEHLTÜREN, SCHADSTOFFKLASSE,
    UMWELTPLAKETTE, KLIMATISIERUNG, ANHAENGERKUPPLUNG, HUBRAUM
}