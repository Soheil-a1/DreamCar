

open class UserLogIn ( ) {



    open var warteZeit = Thread.sleep(1500)
   open var langeWarteZeit = Thread.sleep(60000/1000)


    var user1: User = User("Soheil", "Adel", "soheil.1", "soheil@yahoo.de", "soheil111")


 val userslist = mutableListOf<User>(user1)

    fun logInAndSignUp(){

        println("Anmeldung oder Registrierung")

        var input= readln().lowercase()

        when (input) {

            "1", "Anmeldung" -> logIn()
            "2", "Registrierung" -> signUp()
        }

    }

    private fun logIn() {

        println("Anmeldung")
        println("E-Mail Oder Benutzername:")
        var versuche: Int = 1
        var userMail: String = readln()
        var userLogIn = false


        while (!userLogIn) {


            for (logInAndSignUp in userslist) {
                if (userMail == logInAndSignUp.email || (userMail== logInAndSignUp.userName)) {
                    println("Passwort:")
                    var userPassword = readln()

                    if (userPassword == logInAndSignUp.pass && versuche < 5) {
                        println("Sie sind eingeloggt")
                        userLogIn = true
                        break
                    } else if (versuche > 5 ){
                        println("Die Versuchen sind Überschritten. Bitte versuchen Sie später. ")
                    } else {
                        println("Die Passwort ist Falsch")
                        versuche ++

                        langeWarteZeit

                    }


                } else {

                    println("E-Mail oder Benutzername ist falsch")
                    return logIn()
                }

            }
        }
    }


    fun signUp(){

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
        var nachName: String = readln()
        println("Herzlich Glückwunsch! Die Konto ist bereit erstellt.")


        if ( !userslist.any{it.nutzerName == firstName})  {

            val neuUser = User(nutzerName = userName, email = email, pass = password, name = firstName, lastName = nachName  )
            userslist.add(neuUser)
            return logInAndSignUp()
        } else {
            println("Diese Account ist bereit vorhanden! Bitte Loggen Sie sich ein")
        }

    }






}