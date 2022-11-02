function f(n) {
    if (n==1) return 1;
    return console.log(f(n-1) +1);;
}
f(5);