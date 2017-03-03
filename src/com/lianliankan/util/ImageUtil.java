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
 * ��ȡ������ͼƬ��Դֵ
 * 
 * @author Administrator
 * 
 */
public class ImageUtil {
	private static List<Integer> imageValues = getImageValues();

	/**
	 * ��ȡ����������ͼƬID
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
	 * ��resourceValues�л�ȡsize��ͼƬID
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
	 * ��drawableĿ¼��ȡsize��ͼƬ��Դid
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
	 * ��ͼƬID����ת��ɶ�Ӧ��PieceImage����
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
	 * ��ȡѡ�б�ʾ��ͼƬ
	 * @param context
	 * @return
	 */
	public static Bitmap getSelectImage(Context context){
		return BitmapFactory.decodeResource(context.getResources(), R.drawable.selected);
	}
}
