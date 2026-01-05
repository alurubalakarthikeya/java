import math
startingPoint = input("Enter the Starting city: ")
endingPoint = startingPoint
citiesArray = []
noOfMiddlePoints = int(input("Enter number of other cities you visit during the journey: "))
for i in range(0, noOfMiddlePoints):
    cityName = input("Enter city name:")
    citiesArray.append(cityName)   
print("Cities are: ", citiesArray)
numOfRoutes = math.factorial(noOfMiddlePoints)
print(f"Total number of possible routes from {startingPoint} to {endingPoint} through the cities is: {numOfRoutes}")