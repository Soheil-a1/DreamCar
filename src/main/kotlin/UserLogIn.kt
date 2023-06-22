open class UserLogIn() {
    var shop = Shop()
    val black = "\u001B[30m"
    val reset = "\u001B[0m"
    val white = "\u001B[37m"
    val bold = "\u001B[1m"
    fun logInAndSignUp() {

        println("${bold}-------Dream Car--------${reset}")
        warteZeit
        while (true) {

            println("-------Anmeldung oder Registrierung------")

            var input = readln().lowercase()

            when (input) {

                "1", "Anmeldung", "anmeldung", "Anmelden", "anmelden" -> {
                    val userligIn = logIn()
                    if (userligIn) {
                        shop.menu()
                    }
                }

                "2", "Registrierung", "registrierung", "Registrieren", "registrieren" -> signUp()
                "3", "beenden", "Beenden" -> break
            }

        }
    }

    val userslist = mutableListOf<User>(User("a", "b", "c", "d", "e"))

    private fun logIn(): Boolean {

        println("           Anmeldung            ")
        warteZeit
        println("E-Mail Oder Benutzername:")
        var versuche: Int = 1
        var userMail: String = readln()
        var userLogIn = false


        while (!userLogIn) {

            if (userslist.any { it -> it.email == userMail } || userslist.any { it -> it.userName == userMail }) {
                val logInAndSignUp = userslist.find { it.userName == userMail || it.email == userMail }
                println("Passwort:")
                var userPassword = readln()
                if (userPassword == logInAndSignUp!!.pass && versuche < 5) {
                    println("Sie sind eingeloggt")
                    userLogIn = true
                    break
                } else if (versuche > 5) {
                    println("Die Versuchen sind Überschritten. Bitte versuchen Sie später. ")
                } else {
                    println("Die Passwort ist Falsch")
                    versuche++

                    langeWarteZeit
                }
            } else {

                println("E-Mail oder Benutzername ist falsch")
                println("möchten Sie nochmal Versuchen oder Neuer Konto Erstellen?")
                println("1 für Nochmal versuchen, 2 für neuer Konto erstellen.")
                var input = readln()
                if (input == "1" || input == "nochmal") {
                    return logIn()

                } else {
                    signUp()
                    return false
                }

            }


        }



        return userLogIn
    }


    fun signUp() {

        println("Registrierung")
        warteZeit
        println("Nutzername:")
        var userName: String = readln().lowercase()

        println("E-Mail:")
        var email1: String = readln()

        println("Passwort:")
        var password: String = readln()

        println("Vorname:")
        var firstName: String = readln()
        println("Nachname:")
        var nachName: String = readln()
        println("Herzlich Glückwunsch! Ihre neuen Konto ist bereit erstellt.")

        if (!userslist.any { it.nutzerName == userName && it.email == email1 }) {

            val neuUser = User(nutzerName = userName, email = email1, pass = password, name = firstName, lastName = nachName)
            userslist.add(neuUser)

        } else {
            println("Diese Account ist bereit vorhanden! Bitte Loggen Sie sich ein")
        }
    }
}