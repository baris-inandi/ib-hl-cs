def digit_sums(n : Int64) : Int64
  sum : Int64 = 0
  n.to_s.chars.each do |digit|
    sum += digit.to_i
  end
  return sum
end

def digital_root(n : Int64) : Int64
  return n < 10 ? n : digital_root(digit_sums(n))
end

digital_root(1212)
