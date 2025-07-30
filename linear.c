#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define SIZE 1000000

int isSorted(int arr[], int n) {
    for (int i = 1; i < n; i++) {
        if (arr[i] < arr[i - 1]) return 0;
    }
    return 1;
}

void bubbleSort(int arr[], int n) {
    int i, j, tmp;
    for (i = 0; i < n-1; i++) {
        for (j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}

int linearSearch(int arr[], int n, int target) {
    for (int i = 0; i < n; i++) {
        if (arr[i] == target)
            return i;
    }
    return -1;
}

int binarySearch(int arr[], int n, int target) {
    int low = 0, high = n - 1, mid;
    while (low <= high) {
        mid = low + (high - low) / 2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            low = mid + 1;
        else
            high = mid - 1;
    }
    return -1;
}

int binarySearchWithSort(int arr[], int n, int target) {
    if (!isSorted(arr, n)) {
        bubbleSort(arr, n);
    }
    return binarySearch(arr, n, target);
}

int main() {
    int *arr = (int*)malloc(SIZE * sizeof(int));
    if (arr == NULL) {
        printf("Memory allocation failed.\n");
        return 1;
    }

    for (int i = 0; i < SIZE; i++) {
        arr[i] = i + 1;
    }

    int target_lin_best = arr[0];
    int target_bin_best = arr[SIZE / 2];
    int target_worst = -99;

    clock_t start, end;
    double time_lin_best, time_lin_worst, time_bin_best, time_bin_worst;
    int index_lin_best, index_lin_worst, index_bin_best, index_bin_worst;

    
    start = clock();
    index_lin_best = linearSearch(arr, SIZE, target_lin_best);
    end = clock();
    time_lin_best = (double)(end - start) / CLOCKS_PER_SEC;

    
    start = clock();
    index_bin_best = binarySearchWithSort(arr, SIZE, target_bin_best);
    end = clock();
    time_bin_best = (double)(end - start) / CLOCKS_PER_SEC;

    
    start = clock();
    index_lin_worst = linearSearch(arr, SIZE, target_worst);
    end = clock();
    time_lin_worst = (double)(end - start) / CLOCKS_PER_SEC;

    
    start = clock();
    index_bin_worst = binarySearchWithSort(arr, SIZE, target_worst);
    end = clock();
    time_bin_worst = (double)(end - start) / CLOCKS_PER_SEC;

    printf("Worst Case:\n");
    printf("Target: %d\n", target_worst);
    printf("Linear Search Index: %d, Time Taken: %lf seconds\n", index_lin_worst, time_lin_worst);
    printf("Binary Search Index: %d, Time Taken: %lf seconds\n", index_bin_worst, time_bin_worst);

    printf("Best Case Linear Search:\n");
    printf("Target: %d\n", target_lin_best);
    printf("Linear Search Index: %d, Time Taken: %lf seconds\n", index_lin_best, time_lin_best);

    printf("Best Case Binary Search:\n");
    printf("Target: %d\n", target_bin_best);
    printf("Binary Search Index: %d, Time Taken: %lf seconds\n", index_bin_best, time_bin_best);

    free(arr);
    return 0;
}
