function printRightTriangle(n) {
    // Write your logic here
    for(let i = 1; i<=n; i++){
        for(let j = 0;j<i;j++){
            process.stdout.write("*" + " ");
        }
        process.stdout.write("\n");
    }
}

// OUTPUT: for n=4
// *
// * *
// * * * *
// * * * * *

function printRightTriangleNumbers(n) {
    // Write your logic here
    for(let i = 1; i<=n; i++){
        for(let j = 1;j<=i;j++){
            process.stdout.write(j + " ");
        }
        process.stdout.write("\n");
    }
}


// OUTPUT: for n=4
// 1
// 1 2
// 1 2 3
// 1 2 3 4
