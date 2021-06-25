#include <stdio.h>

int main(void) {
   int n;
   printf("Upisite n > ");
   scanf("%d", &n);

   FILE *dat = fopen("tablica.txt", "w");

   fprintf(dat, "     ");
   for (int i = 1; i <= n; i++) {
      fprintf(dat, "%4d", i);
   }
   fprintf(dat, "\n");

   fprintf(dat, "----+");
   for (int i = 1; i <= n; i++) {
      fprintf(dat, "----");
   }
   fprintf(dat, "+\n");

   for (int i = 1; i <= n; i++) {
      fprintf(dat, "%4d!", i);
      for (int j = 1; j <= n; j++) {
         fprintf(dat, "%4d", i * j);
      }
      fprintf(dat, "!\n");
   }

   fprintf(dat, "----+");
   for (int i = 1; i <= n; i++) {
      fprintf(dat, "----");
   }
   fprintf(dat, "+\n");

   fclose(dat);
   return 0;
}