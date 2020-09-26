#include <iostream>
#include <cstring>
using namespace std;

struct student
{
    char name[50];
    int roll;
    float marks;
};

int main()
{
   student s1;
   char s[50];
   cin.getline(s,50,'\n');
   strcpy(s1.name,s);
   cin>>s1.roll;
   cin>>s1.marks;
  
   cout <<"\nStudent Details"<< endl;
   cout <<"Name: "<<s1.name << endl;
   cout <<"Roll: "<<s1.roll << endl;
   cout <<"Marks: "<<s1.marks<< endl;
   return 0;
}