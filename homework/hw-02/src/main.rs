use rand::Rng;

#[derive(Debug)]
pub struct Student {
    pub exam: f32,
    pub quiz: f32,
    pub average: f32,
}

impl Student {
    pub fn new(exam: f32, quiz: f32) -> Self {
        Self {
            exam,
            quiz,
            average: exam * 0.4 + quiz * 0.3,
        }
    }

    pub fn random_student() -> Self {
        let mut rng = rand::thread_rng();
        Self::new(rng.gen::<f32>() * 100 as f32, rng.gen::<f32>() * 100 as f32)
    }
}

#[derive(Debug)]
pub struct Class {
    pub students: Vec<Student>,
    pub grades: Vec<f32>,
}

fn main() {
    /*
     * Score calculator:
     * 1. for n students (n = 5) create 3 arrays: exam, quiz, final
     * final = exam * 0.4 + quiz * 0.3
     * 2. populate exam and quiz arrays randomly
     * 3. calculate final scores and write in final array
     * 4. calculate the average, max and min scores of the class.
     * 5. score to pass is average/2. Create 2 arrays: fail,pass
     * separate fails and passes in different arrays
     * 6. list all arrays
     */
    dbg!(Student::random_student());
    dbg!(Student::random_student());
    dbg!(Student::random_student());
    dbg!(Student::random_student());
    let exams: Vec<f32> = vec![]
}
