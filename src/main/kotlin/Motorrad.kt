import java.time.YearMonth
open class Motorrad(marke: String, modell: String, preis: Double, leistung: Int, kraftstoff: String, baujahr: Int, kilometer: Double, standOrt: String,
                    farbe: String, var antriebsArt: String, getriebe: String, kontaktNummer: String, var hubraum: Double,
                     fahrzeugHalter: Int, datum: YearMonth) :
        Fahrzeug(marke, modell, preis, leistung, kraftstoff, baujahr, kilometer, farbe, standOrt, fahrzeugtyp = "Motorrad", getriebe,
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
                        |Antriebsart:           $antriebsArt
                        |HU:                    $datum
                        |Farbe:                 $farbe
                        |Fahrzeughalter:        $fahrzeugHalter
                        |Hubraum                $hubraum
                        |Kontaktnummer:         $kontaktNummer
                        |Standort:              $standOrt
                        |-----------------------------------------------------
                        |""${'"'}.trimMargin()
    }
            
                 -------------------------------------  """.trimIndent()
    }
}


enum class MotorradSort() {
    MARKE, MODELL, PREIS, FARBE, GETRIEBE, KRAFTSTOFF, LEISTUNG, BAUJAHR, KILOMETERSTAND, STANDORT, ANTRIEBSART, TÜV, KONTAKTNUMMER, FAHRZEUGHALTER,
    HUBRAUM
}