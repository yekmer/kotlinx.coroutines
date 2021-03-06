/*
 * Copyright 2016-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kotlinx.coroutines.experimental.internalAnnotations

@Target(AnnotationTarget.FILE, AnnotationTarget.FUNCTION)
internal actual annotation class JvmName(actual val name: String)

@Target(AnnotationTarget.FILE)
internal actual annotation class JvmMultifileClass

internal actual annotation class JvmField

internal actual annotation class Volatile

@Suppress("ACTUAL_WITHOUT_EXPECT")
internal actual typealias JsName = kotlin.js.JsName

