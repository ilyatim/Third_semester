#include <iostream>
#include <fstream>
#include <cstdio>
#include "dictionary.h"
using namespace std;

void output();
bool input(Dictionary& dictionary);
int main()
{
  Dictionary dictionary;
  while(input(dictionary))
  {

  }
  dictionary.empty_dictionary();
  return 0;
}
void output()
{
  cout << endl;
  cout << "1 to create empty dictionary" << endl;
  cout << "2 to add new word in dictionary" << endl;
  cout << "3 to delete element from dictionary" << endl;
  cout << "4 to search word" << endl;
  cout << "5 to change word in dictionary" << endl;
  cout << "6 to output all words" << endl;
  cout << "7 to recording dictionary in text file" << endl;
  cout << "8 to recording dictionary from text file" << endl;
  cout << endl;
}
bool input(Dictionary& dictionary)
{
  output();
  int choice;
  cout << "enter u're choice" << endl;
  cin >> choice;
  switch (choice)
  {
    case 1:
    {
      dictionary.empty_dictionary();
      cout << "the dictionary is empty" << endl;
      break;
    }
    case 2:
    {
      string name_1, name_2;
      char make;
      cout << "enter world what u want to record" << endl;
      cin >> name_1;
      cout << "what definition will you give to this word" << endl;
      for(;;)
      {
        make = getchar();
        if(make == 13 || make == 10)
        {
          continue;
        }
        getline(cin, name_2);
        break;
      }
      dictionary.new_word(name_1, name_2);
      break;
    }
    case 3:
    {
      break;
    }
    case 4:
    {
      string name;
      cout << "what word would u like to search?" << endl;
      cin >> name;
      dictionary.search(name);
      break;
    }
    case 5:
    {
      break;
    }
    case 6:
    {
      dictionary.output();
      break;
    }
    case 7:
    {
      cout << "enter the name of the file in which to load the dictionary" << endl;
      string name;
      cin >> name;
      ofstream into_a_file;
      into_a_file.open(name);
      if(into_a_file.is_open())
      {
        into_a_file << dictionary;
      }
      into_a_file.close();
      break;
    }
    case 8:
    {
      cout << "enter the name of the file from which to load the dictionary" << endl;
      string name;
      cin >> name;
      ifstream from_a_file;
      from_a_file.open(name);
      if(from_a_file.is_open())
      {
        from_a_file >> dictionary;
      }
      from_a_file.close();
      break;
    }
    default:
    {
      cout << "exit from programm" << endl;
      return false;
      break;
    }
  }
  return true;
}
