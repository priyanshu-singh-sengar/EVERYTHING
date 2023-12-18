/* 

Today’s checklist
1) Introduction to Arrays
2) Syntax , accessing elements of Arrays
3) Printing Output and Taking Input
4) Types of Arrays
5) Size operator
6) Memory allocation in array,address of array elements
7) Linear search
8) Basic problems

*/

#include<iostream>
using namespace std;
int main()
{
    /*
    int arr[7]; //indices -> 0 1 2 3 4 5 6 
    arr[0] = 7;
    arr[1] = 1;
    arr[2] = 2;
    arr[3] = 3;
    arr[4] = 6;
    arr[5] = 10;
    arr[6] = 11;

    //We can also initialize array as:
    int arr1[7] = {1,5,9,4,6,1,3};

    // accessing elements of array using [] operator
    cout<<arr[4]<<endl;

    // now we can choose to not mention size of array during declaration but on one condition that we need
    // define elements to that array immediately in same expression.

    int arr[]; 
    arr[0] = 7;
    arr[1] = 1;
    arr[2] = 2;
    arr[3] = 3;
    arr[4] = 6;
    arr[5] = 10;
    arr[6] = 11;

    This gives error as we didn't mentioned the size of array and neither did we defined all it's elements
    during array declaration like shown below which doesn't give any errors.
    error message --> 
    "Array_1.cpp: In function ‘int main()’:
    Array_1.cpp:37:9: error: storage size of ‘arr’ isn’t known
          37 |     int arr[];
             |         ^~~"
    */

    /*
    
    int arr3[] = {1,5,9,4,6,1,3};

    //Input in array
    for(int i = 0; i<=6; i++)
    {
        cin>>arr3[i];
    }    

    //printing all elements of an array
    for(int i = 0; i<=6; i++)
    {
        cout<<arr3[i]<<" ";
    }    

    */
//question 1 --> Given an array of marks of students, if the mark of any student is less than 35 print 
//its roll number. roll number here refers to the index of the array.

    int n;
    cout<<"enter number of students : ";
    cin>>n;
    
    int marks[n];
    cout<<"enter marks : ";
    for(int i = 0; i<n; i++)
    {
        cin>>marks[i];
        cout<<'\n';
    }

    for(int i = 0; i<n; i++)
    {
        if(marks[i]<35) cout<<i<<"  ";
    }
}


