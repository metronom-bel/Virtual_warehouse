package testpack;

public class BaseStorageObject {
	
public int CoordX;
public int CoordY;

public void MoveTo (int a, int b) {
	CoordX += a;
	CoordY += b;
}

}
