#ifndef DICTIONARY_H
#define DICTIONARY_H
#include <iostream>
#include <cstring>
#include <map>
#include <utility>
#include <fstream>
class Dictionary
{
private:
  std::multimap <std::string, std::string> mapDictionary;
  bool exist_key(std::string name_1, std::string name_2);
public:
  void empty_dictionary();
  void new_word(std::string name_1, std::string name_2);
  void delete_word(std::string name);
  void search(std::string name);
  void change_word(std::string name);
  void change_definition(std::string name);
  void output();
  void in_text(std::string name);
  void from_text(std::string name, Dictionary& dictionary);
//  friend std::ostream & operator<<(std::ostream & os, Dictionary& dictionary);
//  friend std::istream & operator>>(std::istream & is, Dictionary& dictionary);
};
//std::istream & operator>>(std::istream & is, Dictionary& dictionary);
//std::ostream & operator<<(std::ostream & os, Dictionary& dictionary);
#endif
