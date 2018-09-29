#ifndef DICTIONARY_H
#define DICTIONARY_H
#include <iostream>
#include <cstring>
#include <map>
#include <utility>
class Dictionary
{
private:
  std::multimap <std::string, std::string> mapDictionary;
  bool exist_key(std::string name_1, std::string name_2);
public:
  int getSize();
  void empty_dictionary();
  void new_word(std::string name_1, std::string name_2);
  void delete_word();
  void search(std::string name);
  void change_word();
  void output();
  friend std::ostream & operator<<(std::ostream & os, Dictionary& dictionary);
  friend std::istream & operator>>(std::istream & is, Dictionary& dictionary);
};
std::istream & operator>>(std::istream & is, Dictionary& dictionary);
std::ostream & operator<<(std::ostream & os, Dictionary& dictionary);
#endif
