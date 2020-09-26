#include<iostream>
#include<string>
#include<math.h>
using namespace std;

int main()
{
  string s;
  cin>>s;
  
  int oddsum=0,evensum=0;
  for(int i=0;s[i]!='\0';i++)
  {
    int c=s[i]-'0';
    if(i%2==0)
      evensum+=c;
    else
      oddsum+=c;
  }
  cout<<abs(evensum-oddsum);
  return 0;
}