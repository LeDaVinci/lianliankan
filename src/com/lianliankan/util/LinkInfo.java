package com.lianliankan.util;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Point;

public class LinkInfo {
	/**
	 * ����һ�����ϱ������ӵ�
	 */
	private List<Point> points=new ArrayList<Point>();
	public LinkInfo(Point p1,Point p2){
		points.add(p1);
		points.add(p2);
	}
	public LinkInfo(Point p1,Point p2,Point p3) {
		points.add(p1);
		points.add(p2);
		points.add(p3);
	}
	public LinkInfo(Point p1,Point p2,Point p3,Point p4) {
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
	}
	public List<Point> getLinkPoints(){
		return points;
	}
}
