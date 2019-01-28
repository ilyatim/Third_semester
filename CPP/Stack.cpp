#include <iostream>

using namespace std;

template <class T>

class Stack
{
private:
  struct Node
  {
    T value;
    Node* prev;
  };

  Node* top;
public:
  Stack():top(NULL)
  {

  }
  ~Stack()
  {

  }
  void push(T new_value)
  {
    Node* some_new = new Node;
    some_new->value = new_value;
    some_new->prev = top;
    top = some_new;
  }
  T pop()
  {
    if(isEmpty())
      return -1;
    Node* time_node = new Node;
    T variable = top->value;
    time_node = top;
    top = top->prev;
    delete time_node;
    return variable;
  }
  void print()
  {
    Node* time_top = new Node;
    time_top = top;
    while(time_top)
    {
      cout << time_top->value << ' ';
      time_top = time_top->prev;
    }
    cout << endl;
  }
  bool isEmpty()
  {
    return top ? false : true;
  }
};

int main()
{
  Stack<int> stack;
  stack.push(1);
  stack.push(2);
  stack.push(3);
  stack.push(4);
  stack.print();
  stack.print();
  stack.pop();
  stack.print();
  return 0;
}
