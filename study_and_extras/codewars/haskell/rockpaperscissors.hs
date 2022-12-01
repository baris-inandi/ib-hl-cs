module Codewars.RockPaperScissors where

rps :: String -> String -> String
rps "scissors" "paper" = "Player 1 won!"
rps "rock" "scissors" = "Player 1 won!"
rps "paper" "rock" = "Player 1 won!"
rps s1 s2
  | s1 == s2 = "Draw!"
  | otherwise = "Player 2 won!"