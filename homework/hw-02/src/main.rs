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
pub struct GradeStats {
    pub max_grade: f32,
    pub min_grade: f32,
    pub average_grade: f32,
    pub passing_grade: f32,
}

impl GradeStats {
    pub fn from(grades: &Vec<f32>) -> Self {
        let max = grades.iter().cloned().fold(0. / 0., f32::max);
        let min = grades.iter().cloned().fold(1. / 0., f32::min);
        let avg = grades.iter().sum::<f32>() / grades.len() as f32;
        Self {
            max_grade: max,
            min_grade: min,
            average_grade: avg,
            passing_grade: avg / 2 as f32,
        }
    }
}

#[derive(Debug)]
pub struct Class {
    pub students: Vec<Student>,
    pub grades: Vec<f32>,
    pub stats: GradeStats,
}

impl Class {
    pub fn from(st: Vec<Student>) -> Self {
        let grades = st.iter().map(|i| i.average).collect();
        Self {
            stats: GradeStats::from(&grades),
            grades,
            students: st,
        }
    }

    pub fn random_class(num: usize) -> Self {
        let mut out = Vec::new();
        for _ in 0..num {
            out.push(Student::random_student());
        }
        Self::from(out)
    }

    pub fn passing_students(&self) -> Vec<&Student> {
        self.students
            .iter()
            .filter(|i| i.average >= self.stats.passing_grade)
            .collect()
    }

    pub fn failing_students(&self) -> Vec<&Student> {
        self.students
            .iter()
            .filter(|i| i.average < self.stats.passing_grade)
            .collect()
    }
}

fn main() {
    // create a class with 5 random students with random grades
    let class = Class::random_class(5);

    // print class statistics
    println!("");
    println!("STUDENTS:\t{} students registered.", class.students.len());
    println!("MIN GRADE:\t{:.2}", class.stats.min_grade);
    println!("MAX GRADE:\t{:.2}", class.stats.max_grade);
    println!("AVERAGE GRADE:\t{:.2}", class.stats.average_grade);

    // print passing threshold and get passing and failing students
    println!("PASSING GRADE:\t{:.2}", class.stats.passing_grade);
    println!(
        "PASSING:\t{:?} students passing.",
        class.passing_students().len()
    );
    println!(
        "FAILING:\t{:?} students failing.",
        class.failing_students().len()
    );
    println!("");
}
