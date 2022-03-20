package employees

class Employee constructor(var id : Long, var address : String, var salary : Int, var position : Position? = Position.DEVELOPER) {

}

/*Zadanie 4
*  Napisz klasę Employee. Klasa powinna zawierać jeden konstruktor z następującymi atrybutami:
* id (typu Long), address, salary, position - dobierz odpowiednie typy. Wszystkie atrybuty oprócz position są obowiązkowe.
*
* Position może przyjmować tylko jedną z trzech wartości: Manager, Developer, Tester. Jeśli nie zostanie
* podana wartość position podczas instancjonowania obiektu, wówczas zostaje ustawiona wartość domyślna - Developer.
*
* Następnie dodaj interfejs EmployeeManager z metodami:
* - do dodawania pracownika
* - taką która wypisuje wszystkie informacje (id, address, salary, position) wszystkich aktualnie dodanych pracowników
* - taką, która zwraca sumę wynagrodzeń wszystkich pracowników
*
* Dodaj klasę EmployeeManagerImpl, która implementuje ten interfejs.
* Obiekty klasy Employee powinny być przechowywane w liście, która jest składową klasy EmployeeManagerImpl.
*
* Wykonaj odpowiednie testy.
* Do rozwiązania zadania, nie jest wymagane użycie lambd.
*
* Zadanie 4* (dla osób które zrobiły zasadniczą część)
* Użyj lambd podczas implementacji funkcji interfejsu EmployeeManager.
* */