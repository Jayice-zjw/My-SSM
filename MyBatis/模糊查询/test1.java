@Test
	public void likeSearch() {
		studentDao = new studentDaoImpl();
		List<Student> res = studentDao.likeSearch("杰");
		res.forEach(r -> {
			System.out.println(r);
		});
	}
