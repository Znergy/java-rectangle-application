public class Rectangle {

  private int mLength;
  private int mWidth;

  public Rectangle(int length, int width) {
    this.mLength = length;
    this.mWidth = width;
  }

  public int getLength() {
    return this.mLength;
  }

  public int getWidth() {
    return this.mWidth;
  }

  public boolean isSquare() {
    if(this.mLength != this.mWidth) {
      return false;
    } else {
      return true;
    }
  }
}
