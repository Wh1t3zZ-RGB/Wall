package org.hum.nettyproxy.test.https_client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * https://zhuanlan.zhihu.com/p/25587986
 */
public class Test {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// https://xz.aliyun.com/t/2531
		// https://www.jianshu.com/p/7e9e5e084dfb
		// https://dss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/js/lib/jquery-1-edb203c114.10.2.js
		Socket socket = new Socket("dss0.bdstatic.com", 443);
		// 1.client say hello
		byte[] hello = new byte[] { 22, 3, 1, 2, -102, 1, 0, 2, -106, 3, 3, 20, 106, -25, 85, -47, -76, -117, 40, -44, -90, 114, 123, 106, 113, 41, -107, 61, 67, 34, -23, -102, -77, 47, -63, 111, -75, -19, 0, 44, 27, -32, 113, 32, 110, -40, -65, 20, -27, -103, 36, 76, 32, -58, 56, -77, 29, -114, -73, 76, -119, -52, -18, -41, 113, 36, 83, 20, -125, 56, 37, 37, 81, 108, 76, -67, 0, 36, 19, 1, 19, 3, 19, 2, -64, 43, -64, 47, -52, -87, -52, -88, -64, 44, -64, 48, -64, 10, -64, 9, -64, 19, -64, 20, 0, 51, 0, 57, 0, 47, 0, 53, 0, 10, 1, 0, 2, 41, 0, 0, 0, 22, 0, 20, 0, 0, 17, 100, 115, 115, 48, 46, 98, 100, 115, 116, 97, 116, 105, 99, 46, 99, 111, 109, 0, 23, 0, 0, -1, 1, 0, 1, 0, 0, 10, 0, 14, 0, 12, 0, 29, 0, 23, 0, 24, 0, 25, 1, 0, 1, 1, 0, 11, 0, 2, 1, 0, 0, 16, 0, 14, 0, 12, 2, 104, 50, 8, 104, 116, 116, 112, 47, 49, 46, 49, 0, 5, 0, 5, 1, 0, 0, 0, 0, 0, 51, 0, 107, 0, 105, 0, 29, 0, 32, 47, -125, 7, -124, 103, 34, -21, 5, 36, -124, 119, 0, -45, 65, 10, -69, -38, -85, -82, 26, 90, 67, -73, -47, 81, 121, -2, 21, 66, -6, 62, 102, 0, 23, 0, 65, 4, 101, -89, -89, 96, -60, -108, 72, 81, -14, 51, 53, 27, -106, 4, -45, 85, -79, -53, 71, 78, 109, 54, -32, 124, -2, 0, -72, 65, 88, 80, -90, -58, 126, 121, 78, -101, 5, -71, -107, 71, 111, -52, -53, 51, -108, -61, -32, 93, 22, 23, 39, -95, 91, -20, -56, 103, 101, 15, -2, -31, 123, -49, -59, 41, 0, 43, 0, 9, 8, 3, 4, 3, 3, 3, 2, 3, 1, 0, 13, 0, 24, 0, 22, 4, 3, 5, 3, 6, 3, 8, 4, 8, 5, 8, 6, 4, 1, 5, 1, 6, 1, 2, 3, 2, 1, 0, 45, 0, 2, 1, 1, 0, 28, 0, 2, 64, 1, 0, 41, 1, 43, 0, -10, 0, -16, 46, -33, -38, 103, -83, 101, -15, 48, 27, -45, 24, -93, -49, 31, -58, -41, 36, 84, 99, -75, 12, 26, 15, 42, 16, 20, 61, -46, 35, 1, 10, -53, -50, -105, 59, -120, 87, -92, -71, 20, -47, -82, 28, -47, 31, -49, -88, -23, -100, -13, -119, 72, 61, -64, 28, -126, 79, 100, -15, 13, 57, 126, -70, 102, -79, -97, 61, -50, -36, -81, 105, -118, -3, 63, -21, -67, 81, 90, -77, -9, 97, -123, 66, 62, -86, 23, 92, -85, 107, 90, 45, 20, 1, 53, -56, -23, -44, -76, 106, -13, -3, -121, -40, -76, 2, -46, 36, -15, 113, 39, 109, 13, -94, 80, -126, -32, -92, 46, -83, 76, 96, 6, 92, -8, 89, 73, 124, -15, -44, -39, -105, -98, 68, 67, 115, -91, 23, -59, 127, 113, 96, -127, -60, -104, 115, 108, 112, 51, 5, 38, -122, 96, 99, 45, -79, 66, -70, 67, 104, 84, 79, 105, 12, -103, 76, -75, -126, 30, -56, 45, 84, -12, 80, 124, -101, -62, 63, -67, 83, 0, -15, -34, 71, -107, 76, -18, 32, 21, 35, 12, 1, -91, -51, -4, 102, 4, 94, 24, -121, -34, 109, -82, 92, 22, -55, 24, -126, -49, 7, -94, 87, 7, 88, 29, 1, -120, -82, -105, 45, -79, 101, 92, -20, -98, 105, -104, 16, 27, 76, 31, -64, 125, -37, 89, 70, 67, -51, -48, 48, -41, -75, -64, -60, 5, 0, 49, 48, -111, 29, 34, -26, 114, 57, -100, 80, -59, 16, -54, 55, 5, -9, -91, 3, -6, -32, -50, 98, -21, -92, 80, -25, -73, 34, 96, 8, 22, -97, 95, 91, -27, -122, -100, 3, -9, -49, -110, 7, 5, -69, -118, 55, -97, -126, 117, 42 };
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.write(hello);
		// 2.Server say hello
		byte[] helloFromServer = new byte[512];
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		while (dis.read(helloFromServer) > 0) {
			System.out.println(Arrays.toString(helloFromServer));
		}
	}
}
