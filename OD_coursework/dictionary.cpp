#include "dictionary.h"
#include <iostream>
#include <cstring>
using namespace std;
bool Dictionary::exist_key(string name_1, string name_2)
{
  multimap <string, string>::iterator it = mapDictionary.begin();
  for(unsigned int i = 0; it != mapDictionary.end(); i++, it++)
  {
    if(name_1 == it->first && name_2 == it->second)
      return true;
  }
  return false;
}

void Dictionary::empty_dictionary()
{
  mapDictionary.clear();
}
void Dictionary::new_word(string name_1, string name_2)
{
  if(!(exist_key(name_1, name_2)))
    mapDictionary.insert(make_pair(name_1, name_2));
  else
    cout << "ALREADY EXIST" << endl;
}
void Dictionary::delete_word(string name)
{
  if(mapDictionary.count(name))
    mapDictionary.erase(name);
  else
    cout << "wrong word" << endl;
}
void Dictionary::search(string name)
{
  cout << mapDictionary.count(name);
}
void Dictionary::change_word(string name)
{
  multimap <string, string>::iterator it = mapDictionary.begin();
  for(unsigned int i = 0; it != mapDictionary.end(); it++, i++)
  {
    if(it->first == name)
    {
      cout << "enter new name of this word" << endl;
      cin >> name;
      it->first = name;
    }
  }
}
void Dictionary::change_definition(string name)
{
  multimap <string, string>::iterator it = mapDictionary.begin();
  for(unsigned int i = 0; it != mapDictionary.end(); it++, i++)
  {
    if(it->second == name)
    {
      cout << "enter new name of this word" << endl;
      getline(cin, name, '\n');
      it->second = name;
    }
  }
}
void Dictionary::output()
{
  multimap <string, string>::iterator it = mapDictionary.begin();
  if(mapDictionary.size())
    for(unsigned int i = 0; it != mapDictionary.end(); it++, i++)
      cout << "word - " << it->first << ", definition - " << it->second << endl;
  else
    cout << "dictionary is empty" << endl;
}
void Dictionary::in_text(string name)
{
  multimap <string, string>::iterator it = mapDictionary.begin();
  ofstream into_a_file;
  into_a_file.open(name);
  if(into_a_file.is_open())
  {
    into_a_file << mapDictionary.size();
    for(unsigned int i = 0; it != mapDictionary.end(); it++, i++)
    {
      into_a_file << it->first << '.' << it->second << '.';
    }
  }
  into_a_file.close();
}

void Dictionary::from_text(string name, Dictionary& dictionary)
{
  ifstream from_a_file;
  from_a_file.open(name);
  if(from_a_file.is_open())
  {
    dictionary.empty_dictionary();
    unsigned int size;
    string name_1, name_2;
    from_a_file >> size;
    for(unsigned int i = 0; i < size; i++)
    {
      getline(from_a_file, name_1, '.');
      getline(from_a_file, name_2, '.');
      dictionary.new_word(name_1, name_2);
    }
  }
  from_a_file.close();
}
/*{
  dictionary.empty_dictionary();
  unsigned int size;
  string name_1, name_2;
  is >> size;
  for(unsigned int i = 0; i < size; i++)
  {
    getline(is, name_1, '.');
    getline(is, name_2, '.');
    dictionary.new_word(name_1, name_2);
  }
  return is;
}*/
