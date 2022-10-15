def find_outlier(integers) : Int32 | Int64 | Nil
  even, odd = 0, 0
  integers.each do |i|
    i.even? ? (even += 1) : (odd += 1)
    if even > 1
      return integers.find { |i| i % 2 != 0 }
    elsif odd > 1
      return integers.find { |i| i % 2 == 0 }
    end
  end
end

puts find_outlier [1, 3, 5, 6, 7, 9, 11, -11, -17]
