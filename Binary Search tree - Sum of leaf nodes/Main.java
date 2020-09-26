#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node* left;
    struct node* right;
};

struct node* insert(struct node* root,int value)
{
    struct node* temp = (struct node*) malloc(sizeof(struct node));
    temp->data = value;
    temp->left = temp->right = NULL;
    
    if(root == NULL)
    {
        return temp;
    }
    struct node* cur=root;
    struct node* prev = NULL;
    
    while(cur!=NULL)
    {
        prev = cur;
        cur = (value < cur->data)? cur->left : cur->right;
    }
    
    if(value < prev->data)
        prev->left = temp;
    else
        prev->right = temp;
        
    return root;
}  

/*void inorder(struct node* root)
{
    if(root!=NULL)
    {
        inorder(root->left);
        printf("%d\n",root->data);
        inorder(root->right);
    }
}*/

int sumofleaf(struct node* root)
{
    if(root == NULL)
        return 0;

    if(root->left == NULL && root->right == NULL)
        return root->data;
        
    int sum = sumofleaf(root->left)+sumofleaf(root->right);
    return sum;
}
  
int main()
{
    struct node* root = NULL;
    int n;
    scanf("%d",&n);
   
    while(n!=-1)
    {
        root=insert(root,n);
        scanf("%d",&n);
    }
    
    //inorder(root);
    //int sum=0;
    int sum = sumofleaf(root);
    printf("Sum of all leaf nodes are %d",sum);
    
    return 0;
}