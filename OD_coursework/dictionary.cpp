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
int getSize()
{
  int i;
  i = mapDictionary.size();
  return i;
}
void Dictionary::empty_dictionary()
{
  mapDictionary.clear();
}
void Dictionary::new_word(string name_1, string name_2)
{
  if(!(exist_key(name_1, name_2)))
    mapDictionary.insert({name_1, name_2});
  else
    cout << "ALREADY EXIST" << endl;
}
void Dictionary::delete_word()
{

}
void Dictionary::search(string name)
{
  cout << mapDictionary.count(name);
}
void Dictionary::change_word()
{

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
istream& operator>>(istream & is, Dictionary& dictionary)
{
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
}
ostream& operator<<(ostream & os, Dictionary& dictionary)
{
  multimap <string, string>::iterator it = mapDictionary.begin();
  for(unsigned int i = 0; it != mapDictionary.end(); it++, i++)
    cout << endl;
  return os;
}
