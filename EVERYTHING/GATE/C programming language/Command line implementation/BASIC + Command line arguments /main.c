// main.c
#include <stdio.h>
#include <stdlib.h>  // for atoi  //TO LEARN MORE ABOUT "atoi" and related functions check readme file
#include "functions.h"

int main(int argc, char const *argv[]) {
    if (argc != 3) {
        printf("Usage: %s <num1> <num2>\n", argv[0]);
        return 1;  // Return an error code
    }

    // Convert command-line arguments to integers
    int num1 = atoi(argv[1]);
    int num2 = atoi(argv[2]);

    // Use the add function from functions.c
    printf("Sum: %d\n", add(num1, num2));

    return 0;
}

