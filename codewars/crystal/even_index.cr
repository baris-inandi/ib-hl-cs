def find_even_index(arr)
  arr.each_index do |i|
    return i if arr[0...i].sum == arr[i + 1..-1].sum
  end
  return -1
end

puts find_even_index [1, 2, 3, 4, 3, 2, 1]
