#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int age,wt;
    cin>>age>>wt;
  
  	if(age>17 && wt>=50)
    {
      cout<<"Eligible to donate blood:)"<<endl;
    }
  	else
    {
      cout<<"Not eligible to donate blood:("<<endl;
    }
    return 0;
}