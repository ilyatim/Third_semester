#include <iostream>
#include <fstream>
#include <cstring>
#include <vector>
using namespace std;

struct BankAccount
{
  BankAccount(int account, int summa, string _fio, string openDate)
  {
    account_number = account;
    summ = summa;
    fio = _fio;
    opening_date = openDate;
  }
  int account_number;
  int summ;
  string fio;
  string opening_date;
};

void inform();

istream& operator>>(istream & is, vector <BankAccount>& bank_account);

ostream & operator<<(ostream & os, vector <BankAccount>& bank_account);

bool enter(vector <BankAccount>& bank_account);

int search(int number);

void ordering(vector <BankAccount>& bank_account);

void output(vector <BankAccount>& bank_account);
//////////////////////////////////////////////////
int main()
{
  vector <BankAccount> bank_account;
  while(enter(bank_account))
  {

  }
  return 0;
}
//////////////////////////////////////////////////
void inform()
{
  cout << endl;
  cout << "enter '1' to write down information from file in array" << endl;
  cout << "enter '2' to sort array of structures" << endl;
  cout << "enter '3' to object data output" << endl;
  cout << "enter '4' to search object" << endl;
  cout << "enter '5' to recording binary file" << endl;
  cout << "enter '6' to write down information in text file"
  cout << "enter '7' to read binary file" << endl;
  cout << "enter anything else to exit" << endl;
  cout << endl;
}

istream& operator>>(istream & is, vector <BankAccount>& bank_account)
{
  unsigned int size_of_array;
  int name,summa;
  string _fio,openDate;
  is >> size_of_array;

  for(unsigned int i = 0; i < size_of_array; i++)
  {
    is >> name >> summa >> _fio >> openDate;
    bank_account.push_back(BankAccount(name, summa, _fio, openDate));
  }
  return is;
}

ostream & operator<<(ostream & os, vector <BankAccount>& bank_account)
{
  os << bank_account.size() << endl;
  for(unsigned int i = 0; i < bank_account.size(); i++)
  {
    os << bank_account[i].account_number << " "
       << bank_account[i].summ << " "
       << bank_account[i].fio << " "
       << bank_account[i].opening_date
       << endl;
  }
  return os;
}

bool enter(vector <BankAccount>& bank_account)
{
  int choice;
  inform();
  cout << "what u're choice" << endl;
  cin >> choice;
  switch(choice)
  {
    case 1:
    {
      cout << "enter the name of the file from which to load the structures" << endl;
      string name;
      cin >> name;
      ifstream from_a_file;
      from_a_file.open(name);
      if(from_a_file.is_open())
      {
        from_a_file >> bank_account;
      }
      from_a_file.close();
      break;
    }
    case 2:
    {
      ordering(bank_account);
      if(bank_account.size())
        cout << "u're array was ordering" << endl;
      break;
    }
    case 3:
    {
      cout << bank_account.size() << " bank accounts" << endl;
      output(bank_account);
      break;
    }
    case 4:
    {
      break;
    }
    case 5:
    {
      break;
    }
    case 6:
    {
      cout << "enter the name of the file in which to load the structures" << endl;
      string name;
      cin >> name;
      ofstream into_a_file;
      into_a_file.open(name);
      if(into_a_file.is_open())
      {
        into_a_file << bank_account;
      }
      into_a_file.close();
      break;
    }
    case 7:
    {
      break;
    }
    default:
    {
      return false;
      break;
    }
  }
}

int search(int number)
{

}
void ordering(vector <BankAccount>& bank_account)
{
  if(bank_account.size() == 0)
    cout << "empty array" << endl;
  else
  {
    int temp;
    for (unsigned int i = 0; i < bank_account.size() - 1; i++)
      for (unsigned int j = 0; j < bank_account.size() - i - 1; j++)
        if (bank_account[j].account_number > bank_account[j + 1].account_number)
        {
          temp = bank_account[j].account_number;
          bank_account[j].account_number = bank_account[j + 1].account_number;
          bank_account[j + 1].account_number = temp;
        }
  }
}
void output(vector <BankAccount>& bank_account)
{
  if(bank_account.size() == 0)
    cout << "empty array" << endl;
  else
  {
    ordering(bank_account);
    for(unsigned int i = 0; i < bank_account.size(); i++)
    {
      cout << "account number:" << bank_account[i].account_number << endl;
      cout << "summa:" << bank_account[i].summ << endl;
      cout << "FIO:" << bank_account[i].fio << endl;
      cout << "open Date:" << bank_account[i].opening_date << endl;
      cout << endl;
    }
  }
}
