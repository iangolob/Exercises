#include <stdio.h>
int main(void) {
   int i;
   unsigned int k, m;
   unsigned short j;
   scanf("%d%ho", &i, &j);
   scanf("   %x %x ", &k, &m);
   printf("|%d|%hx|\n", i, j);
   printf("|%d|%d|\n", k, m);
   printf("|%c|", getchar());
   return 0;
}