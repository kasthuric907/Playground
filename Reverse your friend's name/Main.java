#include<iostream>
#include<string>
using namespace std;

int main() 
{ 
	string s;
  	getline(cin,s);
  	
  for(auto i=s.crbegin();i<s.crend();i++)
    cout<<*i;
}