#include <iostream>

using namespace std;

int func(int n, int array[])
{
  if(n < 1)
    return 0;
  else
  {
    cout << array[n - 1] << endl;
    func(n - 1, array);
  }
}

int main()
{
  cout << "enter size of array" << endl;
  int size;
  cin >> size;
  int array[size];
  for(unsigned int i = 0; i < size; i++)
  {
    cout << "element of array " << i + 1 << " " << endl;
    cin >> array[i];
  }
  cout << endl;
  func(size, array);
  return 0;
}
