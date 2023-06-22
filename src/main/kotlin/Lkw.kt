import java.time.YearMonth
class Lkw(marke: String, modell: String, preis: Double, var gesamtGewicht: Double, var radformel: String, leistung: Int, kraftstoff: String, baujahr: Int,
          kilometerstand: Double, standort: String, farbe: String, getriebe: String, var klimatisierung: String, kontaktNummer: String,
          fahrzeugHalter: Int, var schadstoffklasse: String, var umweltplakette: String, datum: YearMonth) :

        Fahrzeug(marke, modell, preis, leistung, kraftstoff, baujahr, kilometerstand, farbe, standOrt = standort, fahrzeugtyp = "LKW", getriebe = getriebe,
                kontaktNummer, fahrzeugHalter, datum) {
    override fun toString(): String {

        return """
            |
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
                        |Anhängerkupplung:      $gesamtGewicht
                        |Radformel:             $radformel
                        |Fahrzeughalter:        $fahrzeugHalter
                        |Gesamtgewicht          $gesamtGewicht
                        |Kontaktnummer:         $kontaktNummer
                        |Standort:              $standOrt
                        |-----------------------------------------------------
                        |""".trimMargin()
    }


}
enum class lkwSortTyp() {
    MARKE, MODELL, PREIS, LEISTUNG, KRAFTSTOFF, BAUJAHR, KILOMETERSTAND, FARBE, STANDORT, GETRIEBE, KLIMATISIERUNG, SCHADSTOFFKLASSE,
    UMWELTPLAKETTE, FAHZEUGHALTER, RADFORMEL, GESAMTGEWICHT
}