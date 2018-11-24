#ifndef DICTIONARY_H
#define DICTIONARY_H
#include <iostream>
#include <cstring>
#include <map>
#include <utility>
#include <fstream>
#include <QMessageBox>
class Dictionary
{
private:
  std::multimap <std::string, std::string> mapDictionary;
  bool exist_key(std::string name_1, std::string name_2);
public:
  void empty_dictionary();
  void new_word(std::string name_1, std::string name_2);
  void delete_word(std::string name);
  bool search(std::string name);
  void change_definition(std::string name, std::string new_name);
  QString output();
  void in_text(QString name);
  void from_text(QString name, Dictionary &dictionary);
  int getSize();
  std::string getName(int number);
};
#endif
