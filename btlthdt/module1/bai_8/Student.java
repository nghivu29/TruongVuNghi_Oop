package btlthdt.module1.bai_8;

public class Student extends Person implements Comment{
    private Score score = new Score();

    public Student(String fulName, float mathScore, float englishScore) throws ScoreException {
        super(fulName);
        this.score.setEnglish(englishScore);
        this.score.setMath(mathScore);
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public String comment() {
        return null;
    }

    @Override
    public String toString() {
        return "#Hoc sinh:\n" +
                super.toString()+ '\n' + score.toString();
    }
}

class Score {
    private float math, english;

    public float getMath() {
        return math;
    }

    public void setMath(float math) throws ScoreException {
        if (!ScoreException.test(math))
            throw new ScoreException();
        this.math = math;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) throws ScoreException {
        if (!ScoreException.test(english))
            throw new ScoreException();
        this.english = english;
    }

    @Override
    public String toString() {
        return "Diem: " +
                "toan: " + math +
                ", anh: " + english;
    }

    public float average(){
        return (math + english) / 2;
    }
}

class ScoreException extends Exception{
    public static boolean test(float score){
        if (score > 10 || score < 0) {
            return false;
        }
        return true;
    }

    @Override
    public String getMessage() {
        return "< 0 || > 10";
    }
}
