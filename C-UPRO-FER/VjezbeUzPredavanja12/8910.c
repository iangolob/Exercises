#include <stdio.h>

int main(void) {
   int i = 6;
   printf("%d\n", i << 3);
   printf("%d\n", i);
   char x, y, z;
   x = 2;
   y = '1';
   z = (y <= x) ? (++x) : (y += ++x);
   printf("%d %c %d %c\n", x, y, y, z);
   int a = 3, b = 5, c = 9, d;
   d = a + (b += c);
   printf("%d %d %d %d", a, b, c, d);
}