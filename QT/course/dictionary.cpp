#include <iostream>
#include <cstring>
#include <QDebug>
#include <QFile>
#include "dictionary.h"
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
    QMessageBox::warning(0, "Warning", "This word already exist");
}
void Dictionary::delete_word(string name)
{
  if(mapDictionary.count(name))
    mapDictionary.erase(name);
  else
    QMessageBox::critical(0, "Warning", "WRONG WORD");
}
bool Dictionary::search(string name)
{
  if(mapDictionary.count(name))
      return true;
  else
      return false;
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
QString Dictionary::output()
{
  QString name = NULL;
  multimap <string, string>::iterator it = mapDictionary.begin();
  if(mapDictionary.size())
    for(unsigned int i = 0; it != mapDictionary.end(); it++, i++)
    {
        QString first = QString::fromStdString(it->first);
        QString second = QString::fromStdString(it->second);
        name += first + " - " + second + "\n";
    }
  return name;
}
void Dictionary::in_text(QString name)
{
  multimap <string, string>::iterator it = mapDictionary.begin();
  QFile file(name);
  if(file.open(QFile::WriteOnly))
  {
    QTextStream in_file(&file);
    for(unsigned int i = 0; it != mapDictionary.end(); it++, i++)
    {
        QString name_first = QString::fromStdString(it->first);
        QString name_second = QString::fromStdString(it->second);
        in_file << name_first << endl;
        in_file << name_second << endl;
    }
    file.close();
  }
  else
      QMessageBox::critical(NULL, "ERROR", "FILE IS NOT OPEN");

}

void Dictionary::from_text(QString name, Dictionary &dictionary)
{
  QFile file(name);
  if(file.open(QIODevice::ReadOnly | QIODevice::Text))
      {
        QTextStream from(&file);
        dictionary.empty_dictionary();
        QString name_1, name_2;
        while(!from.atEnd())
        {
          name_1 = from.readLine();
          name_2 = from.readLine();
          if(!(exist_key(name_1.toStdString(), name_2.toStdString())))
            dictionary.new_word(name_1.toStdString(), name_2.toStdString());
        }
        file.close();
      }
  else
      QMessageBox::critical(NULL, "ERROR", "FILE IS NOT OPEN");
}
int Dictionary::getSize()
{
    return mapDictionary.size();
}
string Dictionary::getName(int number)
{
    if(number > mapDictionary.size())
        return NULL;
    multimap <string, string>::iterator it = mapDictionary.begin();
    for(int i = 0; it != mapDictionary.end(); i++, it++)
    {}
    return it->first;
}