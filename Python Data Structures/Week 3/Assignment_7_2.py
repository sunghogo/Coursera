"""
7.2 Write a program that prompts for a file name, then opens that file and reads through the file, looking for lines of the form:
X-DSPAM-Confidence:    0.8475
Count these lines and extract the floating point values from each of the lines and compute the average of those values and produce an output as shown below. Do not use the sum() function or a variable named sum in your solution.
You can download the sample data at http://www.py4e.com/code3/mbox-short.txt when you are testing below enter mbox-short.txt as the file name.
"""

"""
# Use the file name mbox-short.txt as the file name
fname = input("Enter file name: ")
fh = open(fname)
for line in fh:
    if not line.startswith("X-DSPAM-Confidence:"):
        continue
    print(line)
print("Done")
"""

# Use the file name mbox-short.txt as the file name
# Opens prompted filename into handler, and reprompts until a valid filename is given
filename = input("Enter file name: ")
file_handler = None
while file_handler is None:
    try:
        file_handler = open(filename)
    except:
        filename = input("Enter file name: ")

# Initialize variables
count = float(0)
accumulator = float(0)

# Iterate through file_handler and find formatted string, extract and convert floating point number, then update relevant variables
for line in file_handler:
    if line.startswith("X-DSPAM-Confidence:"):
        position = line.find(':')

        #O(n)^2 number finder for robustness
        position += 1
        while line[position] == ' ':
            position += 1

        number = line[position:]
        number = float(number)
        count += 1
        accumulator += number

# Calculate and print average floating point values
average = accumulator/count
print("Average spam confidence:", average)