#include <iostream>
#include <string>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i;    
cin.getline(str,100);

for(i=0;str[i]!='\0';i++)
  count++;
 
 rev[count]='\0';
  
for(i=0;str[i]!='\0';i++,count--)
{
  rev[count-1]=str[i];
}
cout<<rev;
}