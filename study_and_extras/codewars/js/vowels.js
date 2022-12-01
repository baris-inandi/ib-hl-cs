function getCount(str) {
  return str.split("").filter((ch) => {
    return ["a", "e", "i", "o", "u"].includes(ch);
  }).length;
}

console.log(getCount("the quick brown fox jumps over the lazy dog."));
