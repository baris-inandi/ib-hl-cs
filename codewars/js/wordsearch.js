function wordSearch(word, text) {
  for (const i of text.split(" ")) {
    if (
      i
        .replace(/[^\w\s\']|_/g, "")
        .replace(/\s+/g, " ")
        .trim() === word
    ) {
      return true;
    }
  }
  return false;
}
