package com.example

import com.example.spring.Dept

class scala {
	def main(args: Array[String]): Unit = {
		var dept : Dept = new Dept
				
		dept.setDeptno(10)
		dept.setDname("xxx")
		dept.setLoc("yyy")

		println(dept);
		dept.print();
	}
}