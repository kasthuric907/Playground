#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    //cout << "Hello, World!";
  	int n;
  	cin>>n;
  	if(n==1)
      cout<<"Welcome to Erangel Map. You are Inside a Forest\n";
  	if(n==2)
      cout<<"Welcome to Miramar Map. You are Inside a Desert\n";
  	if(n==3)
      cout<<"Welcome to Sanhok Map. You are Inside a Rain Forest\n";
  	if(n==4)
      cout<<"Welcome to Vikendi Map. You are Inside a Snow Forest\n";
  	if(n>=5)
      cout<<"Invalid Input\n";
  	
    return 0;
}