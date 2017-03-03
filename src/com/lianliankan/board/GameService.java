package com.lianliankan.board;

import com.lianliankan.myview.Piece;
import com.lianliankan.util.LinkInfo;
/**
 * ��Ϸ�߼��ӿ�
 * @author Administrator
 *
 */
public interface GameService {
	public void start();
	public Piece[][] getPieces();
	public boolean hasPieces();
	/**
	 * �����û�������λ���ҵ���Ӧ��Piece����
	 * @param touchX
	 * @param touchY
	 * @return
	 */
	public Piece findPiece(float touchX, float touchY);
	/**
	 * �ж�����piece�Ƿ����������������򷵻�LinkInfo����
	 * @param p1
	 * @param p2
	 * @return
	 */
	public LinkInfo link(Piece p1,Piece p2);
}
