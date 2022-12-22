"""
3.3 Write a program to prompt for a score between 0.0 and 1.0. If the score is out of range, print an error. If the score is between 0.0 and 1.0, print a grade using the following table:
Score Grade
>= 0.9 A
>= 0.8 B
>= 0.7 C
>= 0.6 D
< 0.6 F
If the user enters a value out of range, print a suitable error message and exit. For the test, enter a score of 0.85.
"""

"""
score = input("Enter Score: ")
"""

# Prompt user for input
score = input("Enter Score between 0.0 and 1.0: ")

# Test user input for valid input
try:
    score = float(score)
    # If input is valid and in range, decode score to letter grade
    if 0.0 <= score <= 1.0 :
        if score >= 0.9 :
            print('A')
        elif score >= 0.8 :
            print('B')
        elif score >= 0.7 :
            print('C')
        elif score >= 0.6 :
            print('D')
        else :
            print('F')
    # Else print error message
    else :
        print('Score Out of Range')
# Print error message for invalid input
except:
    print('Invalid Input')
