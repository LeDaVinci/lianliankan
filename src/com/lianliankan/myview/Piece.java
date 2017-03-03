package com.lianliankan.myview;

import android.graphics.Point;

/**
 * 方块对象
 */
public class Piece {
	/**
	 * 方块对应的图片
	 */
	private PieceImage	pieceImage;	
	/**
	 * 方块对应的左上角的X,y坐标
	 */
	private int beginX;
	private int beginY;
	/**
	 *	该对象的索引值，因为画布相当是一个网格，对应一个二维数组。
	 *	所以X,Y对应的就是该对象的索引
	 */
	private int indexX;
	private int indexY;
	/**
	 * 构造方法，只需要知道索引就行，不一定有图片填充
	 * @param indexX
	 * @param indexY
	 */
	public Piece(int indexX, int indexY) {
		super();
		this.indexX = indexX;
		this.indexY = indexY;
	}
	/**
	 * 获得方块中心的坐标
	 * @return 中心点坐标对象point
	 */
	public Point GetCenter(){
		return new Point(getBeginX()+getPieceImage().getImage().getWidth()/2,
				getBeginY()+getPieceImage().getImage().getHeight()/2);
		
	}
	public boolean isSameImage(Piece otherPieceImage){
		if(pieceImage==null){
			if(otherPieceImage!=null)
				return false;
		}
		return pieceImage.getImageId()==otherPieceImage.pieceImage.getImageId();
		
	}
	public PieceImage getPieceImage() {
		return pieceImage;
	}
	public void setPieceImage(PieceImage pieceImage) {
		this.pieceImage = pieceImage;
	}
	public int getBeginX() {
		return beginX;
	}
	public void setBeginX(int beginX) {
		this.beginX = beginX;
	}
	public int getBeginY() {
		return beginY;
	}
	public void setBeginY(int beginY) {
		this.beginY = beginY;
	}
	public int getIndexX() {
		return indexX;
	}
	public void setIndexX(int indexX) {
		this.indexX = indexX;
	}
	public int getIndexY() {
		return indexY;
	}
	public void setIndexY(int indexY) {
		this.indexY = indexY;
	}

	
	
}
