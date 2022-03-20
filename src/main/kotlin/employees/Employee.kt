package employees


data class Employee constructor(val id : Long, var address : String, var salary : Int, var position : Position = Position.DEVELOPER) {}
