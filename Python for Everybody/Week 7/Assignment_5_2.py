"""
5.2 Write a program that repeatedly prompts a user for integer numbers until the user enters 'done'. Once 'done' is entered, print out the largest and smallest of the numbers. If the user enters anything other than a valid number catch it with a try/except and put out an appropriate message and ignore the number. Enter 7, 2, bob, 10, and 4 and match the output below.
"""

"""
largest = None
smallest = None
while True:
    num = input("Enter a number: ")
    if num == "done":
        break
    print(num)

print("Maximum", largest)
"""

# Initialize variables
largest = None
smallest = None

# Loop for user input indefinitely
while True:
    num = input("Enter a number: ")

    # If 'done' is entered, exit loop
    if num == "done":
        break
    
    # If invalid input, print error message and reloop
    try:
        num = int(num)
    except:
        print('Invalid input')
        continue
    
    # If valid input but variables are still equal to None, assign num to variables
    if largest is None:
        largest = num
        smallest = num
    # Else reassign variables accordingly
    else:
        if num > largest:
            largest = num
        elif num < smallest:
            smallest = num

# Print maxium and smallest numbers
print("Maximum is", largest)
print("Minimum is", smallest)