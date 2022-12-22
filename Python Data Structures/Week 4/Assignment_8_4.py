"""
8.4 Open the file romeo.txt and read it line by line. For each line, split the line into a list of words using the split() method. The program should build a list of words. For each word on each line check to see if the word is already in the list and if not append it to the list. When the program completes, sort and print the resulting words in alphabetical order.
You can download the sample data at http://www.py4e.com/code3/romeo.txt
"""

"""
fname = input("Enter file name: ")
fh = open(fname)
lst = list()
for line in fh:
print(line.rstrip())
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

# Initialize cumulative list
cumulative_list = list()

"""
# Alternative way to parse the text... this way takes extra space in memory due to parsing everything into a string, also slower due to need to iterate through the string for a split() and then another for conditional processing
text = file_handler.read()
print(text)
text_list = text.split()
print(text_list)
"""

# Goes through file handler and appends each unique word in the cumulative list
for line in file_handler:
    line_list = line.split()
    for word in line_list:
        if word not in cumulative_list:
            cumulative_list.append(word)

# Sort cumulative list in alphabetical order and print the list
cumulative_list.sort()
print(cumulative_list)
