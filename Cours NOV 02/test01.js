n = 5;

function sumB(n) {
    total = 0;
    for (i = 1; i <= n; i++) {
        total += i;
    }
    return total;
}
console.log(`Boucle: sumB(${n}) = ` + sumB(n));

function sumR(n) {
    if (n == 1) { return 1; }
    return n + sumR(n-1)
}
console.log(`Récursif: sumR(${n}) = ` + sumR(n));