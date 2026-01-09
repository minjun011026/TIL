## KMP의 컴파일 과정
### Android
안드로이드는 기존 네이티브와 동일한 컴파일 파이프라인을 사용한다.
1. Kotlin 코드가 JVM 바이트코드로 번역된다.
2. 이것이 다시 안드로이드에 최적화된 DEX 바이트코드로 번역된다.
3. 이 DEX 코드가 다시 특정 안드로이드 기기를 위한 기계어로 직접 번역된다. 이 과정은 주로 앱을 설치할 때나 실행 중에 이루어진다.

### iOS
iOS는 JVM이 작동하지 않아 조금 다르다. 
1. KMP 프로젝트에서 작성한 코틀린 소스코드가 먼저 컴파일러가 이해하기 쉬운 형식인 Kotlin IR 이라는 형태로 번역된다.
2. iOS는 LLVM(Low-Level Virtual Machine)이라는 도구를 사용하는데 컴파일러는 이전에 만든 Kotiln IR을 가져와서 LLVM이 이해할 수 있는 저수준 명령어으로 번역한다.
3. 마지막으로 LLVM은 이 저수준 명령어를 최적화하여 iOS CPU에서 직접 실행될 수 있는 기계어로 번역한다.
4. 최종 출력물은 `.framework` 파일 형태가 된다. 네이티브 iOS 개발에서 Framework는 라이브러리를 의미하고 iOS는 이 파일을 Swift로 작성된 다른 Framework랑 동일하게 취급한다.

### Desktop
Desktop은 Desktop JVM과 Desktop Native 두 방식 중 선택할 수 있다. 
+ Desktop JVM(기본 값) : 모든 Desktop 플랫폼에서 JVM 소프트웨어를 실행할 수 있어 가장 단순하고 기본으로 사용된다.
1. Kotlin 코드가 JVM 바이트코드로 번역되고 JVM이 이를 실행 중인 플랫폼(Window, Mac 등)에 맞는 기계어로 번역한다.
+ Desktop Native : 실제 해당 플랫폼의 바이너리(실행 파일)로 컴파일하는 방식
    + macOS : iOS와 거의 유사
    + Windows : Kotlin 코드가 LLVM 중간 표현을 거쳐 최종적으로 `.exe` 실행 파일로 번역
    + Linux : Kotlin 코드가 LLVM 중간 표현을 거쳐 최종적으로 ELF 실행 파일이 됨