#include <stdio.h>

int main(){

int arr[10] = {19, 3, 0, 1, 0, 4, 5, 0, 9, 10};
int i;
int size = 10;
int temp;
int lastIndex = 9;

for(i = 0; i < size; i++){
	if(lastIndex == i){
		break;
	}
	if(arr[i] == 0){
		temp = arr[lastIndex];
		arr[lastIndex] = arr[i];
		arr[i] = temp;
		lastIndex--;
	}
}

for(i = 0; i < size; i++){
	printf(" %d", arr[i]);
}


	return 0;
}
