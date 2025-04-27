// code here
// code here
CSG Base = new Cube(	20,// X dimention
			20,// Y dimention
			20,//  Z dimention
			).toCSG()// this converts from the geometry to an object we can work with
Base = Base.toZMin() 
		.toXMin() .toYMin()
CSG Roof = new Isosceles(20,20,15).toCSG()
		.toXMin() .toYMin() .movez(20)
CSG Inside = new Cube(	35,// X dimention
			12,// Y dimention
			10,//  Z dimention
			).toCSG()// this converts from the geometry to an object we can work with
		.movex(20).movey(10).movez(10)
CSG SecondWindow = new Cube(	10,// X dimention
			20,// Y dimention
			10,//  Z dimention
			).toCSG()// this converts from the geometry to an object we can work with
		.movex(20).movey(10).movez(10)
CSG Steps = new Cube(	3,// x dimention
			20,// Y dimention
			3,// Z dimention
			).toCSG()//
		.movex(19) .toYMin() .movez(4)
CSG Window = new Cube(	5,//X dimention
			30,// y dimention
			5,// z dimention
			).toCSG()//
			.movex(8) .movey(10) .movez(10)
CSG Path = Cube(		3,// Xdimetion
			20,// Y dimention
return CSG.unionAll([Base, Roof,]).difference(Inside, SecondWindow, Steps, Window)

