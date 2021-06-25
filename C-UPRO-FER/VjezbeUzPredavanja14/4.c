#include <stdio.h>
int main(void) {
   int a = 10, b = 20, *p1 = &a, *p2 = &b, *pom;
   a = ++*p2 + 3;
   b = (*p1)++ + 5;
   pom = p1;
   p1 = p2;
   p2 = pom;
   printf("%d %d %d %d\n", a, b, *p1, *p2);
   return 0;
}