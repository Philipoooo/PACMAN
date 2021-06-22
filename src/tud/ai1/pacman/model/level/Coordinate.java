package tud.ai1.pacman.model.level;

public class Coordinate implements ICoordinate{
	private int x;
	private int y;
	public Coordinate (int x, int y) {
		this.x= x;
		this.y = y;
	}
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public void setX(final int x) {
			 this.x = x;
		}
		
		public void setY(final int y) {
			this.y = y;
		}
			
	
}


