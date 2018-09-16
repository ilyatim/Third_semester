#include <iostream>
#include <cstring>
using namespace std;

void input(string** array, int n, int m);

void input(int** array, int n, int m);

void output(string** array, int n, int m);

void output(int** array, int n, int m);

void ordering(string** array, int n, int m);

void ordering(int** array, int n, int m);

int main()
{
  int n, m, choice;
  cout << "enter size of matrix, lines and columns" << endl;
  cin >> n >> m;
  cout << "select which elements will be contained in the array, 1 to string, 2 to int" << endl;
  cin >> choice;
  switch(choice)
  {
    case 1:
      {
        string** array = new string* [n];
        for(unsigned int i = 0; i < n; i++)
          array[i] = new string[m];
        input(array, n, m);
        output(array, n, m);
        ordering(array, n, m);
        cout << endl;
        output(array, n, m);
        for(int i=0;i<n;i++)
          delete[] array[i];
        delete[] array;
        break;
      }
    case 2:
      {
        int** array = new int* [n];
        for(unsigned int i = 0; i < n; i++)
          array[i] = new int[m];
        input(array, n, m);
        output(array, n, m);
        ordering(array, n, m);
        cout << endl;
        output(array, n, m);
        for(int i=0;i<n;i++)
          delete[] array[i];
        delete[] array;
        break;
      }
    default:
      {
        cout << "what a hell u write" << endl;
        break;
      }
  }
  return 0;
}
void input(string** array, int n, int m)
{
  for (int i = 0; i < n; i++)
  {
      for (int j = 0; j < m; j++)
      {
          cout << "massiv[" << i << "][" << j<< "] = ";
          cin >> array[i][j];
      }
  }
}
void input(int** array, int n, int m)
{
  for (int i = 0; i < n; i++)
  {
      for (int j = 0; j < m; j++)
      {
          cout << "massiv[" << i << "][" << j<< "] = ";
          cin >> array[i][j];
      }
  }
}
void output(string** array, int n, int m)
{
  for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
            cout << array[i][j] << "  ";
        cout << endl;
    }
}
void output(int** array, int n, int m)
{
  for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
            cout << array[i][j] << "  ";
        cout << endl;
    }
}
void ordering(string** array, int n, int m)
{
  string temp;
  for (unsigned int j = 0; j < m; j++)
    {
        for (unsigned int i = 0; i < n - 1; i++)
        {
           for (unsigned int k = 0; k < n - i - 1; k++)
           {
               if (array[k][j] > array[k + 1][j])
               {
                   temp = array[k][j];
                   array[k][j] = array[k + 1][j];
                   array[k + 1][j] = temp;
               }
           }
       }
   }
}
void ordering(int** array, int n, int m)
{
  int temp;
  for (int j = 0; j < m; j++)
    {
        for (unsigned int i = 0; i < n - 1; i++)
        {
           for (unsigned int k = 0; k < n - i - 1; k++)
           {
               if (array[k][j] > array[k + 1][j])
               {
                   temp = array[k][j];
                   array[k][j] = array[k + 1][j];
                   array[k + 1][j] = temp;
               }
           }
       }
   }
}
