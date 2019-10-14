# Reverse the word order of a sentence without reversing the words
# e.g. 'this is a sentence' becomes 'sentence a is this'

def reverseSentence(sentence):
    wordList = sentence.split(" ")
    newSentence = "";
    for i in range(1,len(wordList)+1):
        newSentence += wordList[-i] + " "
    return newSentence

print(reverseSentence("This is a sentence"))
