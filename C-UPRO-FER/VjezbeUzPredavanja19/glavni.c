#include "modulA.h"
#include "modulB.h"
#include <stdio.h>
void fun1(void);
int main(void) {
   int x = 30;
   x += 2;
   printf("%d\n", x);
   fun1();
   fun2();
   fun3();
   fun4();
   fun3();
   return 0;
}
void fun1(void) {
   x += 3;
   printf("%d\n", x);
}