
public class Hotel
{
	Hotel(){
		this(5,10);
	}
	Hotel(int rows,int cols){
		 rooms = new Room[rows][cols];
		//遍历rows
		for(int i=0;i<rows;i++){
			
			//为楼层数自动添0
			String str01 = "";
			for(int j=10;j<=rows;j*=10){
				if((rows/j != 0) && ((i+1)/j == 0))
					str01 += "0";
			}
			//遍历cols
			for(int j=0;j<cols;j++){
				rooms[i][j] = new Room();
				//判断并输入type
				if(i < rows*2/5)
					rooms[i][j].setType("标准间");
				else if(i >= rows*4/5)
					rooms[i][j].setType("豪华间");
				else
					rooms[i][j].setType("双人间");
				//为楼层数自动添0
				String str02 = "";
				for(int k=10;k<=cols;k*=10){
					if((cols/k != 0) && ((j+1)/k == 0))
						str02 += "0";
				}
					rooms[i][j].setNo(str01 + (i + 1) + str02 + (j + 1));					
			}

		}
	}
	public Room[][] rooms;
	//打印酒店入住情况
	public void scanner(){
		//遍历每个楼层
		for(int i=0;i<rooms.length;i++){
			//判断楼层类型，打印房间类型
			if(i < rooms.length*2/5)
					System.out.println("[标准间]");
				else if(i >= rooms.length*4/5)
					System.out.println("[豪华间]");
				else
					System.out.println("[双人间]");
			//遍历每个房间
			for(int j=0;j<rooms[i].length;j++){
				System.out.print(rooms[i][j].getNo()+":");
				if(rooms[i][j].getIsUse())
					System.out.print("已入住");
				else
					System.out.print("未入住");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	//酒店登记系统
	public void register(int rows,int cols){
		//判断房间是否被预订
		if(rooms[rows][cols].getIsUse()){
			System.out.println("抱歉，您选择的房间已被预订！");
		}else{
			System.out.println("您好，该房间未被预订！");
			System.out.println("是否预订" +"[" + rooms[rows][cols].getType() + "]"+ rooms[rows][cols].getNo() + "号房间?(Y/N)");
			java.util.Scanner reader =new java.util.Scanner(System.in);
			String confirm = reader.next();
			//确认预订或者取消预订
			if("Y".equals(confirm)|| "y".equals(confirm)){
				System.out.println("预订成功！");
				rooms[rows][cols].setIsUse(true);
			}else
				System.out.println("已经取消预订！");
		}	
	}
	//酒店退订系统
	public void cancel(int rows,int cols){
		if(!rooms[rows][cols].getIsUse()){
			System.out.println("抱歉，您选择的房间未被预订！");
		}else{
			System.out.println("您好，该房间已被预订！");
			System.out.println("是否退订" +"[" + rooms[rows][cols].getType() + "]" + rooms[rows][cols].getNo() + "号房间?(Y/N)");
			java.util.Scanner reader =new java.util.Scanner(System.in);
			String confirm = reader.next();
			//确认退订或者取消退订
			if("Y".equals(confirm)|| "y".equals(confirm)){
				System.out.println("退订成功！");
				rooms[rows][cols].setIsUse(true);
			}else
				System.out.println("已经取消退订！");
		}
	}

}

