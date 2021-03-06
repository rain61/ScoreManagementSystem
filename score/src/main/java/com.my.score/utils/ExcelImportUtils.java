package com.my.score.utils;
/**
*
* @ClassName:ExcelImportUtils.java
* @description:
* @author: wangjunpeng
* @date: 2018年5月28日 下午5:57:41
* @version: v1.0.0
*
**/
public class ExcelImportUtils {  
    // @描述：是否是2003的excel，返回true是2003   
    public static boolean isExcel2003(String filePath)  {    
        return filePath.matches("^.+\\.(?i)(xls)$");    
    }    
     
    //@描述：是否是2007的excel，返回true是2007   
    public static boolean isExcel2007(String filePath)  {    
        return filePath.matches("^.+\\.(?i)(xlsx)$");    
    }    
      
  /** 
   * 验证EXCEL文件 
   * @param filePath 
   * @return 
   */  
  public static boolean validateExcel(String filePath){  
        if (filePath == null || !(isExcel2003(filePath) || isExcel2007(filePath))){    
            return false;    
        }    
        return true;  
  }  
}
