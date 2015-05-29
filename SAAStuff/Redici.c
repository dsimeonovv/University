#include <stdio.h>


int main(){

	int arr[10] = {4, 3, 2, 1, 6, 4, 3, 5, 7, 8};
	int i;
	int countOfRedici = 0;
	int size = 10;

	for(i = 0; i < size; i++ ){
		if(arr[i] > arr[i+1]){
			arr[i++];
			countOfRedici++;
		}
	}
	printf("%d\n", countOfRedici);
}
