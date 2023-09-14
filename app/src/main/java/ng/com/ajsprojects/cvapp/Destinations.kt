package ng.com.ajsprojects.cvapp

interface Destinations {
    val route: String
}

object ViewCvScreen: Destinations{
    override val route = "Cv Screen"
}

object EditCvScreen: Destinations{
    override val route = "Edit Screen"
}