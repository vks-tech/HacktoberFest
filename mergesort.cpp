#include<iostream>
using namespace std;

int merge(int *arr, int s, int e) {

    int mid = (s+e)/2;

    int len1 = mid - s + 1;
    int len2 = e - mid;

    int *first = new int[len1];
    int *second = new int[len2];

    //copy values
    int mainArrayIndex = s;
    for(int i=0; i<len1; i++) {
        first[i] = arr[mainArrayIndex++];
    }

    mainArrayIndex = mid+1;
    for(int i=0; i<len2; i++) {
        second[i] = arr[mainArrayIndex++];
    }

    //merge 2 sorted arrays     
    int index1 = 0;
    int index2 = 0;
    mainArrayIndex = s;

    while(index1 < len1 && index2 < len2) {
        if(first[index1] < second[index2]) {
            arr[mainArrayIndex++] = first[index1++];
        }
        else{
            arr[mainArrayIndex++] = second[index2++];
        }
    }   

    while(index1 < len1) {
        arr[mainArrayIndex++] = first[index1++];
    }

    while(index2 < len2 ) {
        arr[mainArrayIndex++] = second[index2++];
    }
  //for saving spces
  //we used dynamic spacing with pointers so this will delete the extra memory.
  //  delete []first;
    //delete []second;

}

int mergeSort(int *arr, int s, int e) {

    //base case
    int count =0;
    if(s >= e) {
        return 0 ;
    }
    
    int mid = (s+e)/2;

    //left part sort karna h 
   count+=  mergeSort(arr, s, mid);
    
    //right part sort karna h 
   count+=  mergeSort(arr, mid+1, e);

    //merge
 count+=  merge(arr, s, e);
  return count;

}

int main() {

    int arr[7] = { 1, 20, 6, 4, 5, 14, 18 };
    int n = 7;

//    mergeSort(arr, 0, n-1);

  //  for(int i=0;i<n;i++){
  //      cout << arr[i] << " ";
  //  } cout << endl;
    int ans= mergeSort(arr,0,n-1);
   cout << " Number of inversions are " << ans;
    return 0;
}
