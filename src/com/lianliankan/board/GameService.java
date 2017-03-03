package com.lianliankan.board;

import com.lianliankan.myview.Piece;
import com.lianliankan.util.LinkInfo;
/**
 * 游戏逻辑接口
 * @author Administrator
 *
 */
public interface GameService {
	public void start();
	public Piece[][] getPieces();
	public boolean hasPieces();
	/**
	 * 根据用户触摸的位置找到相应的Piece对象
	 * @param touchX
	 * @param touchY
	 * @return
	 */
	public Piece findPiece(float touchX, float touchY);
	/**
	 * 判断两个piece是否可以连接如果可以则返回LinkInfo对象
	 * @param p1
	 * @param p2
	 * @return
	 */
	public LinkInfo link(Piece p1,Piece p2);
}
