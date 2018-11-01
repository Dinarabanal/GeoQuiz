package edu.cnm.deepdive.geoquiz;

public class Question {

  private int mTextResId;
  private boolean mAnswerTrue;

  public Question(int mTextResId, boolean mAnswerTrue) {}
  mTextResId= textResId;
  mAnswerTrue= answerTrue;

  public int getmTextResId() {
    return mTextResId;
  }

  public void setmTextResId(int mTextResId) {
    this.mTextResId = mTextResId;
  }

  public boolean ismAnswerTrue() {
    return mAnswerTrue;
  }

  public void setmAnswerTrue(boolean mAnswerTrue) {
    this.mAnswerTrue = mAnswerTrue;
  }

  public Question(int textResID, boolean AnswerTrue){
    mAnswerTrue = AnswerTrue;
    mTextResID = textResID;

  }
}