def doFizzBuzz(numTo):
    for i in range(1,numTo+1):
        if i % 3 == 0:
            print("Fizz", end = '')
        if i % 5 == 0:
            print("Buzz", end = '')
        if( i % 3 != 0 and i % 5 != 0):
            print(i, end = '')
        print()
        

doFizzBuzz(50)
