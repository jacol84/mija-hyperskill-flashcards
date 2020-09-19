val lambda: (Long, Long) -> Long = { x, y -> (x..y).reduce { sum, ele -> sum * ele } }
