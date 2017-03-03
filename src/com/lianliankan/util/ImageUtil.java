package com.lianliankan.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.test.R;
import com.lianliankan.myview.PieceImage;

/**
 * 获取连连看图片资源值
 * 
 * @author Administrator
 * 
 */
public class ImageUtil {
	private static List<Integer> imageValues = getImageValues();

	/**
	 * 获取连连看所有图片ID
	 * 
	 * @return
	 */
	public static List<Integer> getImageValues() {
		Field[] drawableFields = R.drawable.class.getFields();
		List<Integer> resourceValues = new ArrayList<Integer>();
		for (Field field : drawableFields) {
			if (field.getName().indexOf("p_") != -1) {
				try {
					resourceValues.add(field.getInt(R.drawable.class));
				} catch (Exception e) {
					return null;
				}
			}
		}
		return resourceValues;
	}

	/**
	 * 从resourceValues中获取size个图片ID
	 * 
	 * @return
	 */
	public static List<Integer> getRandomValues(List<Integer> sourceValues,
			int size) {
		Random random = new Random();
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			try {
				int index = random.nextInt(sourceValues.size());
				Integer image = sourceValues.get(index);
				result.add(image);
			} catch (IndexOutOfBoundsException e) {
				return result;
			}
		}
		return result;
	}
	/**
	 * 从drawable目录获取size个图片资源id
	 * @param size
	 * @return
	 */
	public static List<Integer> getPlayValues(int size){
		if(size%2!=0){
			size++;
		}
		List<Integer> playImageValues=getRandomValues(imageValues, size/2);
		playImageValues.addAll(playImageValues);
		Collections.shuffle(playImageValues);
		return playImageValues;
	}
	/**
	 * 将图片ID集合转变成对应的PieceImage集合
	 * @param context
	 * @param size
	 * @return
	 */
	public static List<PieceImage> getPieceImages(Context context,int size){
		List<Integer> resourceValues = getPlayValues(size);
		List<PieceImage> result = new ArrayList<PieceImage>();
		for(Integer value: resourceValues){
			Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(),value);
			PieceImage pieceImage=new PieceImage(bitmap, value);
			result.add(pieceImage);
		}
		return result;
	}
	/**
	 * 获取选中标示的图片
	 * @param context
	 * @return
	 */
	public static Bitmap getSelectImage(Context context){
		return BitmapFactory.decodeResource(context.getResources(), R.drawable.selected);
	}
}
