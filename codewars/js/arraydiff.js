function arrayDiff(a, b) {
  for (const item of b) {
    a = a.filter((x) => x !== item);
  }
  return a;
}

console.log(
  arrayDiff([1, 2, 2, 2, 3], [2]) // [1,3]
);
