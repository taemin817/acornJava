package day14.IOEx;

import java.io.Serializable;

public class Score implements Serializable{
String nameString;
int kor;

// 컨 스페이스바  기본생성자
public Score() {
}


// using field
public Score(String nameString, int kor) {
	super();
	this.nameString = nameString;
	this.kor = kor;
}

// getter setter
public String getNameString() {
	return nameString;
}

public void setNameString(String nameString) {
	this.nameString = nameString;
}

public int getKor() {
	return kor;
}

public void setKor(int kor) {
	this.kor = kor;
}

// to String
@Override
public String toString() {
	return "Score [nameString=" + nameString + ", kor=" + kor + "]";
}


}
