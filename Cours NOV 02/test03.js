function t(n) { console.log("n = " + n); }

function f(n) {
    if (n==0) {
        t(n);
    }
    else {
        f(n-1);
        t(n);
    }
}

f(4);