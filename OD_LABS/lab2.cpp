#include <iostream>
#include <vector>
#include <ctime>
#include <cmath>
using namespace std;
bool check(int number)
{
  if(number == 1)
    return false;
  for (unsigned i = sqrt(number); i > 1; i--)
        if (!(number % i))
            return false;
    return true;
}
int main()
{
  int size_of_array;
  int element;
  srand(time(0));
  cout << "enter size of array" << endl;
  cin >> size_of_array;
  if((size_of_array > 100) || (size_of_array < 1))
    return 1;
  vector <int> array;
  for(unsigned int i = 0; i < size_of_array; i++)
  {
    element = rand() % 100 + 1;
    array.push_back(element);
    cout << array[i] << " ";
  }
  cout << endl;
  for(unsigned int i = 0; i < array.size(); i++)
  {
    element = array[i];
    if(check(element))
      cout << array[i] << " ";
  }
  cout << endl;
  array.clear();
  return 0;
}
