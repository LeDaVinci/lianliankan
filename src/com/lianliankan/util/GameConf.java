package com.lianliankan.util;

import android.content.Context;

public class GameConf {
	/**
	 * Ĭ�ϵķ��鳤���Լ���Ϸʱ��
	 */
	private static final int PIECE_WIDTH=40;
	private static final int PIECE_HEIGHT=40;
	private static int DEFAULT_TIME=100;
	/**
	 * piece�����鳤��
	 */
	private int Xsize;
	private int Ysize;
	/**
	 * ��ʼ���������
	 */
	private int beginImageX;
	private int beginImageY;
	/**
	 * ��Ϸ��ʱ��
	 */
	private int gameTime;
	private Context context;
	public GameConf(int xsize, int ysize, int beginImageX, int beginImageY,
			int gameTime, Context context) {
		super();
		Xsize = xsize;
		Ysize = ysize;
		this.beginImageX = beginImageX;
		this.beginImageY = beginImageY;
		this.gameTime = gameTime;
		this.context = context;
	}
	public int getXsize() {
		return Xsize;
	}
	public int getYsize() {
		return Ysize;
	}
	public int getBeginImageX() {
		return beginImageX;
	}
	public int getBeginImageY() {
		return beginImageY;
	}
	public int getGameTime() {
		return gameTime;
	}
	public Context getContext() {
		return context;
	}	
	
}
