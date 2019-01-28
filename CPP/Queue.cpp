#include <iostream>

using namespace std;

template <class T>

class Queue
{
private:
  struct Node
  {
    T value;
    Node* next;
  };

  Node* head;
  Node* tail;
public:
  Queue():head(NULL),tail(NULL)
  {

  }
  ~Queue()
  {

  }
  void push(T new_value)
  {
    Node* variable = new Node;
    variable->value = new_value;
    variable->next = NULL;
    if(head != NULL)
    {
      tail->next = variable;
      tail = variable;
    }
    else
      head = tail = variable;
  }
  T pop()
  {
    if(isEmpty())
      return -1;
    T value = head->value;
    Node* time_node = new Node;
    time_node = head;
    head = head->next;
    delete time_node;
    return value;
  }
  T headValue()
  {
    T variable = head->value;
    return variable;
  }
  T rearValue()
  {
    T variable = tail->value;
    return variable;
  }
  void clear()
  {
    while(head)
    {
      pop();
    }
  }
  void print()
  {
    Node* time_head = new Node;
    time_head = head;
    while(time_head)
    {
      cout << time_head->value << ' ';
      time_head = time_head->next;
    }
    cout << endl;
  }
  bool isEmpty()
  {
    return head ? false : true;
  }
};

int main()
{
  Queue<int> queue;
  queue.push(1);
  queue.push(2);
  queue.push(3);
  queue.push(4);
  queue.print();
  queue.pop();
  queue.push(1);
  queue.print();
  cout << queue.headValue() << ' ' << queue.rearValue() << endl;
  queue.clear();
  queue.print();
  return 0;
}
