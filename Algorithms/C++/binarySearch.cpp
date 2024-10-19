#include <iostream>
using namespace std;

int binarySearch(int arr[], int size, int key){
    int start = 0;
    int end = size-1;
    int mid = start + (end-start)/2;

    while(start<end){
        if(key == arr[mid]) return mid;
        else if (key > arr[mid]) start = mid + 1;
        else end = mid-1;
        mid = start + (end-start)/2;
    }
    return -1;
}

int main(){
    int size;
    cout<<"Enter size of array : ";
    cin>>size;
    int arr[size];
    for(int i=0; i<size; i++){
        cin>>arr[i];
    }
    int key;
    cout<<"Enter value you want to search: ";
    cin>>key;
    int index = binarySearch(arr, size, key);
    cout<<"Index of "<<key<<" is : "<<index<<endl; 
}