package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import vo.EmpVO;

public class EmpDAO {
	private String fileName;

	public EmpDAO(String fileName) {
		this.fileName = fileName;
	}
	public List<EmpVO> getAll(){
		ArrayList<EmpVO> list = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(new File(fileName)))){

			String line;
            //ヘッダー表示

            int check = 0;
            while((line = in.readLine()) != null){
            	String[] data = line.split(",");
            	EmpVO str = new EmpVO();
            	str.setSyainNumber(data[0]);
            	str.setName(data[1]);
            	str.setHeight(data[2]);
            	str.setWeight(data[3]);
            	list.add(str);
            	check ++;

            	}
            if(check == 0) {
            	return null;
            }

        }catch (IOException e) {
            e.printStackTrace();
        }return list;
	}
	public EmpVO get(int syainNumber) {

		try (BufferedReader in = new BufferedReader(new FileReader(new File(fileName)))){

			String line;
            while((line = in.readLine()) != null){

            	String[] data = line.split(",");
            	if(syainNumber == Integer.parseInt(data[0])){
            		EmpVO vo = new EmpVO();
            		vo.setSyainNumber(data[0]);
            		vo.setName(data[1]);
            		vo.setHeight(data[2]);
            		vo.setWeight(data[3]);

            		return vo;

            	}

            }
		}catch (IOException e) {
            e.printStackTrace();
        }return null;
	}
	//社員情報追加
	public void insert(EmpVO empVO) {

	}

}
