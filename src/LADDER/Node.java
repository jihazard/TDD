package LADDER;

import LADDER.Node.Direction;

 class Node {

	enum Direction{
		LEFT,
		CENTER,
		RIGHT;
		
	}
	private Direction direction;
	
	private Node(Direction direction) {
		// TODO Auto-generated constructor stub
		this.direction =  direction;
	}


	public void changeRight() {
		this.direction = Direction.RIGHT;
		
	}

	public void changeLeft() {
		// TODO Auto-generated method stub
		
		this.direction = Direction.LEFT;
	}
	
	public Marker move(Marker marker) {
		// TODO Auto-generated method stub
		if(isRightDirection()){
			return marker.moveRight();
		}
		if(isLeftDirection()){
			return marker.moveLeft();
		}
	
		return marker;
	}



	static Node createCenterNode(){
		return new Node(Direction.CENTER);
	}
	static Node createLEFTNode(){
		return new Node(Direction.LEFT);
	}
	


	static Node createRIGHTNode(){
		return new Node(Direction.RIGHT);
	}
	
	public boolean isLeftDirection() {
		// TODO Auto-generated method stub
		return this.direction == Direction.LEFT;
	}
	
	private boolean isRightDirection() {
		// TODO Auto-generated method stub
		return this.direction== Direction.RIGHT;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direction == null) ? 0 : direction.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (direction != other.direction)
			return false;
		return true;
	}


	public int getSymbol() {
		// TODO Auto-generated method stub
		if(isLeftDirection()) return -1;
		if(isRightDirection()) return 1;
		
		return 0;
	}


	


	
	
	
}
