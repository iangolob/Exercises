#include <stdio.h>

int fak(int x) {
   int rez = 1;
   for (int j = 1; j <= x; j++)
      rez = rez * j;
   return rez;
}

int main(void) {
   int m, n;
   printf("Upisite m i n > ");
   scanf("%d %d", &m, &n);
   if (m >= 0 && n >= 0 && m >= n) {
      printf("%d povrh %d = %d", m, n, fak(m) / (fak(n) * fak(m - n)));
   } else {
      printf("m ili n su neispravni");
   }

   return 0;
}