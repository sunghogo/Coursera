"""
8.5 Open the file mbox-short.txt and read it line by line. When you find a line that starts with 'From ' like the following line:
From stephen.marquard@uct.ac.za Sat Jan  5 09:14:16 2008
You will parse the From line using split() and print out the second word in the line (i.e. the entire address of the person who sent the message). Then print out a count at the end.
Hint: make sure not to include the lines that start with 'From:'. Also look at the last line of the sample output to see how to print the count.

You can download the sample data at http://www.py4e.com/code3/mbox-short.txt
"""

"""
fname = input("Enter file name: ")
if len(fname) < 1:
    fname = "mbox-short.txt"

fh = open(fname)
count = 0

print("There were", count, "lines in the file with From as the first word")
"""

# Opens prompted filename into handler, and reprompts until a valid filename is given
filename = input("Enter file name: ")
file_handler = None
while file_handler is None:
    try:
        file_handler = open(filename)
    except:
        filename = input("Enter file name: ")

# Initialize count variable
count = 0

# Iterate through file handler and select for appropriate lines, then .split(), print index(1), and increment ounter
for line in file_handler:
    if line.startswith('From '):
        line_list = line.split()
        print(line_list[1])
        count += 1

# Print the final count of lines
print("There were", count, "lines in the file with From as the first word")