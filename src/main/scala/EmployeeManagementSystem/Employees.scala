package EmployeeManagementSystem

trait Employees {
  def Consaltant(ID: Int,firstname: String, lastname: String, salary: String):String
  def Manager(ID: Int,firstname: String, lastname: String, salary: String):String
  def SrManager(ID: Int,firstname: String, lastname: String, salary: String):String
  def president(ID: Int,firstname: String, lastname: String, salary: String):String
}


class EmpDetail extends Employees {

  private val cons = "CONS"
  private val mana = "MANA"
  private val srma = "SRMA"
  private val potc = "POTC"

  def Consaltant( ID: Int,firstname: String, lastname: String, salary: String): String =( s"Id:  $cons$ID Name: $firstname $lastname Salary: $salary" )
  def Manager(ID: Int, firstname:String, lastname: String, salary: String): String =( s"Id:  $mana$ID Name: $firstname $lastname Salary: $salary" )
  def SrManager(ID: Int, firstname:String, lastname: String, salary: String): String =( s"Id:  $srma$ID Name: $firstname $lastname Salary: $salary" )
  def president(ID: Int,firstname: String, lastname: String, salary: String): String =( s"Id:  $potc$ID Name: $firstname $lastname Salary: $salary" )


  def attendence(name:String,startTime:String, endTime:String):String=(s"Employee name: $name LoginTime: $startTime AM LogOutTime:$endTime PM")

  def attendence(name:String): String=(s"Employee name: $name LoginTime: 9:45 AM LogOutTime: 6:45 PM")


}





