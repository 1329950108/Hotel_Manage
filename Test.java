
import java.util.Scanner;
public class Test
{
	public static void main(String[] args){
		
		Hotel jiaRi = new Hotel();
		Scanner reader = new Scanner(System.in);
		System.out.println("欢迎使用酒店管理系统！");
		System.out.println("查看入住情况请按1；预订房间请按2；退订房间请按3；推出系统请按0。按回车键结束");
		int judge = reader.nextInt();
		switch(judge){
			 case 1:{
				System.out.println("本酒店入住情况：");
				jiaRi.scanner();
				break;
			}case 2:{
				System.out.print("请选择您需要入住的楼层：");
				int lows = reader.nextInt();				
				System.out.print("请选择该楼层的房间号：（前面无需添加零）");
				int cols = reader.nextInt();
				jiaRi.register(lows,cols);
				break;
			}case 3:{
				System.out.print("请选择您需要退订的楼层：");
				int rows = reader.nextInt();				
				System.out.print("请选择该楼层的房间号：（前面无需添加零）");
				int cols = reader.nextInt();
				jiaRi.cancel(rows,cols);
				break;
			}case 0:
				System.exit(0);
			default:
				System.out.println("输入错误！");
		}

	}
}
