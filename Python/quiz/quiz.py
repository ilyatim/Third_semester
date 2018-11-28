# игра викторина, в текстовом файле находятся вопросы и ответы на них
#
import sys
def open_file(name_of_file, mode):
    try:
        the_file = open(name_of_file, mode, encoding= 'utf-8')
        print("file is open")
    except IOError as e:
        print("this file doesn't work -", e, "error")
        sys.exit()
    else:
        return the_file
def next_line(the_file):
    line = the_file.readline()
    line = line.replace("/", "\n")
    return line
def next_block(the_file):
    category = next_line(the_file)
    question = next_line(the_file)
    answer = []
    explanation = None
    for i in range(4):
        answer.append(next_line(the_file))
    correct = next_line(the_file)
    if correct:
        correct = correct[0]
        explanation = next_line(the_file)
    return category, question, answer, correct, explanation
def welcome(title):
    print("welcome")
    print(title)
def main():
    quiz_file = open_file("quiz.txt", "r")
    title = quiz_file.readline()
    welcome(title)
    score = 0
    category, question, answers, correct, explanation = next_block(quiz_file)
    while category:
        print(category)
        print(question)
        for i in range(4):
            print(answers[i], "\n")
        answer = input("u're answer - ")
        if answer == correct:
            print("yes")
            score += 1
        else:
            print("no")
        print(explanation)
        print("score:", score)
        category, question, answers, correct, explanation = next_block(quiz_file)
    print("it's be finally question, goodbye")
    print("u're score:", score)
    quiz_file.close()
main()