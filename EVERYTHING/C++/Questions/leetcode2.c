#include<stdio.h>
Definition for singly-linked list.
struct ListNode {
    int val;
     struct ListNode *next;
 };

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) 
{
    int sum = 0; int sum2 = 0;
    while(l1 -> next == NULL && l2 -> NULL)
    {
        sum = sum*10 + l1 -> next -> val;
        sum2 = sum2*10 + l2 -> next -> val;
    }
    while(l2 -> next == NULL)
    {
        
    }
}
int main(){return 0}