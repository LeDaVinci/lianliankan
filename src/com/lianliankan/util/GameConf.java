package com.lianliankan.util;

import android.content.Context;

public class GameConf {
	/**
	 * 默认的方块长宽以及游戏时间
	 */
	private static final int PIECE_WIDTH=40;
	private static final int PIECE_HEIGHT=40;
	private static int DEFAULT_TIME=100;
	/**
	 * piece的数组长度
	 */
	private int Xsize;
	private int Ysize;
	/**
	 * 起始方块的坐标
	 */
	private int beginImageX;
	private int beginImageY;
	/**
	 * 游戏总时间
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
