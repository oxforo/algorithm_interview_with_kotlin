class RecorderLogFiles {
    companion object {
        // TODO : Collections.sort 람다식 표현으로 바꿔볼 것!
        fun sort(logFiles: List<String>): List<String> {
            val dq = ArrayDeque<String>()
            var strFileCount = 0
            // 1. 우선 순위 : 문자 로그 > 숫자로그
            for(i in logFiles.indices) {
                if(logFiles[i].split(" ", limit = 2)[1][0].isDigit())
                    dq.addLast(logFiles[i])
                else if(logFiles[i].split(" ", limit = 2)[1][0].isLetter()) {
                    dq.addFirst(logFiles[i])
                    strFileCount++
                }
            }
            println(dq)
            // 2. 우선 순위 : 문자열 로그 사전순 + 같으면 식별자 순
            for(i in 0 until strFileCount-1) {
                for(j in i until strFileCount) {
                    if(dq[i].split(" ",limit = 2)[1] > dq[j].split(" ",limit = 2)[1]) {
                        dq[i] = dq[j].also {
                            dq[j] = dq[i]
                        }
                    }
                    else if (dq[i].split(" ",limit = 2)[1].compareTo(dq[j].split(" ",limit = 2)[1]) == 0 ) {
                        if (dq[i].split(" ",limit = 2)[0] > dq[j].split(" ",limit = 2)[0]) {
                            dq[i] = dq[j].also {
                                dq[j] = dq[i]
                            }
                        }
                    }
                    print("${i}, ${j}")
                    println(dq)
                }
            }

            return dq
        }
    }
}