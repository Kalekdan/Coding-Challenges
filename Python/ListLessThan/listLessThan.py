# print out a new list created from a given list but only the values
# less than a provided value
# https://www.practicepython.org/exercise/2014/02/15/03-list-less-than-ten.html

myList = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]

def newListLessThan(listMax):
    newList = []
    for i in myList:
        if i < listMax:
            newList.append(i)
    return newList

print(newListLessThan(29))

