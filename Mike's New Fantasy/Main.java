#include<iostream>
#include<cstdlib>
using namespace std;

long fib(long n) 
{ 
  long a = 0, b = 1, c, i; 
  if( n == 0) 
    return a; 
  for (i = 2; i <= n; i++) 
  { 
     c = a + b; 
     a = b; 
     b = c; 
  } 
  return b; 
} 
  
int main () 
{ 
  long n;
  cin>>n;
  cout<<fib(n-1); 
  return 0; 
} 