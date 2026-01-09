## KMP는 네이티브이다
1. CPU에서 읽는 언어가 똑같다.
+ Swift/Object-C : Xcode에서 빌드시 ARM64 기계어로 변환된다.
+ KMP : Kotlin으로 작성하여도 빌드시 ARM64 기계어로 변환된다.

2. Bridge가 없다.
+ React Native : JavaScript Engine이라는 Interpreter 가 내부에 존재하여 코드 실행시 interpret 과정이 존재한다.
+ Flutter : 기계어로 번역되나 시스템 API(알림 등)을 사용할 때에는 별도의 Platform Channel을 거쳐야 한다.
+ KMP : Kotlin 코드에서 iOS의 시스템 기능을 직접 호출한다.

물론 Kotlin과 iOS 간 데이터 타입이 미묘하게 다른 점 등으로 완전히 차이가 없는 것은 아니다.
또한 Flutter나 RN에 비해 빌드 시간이 오래 걸린다는 단점이 존재한다.