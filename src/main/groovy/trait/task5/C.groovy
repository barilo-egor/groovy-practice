package trait.task5

class C implements A, B{
	@Override
	void hi() {
		A.super.hi()
		B.super.hi()
	}
}
