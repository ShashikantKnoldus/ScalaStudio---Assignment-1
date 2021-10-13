package EmployeeManagementSystem
import org.scalatest.flatspec.AnyFlatSpec

import scala.language.postfixOps


class EmployeeTest extends AnyFlatSpec {
  val empDetail= new EmpDetail
  //Consultant Cases
  //Case 1
  "Consultant"should "give"in{
    val temp=empDetail.Consaltant(123,"Shashikant","Tyagi","15000")
    val temp2=empDetail.Consaltant(123,"Shashikant","Tyag","15000")

    assert(temp=="Id:  CONS123 Name: Shashikant Tyagi Salary: 15000")
    assert(temp2!="Id:  CONS123 Name: Shashikant Tyagi Salary: 15000")
  }
  //Manager Cases
  //Case 2
  "Manager"should "give"in{
    val temp=empDetail.Manager(123,"Vinit","Tyagi","750000")
    val temp2=empDetail.Manager(123,"Vinit","Tyag","750000")

    assert(temp=="Id:  MANA123 Name: Vinit Tyagi Salary: 15000")
    assert(temp2!="Id:  MANA123 Name: Vinit Tyagi Salary: 15000")
  }
  //Manager Cases
  //Case 3
  "SrManager"should "give"in {
    val temp = empDetail.SrManager(123, "Prabhat ", "Kashyap", "150000")
    val temp2 = empDetail.SrManager(123, "Prabhat ", "Kashyap", "150000")

    assert(temp == "Id:  SRMA123 Name: Prabhat Kashyap Salary: 150000")
    assert(temp2 != "Id:  SRMA123 Name: Prabhat Kashyap Salary: 150000")
  }
  //President Cases
  //Case 4
  "President"should "give"in {
    val temp = empDetail.president(123, "Vikas", "Hazrati", "1500000")
    val temp2 = empDetail.president(123, "Vikas ", "Hazrati", "1500000")

    assert(temp == "Id:  POTC123 Name: Vikas Hazrati Salary: 150000")
    assert(temp2 != "Id: POTC123 Name: Vikas Hazrati Salary: 150000")
  }
  //Attendence Cases
  // test case 5
  "Attendence" should "give"in {
    val temp = empDetail.attendence("Shashikant", "9:00", "7:00")
    assert(temp == "Employee name: Shashikant LoginTime: 9:00 AM LogOutTime:7:00 PM")
  }
  //Attendence Cases
  // test case 6
  "Attendenc" should "give"in {
    val temp = empDetail.attendence("Shashikant")
    assert(temp == "Employee name: Shashikant LoginTime: 9:45 AM LogOutTime: 6:45 PM")
  }
}

