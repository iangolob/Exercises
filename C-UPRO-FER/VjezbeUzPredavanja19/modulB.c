#include "modulB.h"
#include <stdio.h>
void fun3(void) {
   static int x = 5;
   x += 5;
   printf("%d\n", x);
}
void fun4(void) {
   extern int x;
   x += 6;
   printf("%d\n", x);
}