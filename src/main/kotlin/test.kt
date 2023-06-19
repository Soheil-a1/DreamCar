


fun main ()
{
    Shop().menu()
}










/*
val nutzerListe = mutableListOf<User>()




fun main (){
    anmeldungUndRegister()
}


fun anmeldungUndRegister() {

    println("Anmeldung oder Registrierung")

    var input = readln().toString()

    when (input) {

        "1", "Anmeldung", "anmeldung", "Anmelden", "anmelden", "log in", "Log In" -> anmeldung()

        "2", "Registrierung", "registrierung", "registrieren", "Registrieren", "sign up", "Sign Up" -> Registrieren()

    }


}

    private fun anmeldung() {

        println("Anmeldung")
        println("E-Mail Oder Benutzername:")

        var userLogIn: Boolean = false
        var versuche: Int = 0
        var username: String
        var password: String



        while (!userLogIn && versuche <5) {
            println("Geben sie ihren Benutzername ein:")
            username = readln()
            println("Geben sie ihre Passwort ein:")
            password = readln()

            userLogIn = username in nutzerListe && password == nutzerListe[username]!!
            versuche++
            if (userLogIn) {
                println("Willkommen, $username")
                break
            } else if (versuche == 3)
                println("Maximale Anzahl an Versuchen überschritten")
            else
                println("Login Fehlgeschlagen")
        }


    }



fun Registrieren(){

    println("Registrierung")
    println("Nutzername::")
    var userName: String = readln().lowercase()

    println("E-Mail:")
    var email: String = readln()

    println("Passwort:")
    var password: String = readln()

    println("Vorname:")
    var firstName: String = readln()
    println("Nachname:")
    var lastName: String = readln()
    println("Herzlich Glückwunsch! Die Konto ist bereit erstellt.")


    if ( !nutzerListe.any{it.userName == firstName})  {

        val neuUser = User(nutzerName = userName, email = email, pass = password, vorName = firstName, nachName = lastName  )
        nutzerListe.add(neuUser)
        return anmeldungUndRegister()
    } else {
        println("Diese Account ist bereit vorhanden! Bitte Loggen Sie sich ein")
    }

}


/*
"marioSchindler@gmail.com" to listOf("mario.12", "Mario1234", "Mario", "Schindler"),
        "enes@gmail.com" to listOf("enes.enes1", "Enes321", "Enes"), "eduard@yahoo.de" to listOf("eduard223", "Eduard0123", "Eduard"),
        "maxMueller@outlook.com" to listOf("mueller11", "Maxmueller332", "Max", "Müller"
 */