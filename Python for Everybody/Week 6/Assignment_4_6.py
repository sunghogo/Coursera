"""
4.6 Write a program to prompt the user for hours and rate per hour using input to compute gross pay. Pay should be the normal rate for hours up to 40 and time-and-a-half for the hourly rate for all hours worked above 40 hours. Put the logic to do the computation of pay in a function called computepay() and use the function to do the computation. The function should return a value. Use 45 hours and a rate of 10.50 per hour to test the program (the pay should be 498.75). You should use input to read a string and float() to convert the string to a number. Do not worry about error checking the user input unless you want to - you can assume the user types numbers properly. Do not name your variable sum or use the sum() function.
"""

"""
def computepay(h, r):
    return 42.37

hrs = input("Enter Hours:")
p = computepay(10, 20)
print("Pay", p)
"""

# Prompt user for valid inputs, returns list with converted input values or returns -1 for invalid input
def prompt_input():
    hours = input("Enter Hours: ")
    rate = input("Enter Hourly Rate: ")

    # Test user input for valid input
    try:
        # Convert input values to floating point
        hours = float(hours)
        rate = float(rate)

        # Print error message for out of range input
        if hours < 0 or rate < 0:
            print("Please enter a positive value for the inputs.")
            return -1
        else:
            inputs = [hours, rate]
            return inputs

        
    # Print error message for invalid input
    except:
        print("Invalid Input.")
        return -1


# Takes 2 float parameters to calculate and return gross pay
def computepay(hours, rate):
    # Calculate hours and overtime hours
    overtime_hours = 0
    if hours > 40 :
        overtime_hours = hours - 40
        hours = float(40)

    # Calculate Pay
    pay = (hours * rate) + (overtime_hours * 1.5 * rate)
    return pay


# Loops for valid user input
inputs = -1
while inputs == -1:
    inputs = prompt_input()
# When valid inputs, decode variables from returned inputs list and print computed pay
hours = inputs[0]
rate = inputs[1]
print("Pay", computepay(hours, rate))