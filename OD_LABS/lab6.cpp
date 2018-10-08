#include <iostream>
#include <vector>

using namespace std;
bool doesExist(int number, vector <int>& _vector);

void addElement(int number, vector <int>& _vector);

void deleteElement(int number, vector <int>& _vector);

void printArray(vector <int>& _vector);

void addElementInArray(int number, vector <int>& _vector);

int firstMaxElement(vector <int>& _vector);

void menu();

int main()
{
  vector <int> _vector;
  int choice, size, element;
  bool i = true;
  while(i)
  {
    menu();
    cout << "select the action" << endl;
    cin >> choice;
    switch (choice)
    {
      case 1:
      {
        cout << "how many element do you want to add?" << endl;
        cin >> size;
        if(!isdigit(size))
        {
          for(unsigned int i = 0; i < size; i++)
          {
            cout << "enter element " << i + 1 << " - ";
            cin >> element;
            if(!isdigit(element))
            {
              addElement(element, _vector);
              cout << endl;
            }
            else
              cout << "not number" << endl;
          }
        }
        else
          cout << "not number" << endl;
        break;
      }
      case 2:
      {
        cout << "what element u want to delete?" << endl;
        cin >> element;
        if(!isdigit(element) && element >= 0)
        {
          deleteElement(element, _vector);
        }
        else
          cout << "not number" << endl;
        break;
      }
      case 3:
      {
        if(_vector.size())
          printArray(_vector);
        else
          cout << "empty array" << endl;
        break;
      }
      case 4:
      {
        cout << "where would u like enter element?" << endl;
        cin >> element;
        addElementInArray(element, _vector);
        break;
      }
      case 5:
      {
        if(!_vector.empty())
          {
            cout << "index of first max element = ";
            cout << firstMaxElement(_vector) << endl;
          }
        else
          cout << "empty array" << endl;
        break;
      }
      default:
      {
        i = false;
        break;
      }
    }
  }
  _vector.clear();
  return 0;
}
bool doesExist(int number, vector <int>& _vector)
{
  if(number <= _vector.size())
    return true;
  else
    return false;
}
void addElement(int number, vector <int>& _vector)
{
  _vector.push_back(number);
}
void deleteElement(int number, vector <int>& _vector)
{
  if(doesExist(number, _vector))
  {
    for(unsigned int i = 0; i < number; i++) {}
    _vector.erase(_vector.begin() + i - 1);
  }
  else
    cout << "this element does not exist" << endl;
}
void printArray(vector <int>& _vector)
{
  for(unsigned int i = 0; i < _vector.size(); i++)
  {
    cout << _vector[i] << " ";
  }
  cout << endl;
}
void addElementInArray(int number, vector <int>& _vector)
{
  if(doesExist(number, _vector))
  {
    vector <int>::iterator it;
    for(unsigned int i = 0; i < number; i++)
      it = _vector.begin() + i;
    cout << "what would u like to enter?" << endl;
    int x;
    cin >> x;
    _vector.insert(it, x);
  }
  else
    cout << "not exist element" << endl;
}
int firstMaxElement(vector <int>& _vector)
{
  int max = 0, maxNumber;
  for(unsigned int i = 0; i < _vector.size(); i++)
  {
    if(_vector[i] > max)
    {
      max = _vector[i];
      maxNumber = i;
    }
  }
  return maxNumber + 1;
}
void menu()
{
  cout << endl;
  cout << "enter '1' to add element" << endl;
  cout << "enter '2' to delete element" << endl;
  cout << "enter '3' to print array" << endl;
  cout << "enter '4' to add element in some part array" << endl;
  cout << "enter '5' to print number of first max element" << endl;
  cout << "enter '6' to exit" << endl;
  cout << endl;
}
