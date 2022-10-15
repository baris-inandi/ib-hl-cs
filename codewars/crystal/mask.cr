def maskify(cc)
  cc.gsub(/.(?=.{4})/, '#')
end

puts maskify("3")
