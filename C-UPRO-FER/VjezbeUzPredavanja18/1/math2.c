unsigned long long fakt(unsigned int n) {
   if (n == 0 || n == 1) {
      return 1;
   } else {
      return n * fakt(n - 1);
   }
};
double eksp(float x, int n) {
   double rez = x;
   for (int i = 1; i < n; i++) {
      rez = rez * x;
   }
   return rez;
}; // x na potenciju n, n 0
float fabsolut(float x) {
   if (x < 0) {
      return -x;
   } else {
      return x;
   }
}; // apsolutnavrijednost od x
double dabsolut(double x) {
   if (x < 0) {
      return -x;
   } else {
      return x;
   }
}; // apsolutnavrijednost od x
int iabsolut(int n) {
   if (n < 0) {
      return -n;
   } else {
      return n;
   }
}; // apsolutnavrijednost od n
   // n!