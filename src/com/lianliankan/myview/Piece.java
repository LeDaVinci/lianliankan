package com.lianliankan.myview;

import android.graphics.Point;

/**
 * �������
 */
public class Piece {
	/**
	 * �����Ӧ��ͼƬ
	 */
	private PieceImage	pieceImage;	
	/**
	 * �����Ӧ�����Ͻǵ�X,y����
	 */
	private int beginX;
	private int beginY;
	/**
	 *	�ö��������ֵ����Ϊ�����൱��һ�����񣬶�Ӧһ����ά���顣
	 *	����X,Y��Ӧ�ľ��Ǹö��������
	 */
	private int indexX;
	private int indexY;
	/**
	 * ���췽����ֻ��Ҫ֪���������У���һ����ͼƬ���
	 * @param indexX
	 * @param indexY
	 */
	public Piece(int indexX, int indexY) {
		super();
		this.indexX = indexX;
		this.indexY = indexY;
	}
	/**
	 * ��÷������ĵ�����
	 * @return ���ĵ��������point
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
