package com.lianliankan.board;

import java.util.List;

import com.lianliankan.myview.Piece;
import com.lianliankan.util.GameConf;


public abstract class AbstractBoard {
	protected abstract List<Piece> creatPieces(GameConf conf,Piece[][] pieces);
}
