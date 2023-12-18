#include <stdio.h>

enum Day {
    SUNDAY,    //starts with number 0
    MONDAY,    // 1 
    TUESDAY,   // 2 and so on till
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,   // 6
};

int main() {
    enum Day today = WEDNESDAY;

    printf("Today is ");
    switch(today) {
        case SUNDAY:
            printf("Sunday");
            break;
        case MONDAY:
            printf("Monday");
            break;
        case TUESDAY:
            printf("Tuesday");
            break;
        case WEDNESDAY:
            printf("Wednesday");
            break;
        case THURSDAY:
            printf("Thursday");
            break;
        case FRIDAY:
            printf("Friday");
            break;
        case SATURDAY:
            printf("Saturday");
            break;
    }
    printf("\n");
    return 0;
}


// we can also use numbers in place of values in enum 

/*
#include <stdio.h>

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
};

int main() {
    enum Day today = WEDNESDAY;

    printf("Today is ");
    switch(today) {
        case 0:
            printf("Sunday");
            break;
        case 1:
            printf("Monday");
            break;
        case 2:
            printf("Tuesday");
            break;
        case 3:
            printf("Wednesday");
            break;
        case 4:
            printf("Thursday");
            break;
        case 5:
            printf("Friday");
            break;
        case 6:
            printf("Saturday");
            break;
    }
    printf("\n");
    return 0;
}
*/



/*THEORY PART 

In C, an enumeration, often referred to as an "enum," is a user-defined data type that consists of a set of named integer constants. Enumerations provide a way to create symbolic names for sets of related values, making the code more readable and maintainable.

Here's the basic syntax for declaring an enumeration in C:

```c
enum enum_name {
    constant1,
    constant2,
    //till
    constantN
};

Here's a simple example:

#include <stdio.h>

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
};

int main() {
    enum Day today = WEDNESDAY;

    printf("Today is ");
    switch(today) {
        case SUNDAY:
            printf("Sunday");
            break;
        case MONDAY:
            printf("Monday");
            break;
        case TUESDAY:
            printf("Tuesday");
            break;
        case WEDNESDAY:
            printf("Wednesday");
            break;
        case THURSDAY:
            printf("Thursday");
            break;
        case FRIDAY:
            printf("Friday");
            break;
        case SATURDAY:
            printf("Saturday");
            break;
    }

    return 0;
}
```

In this example, an enumeration named `Day` is defined, and it contains constants representing the days of the week. The `today` variable is declared as an instance of this enumeration, and its value is set to `WEDNESDAY`. The program then uses a `switch` statement to print the name of the day corresponding to the value of `today`.

It's important to note that the constants in an enumeration are implicitly assigned integer values starting from 0. However, you can explicitly assign values to the constants if needed. For example:

enum Month {
    JAN = 1,
    FEB,
    MAR,
    
    DEC
};


In this case, `JAN` is assigned the value 1, and subsequent constants (`FEB`, `MAR`, etc.) are assigned values incremented by 1.

Enumerations in C provide a way to create more meaningful and self-explanatory code by using symbolic names for integral constants.
*/