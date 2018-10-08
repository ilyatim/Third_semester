#include <iostream>
#include <cstring>
#include <algorithm>
using namespace std;

int main()
{
  string name;
  cout << "enter e-mail u want to create" << endl;
  cin >> name;
  char c = '@';
  if(count(name.begin(), name.end(), c) == 1)
    cout << "good e-mail))" << endl;
  else
    cout << "wrong e-mail, unacceptable symbol" << endl;
  return 0;
}
