String.prototype.toJadenCase = function () {
  out = "";
  for (const i of this.split(" ")) {
    out += i[0].toUpperCase() + i.slice(1) + " ";
  }
  return out.slice(0, -1);
};

console.log("the quick brown fox".toJadenCase());
