"""
6.5 Write code using find() and string slicing (see section 6.10) to extract the number at the end of the line below. Convert the extracted value to a floating point number and print it out.
"""

"""
text = "X-DSPAM-Confidence:    0.8475"
"""

text = "X-DSPAM-Confidence:    0.8475"

# Finds and extracts exact number, coverts it to float, and prints it
number_position = text.find('0.8475')
number = text[number_position:]
print(float(number))