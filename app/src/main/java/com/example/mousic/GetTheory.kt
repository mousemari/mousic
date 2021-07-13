package com.example.mousic


object GetTheory {
    fun getLesson(theme: Int): ArrayList<Reader> {
        var lessonList = java.util.ArrayList<Reader>()
        when (theme) {
            12 -> {
                lessonList =  Tritons.getLesson()
            }
            13 -> {
                lessonList =  SpecialIntervals.getLesson()
            }

            21 -> {
                lessonList = ChordsStandarts.getLesson()
            }
            22 -> {
                lessonList = ChordsSide.getLesson()
            }
            23 -> {
                lessonList = Dm7.getLesson()
            }
            24 -> {
                lessonList = SeptChords.getLesson()
            }

            31 -> {
                lessonList = Angemiton.getLesson()
            }
            32 -> {
                lessonList = Diatonic.getLesson()
            }
            33 -> {
                lessonList = CondDiatonic.getLesson()
            }
            34 -> {
                lessonList = FalseMode.getLesson()
            }

            41 -> {
                lessonList = RhythmDiv.getLesson()
            }
            42 -> {
                lessonList = TimeSign.getLesson()
            }
            43 -> {
                lessonList = Metre.getLesson()
            }
            44 -> {
                lessonList = RhythmPattern.getLesson()
            }
        }
        return lessonList
    }
}
