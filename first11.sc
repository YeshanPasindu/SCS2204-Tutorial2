//Q:: 1 ,2


var k, i, j = 2
var m, n = 5
var f = 12.0f
var g = 4.0f
var c = 'X'

//*************************************


//Q:: 3 > 1

//a)
k + 12 * m

//b)
m / j

//c)
n % j

//d)
m / j * j

//e)
f + 10 * 5 + g

//f)
i = i + 1
i * n

//*************************************

//Q:: 3 > 2

var a = 2
var b = 3
var c = 4
var d = 5
var k = 4.3f


//a)
b = b - 1
println(b * a + c * d)
d = d - 1

//b)
println(a)
a = a + 1

//c)
println(-2 * (g - k) + c)

//d)
println(c)
c = c + 1

//e)
c = c + 1
println(c * a)
a = a + 1

//*************************************

//Q:: 4 > 1


val salaryForWH = 250.00f
val salaryForOTH = 85.00f
val typicalWHPerWeek = 40
val typicalOTHPerWeek = 30
val taxRate = 0.12f

def ChekValid(workingHours: Int, otHours: Int): Boolean = workingHours >= typicalWHPerWeek && otHours >= typicalOTHPerWeek
def TotalSalary(workingHours: Int, otHours: Int): Float = (workingHours * salaryForWH) + (otHours * salaryForOTH)
def Tax(totalOfSalary: Float): Float = totalOfSalary * taxRate
def TakeHomeSalary(totalOfSalary: Float, tax: Float) : Float = totalOfSalary - tax

def CalculateSalary(workingHours: Int, otHours: Int) : Float = if (ChekValid(workingHours, otHours)) {
  val totalOfSalary = TotalSalary(workingHours, otHours)
  val tax = Tax(totalOfSalary)
  TakeHomeSalary(totalOfSalary, tax)
} else {

  0
}

CalculateSalary(60, 60)


//*************************************

//Q:: 4 > 2

val priceChange = 5

def NumOfPeople(priceChange: Int): Int = -1 * (priceChange * 20 / 5) + 120
def TicketCost(priceChange: Int): Float = 15.0f + priceChange
def Income(numberOfPeople: Int, ticketPrice: Float): Float = ticketPrice * numberOfPeople
def Cost(numberOfPeople: Int): Float = 500.00f + (3.00f * numberOfPeople)
def Profit(income: Float, cost: Float): Float = income - cost
def CalculateProfit(numberOfPeople: Int, ticketPrice: Float) : Float = Profit(Income(numberOfPeople, ticketPrice), Cost(numberOfPeople))

def FindPrice(priceIncrese: Int, priceDecrese: Int): Float = {
  val numberOfPeopleIncreased = NumOfPeople(priceIncrese)
  val ticketPriceIncreased = TicketCost(priceIncrese)
  val profitIncreased = CalculateProfit(numberOfPeopleIncreased, ticketPriceIncreased)

  val numberOfPeopleDecreased = NumOfPeople(priceDecrese)
  val ticketCostDecreased = TicketCost(priceDecrese)
  val profitDecreased = CalculateProfit(numberOfPeopleDecreased, ticketCostDecreased)

  if(profitIncreased >= profitDecreased) ticketPriceIncreased else ticketCostDecreased
}
FindPrice(5,-5)