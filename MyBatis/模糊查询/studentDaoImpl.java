@Override
	public List<Student> likeSearch(String name) {
		try(SqlSession sqlSession=util.getSqlSession()){
			List<Student> res=sqlSession.selectList("likeSearch",name);
			return res;
		}
	}
