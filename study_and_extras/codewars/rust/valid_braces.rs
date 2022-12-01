fn valid_braces(s: &str) -> bool {
    let mut stack = Vec::new();
    for c in s.chars() {
        match c {
            '(' => stack.push(c),
            ')' => {
                if stack.pop() != Some('(') {
                    return false;
                }
            }
            '{' => stack.push(c),
            '}' => {
                if stack.pop() != Some('{') {
                    return false;
                }
            }
            '[' => stack.push(c),
            ']' => {
                if stack.pop() != Some('[') {
                    return false;
                }
            }
            _ => panic!("Invalid input"),
        }
    }
    stack.is_empty()
}
